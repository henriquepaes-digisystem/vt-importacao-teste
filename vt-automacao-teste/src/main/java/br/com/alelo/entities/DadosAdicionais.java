package br.com.alelo.entities;

/**
 * Contém dados adicionais do(s) usuário(s) da(s) empresa(s)
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class DadosAdicionais {
	private long id;
	private long cnpj;
	private String matricula;
	private String nomeMae;
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
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
		result = prime * result + ((brancos == null) ? 0 : brancos.hashCode());
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
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
		DadosAdicionais other = (DadosAdicionais) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (id != other.id)
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (sequenciaRegistro != other.sequenciaRegistro)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return id
				+ String.format("%014d", cnpj)
				+ String.format("%-15.15s", matricula)
				+ String.format("%-50.50s", nomeMae)
				+ String.format("%-154.154s", brancos)
				+ String.format("%06d", sequenciaRegistro);
	}
}