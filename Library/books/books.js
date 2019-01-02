const express=require("express");
const app=express();
const bodyParser=require("body-parser");

app.use(bodyParser.json());

const mongoose=require("mongoose");

require("./Book")
const Book=mongoose.model("Book") 

mongoose.connect("mongodb://<akshay>:<123456789@abc>@ds145694.mlab.com:45694/booksservice",() => {
    console.log("database connected");
});

app.get('/',(req,res)=>{
    res.send("This is our book service !");
})

app.post("/book",(req,res)=>{
   var newBook= {
       title: req.body.title,
       author: req.body.author,
       numberPages: req.body.numberPages,
       publisher: req.body.publisher

   }
   var book=new Book(newBook)
   book.save().then(()=>{
       console.log("new Book created")
   }).catch((err)=>{
       if(err){
           throw err;
       }
   })
   res.send("A new book created with success!")
   
})

app.listen(3001,()=>{
    console.log("Up and running!--This is our Books Service");
})