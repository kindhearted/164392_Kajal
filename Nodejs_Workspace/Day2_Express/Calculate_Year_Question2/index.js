var express= require('express')();

express.get('/:year/:age',function(req,res)
{
  var age=req.params.age;
  var birthyear=req.params.year-age;
  res.send("The year you were born is " + birthyear);
});
express.listen(3000);