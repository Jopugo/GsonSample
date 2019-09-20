package gson.maven.dad;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Persona p = new Persona();
		p.setNombre(in.next());
		p.setApellido(in.next());
		p.setEdad(in.nextInt());
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

	}
}
