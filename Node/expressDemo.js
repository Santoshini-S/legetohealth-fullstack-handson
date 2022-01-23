let express=require("express");
let app=express();
let port = 8080;
app.get('/employee/:id', (request,response)=>{
    console.log(request.params.id);
    let employee = {id : 100, name : "Raj" , salary : 35000};
    response.json(employee);

});

app.post('/employee/:id/:name/:salary', (request,response) =>{
    let p = request.params;
    let employee = {id: p.id, name : p.name,salry : p.salary};
    resoonse.json(employee);
});
app.put('/', (request,response) =>{
    response.json('Put Request Form /');
});
app.delete('/', (request,response) =>{
    response.json('Delete Request From / ')
});
app.listen(port, () => console.log('listening to ${port}'));