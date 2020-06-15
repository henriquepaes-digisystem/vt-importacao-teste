Feature: Importacao de arquivo.

@fast @importacao
Scenario: Importar arquivo para a API
	Given que foi criado o arquivo corretamente
	When importar para a API
	Then a especificacao deve finalizar com sucesso