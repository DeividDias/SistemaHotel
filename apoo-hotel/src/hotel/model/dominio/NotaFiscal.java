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
@Table(name="TB_NOTAFISCAL")
public class NotaFiscal  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codNota;

	@ManyToOne(optional = true)
	@JoinColumn(name="pagamento")
	private Pagamento pagamento;

	BigDecimal valorTotal;
	private Date dataGeracao;
	public Integer getCodNota() {
		return codNota;
	}
	public void setCodNota(Integer codNota) {
		this.codNota = codNota;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codNota == null) ? 0 : codNota.hashCode());
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
		NotaFiscal other = (NotaFiscal) obj;
		if (codNota == null) {
			if (other.codNota != null)
				return false;
		} else if (!codNota.equals(other.codNota))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NotaFiscal [codNota=" + codNota + ", pagamento=" + pagamento
				+ ", valorTotal=" + valorTotal + ", dataGeracao=" + dataGeracao
				+ "]";
	}
}
