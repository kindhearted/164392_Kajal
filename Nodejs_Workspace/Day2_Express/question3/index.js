var express = require('express');
var app = express();

app.get('/home', function (req, res) {
   res.send('Hello Kajal Kurhade');
})

var server = app.listen(process.argv[2], function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})