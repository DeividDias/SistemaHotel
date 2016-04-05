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
@Table(name="TB_DEPARTAMENTO")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codDepartamento;
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
    @Column(nullable=true)
	private Collection<Funcionario> funcionario;

	public Integer getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(Integer codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Collection<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codDepartamento == null) ? 0 : codDepartamento.hashCode());
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
		Departamento other = (Departamento) obj;
		if (codDepartamento == null) {
			if (other.codDepartamento != null)
				return false;
		} else if (!codDepartamento.equals(other.codDepartamento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [codDepartamento=" + codDepartamento + ", nome="
				+ nome + "]";
	}

}
