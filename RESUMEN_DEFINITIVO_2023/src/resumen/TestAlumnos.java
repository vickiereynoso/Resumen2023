package resumen;

import java.util.Scanner;

public class TestAlumnos {
	
	private static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definiremos variables normales (y no atributos de nadie).
		String nombreIngresado;
		String dniIngresado;
		boolean tieneDudas;
		int nota1,nota2;
		
		//holavadyrrree
		
		//Pediremos datos de un alumno para luego crear el objeto que los guarde:
		
		System.out.println("Ingrese el nombre del alumno:");
		nombreIngresado=teclado.nextLine();
		
		System.out.println("Ingrese la primer nota:");
		nota1=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Ingrese la segunda nota:");
		nota2=Integer.parseInt(teclado.nextLine());
		
		//Crearemos un objeto de tipo Alumno, a partir de la clase Alumno:
		
		Alumno alum1 = new Alumno(); // CREAMOS EL OBJETO, por ahora vac�o.
		//Cuando decimos new "algo", Java lo primero que mira es su m�todo CONSTRUCTOR
		//O sea, lo que haya dentro de los ()
		//Ya que el Constructor puede recibir par�metros.
		alum1.setNombre(nombreIngresado); //Se llama de a un m�todo por vez.
		alum1.setNota1(nota1);
		alum1.setNota2(nota2);
		//Llenar TODOS los atributos puede ser obligatorio o no.
		//Si se trata de un alumno que reci�n se anota en una escuela...
		//...es de esperar que no haya notas para ingresar todav�a.
		//En todo caso, se avisar� en la consigna.
		
		System.out.println("El nombre es " + alum1.devolverNombre()); // es un getter aunque no se llame get.
		//En caso de no poder poner alum1.nombre para mostrarlo, por si nombre fuese un atributo privado.
		
		System.out.println("Sus notas son: "+ alum1.getNota1() + " y "+ alum1.getNota2());
		
		
		//Queremos mostrar los ATRIBUTOS de un OBJETO:
		
		//O sea, la ficha del alumno, por llamarle as�, en este caso.
		//Para eso est� el m�todo toString() hecho en la clase Alumno.
		System.out.println(alum1.toString()); //muestro todos los valores de sus atributos de Alumno.
		//Si no lo tuviera definido en la clase Alumno, se puede llamarlo desde ac� pero me devolver�a un resultado feo de leer.
		
		//Como dec�amos: puedo hacer System.out.println(alum1); Java lo interpreta igual y llama a toString().
		//Aunque no lo haya definido en la clase Alumno, Java lo define por m� y me muestra el resultado ese feo de leer.
		
		//double promedio = (alum1.getNota1()+alum1.getNota2())/2;
		
		System.out.println("Su promedio es de: "+alum1.calcularPromedio());
		
		//Crearemos un SEGUNDO objeto de tipo Alumno, a partir de la clase Alumno:
		//Otra instancia.
		
		Alumno alum2 = new Alumno("Juancito","12345678");
		//Cuando ponemos "new" Java busca la definici�n de la clase Alumno.
		//La clase Alumno es otro archivo.
		//Java lo encuentra porque est� en el mismo Package que TestAlumnos.
		//Sino se usar�a "import" del otro paquete (como hacemos con el Scanner).
		//Si no hay definido un Constructor, llama al constructor por defecto.
		//Y crea la estructura de la clase en la memoria, como diga su definici�n.
		
		//Java reconoce a este constructor de 2 par�metros en la Clase Alumno.
		//Justamente por la cantidad de par�metros.
		//Alumno alum2 = new Alumno("Juancito"); --> esto hubiera dado error.
		//Ya que no existe por ahora un constructor de 1 s�lo par�metro en la Clase Alumno.
		//Es muy pr�ctico ya que no hay que andar llamando a los setters.
		//Esos setters van a dejar de ser p�blicos.
		
		
	}//CIERRE MAIN

}//CIERRE CLASS
