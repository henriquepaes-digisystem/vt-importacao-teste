package br.com.alelo.entities;

/**
 * Contém dados do(s) endereços(s) da(s) empresa(s) 
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class Endereco {
	private long id;
	private long cnpj;
	private long enderecoTrabalhoEntrega;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	private String responsavelRecebimento;
	private String brancos;
	private long sequenciaRegistro;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public long getEnderecoTrabalhoEntrega() {
		return enderecoTrabalhoEntrega;
	}
	public void setEnderecoTrabalhoEntrega(long enderecoTrabalhoEntrega) {
		this.enderecoTrabalhoEntrega = enderecoTrabalhoEntrega;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getResponsavelRecebimento() {
		return responsavelRecebimento;
	}
	public void setResponsavelRecebimento(String responsavelRecebimento) {
		this.responsavelRecebimento = responsavelRecebimento;
	}
	public String getBrancos() {
		return brancos;
	}
	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}
	public long getSequenciaRegistro() {
		return sequenciaRegistro;
	}
	public void setSequenciaRegistro(long sequenciaRegistro) {
		this.sequenciaRegistro = sequenciaRegistro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((brancos == null) ? 0 : brancos.hashCode());
		result = prime * result + (int) (cep ^ (cep >>> 32));
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + (int) (enderecoTrabalhoEntrega ^ (enderecoTrabalhoEntrega >>> 32));
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((responsavelRecebimento == null) ? 0 : responsavelRecebimento.hashCode());
		result = prime * result + (int) (sequenciaRegistro ^ (sequenciaRegistro >>> 32));
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (cep != other.cep)
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (enderecoTrabalhoEntrega != other.enderecoTrabalhoEntrega)
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id != other.id)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (responsavelRecebimento == null) {
			if (other.responsavelRecebimento != null)
				return false;
		} else if (!responsavelRecebimento.equals(other.responsavelRecebimento))
			return false;
		if (sequenciaRegistro != other.sequenciaRegistro)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return id
				+ String.format("%014d", cnpj)
				+ String.format("%03d", enderecoTrabalhoEntrega)
				+ String.format("%-50.50s", logradouro)
				+ String.format("%-15.15s", numero)
				+ String.format("%-20.20s", complemento)
				+ String.format("%-35.35s", bairro)
				+ String.format("%08d", cep)
				+ String.format("%-30.30s", cidade)
				+ String.format("%-2.2s", estado)
				+ String.format("%-45.45s", responsavelRecebimento) 
				+ String.format("%-11.11s", brancos)
				+ String.format("%06d", sequenciaRegistro);
	}
}