package entityBuilder;

public class Builder {
	
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	public Builder(String nombre) {
		this.nombre = nombre;
	}
	
	public Builder withApellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}
	
	public Builder withEdad(Integer edad) {
		this.edad = edad;
		return this;
	}
	
	public Persona build(){
        Persona persona = new Persona();
        persona.setNombre(this.nombre);
        persona.setApellidos(this.apellidos);
        persona.setEdad(this.edad);
        return persona;
    }

}
