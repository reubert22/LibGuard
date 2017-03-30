var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/post');
var Schema = mongoose.Schema;

var livroSchema = new Schema({
	titulo: {type: String, required: true},
	autor: {type: String, required: true},
	editor: {type: String, required: true},
	isbn: {type: String, required: true}
});

var Livro = mongoose.model('livro', livroSchema);

exports.index = function(req, res){
	res.render('index', {title: 'LibGuard'});
};

exports.adicionarLivro = function(req, res){
	var livro = new Livro(req.body);
	livro.save(function(error, livro){
		if(error){
			 res.sendStatus(500);
		}else{
			res.sendStatus(201);
		}
	});
};

exports.removerLivro = function(req, res){
	var arrayId = [];
	for(var i = 0; i < req.body.length; i++){
		arrayId[i] = req.body[i]._id;
	}
	Livro.remove({ _id:{ $in: arrayId } }, function(err){
		if(!err){
			res.sendStatus(201);
		}else{
			res.sendStatus(500);
		}
	});
};

exports.listarLivros = function(req, res){
	Livro.find({}, function(error, livros){
		if(error) res.sendStatus(500);

		res.json({livros: livros});
	});
};
