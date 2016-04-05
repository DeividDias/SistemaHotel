package hotel.model.dominio;

import hotel.model.dominio.Cidade;
//import hotel.model.dominio.ProgramaFidelidade;
import hotel.model.dominio.Quarto;
import hotel.model.dominio.Reserva;
import hotel.model.dominio.Usuario;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer codCliente;

	private String nome;
	private String cpf;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="quarto")
	private Quarto quarto;
	
	@OneToMany(mappedBy = "cliente")
    @Column(nullable=true)
	private Collection<Reserva> reserva;
	
	/*
	@ManyToOne(optional = true)
	@JoinColumn(name="programaFidelidade")
	private ProgramaFidelidade programaFidelidade;
	*/

	@ManyToOne(optional = true)
	@JoinColumn(name="cidade")
	private Cidade cidade;

	@ManyToOne(optional = true)
	@JoinColumn(name="usuario")
	private Usuario usuario;

	@OneToMany(mappedBy="cliente")
	private List<Fidelidade> fidelidade;

	public Cliente() {
		
	}
	
	public Cliente(Integer codCliente, String nome, String cpf, String endereco, String telefone,
			String email) {
		this.codCliente = codCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}


	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Collection<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(Collection<Reserva> reserva) {
		this.reserva = reserva;
	}

	public List<Fidelidade> getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(List<Fidelidade> fidelidade) {
		this.fidelidade = fidelidade;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome
				+ ", cpf=" + cpf + ", endereco=" + endereco + ", telefone="
				+ telefone + ", email=" + email + "]";
	}

	public BigDecimal totalPontos() {
		BigDecimal totalPontos = BigDecimal.ZERO;// new BigDecimal("0.00");
		
		for(Fidelidade fidelid : fidelidade){
			totalPontos = totalPontos.add(fidelid.getPontos());
		}
		
		return totalPontos;
	}

//	private Quarto quarto;

//	private Collection<Reserva> reserva;

}
