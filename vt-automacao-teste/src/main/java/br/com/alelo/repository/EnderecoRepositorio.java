package br.com.alelo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.alelo.entities.Endereco;

public class EnderecoRepositorio {
	public List<Endereco> generateData() {
		List<Endereco> listEndereco = new ArrayList<Endereco>();
		
		Endereco endereco = new Endereco();
		endereco.setId(1);
		endereco.setCnpj(4792521000180L);
		endereco.setEnderecoTrabalhoEntrega(001);
		endereco.setLogradouro("AVENIDA ANTONIO FREDERICO OZANAN");
		endereco.setNumero("1440");
		endereco.setComplemento("BLOCO XII");
		endereco.setBairro("VILA SANTANA II");
		endereco.setCep(13219001);
		endereco.setCidade("JUNDIAI");
		endereco.setEstado("SP");
		endereco.setResponsavelRecebimento("");
		endereco.setBrancos("");
		endereco.setSequenciaRegistro(000002);
		
		listEndereco.add(endereco);
		
		return listEndereco;
	}
}