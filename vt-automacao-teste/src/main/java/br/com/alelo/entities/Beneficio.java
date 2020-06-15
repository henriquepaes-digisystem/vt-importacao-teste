package br.com.alelo.entities;

/**
 * Contém dados do(s) beneficiário(s) da(s) empresa(s) 
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class Beneficio {
	private long id;
	private long cnpj;
	private String matricula;
	private long codigoBeneficio;
	private String descricaoBeneficio;
	private long valorItem;
	private long quantidadePorDia;
	private String numeroCartao;
	private String brancos;
	private long sequenciaArquivo;
	
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
	public long getCodigoBeneficio() {
		return codigoBeneficio;
	}
	public void setCodigoBeneficio(long codigoBeneficio) {
		this.codigoBeneficio = codigoBeneficio;
	}
	public String getDescricaoBeneficio() {
		return descricaoBeneficio;
	}
	public void setDescricaoBeneficio(String descricaoBeneficio) {
		this.descricaoBeneficio = descricaoBeneficio;
	}
	public long getValorItem() {
		return valorItem;
	}
	public void setValorItem(long valorItem) {
		this.valorItem = valorItem;
	}
	public long getQuantidadePorDia() {
		return quantidadePorDia;
	}
	public void setQuantidadePorDia(long quantidadePorDia) {
		this.quantidadePorDia = quantidadePorDia;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getBrancos() {
		return brancos;
	}
	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}
	public long getSequenciaArquivo() {
		return sequenciaArquivo;
	}
	public void setSequenciaArquivo(long sequenciaArquivo) {
		this.sequenciaArquivo = sequenciaArquivo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brancos == null) ? 0 : brancos.hashCode());
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + (int) (codigoBeneficio ^ (codigoBeneficio >>> 32));
		result = prime * result + ((descricaoBeneficio == null) ? 0 : descricaoBeneficio.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((numeroCartao == null) ? 0 : numeroCartao.hashCode());
		result = prime * result + (int) (quantidadePorDia ^ (quantidadePorDia >>> 32));
		result = prime * result + (int) (sequenciaArquivo ^ (sequenciaArquivo >>> 32));
		result = prime * result + (int) (valorItem ^ (valorItem >>> 32));
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
		Beneficio other = (Beneficio) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (codigoBeneficio != other.codigoBeneficio)
			return false;
		if (descricaoBeneficio == null) {
			if (other.descricaoBeneficio != null)
				return false;
		} else if (!descricaoBeneficio.equals(other.descricaoBeneficio))
			return false;
		if (id != other.id)
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (numeroCartao == null) {
			if (other.numeroCartao != null)
				return false;
		} else if (!numeroCartao.equals(other.numeroCartao))
			return false;
		if (quantidadePorDia != other.quantidadePorDia)
			return false;
		if (sequenciaArquivo != other.sequenciaArquivo)
			return false;
		if (valorItem != other.valorItem)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return id
			+ String.format("%014d", cnpj)
			+ String.format("%-15.15s", matricula)
			+ String.format("%06d", codigoBeneficio)
			+ String.format("%-50.50s", descricaoBeneficio)
			+ String.format("%012d", valorItem)
			+ String.format("%03d", quantidadePorDia)
			+ String.format("%-25.25s", numeroCartao)
			+ String.format("%-108.108s", brancos)
			+ String.format("%06d", sequenciaArquivo);
	}
}