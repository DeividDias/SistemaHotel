package model.domain;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_SMS")
public class Sms implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@ManyToOne
	@JoinColumn (name="CD_TELEFONE", referencedColumnName="CD_TELEFONE")
	private Telefone telefone;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ENVIO_SMS")
	private Date data;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_STATUS")
	private StatusSms statusSms;

		
	public Sms() {
		super();
	}

	public Sms(Integer codigo, Telefone telefone, Date data, StatusSms statusSms) {
		super();
		this.codigo = codigo;
		this.telefone = telefone;
		this.data = data;
		this.statusSms = statusSms;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusSms getStatusSms() {
		return statusSms;
	}

	public void setStatusSms(StatusSms statusSms) {
		this.statusSms = statusSms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((statusSms == null) ? 0 : statusSms.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Sms other = (Sms) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (statusSms != other.statusSms)
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	
}
