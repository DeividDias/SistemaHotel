package model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CD_CLIENTE")
	private Integer codigo;
	
	@Column(name="NM_CLIENTE", length=1024, nullable=false)
	private String nome;
	
	@OneToMany(mappedBy="cliente")
	private List<Telefone> telefones;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer codigo, String nome, List<Telefone> telefones) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefones = telefones;
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}
