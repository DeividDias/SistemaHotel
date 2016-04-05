package hotel.model.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codReserva;

	private Date dataEntrada;
	private Date dataSaida;

	@OneToOne
	private Quarto quarto;

	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;

//	@OneToOne
//	private Pagamento pagamento;
	
	public Reserva() {
		
	}

	public Reserva(Date dataEntrada, Date dataSaida, Quarto quarto,
			Cliente cliente) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.quarto = quarto;
		this.cliente = cliente;
	}

	public Integer getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(Integer codReserva) {
		this.codReserva = codReserva;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Reserva [codReserva=" + codReserva + 
				", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida +
				", quarto=" + quarto + ", cliente=" + cliente + "]";
	}	

}
