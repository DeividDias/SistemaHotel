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
@Table(name="tb_fidelidade")
public class Fidelidade implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer codFidelidade;
	private BigDecimal pontos;

	private Date dataInicio;

	private String observacao;

	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;

	public Fidelidade(){
		
	}
	
	public Fidelidade(Integer codFidelidade, BigDecimal pontos, Date dataInicio, String observacao, Cliente cliente) {
		super();
		this.codFidelidade = codFidelidade;
		this.pontos = pontos;
		this.dataInicio = dataInicio;
		this.observacao = observacao;
		this.cliente = cliente;
	}

	public Integer getCodFidelidade() {
		return codFidelidade;
	}

	public void setCodFidelidade(Integer codFidelidade) {
		this.codFidelidade = codFidelidade;
	}

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	@Override
	public String toString() {
		return "ProgramaFidelidade [pontos=" + pontos + ", dataInicio="
				+ dataInicio + ", observacao=" + observacao + ", cliente=" + cliente + "]";
	}

	
	
}
