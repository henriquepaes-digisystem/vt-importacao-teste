package br.com.alelo.repository;

import br.com.alelo.entities.Rodape;

/**
 * 
 * 
 * @author henrique.paes
 * @version 1.0.0
 * @since 2020
 */
public class RodapeRepositorio {
	public Rodape generateData() {
		Rodape rodape = new Rodape();
		rodape.setId(9);
		rodape.setQtdeRegistrosTipo1(123);
		rodape.setQtdeRegistrosTipo2(123);
		rodape.setQtdeRegistrosTipo3(123);
		rodape.setQtdeRegistrosTipo4(123);
		rodape.setQtdeRegistrosTipo5(123);
		rodape.setBrancos("");
		
		return rodape;
	}
}