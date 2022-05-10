package model;

public class Cliente {
	private int cadastro;
	private String nome;
	private String telefone;
	private String tipoDeCorte;
	private String tipoDeBarba;
	private float preco_1;
	private float preco_2;
	private float total;
	
	
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipoDeCorte() {
		return tipoDeCorte;
	}
	public void setTipoDeCorte(String tipoDeCorte) {
		this.tipoDeCorte = tipoDeCorte;
	}
	public String getTipoDeBarba() {
		return tipoDeBarba;
	}
	public void setTipoDeBarba(String tipoDeBarba) {
		this.tipoDeBarba = tipoDeBarba;
	}
	public float getPreco_1() {
		return preco_1;
	}
	public void setPreco_1(float preco_1) {
		this.preco_1 = preco_1;
	}
	public float getPreco_2() {
		return preco_2;
	}
	public void setPreco_2(float preco_2) {
		this.preco_2 = preco_2;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [cadastro=" + cadastro + ", nome=" + nome + ", telefone=" + telefone + ", tipoDeCorte="
				+ tipoDeCorte + ", tipoDeBarba=" + tipoDeBarba + ", preco_1=" + preco_1 + ", preco_2=" + preco_2
				+ ", total=" + total + "]";
	}
		
}
