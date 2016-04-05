package hotel.model.dominio;

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
@Table(name="TB_SERVICODEQUARTO")
public class ServicoDeQuarto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codServicoDeQuarto;
	private String tipo;
	private BigDecimal valor;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="reserva")
	private Reserva reserva;

	@OneToMany(mappedBy = "servicoDeQuarto")
    @Column(nullable=true)
	private Collection<Produto> produto;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="quarto")
	private Quarto quarto;

	@ManyToOne(optional = true)
	@JoinColumn(name="servicoDeQuarto")
	private ServicoDeQuarto servicoDeQuarto;

	
	public ServicoDeQuarto(){
		
	}
	
	
	
	public ServicoDeQuarto(Integer codServicoDeQuarto, String tipo,
			BigDecimal valor, Reserva reserva, Collection<Produto> produto,
			Quarto quarto) {
		super();
		this.codServicoDeQuarto = codServicoDeQuarto;
		this.tipo = tipo;
		this.valor = valor;
		this.reserva = reserva;
		this.produto = produto;
		this.quarto = quarto;
	}



	public Integer getCodServicoDeQuarto() {
		return codServicoDeQuarto;
	}

	public void setCodServicoDeQuarto(Integer codServicoDeQuarto) {
		this.codServicoDeQuarto = codServicoDeQuarto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public ServicoDeQuarto getServicoDeQuarto() {
		return servicoDeQuarto;
	}

	public void setServicoDeQuarto(ServicoDeQuarto servicoDeQuarto) {
		this.servicoDeQuarto = servicoDeQuarto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codServicoDeQuarto == null) ? 0 : codServicoDeQuarto
						.hashCode());
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
		ServicoDeQuarto other = (ServicoDeQuarto) obj;
		if (codServicoDeQuarto == null) {
			if (other.codServicoDeQuarto != null)
				return false;
		} else if (!codServicoDeQuarto.equals(other.codServicoDeQuarto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServicoDeQuarto [codServicoDeQuarto=" + codServicoDeQuarto
				+ ", tipo=" + tipo + ", valor=" + valor + ", reserva="
				+ reserva + "]";
	}
}
