var express = require('express'),
	routes = require('./routes'),
	http = require('http'),
	path = require('path'),
	bodyParser = require('body-parser');

var app = express();

app.use(bodyParser());
app.use(express.static(path.join(__dirname, 'public')));
app.set('port', process.env.PORT || 3000);
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.get('/', routes.index);
app.post('/livro', routes.adicionarLivro);
app.get('/livros', routes.listarLivros);
app.post('/livros', routes.removerLivro);

http.createServer(app).listen(app.get('port'), function(){
	console.log('Express server listening on port ' + app.get('port'));
});

//isso é route e estaba solto com package
