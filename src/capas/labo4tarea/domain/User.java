package capas.labo4tarea.domain;

import javax.validation.constraints.Size;

public class User {
	
	@Size(message="La longitud debe ser entre 4 y 10 caracteres", min=4, max=10)
	private String name;

	private String username;
	
	@Size(message="La longitud debe ser entre 4 y 10 caracteres", min=4, max=10)
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
