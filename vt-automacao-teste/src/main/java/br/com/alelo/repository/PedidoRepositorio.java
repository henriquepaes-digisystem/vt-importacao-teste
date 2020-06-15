package br.com.alelo.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.alelo.entities.Beneficio;
import br.com.alelo.entities.DadosAdicionais;
import br.com.alelo.entities.Endereco;
import br.com.alelo.entities.Pedido;
import br.com.alelo.entities.Residencia;
import br.com.alelo.entities.Usuario;

public class PedidoRepositorio {
	/**
	 * Salvar um ou mais pedidos em um arquivo.
	 * 
	 * @param listaPedidos Lista de Pedidos que deverão ser gravados no arquivo.
	 * @throws IOException 
	 * @apiNote Tipo: Arquivo Texto em formato ASCII
	 * Nome: AAAAMMDDnnn.APS onde:
	 * <ul>
	 * 	<li>AAAA - ano em que foi gerado o arquivo (2019, 2020, etc)</li>
	 * 	<li>MM - mês em que foi gerado o arquivo (00..12)</li>
	 * 	<li>DD - dia em que foi gerado o arquivo (01..31)</li>
	 * 	<li>nnn - sequencia diaria do arquivo iniciado em 001 (quando enviado mais de um arquivo no dia)</li>
	 * </ul>
	 */
	public String setDataOnFile(Pedido pedido) throws IOException {
		String nameOfFile = returnNameOfFile();	
		BufferedWriter buffeWrite = new BufferedWriter(new FileWriter(".\\repositorio\\" + nameOfFile));
		
		try {		
			// Cabecalho
			buffeWrite.append(pedido.getCabecalho().toString() + "\n");
			
			// Enderecos
			for (Endereco endereco : pedido.getEndereco())
				buffeWrite.append(endereco.toString() + "\n");
			
			// Usuarios
			for (Usuario usuario : pedido.getUsuario())
				buffeWrite.append(usuario.toString() + "\n");
			
			// Beneficio
			for (Beneficio beneficio : pedido.getBeneficio())
				buffeWrite.append(beneficio.toString() + "\n");
			
			// Residencia
			for (Residencia residencia : pedido.getResidencia())
				buffeWrite.append(residencia.toString() + "\n");
			
			// Dados Adicionais
			for (DadosAdicionais dadosAdicionais : pedido.getDadosAdicionais())
				buffeWrite.append(dadosAdicionais.toString() + "\n");	
			
			// Rodape
			buffeWrite.append(pedido.getRodape().toString());
			
			return ".\\repositorio\\" + nameOfFile;
		} finally {
			buffeWrite.close();
		}	
	}
	
	private String returnNameOfFile() throws IOException {
		Calendar calendar = Calendar.getInstance();		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		DecimalFormat df = new DecimalFormat("000");
		
		new File("repositorio").mkdir();
		
		File file = new File(".\\repositorio");		
        File[] files = file.listFiles (new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".aps");
            } 
        });		
		
        int contador = 1;
	    for (File arquivo : files)
			if(arquivo.getName().contains(sdf.format(calendar.getTimeInMillis())))
				contador++;

	    return sdf.format(calendar.getTimeInMillis()) + df.format(contador) + ".APS";
	}
}