package br.com.alelo.repository;

import br.com.alelo.entities.Cabecalho;

public class CabecalhoRepositorio {	
	public Cabecalho generateData() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.setId(0);
		cabecalho.setDataArquivo(01062020);
		cabecalho.setCnpj(4792521000180L);
		cabecalho.setRazaoSocial("FIDELITY PROCESSADORA E SERVICOS S.A");
		cabecalho.setBrancos("");
		cabecalho.setVersao(04);
		cabecalho.setRelease(00);
		cabecalho.setSequenciaRegistro(000001);
		
		return cabecalho;
	}
}