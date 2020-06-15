package br.com.alelo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.alelo.entities.Usuario;

public class UsuarioRepositorio {
	public List<Usuario> generateData() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setCnpj(4792521000180L);
		usuario.setEnderecoTrabalhoEntrega(001);
		usuario.setMatricula("AAA001");
		usuario.setNomeCompleto("KEMILI CRISTINA DE SOUZA");
		usuario.setCpf(39036990807L);
		usuario.setNumeroRG("45226974");
		usuario.setDigitoRG("");
		usuario.setEstadoEmissaoRG("SP");
		usuario.setDataNascimento(16081991);
		usuario.setDepartamento("");
		usuario.setCargo("OPERADOR ATENDIMENTO I");
		usuario.setQuantidadeDiasTrabalhados(015);
		usuario.setSalario("");
		usuario.setBrancos("");
		usuario.setSequenciaRegistro(000003);
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(2);
		usuario2.setCnpj(4792521000180L);
		usuario2.setEnderecoTrabalhoEntrega(001);
		usuario2.setMatricula("AAA002");
		usuario2.setNomeCompleto("THAIANE DE OLIVEIRA FERNANDES");
		usuario2.setCpf(41246121840L);
		usuario2.setNumeroRG("488479484");
		usuario2.setDigitoRG("");
		usuario2.setEstadoEmissaoRG("SP");
		usuario2.setDataNascimento(4121992);
		usuario2.setDepartamento("");
		usuario2.setCargo("OPERADOR ATENDIMENTO I");
		usuario2.setQuantidadeDiasTrabalhados(020);
		usuario2.setSalario("");
		usuario2.setBrancos("");
		usuario2.setSequenciaRegistro(000004);
		
		Usuario usuario3 = new Usuario();
		usuario3.setId(2);
		usuario3.setCnpj(4792521000180L);
		usuario3.setEnderecoTrabalhoEntrega(001);
		usuario3.setMatricula("AAA003");
		usuario3.setNomeCompleto("LUCIMEIRE DE MOURA");
		usuario3.setCpf(22098675844L);
		usuario3.setNumeroRG("306194624");
		usuario3.setDigitoRG("");
		usuario3.setEstadoEmissaoRG("SP");
		usuario3.setDataNascimento(19031976);
		usuario3.setDepartamento("");
		usuario3.setCargo("OPERADOR ATENDIMENTO I");
		usuario3.setQuantidadeDiasTrabalhados(022);
		usuario3.setSalario("");
		usuario3.setBrancos("");
		usuario3.setSequenciaRegistro(000005);	
		
		listaUsuario.add(usuario);
		listaUsuario.add(usuario2);
		listaUsuario.add(usuario3);
		
		return listaUsuario;
	}
}