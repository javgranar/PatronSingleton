package entityBuilder;

public class MainBuilder {

	public static void main(String[] args) {
		Builder buider = new Builder("Javi");
		
		Persona persona = buider.build();
		
		System.out.println("persona" + persona.getNombre());

	}

}
