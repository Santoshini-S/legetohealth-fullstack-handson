let http = require('http');
let url = require('url');
let port = 9090;
let Server = http.createServer((request,response)=>{
    if(request.url !='/favicon.ico'){
        let urlObject = url.parse(request.url,true);
        console.log(urlObject.query.username,urlObject.query.age);
        response.writeHead(200,{'content-type': 'text/html'});
        response.write('<h2>Welcome to node web</h2></h2>');
        response.end();
    }

});
Server.listen(port, () => console.log('Server started in ${port}'));

