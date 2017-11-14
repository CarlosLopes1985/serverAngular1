package entity;

public class Pessoa {
	 private  Integer codigo;
	 private  String   nome;
	 private String    sexo;
	 private Integer  idade;
	
	 public Pessoa(Integer codigo, String nome, String sexo, Integer idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public Pessoa() {
 	}
	
	
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	 
	 
	 
	 
}
