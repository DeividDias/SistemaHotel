package hotel.model.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer codProduto;
	private String descricao;
	private BigDecimal valor;
	private Integer quantidade;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="servicoDeQuarto")
	private ServicoDeQuarto servicoDeQuarto;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="fornecedor")
	private Fornecedor fornecedor;
	
	public Produto(){
		
	}
	
	

	public Produto(Integer codProduto, String descricao, BigDecimal valor,
			Integer quantidade, ServicoDeQuarto servicoDeQuarto,
			Fornecedor fornecedor) {
		super();
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.servicoDeQuarto = servicoDeQuarto;
		this.fornecedor = fornecedor;
	}



	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public ServicoDeQuarto getServicoDeQuarto() {
		return servicoDeQuarto;
	}

	public void setServicoDeQuarto(ServicoDeQuarto servicoDeQuarto) {
		this.servicoDeQuarto = servicoDeQuarto;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codProduto == null) ? 0 : codProduto.hashCode());
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
		Produto other = (Produto) obj;
		if (codProduto == null) {
			if (other.codProduto != null)
				return false;
		} else if (!codProduto.equals(other.codProduto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", descricao=" + descricao
				+ "]";
	}

}
