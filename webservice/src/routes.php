<?php
// Routes

$app->post('/pedido/new', function ($request, $response) {

	$db = $this->db;
	$sth = $db->prepare("INSERT INTO pedido VALUES (DEFAULT, :n_mesa, :tamanho, :fruta, :acomp, :cobertura)");

	$pedido = $request->getParsedBody();
	
	unset($posto['n_pedido']);
	$sth->execute($pedido);
	return $response->withJson($pedido); 

});
