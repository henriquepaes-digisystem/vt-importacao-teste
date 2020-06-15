package br.com.alelo.entities;

import java.util.List;

/**
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 * @apiNote Versão do Layout 07.00
 */

public class Pedido {
	private Cabecalho cabecalho;
	private List<Endereco> endereco;
	private List<Usuario> usuario;
	private List<Beneficio> beneficio;
	private List<Residencia> residencia;
	private List<DadosAdicionais> dadosAdicionais;
	private Rodape rodape;

	public Cabecalho getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	public List<Beneficio> getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(List<Beneficio> beneficio) {
		this.beneficio = beneficio;
	}
	public List<Residencia> getResidencia() {
		return residencia;
	}
	public void setResidencia(List<Residencia> residencia) {
		this.residencia = residencia;
	}
	public List<DadosAdicionais> getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(List<DadosAdicionais> dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public Rodape getRodape() {
		return rodape;
	}
	public void setRodape(Rodape rodape) {
		this.rodape = rodape;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beneficio == null) ? 0 : beneficio.hashCode());
		result = prime * result + ((cabecalho == null) ? 0 : cabecalho.hashCode());
		result = prime * result + ((dadosAdicionais == null) ? 0 : dadosAdicionais.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((residencia == null) ? 0 : residencia.hashCode());
		result = prime * result + ((rodape == null) ? 0 : rodape.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (beneficio == null) {
			if (other.beneficio != null)
				return false;
		} else if (!beneficio.equals(other.beneficio))
			return false;
		if (cabecalho == null) {
			if (other.cabecalho != null)
				return false;
		} else if (!cabecalho.equals(other.cabecalho))
			return false;
		if (dadosAdicionais == null) {
			if (other.dadosAdicionais != null)
				return false;
		} else if (!dadosAdicionais.equals(other.dadosAdicionais))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (residencia == null) {
			if (other.residencia != null)
				return false;
		} else if (!residencia.equals(other.residencia))
			return false;
		if (rodape == null) {
			if (other.rodape != null)
				return false;
		} else if (!rodape.equals(other.rodape))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pedido [cabecalho=" + cabecalho + ", endereco=" + endereco + ", usuario=" + usuario + ", beneficio="
				+ beneficio + ", residencia=" + residencia + ", dadosAdicionais=" + dadosAdicionais + ", rodape="
				+ rodape + "]";
	}
}