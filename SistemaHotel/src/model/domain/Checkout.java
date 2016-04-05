package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CHECKOUT")
public class Checkout {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CD_CHECKOUT")
	private Integer codigo;

	public void setCodigo(Integer codigoCheckout) {
		// TODO Auto-generated method stub
		
	}
	
	
}
