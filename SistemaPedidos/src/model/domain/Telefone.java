package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_TELEFONE")
public class Telefone {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CD_TELEFONE")
	private Integer codigo;
	
	@Column(name="NR_DDD", nullable=false)
	private Integer ddd;
	
	@Column(name="NR_NUMERO", nullable=false)
	private Integer numero;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_TELEFONE", nullable=false)
	private TipoTelefone tipoTelefone;
	
	@ManyToOne
	@JoinColumn (name="CD_CLIENTE", referencedColumnName="CD_CLIENTE")
	private Cliente cliente;

	
	public Telefone() {
		super();
	}

	public Telefone(Integer codigo, Integer ddd, Integer numero, TipoTelefone tipoTelefone, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.ddd = ddd;
		this.numero = numero;
		this.tipoTelefone = tipoTelefone;
		this.cliente = cliente;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
