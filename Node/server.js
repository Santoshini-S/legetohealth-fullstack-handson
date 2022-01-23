let app = require('express')();
let http = require('http').Server(app)
let io = require("socket.io")(http)

app.get('/', (request,response) => {
    response.sendFile(_dirname+"/client.html");
})
http.listen(8080, () => console.log('server running in 8080'));

io.on('connection',(socket) => {
    console.log('client is connected to the serve: '+socket.connected);
    socket.on("clientMessage", (msg) => {
        socket.emit("messageKey", msg);
    });
});