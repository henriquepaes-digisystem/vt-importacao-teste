package br.com.alelo.entities;

/**
 * Contém dados do inicio do arquivo.
 *
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class Cabecalho {
	private long id;
	private long dataArquivo;
	private long cnpj;
	private String razaoSocial;
	private String brancos;
	private long versao;
	private long release;
	private long sequenciaRegistro;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDataArquivo() {
		return dataArquivo;
	}
	public void setDataArquivo(long dataArquivo) {
		this.dataArquivo = dataArquivo;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getBrancos() {
		return brancos;
	}
	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}
	public long getVersao() {
		return versao;
	}
	public void setVersao(long versao) {
		this.versao = versao;
	}
	public long getRelease() {
		return release;
	}
	public void setRelease(long release) {
		this.release = release;
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
		result = prime * result + (int) (dataArquivo ^ (dataArquivo >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + (int) (release ^ (release >>> 32));
		result = prime * result + (int) (sequenciaRegistro ^ (sequenciaRegistro >>> 32));
		result = prime * result + (int) (versao ^ (versao >>> 32));
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
		Cabecalho other = (Cabecalho) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (dataArquivo != other.dataArquivo)
			return false;
		if (id != other.id)
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (release != other.release)
			return false;
		if (sequenciaRegistro != other.sequenciaRegistro)
			return false;
		if (versao != other.versao)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return id
				+ String.format("%08d", dataArquivo) 
				+ String.format("%014d", cnpj)
				+ String.format("%-50.50s", razaoSocial)
				+ String.format("%-157.157s", brancos)
				+ String.format("%02d", versao)
				+ String.format("%02d", release) 
				+ String.format("%06d", sequenciaRegistro);
	}
}