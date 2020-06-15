package br.com.alelo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.alelo.entities.Residencia;

public class ResidenciaRepositorio {
	public List<Residencia> generateData() {
		List<Residencia> listaResidencia = new ArrayList<Residencia>();
		
		Residencia residencia = new Residencia();
		residencia.setId(4);
		residencia.setCnpj(4792521000180L);
		residencia.setMatricula("AAA001");
		residencia.setLogradouro("RUA LUIZA RIZZO PESENTE");
		residencia.setNumero("544");
		residencia.setComplemento("");
		residencia.setBairro("VILA PINHEIRO");
		residencia.setCep(07700000);
		residencia.setCidade("CAIEIRAS");
		residencia.setEstado("SP");
		residencia.setSugestaoRota("N");
		residencia.setValorTotalValesTransporte(0);
		residencia.setBrancos("");
		residencia.setSequenciaRegistro(12);
		
		Residencia residencia2 = new Residencia();
		residencia2.setId(4);
		residencia2.setCnpj(4792521000180L);
		residencia2.setMatricula("AAA002");
		residencia2.setLogradouro("RUA PROFESSOR MESSIAS L. C. DE MATOS");
		residencia2.setNumero("463");
		residencia2.setComplemento("");
		residencia2.setBairro("JARDIM VASSOURAS");
		residencia2.setCep(7950100);
		residencia2.setCidade("FRANCISCO MORATO");
		residencia2.setEstado("SP");
		residencia2.setSugestaoRota("S");
		residencia2.setValorTotalValesTransporte(0);
		residencia2.setBrancos("");
		residencia2.setSequenciaRegistro(13);
		
		Residencia residencia3 = new Residencia();
		residencia3.setId(4);
		residencia3.setCnpj(4792521000180L);
		residencia3.setMatricula("AAA003");
		residencia3.setLogradouro("RUA HUMBERTO DE CAMPOS");
		residencia3.setNumero("59");
		residencia3.setComplemento("");
		residencia3.setBairro("JARDIM SANTO ANTONIO");
		residencia3.setCep(7916000);
		residencia3.setCidade("FRANCISCO MORATO");
		residencia3.setEstado("SP");
		residencia3.setSugestaoRota("N");
		residencia3.setValorTotalValesTransporte(0);
		residencia3.setBrancos("");
		residencia3.setSequenciaRegistro(14);		
		
		listaResidencia.add(residencia);
		listaResidencia.add(residencia2);
		listaResidencia.add(residencia3);
		
		return listaResidencia;
	}
}