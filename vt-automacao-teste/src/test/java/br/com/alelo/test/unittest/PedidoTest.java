package br.com.alelo.test.unittest;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

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

/**
 * Teste Unitário da Geração do Arquivo para Importação.
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class PedidoTest {

	@Test
	@DisplayName("Criando arquivo layout Pedido Alelo")
	public void adicionaPedidoTest() throws NumberFormatException, Exception {	
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
		
		assertTrue(fileOutput.exists());
	}

}