package br.com.alelo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.alelo.entities.Beneficio;

public class BeneficioRepositorio {
	public List<Beneficio> generateData() {
		List<Beneficio> listaBeneficio = new ArrayList<Beneficio>();
		
		Beneficio beneficio = new Beneficio();
		beneficio.setId(3);
		beneficio.setCnpj(4792521000180L);
		beneficio.setMatricula("AAA001");
		beneficio.setCodigoBeneficio(000204);
		beneficio.setDescricaoBeneficio("BILHETE UNICO-ONIBUS SPTRANS");
		beneficio.setValorItem(000000000440);
		beneficio.setQuantidadePorDia(002);
		beneficio.setNumeroCartao("7114100435411");
		beneficio.setBrancos("");
		beneficio.setSequenciaArquivo(6);
		
		Beneficio beneficio2 = new Beneficio();
		beneficio2.setId(3);
		beneficio2.setCnpj(4792521000180L);
		beneficio2.setMatricula("AAA001");
		beneficio2.setCodigoBeneficio(001347);
		beneficio2.setDescricaoBeneficio("AUTO VIACAO CAMPESTRE - COSMOPOLIS - URBANO");
		beneficio2.setValorItem(000000000440);
		beneficio2.setQuantidadePorDia(002);
		beneficio2.setNumeroCartao("7114100435411");
		beneficio2.setBrancos("");
		beneficio2.setSequenciaArquivo(7);	
		
		Beneficio beneficio3 = new Beneficio();
		beneficio3.setId(3);
		beneficio3.setCnpj(4792521000180L);
		beneficio3.setMatricula("AAA002");
		beneficio3.setCodigoBeneficio(000204);
		beneficio3.setDescricaoBeneficio("BILHETE UNICO-ONIBUS SPTRANS");
		beneficio3.setValorItem(000000000440);
		beneficio3.setQuantidadePorDia(002);
		beneficio3.setNumeroCartao("TEMP260160998274549255");
		beneficio3.setBrancos("");
		beneficio3.setSequenciaArquivo(8);	
		
		Beneficio beneficio4 = new Beneficio();
		beneficio4.setId(3);
		beneficio4.setCnpj(4792521000180L);
		beneficio4.setMatricula("AAA002");
		beneficio4.setCodigoBeneficio(001432);
		beneficio4.setDescricaoBeneficio("VIACAO BONAVITA - CAMPINAS / COSMOPOLIS - EMTU RMC");
		beneficio4.setValorItem(000000000440);
		beneficio4.setQuantidadePorDia(002);
		beneficio4.setNumeroCartao("TEMP260160998274549255");
		beneficio4.setBrancos("");
		beneficio4.setSequenciaArquivo(9);	
		
		Beneficio beneficio5 = new Beneficio();
		beneficio5.setId(3);
		beneficio5.setCnpj(4792521000180L);
		beneficio5.setMatricula("AAA003");
		beneficio5.setCodigoBeneficio(1091);
		beneficio5.setDescricaoBeneficio("TRANSURC - CAMPINAS - ELETRONICO");
		beneficio5.setValorItem(000000000440);
		beneficio5.setQuantidadePorDia(002);
		beneficio5.setNumeroCartao("TEMP260160998274549255");
		beneficio5.setBrancos("");
		beneficio5.setSequenciaArquivo(10);	
		
		Beneficio beneficio6 = new Beneficio();
		beneficio6.setId(3);
		beneficio6.setCnpj(4792521000180L);
		beneficio6.setMatricula("AAA003");
		beneficio6.setCodigoBeneficio(001312);
		beneficio6.setDescricaoBeneficio("VIACAO BONAVITA - PAULINIA / COSMOPOLIS - EMTU RMC");
		beneficio6.setValorItem(000000000440);
		beneficio6.setQuantidadePorDia(002);
		beneficio6.setNumeroCartao("TEMP260160998274549255");
		beneficio6.setBrancos("");
		beneficio6.setSequenciaArquivo(11);		
		
		listaBeneficio.add(beneficio);
		listaBeneficio.add(beneficio2);
		listaBeneficio.add(beneficio3);
		listaBeneficio.add(beneficio4);
		listaBeneficio.add(beneficio5);
		listaBeneficio.add(beneficio6);
		
		return listaBeneficio;
	}
}