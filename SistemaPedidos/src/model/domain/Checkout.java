package model.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_CHECKOUT")
public class Checkout {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CD_CHECKOUT")
	private Integer quarto;

	@Column(name="NM_HOSPEDE", length=1024)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENTRADA")
	private Date dataent;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_SAIDA")
	private Date datasai;
	
	@Column(name="VR_VALOR")
	private double valor;

	@Column(name="QTD_QTDACOMOD")
	private Integer qtdAcomod;

	@Column(name="VR_VALORCONSUMO")
	private double valorConsumo;
	
	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Checkout(Integer quarto, String nome, Date dataent, Date datasai, double valor) {
		super();
		this.quarto = quarto;
		this.nome = nome;
		this.dataent = dataent;
		this.datasai = datasai;
		this.valor = valor;
		this.qtdAcomod = qtdAcomod;
		this.valorConsumo = valorConsumo;
	}

	public Integer getQuarto() {
		return quarto;
	}

	public void setQuarto(Integer quarto) {
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataent() {
		return dataent;
	}

	public void setDataent(Date dataent) {
		this.dataent = dataent;
	}

	public Date getDatasai() {
		return datasai;
	}

	public void setDatasai(Date datasai) {
		this.datasai = datasai;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Integer getQtdAcomod() {
		return qtdAcomod;
	}

	public void setQtdAcomod(Integer qtdAcomod) {
		this.qtdAcomod = qtdAcomod;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public void setValorConsumo(double valorConsumo) {
		this.valorConsumo = valorConsumo;
	}

}
