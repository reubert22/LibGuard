function livrosController($scope, $http){
	function Livro(){
		this.titulo = '';
		this.autor = '';
		this.editor = '';
		this.isbn = '';
	}

	$scope.livro = new Livro();

	$scope.livros = [];

	/******************************************************
	* Faz a requisição para mostrar os contatos adicionados
	******************************************************/
	$http.get('/livros').success(function(response){
		$scope.livros = response.livros;
	});

	/*******************************************
	* Função responsavel por adicionar os livros
	*******************************************/
	$scope.adicionaLivro = function(){
		$http.post('/livro', $scope.livro).success(function(){
			$scope.livros.push($scope.livro);
			$scope.livro = new Livro();
		});
	}

	/*********************************************************************
	* Como o proprio nome diz essa função apaga os livros selecionados
	* Por meio do checkbox e com o auxilio da funcao livroSelecionado,
	* filtramos aqueles livros que são selecionados e colocamos em um novo
	* array para que eles possam ser apagados posteriormente.
	* Temos uma requisição POST para apagar aqueles livros que foram
	* selecionados.
	*********************************************************************/
	$scope.apagarLivro = function(livros){
		var livrosSelecionados = livros.filter(function(livro){
			if(livro.selecionado) return livro;
		});
		$http.post('/livros', livrosSelecionados).then(function(response){
			$scope.livros = livros.filter(function(livro){
				if(!livro.selecionado) return livro;
			});
		}, function(response){
			console.log("Erro ao remover livro.");
		});
	};

	$scope.livroSelecionado = function(livros){
		return livros.some(function(livros){
			return livros.selecionado;
		});
	};


}
