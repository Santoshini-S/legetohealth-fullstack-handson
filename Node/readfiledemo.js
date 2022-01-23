var fs = require('fs');

fs.readFile('user.json' ,'utf8',function(err,data){
    console.log(data)
})