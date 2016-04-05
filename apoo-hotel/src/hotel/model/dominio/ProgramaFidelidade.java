package hotel.model.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
*/

//@Entity
//@Table(name="TB_PROGRAMAFIDELIDADE")
public class ProgramaFidelidade implements Serializable {
	private static final long serialVersionUID = 1L;

	//@Id
	//@GeneratedValue
	private BigDecimal pontos;
	private Date dataInicio;
	private String observacao;
	
	//@ManyToOne(optional = true)
	//@JoinColumn(name="reserva")
	private Reserva reserva;
	
	//@ManyToOne(optional = true)
	//@JoinColumn(name="cliente")
	private Cliente cliente;

	public BigDecimal getPontos() {
		return pontos;
	}

	public void setPontos(BigDecimal pontos) {
		this.pontos = pontos;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
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
		ProgramaFidelidade other = (ProgramaFidelidade) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProgramaFidelidade [pontos=" + pontos + ", dataInicio="
				+ dataInicio + ", observacao=" + observacao + ", reserva="
				+ reserva + ", cliente=" + cliente + "]";
	}

}
