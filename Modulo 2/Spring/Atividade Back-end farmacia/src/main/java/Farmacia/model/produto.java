package Farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "o campo produto não pode estar em branco.")
	@NotNull(message = "O produto deve conter caracteres")
	private String produto;

	@NotBlank(message = "o campo descrição não pode estar em branco.")
	@NotNull(message = "A descrição deve conter caracteres")
	private String descricao;

	@NotNull(message = "a quantidade deve conter um número inteiro")
	private int quantidade;

	@NotNull(message = "O preço deve conter caracteres")
	private BigDecimal preco;

	@NotBlank(message = "A foto não pode estar em branco.")
	@NotNull(message = "A foto deve conter uma URL")
	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
}
