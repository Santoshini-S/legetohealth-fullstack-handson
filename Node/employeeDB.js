let app = require("express")();
let MongoClient = require('mongodb').MongoClient;
let dbURL = "mongodb://locahost:27017";
let port = 9090;
app.listen(port, () => console.log("Node server running in $(port)"));
app.get('/employee/:id' , (request,response) =>{
    MongoClient.connect(dbURL, {userNewUrlParser: true}, {err,client} => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection('employee').find({_id: id});
            let x = 0;
            doc.forEach(record) => {
                x++;
                response.json(record);

            }, () => {
                if(x==0){
                    response.json({error : 'Sorry id ${id} is not found'});
                }
                client.close();
            
                
            });
        }

    });

});