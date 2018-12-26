var express = require('express');
var app = express();

var cart = ["Mobile", "Laptop", "Shoes", "Fruits"];
var price=['25000','45000','1500','100'];


app.get('/', function(req, res){
    res.send('Shopping Cart List ' +cart);
});


app.post('/items/:name/:cost',function(req,res){
    var name=req.params.name;
    var cost=req.params.cost;

   cart.push(name);
    price.push(cost);
   
    res.send(' Prices of items ' +cart + ' are '+ price+ ' respectively');

})

app.get('/items/:id',function(req,res){
    var id=req.params.id;
    if (id>cart.length){
        res.send('Invalid Id');
    }
    else{
    res.send('Price of item ' +cart[id] + ' is '+ price[id]);
    }
})

app.patch('/items/:id/:name/:cost',function(req,res){
    var name=req.params.name;
    var cost=req.params.cost;
    var id=req.params.id;

    cart[id]=name;
    price[id]=cost;

    res.send('Price of item ' +cart[id] + ' is '+ price[id]);
})


app.delete('/delete/:id',function(req,res){
    var id=req.params.id;
    if (id>cart.length){
        res.send('Invalid Id');
    }
    else{
        cart.splice(id);
        price.splice(id);

        res.send('Prices of items ' +cart + ' are '+ price+ ' respectively');
    }
})


app.listen(3002);