package hotel.model.dominio;

import hotel.model.dominio.Cliente;
import hotel.model.dominio.Item;
import hotel.model.dominio.Reserva;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_quarto")
public class Quarto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codQuarto;

	private Integer numero;
	private String tipo;
	private Boolean disponibilidade;
	private BigDecimal valor;
		
	@ManyToOne(optional = true)
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "quarto")
    @Column(nullable=true)
	private Collection<Item> itens;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="reserva")
	private Reserva reserva;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="item")
	private Item item;
	
	public Quarto() {
		
	}
	
	public Quarto(Integer numero, String tipo,
			Boolean disponibilidade, BigDecimal valor) {
		this.numero = numero;
		this.tipo = tipo;
		this.disponibilidade = disponibilidade;
		this.valor = valor;
	}

//	public BigDecimal valorTotalServicos() {
//		return null;
//	}

	public Integer getCodQuarto() {
		return codQuarto;
	}

	public void setCodQuarto(Integer codQuarto) {
		this.codQuarto = codQuarto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Quarto [codQuarto=" + codQuarto + ", numero=" + numero
				+ ", tipo=" + tipo + ", disponibilidade=" + disponibilidade
				+ ", valor=" + valor + ", cliente=" + cliente + "]";
	}

}
