package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FORNECEDOR")
public class Fornecedor {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="FOR_CODIGO")
	private Integer codigo;

	@Column(name="FOR_FORNECEDOR", length=1024, nullable=false)
	private String nome;

	@Column(name="FOR_EMAIL", length=1024, nullable=false)
	private String email;

	@Column(name="FOR_CNPJ", length=1024, nullable=false)
	private String cnpj;

	public Fornecedor() {
	}

	public Fornecedor(Integer codigo, String nome, String email, String cnpj) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
