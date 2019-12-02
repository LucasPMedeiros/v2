package spring_webapp;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Pessoa {
	@NotNull(message="Obrigatório")
	@NotBlank(message="Obrigatório")
	private String Nome;
	@NotNull(message="Obrigatório")
	@NotBlank(message="Obrigatório")
	@Min(value=10, message="Não pode ser menor que 10")
	@Max(value=100, message="Não pode ser maior que 100")
	private int Idade;
	@NotNull(message="Obrigatório")
	@NotBlank(message="Obrigatório")
	@Size(min=1, message="Pelo menos 1 char")
	private String Genero;
	private LinkedHashMap <String, String> Servico;
	
		
	public Pessoa(String nome, int idade, String genero, LinkedHashMap<String, String> servico) {
		super();
		Nome = nome;
		Idade = idade;
		Genero = genero;
		Servico = servico;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
			
	public  LinkedHashMap<String, String> getServico() {
		return Servico;
	}

	public void setServico( LinkedHashMap<String, String> servico) {
		this.Servico = servico;
	}

	public Pessoa() {
		Servico = new LinkedHashMap<String, String>();
		
		Servico.put("iFood", "iFood");
		Servico.put("UBer", "UBer");
		Servico.put("Spotify", "Spotify");
		Servico.put("Netflix", "Netflix");
		
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return Servico;
	}

	
}
