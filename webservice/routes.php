<?php
// Routes

$app->get('/tarefa/list', function ($request, $response) {

	$db = $this->db;
	foreach($db->query('SELECT * FROM tarefa') as $row){
		$return[] = $row;
	};

	return $response->withJson($return);
});


$app->post('/tarefa/new', function ($request, $response) {

	$db = $this->db;
	$sth = $db->prepare("INSERT INTO tarefa (titulo, texto, criador) VALUES (:titulo, :texto, :criador)");

	$dados = $request->getParsedBody();
	
	$insertTerefa["titulo"] = $dados["titulo"];
	$insertTerefa["texto"] = $dados["texto"];
	$insertTerefa["criador"] = $dados["criador"];
	
	$sth->execute($insertTerefa);
	
	return $response->withJson($insertTerefa); 

});
