package hotel.model.dominio;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_FORNECEDOR")
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String codFornecedor;
	private String nomeFornecedor;
	private String telefone;
	private String email;
	
	@OneToMany(mappedBy = "fornecedor")
    @Column(nullable=true)
	private Collection<Produto> produto;

	public String getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(String codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codFornecedor == null) ? 0 : codFornecedor.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (codFornecedor == null) {
			if (other.codFornecedor != null)
				return false;
		} else if (!codFornecedor.equals(other.codFornecedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [codFornecedor=" + codFornecedor
				+ ", nomeFornecedor=" + nomeFornecedor + "]";
	}

}
