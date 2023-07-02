package model.util;

public class Movel extends Patrimonio{
	private String nome;
	private int codigo;
	private double valor;
	private int peso;
	private String cor;
	private int dimensao;
	
	public Movel(String nome, double valor, int peso, String cor, int dimensao) {
        super(nome);
        this.nome = nome; // Assign the nome parameter to the nome field
        this.codigo = codigo;
        this.valor = valor;
        this.peso = peso;
        this.cor = cor;
        this.dimensao = dimensao;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getDimensao() {
		return dimensao;
	}
	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}

	@Override
	public String toString() {
		return "Movel [nome=" + nome + ", valor=" + valor + ", peso=" + peso + ", cor=" + cor + ", dimensao=" + dimensao
				+ ", tipo=" + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
