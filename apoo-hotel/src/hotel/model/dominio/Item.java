package hotel.model.dominio;

import java.io.Serializable;
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
@Table(name="TB_ITEM")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codItem;
	private String descricao;
	private String tipo;
	
	@OneToMany(mappedBy = "item")
    @Column(nullable=true)
	private Collection<Quarto> quartos;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="quarto")
	private Item quarto;

	public Item getQuarto() {
		return quarto;
	}

	public void setQuarto(Item quarto) {
		this.quarto = quarto;
	}

	public Integer getCodItem() {
		return codItem;
	}

	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Collection<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(Collection<Quarto> quartos) {
		this.quartos = quartos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
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
		Item other = (Item) obj;
		if (codItem == null) {
			if (other.codItem != null)
				return false;
		} else if (!codItem.equals(other.codItem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [codItem=" + codItem + ", descricao=" + descricao + "]";
	}

}
