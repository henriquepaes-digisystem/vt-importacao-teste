package br.com.alelo.entities;

/**
 * Contém dados do(s) usuário(s) da(s) empresa(s)
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class Usuario {
	private long id;
	private long cnpj;
	private long enderecoTrabalhoEntrega;
	private String matricula;
	private String nomeCompleto;
	private long cpf;
	private String numeroRG;
	private String digitoRG;
	private String estadoEmissaoRG;
	private long dataNascimento;
	private String departamento;
	private String cargo;
	private long quantidadeDiasTrabalhados;
	private String salario;
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNumeroRG() {
		return numeroRG;
	}
	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}
	public String getDigitoRG() {
		return digitoRG;
	}
	public void setDigitoRG(String digitoRG) {
		this.digitoRG = digitoRG;
	}
	public String getEstadoEmissaoRG() {
		return estadoEmissaoRG;
	}
	public void setEstadoEmissaoRG(String estadoEmissaoRG) {
		this.estadoEmissaoRG = estadoEmissaoRG;
	}
	public long getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getQuantidadeDiasTrabalhados() {
		return quantidadeDiasTrabalhados;
	}
	public void setQuantidadeDiasTrabalhados(long quantidadeDiasTrabalhados) {
		this.quantidadeDiasTrabalhados = quantidadeDiasTrabalhados;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
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
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + (int) (dataNascimento ^ (dataNascimento >>> 32));
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((digitoRG == null) ? 0 : digitoRG.hashCode());
		result = prime * result + (int) (enderecoTrabalhoEntrega ^ (enderecoTrabalhoEntrega >>> 32));
		result = prime * result + ((estadoEmissaoRG == null) ? 0 : estadoEmissaoRG.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		result = prime * result + ((numeroRG == null) ? 0 : numeroRG.hashCode());
		result = prime * result + (int) (quantidadeDiasTrabalhados ^ (quantidadeDiasTrabalhados >>> 32));
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (cpf != other.cpf)
			return false;
		if (dataNascimento != other.dataNascimento)
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (digitoRG == null) {
			if (other.digitoRG != null)
				return false;
		} else if (!digitoRG.equals(other.digitoRG))
			return false;
		if (enderecoTrabalhoEntrega != other.enderecoTrabalhoEntrega)
			return false;
		if (estadoEmissaoRG == null) {
			if (other.estadoEmissaoRG != null)
				return false;
		} else if (!estadoEmissaoRG.equals(other.estadoEmissaoRG))
			return false;
		if (id != other.id)
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		if (numeroRG == null) {
			if (other.numeroRG != null)
				return false;
		} else if (!numeroRG.equals(other.numeroRG))
			return false;
		if (quantidadeDiasTrabalhados != other.quantidadeDiasTrabalhados)
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
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
				+ String.format("%-15.15s", matricula)
				+ String.format("%-50.50s", nomeCompleto)
				+ String.format("%011d", cpf)
				+ String.format("%-9.9s", numeroRG)
				+ String.format("%-2.2s", digitoRG)
				+ String.format("%-2.2s", estadoEmissaoRG)
				+ String.format("%08d", dataNascimento)
				+ String.format("%-45.45s", departamento)
				+ String.format("%-45.45s", cargo)
				+ String.format("%03d", quantidadeDiasTrabalhados)
				+ String.format("%-9.9s", salario)
				+ String.format("%-17.17s", brancos)
				+ String.format("%06d", sequenciaRegistro);
	}
}