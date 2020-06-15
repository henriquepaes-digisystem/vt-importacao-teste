package br.com.alelo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.alelo.entities.DadosAdicionais;

public class DadosAdicionaisRepositorio {
	public List<DadosAdicionais> generateData() {
		List<DadosAdicionais> listaDadosAdicionais = new ArrayList<DadosAdicionais>();
		
		DadosAdicionais dadosAdicionais = new DadosAdicionais();
		dadosAdicionais.setId(5);
		dadosAdicionais.setCnpj(4792521000180L);
		dadosAdicionais.setMatricula("AAA001");
		dadosAdicionais.setNomeMae("MARIA IVANEIDE DE SOUZA");
		dadosAdicionais.setBrancos("");
		dadosAdicionais.setSequenciaRegistro(15);
		
		DadosAdicionais dadosAdicionais2 = new DadosAdicionais();
		dadosAdicionais2.setId(5);
		dadosAdicionais2.setCnpj(4792521000180L);
		dadosAdicionais2.setMatricula("AAA002");
		dadosAdicionais2.setNomeMae("MARCIA VELOSO DE OLIVEIRA");
		dadosAdicionais2.setBrancos("");
		dadosAdicionais2.setSequenciaRegistro(16);		
		
		DadosAdicionais dadosAdicionais3 = new DadosAdicionais();
		dadosAdicionais3.setId(5);
		dadosAdicionais3.setCnpj(4792521000180L);
		dadosAdicionais3.setMatricula("AAA003");
		dadosAdicionais3.setNomeMae("ANEZIA CRISPIM MOURA");
		dadosAdicionais3.setBrancos("");
		dadosAdicionais3.setSequenciaRegistro(17);			
		
		listaDadosAdicionais.add(dadosAdicionais);
		listaDadosAdicionais.add(dadosAdicionais2);
		listaDadosAdicionais.add(dadosAdicionais3);
		
		return listaDadosAdicionais;
	}
}