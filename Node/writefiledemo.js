let fs = require('fs');

let text = "This is simple text\n";
fs.appendFile('users.json','console.log("done)',function(err){
    console.log("Data saved")
})