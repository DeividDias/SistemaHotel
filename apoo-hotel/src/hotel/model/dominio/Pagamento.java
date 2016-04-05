package hotel.model.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PAGAMENTO")
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codPagamento;
	private Date dataPagamento;
	private Date dataVencimento;
	private BigDecimal valor;
	private Integer percentualDesconto;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="reserva")
	private Reserva reserva;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="quarto")
	private Quarto quarto;

	public Integer getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(Integer codPagamento) {
		this.codPagamento = codPagamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(Integer percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPagamento == null) ? 0 : codPagamento.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (codPagamento == null) {
			if (other.codPagamento != null)
				return false;
		} else if (!codPagamento.equals(other.codPagamento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pagamento [codPagamento=" + codPagamento + ", dataPagamento="
				+ dataPagamento + ", dataVencimento=" + dataVencimento
				+ ", valor=" + valor + ", percentualDesconto="
				+ percentualDesconto + ", reserva=" + reserva + ", quarto="
				+ quarto + "]";
	}

}
