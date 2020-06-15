package br.com.alelo.entities;

/**
 * Contém dados do final do arquivo 
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class Rodape {
	private long id;
	private long qtdeRegistrosTipo1;
	private long qtdeRegistrosTipo2;
	private long qtdeRegistrosTipo3;
	private long qtdeRegistrosTipo4;
	private long qtdeRegistrosTipo5;
	private String brancos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getQtdeRegistrosTipo1() {
		return qtdeRegistrosTipo1;
	}
	public void setQtdeRegistrosTipo1(long qtdeRegistrosTipo1) {
		this.qtdeRegistrosTipo1 = qtdeRegistrosTipo1;
	}
	public long getQtdeRegistrosTipo2() {
		return qtdeRegistrosTipo2;
	}
	public void setQtdeRegistrosTipo2(long qtdeRegistrosTipo2) {
		this.qtdeRegistrosTipo2 = qtdeRegistrosTipo2;
	}
	public long getQtdeRegistrosTipo3() {
		return qtdeRegistrosTipo3;
	}
	public void setQtdeRegistrosTipo3(long qtdeRegistrosTipo3) {
		this.qtdeRegistrosTipo3 = qtdeRegistrosTipo3;
	}
	public long getQtdeRegistrosTipo4() {
		return qtdeRegistrosTipo4;
	}
	public void setQtdeRegistrosTipo4(long qtdeRegistrosTipo4) {
		this.qtdeRegistrosTipo4 = qtdeRegistrosTipo4;
	}
	public long getQtdeRegistrosTipo5() {
		return qtdeRegistrosTipo5;
	}
	public void setQtdeRegistrosTipo5(long qtdeRegistrosTipo5) {
		this.qtdeRegistrosTipo5 = qtdeRegistrosTipo5;
	}
	public String getBrancos() {
		return brancos;
	}
	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brancos == null) ? 0 : brancos.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (qtdeRegistrosTipo1 ^ (qtdeRegistrosTipo1 >>> 32));
		result = prime * result + (int) (qtdeRegistrosTipo2 ^ (qtdeRegistrosTipo2 >>> 32));
		result = prime * result + (int) (qtdeRegistrosTipo3 ^ (qtdeRegistrosTipo3 >>> 32));
		result = prime * result + (int) (qtdeRegistrosTipo4 ^ (qtdeRegistrosTipo4 >>> 32));
		result = prime * result + (int) (qtdeRegistrosTipo5 ^ (qtdeRegistrosTipo5 >>> 32));
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
		Rodape other = (Rodape) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (id != other.id)
			return false;
		if (qtdeRegistrosTipo1 != other.qtdeRegistrosTipo1)
			return false;
		if (qtdeRegistrosTipo2 != other.qtdeRegistrosTipo2)
			return false;
		if (qtdeRegistrosTipo3 != other.qtdeRegistrosTipo3)
			return false;
		if (qtdeRegistrosTipo4 != other.qtdeRegistrosTipo4)
			return false;
		if (qtdeRegistrosTipo5 != other.qtdeRegistrosTipo5)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return id
				+ String.format("%06d", qtdeRegistrosTipo1)
				+ String.format("%06d", qtdeRegistrosTipo2)
				+ String.format("%06d", qtdeRegistrosTipo3)
				+ String.format("%06d", qtdeRegistrosTipo4)
				+ String.format("%06d", qtdeRegistrosTipo5)
				+ String.format("%-203.203s", brancos);
	}
}