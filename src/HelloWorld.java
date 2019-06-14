import com.ipartek.formacion.Employee;
import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws Exception {

		String nombre = "Ander";

		System.out.println("  Hello " + nombre);

		Person p1 = new Person();
		p1.setNombre("Manolo");

		System.out.println(p1.saludar());

	
		Perro dog = new Perro();
		
		dog.setNombre("Rex");
		dog.setRaza("Pastor Aleman");
		dog.setEdad(4);
		dog.setVacunado(true);
		
		System.out.println(dog.toString());
		
		
		dog.setNombre("Tobby");
		dog.setRaza("Basset hound");
		dog.setEdad(-1);
		dog.setVacunado(false);
		
		System.out.println(dog.toString());
		
		
		dog.setNombre("Snoppy");
		dog.setRaza("Beagle");
		dog.setEdad(5);
		dog.setVacunado(true);
		
		System.out.println(dog.toString());
		
		
		PerroPresa buba= new PerroPresa();
		buba.setNombre("Buba");
		buba.atacar();
		
		System.out.println(buba.toString());
		
		Perro dog2 = new Perro("Pulgoso");
		System.out.println(dog2);
	
	
		
		Employee youtuber = new Employee("Logan Paul", 23, 'h', 14500000);
		System.out.println(youtuber.getNombre()+ " " + youtuber.getEdad()+ " " + youtuber.getSexo()+ " $" +youtuber.getSalario());
		Employee youtuber2 = new Employee("PewDiePie", 29, 'h', 15500000);
		System.out.println(youtuber2.getNombre()+ " " + youtuber2.getEdad()+ " " + youtuber2.getSexo()+ " $" +youtuber2.getSalario());
		Employee youtuber3 = new Employee("Jacksepticeye", 28, 'h', 16000000);
		System.out.println(youtuber3.getNombre()+ " " + youtuber3.getEdad()+ " " + youtuber3.getSexo()+ " $" +youtuber3.getSalario());
		Employee youtuber4 = new Employee("Vanoss Gaming", 26, 'h', 17000000);
		System.out.println(youtuber4.getNombre()+ " " + youtuber4.getEdad()+ " " + youtuber4.getSexo()+ " $" +youtuber4.getSalario());
	}

}
