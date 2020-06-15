package br.com.alelo.test.steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.util.List;

import org.apache.http.HttpStatus;

import br.com.alelo.config.BaseAPI;
import br.com.alelo.entities.Beneficio;
import br.com.alelo.entities.Cabecalho;
import br.com.alelo.entities.DadosAdicionais;
import br.com.alelo.entities.Endereco;
import br.com.alelo.entities.Pedido;
import br.com.alelo.entities.Residencia;
import br.com.alelo.entities.Rodape;
import br.com.alelo.entities.Usuario;
import br.com.alelo.repository.BeneficioRepositorio;
import br.com.alelo.repository.CabecalhoRepositorio;
import br.com.alelo.repository.DadosAdicionaisRepositorio;
import br.com.alelo.repository.EnderecoRepositorio;
import br.com.alelo.repository.PedidoRepositorio;
import br.com.alelo.repository.ResidenciaRepositorio;
import br.com.alelo.repository.RodapeRepositorio;
import br.com.alelo.repository.UsuarioRepositorio;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImportacaoArquivoSteps extends BaseAPI {
	@Given("^que foi criado o arquivo corretamente$")
	public void queFoiCriadoOArquivoCorretamente() throws Throwable {
		Cabecalho cabecalho = new CabecalhoRepositorio().generateData();
		
		List<Endereco> listEndereco = new EnderecoRepositorio().generateData();		
		List<Usuario> listUsuario = new UsuarioRepositorio().generateData();		
		List<Beneficio> listBeneficio = new BeneficioRepositorio().generateData(); 				
		List<Residencia> listResidencia = new ResidenciaRepositorio().generateData();		
		List<DadosAdicionais> listDadosAdicionais = new DadosAdicionaisRepositorio().generateData();											
												
		Rodape rodape = new RodapeRepositorio().generateData();
							
		Pedido pedido = new Pedido();
		pedido.setCabecalho(cabecalho);
		pedido.setEndereco(listEndereco);
		pedido.setUsuario(listUsuario);
		pedido.setBeneficio(listBeneficio);
		pedido.setResidencia(listResidencia);
		pedido.setDadosAdicionais(listDadosAdicionais);
		pedido.setRodape(rodape);
	
		PedidoRepositorio pr = new PedidoRepositorio();
		String arquivoCriado = pr.setDataOnFile(pedido); 
		
		File fileOutput = new File(arquivoCriado);
	}

	@When("^importar para a API$")
	public void importarParaAAPI() throws Throwable {
		preCondition();
		
		given().
			pathParam("value", 1)
		.when().
			get("/{value}")
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body("userId", is(1), 
				  "id", is(1), 
				  "title", equalTo("delectus aut autem"), 
				  "completed", equalTo(false));
	}

	@Then("^a especificacao deve finalizar com sucesso$")
	public void aEspecificaODeveFinalizarComSucesso() throws Throwable {

	}
}