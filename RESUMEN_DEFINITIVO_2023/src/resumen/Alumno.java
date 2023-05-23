package resumen;

/*Clase Alumno (es un molde o plantilla de c�mo debe ser un alumno.)
 * 
 * 
 * ESTA CLASE NO HACE NADA, NO TIENE MAIN. ES UN MOLDE.
 * S�lo har� algo cuando alguna otra clase de afuera ponga new Alumno.
 * (La probaremos en la clase TestAlumnos)
 * 
 * La clase tiene ATRIBUTOS (datos, caracteristicas, propiedades): 
 * 
 * -------(DEBEN SER PRIVADOS)------- (Encapsulamiento/Visibilidad).
 * (s�lo se deber�a poder acceder a editarlos a trav�s de m�todos designados para tal fin).
 * 
 * nombre
 * dni
 * domic
 * telef
 * fecnac
 * tieneDudas
 * 
 * 
 * Y tiene M�TODOS (comportamientos):
 * 
 * -----(Ac� va a haber m�todos para modificar los atributos)-----
 * -------------(SETTERS: Ej setLimite() // GETTERS: Ej getDni() )---------------
 * (NOTA: no siempre todos los atributos tendr�n getters y/o setters).
 * 
 * - setters: son los que nos permiten MODIFICAR el contenido de atributos de una clase.
 * no devuelve nada, es un m�todo void.
 * - getters: son los m�todos que nos permiten VER el contenido de atributos de una clase.
 * devuelven siempre datos.
 * (ojo, no es un syso, es un return)
 * - se pueden escribir manualmente o ir a Source --> Generate Getters and Setters
 * 
 * rendir()
 * asistir()
 * preguntar()
 * practicar()
 * pagarCuota()
 * 
 * Nota: los m�todos deben ser breves y no pedir m�s de UNA cosa.
 * No est� bueno que, por ejem, un setNombre pida tambi�n por teclado,
 * (s�lo tiene que guardar el dato en el objeto)
 * 
 * 
 * A partir de una clase se instancian (hacen realidad) los objetos.
 * Parecido a lo que hac�amos con Scanner teclado = new Scanner (System.in)
 * 
 * Haremos:
 * Alumno (tipo, molde de la Clase) alum1 (variable de tipo Alumno) = new Alumno() (contiene un nuevo objeto "Alumno")
 * O sea Alumno alum1 = new Alumno (); ----> creamos una instancia de la Clase Alumno
 * Se crea en memoria una variable que tendr� todos los atributos y m�todos.
  */



// STATIC quiere decir que no se necesita que la clase se instancie para poder ejecutarse.
// era lo que hac�amos en Programaci�n Estructurada. 
// Ac� NO SE USA, ac� en la clase Alumno.

// Si en Atributos yo pusiera private static int Legajo=10, por m�s de que instancie 34 objetos de esa misma clase...
// ...en todos, tendr� legajo = 10.
// Se usa s�lo para guardar constantes. Pero en las definiciones de clases, no se usan mucho.


// Si a alg�n atributo le pusi�ramos FINAL, ser�a constante, pero se instanciar� 34 veces.
// O sea, cada alumno tendr�a su atributo-constante. 



public class Alumno {
	
	
	// Crear� el molde:
	
	//Visibilidad: por default ser�a p�blico. OJO. Nunca dejarlo sin definir.


	
//////////////////////////////////////////////////////////////////////////////////
	
	
	
		//Defino ATRIBUTOS:
	
		private String nombre;
		private String dni;
		private int nota1;
		private int nota2;
		private boolean tieneDudas;
		//private double promedio; //es l�gico que tenga getter, pero no setter...
		//...ya que viene de un c�lculo de nota1 y nota2, no me lo asignan.
		//En realidad no tiene sentido que promedio est� definido como atributo ya que lo calculo y hace return, de todas formas.
		//Se calcula a cada momento. Teniendo las notas, no tiene sentido guardarlo.
		//Es como tener atributo edad. No guardar�a un atributo edad, con tener fecha de nacimiento cada vez...
		//...que quiera saber edad, calculo con la fecha de nacimiento respecto a la fecha de hoy, y listo.
		private int cantNotas; //puede tener un setter privado
	
		
		
////////////////////////////////////////////////////////////////////////////////		
		
		
		
		/*  --- C O N S T R U C T O R E S --- */
		
		
		
		/*EJEMPLO DE M�TODO CONSTRUCTOR POR DEFECTO*/
		
		
		//El nombre ser� el mismo que el de la clase.
		//No tiene tipo de retorno (ni void, ni string, ni int, etc.)
		//Le dice a Java que tiene que construir TODA la, ya definida, estructura de atributos y m�todos, en memoria.
		
		public Alumno () {   //public SOLO, no public class
			
		}
		
		
		/*EJEMPLO DE M�TODO CONSTRUCTOR PARAMETRIZADO*/
		
		
		//Es igual que el anterior pero tiene distinta cantidad de par�metros. (El otro no ten�a ninguno).
		public Alumno (String unNombre, String unDni) { // FIRMA DE UN M�TODO    //public SOLO, no public class
			this.setDni(unDni); // tambi�n ser�a v�lido escribir "this.dni = unDni;" en vez de llamar al setter. Pero preferible con setter, por un tema de validaci�n.
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2); //NO es necesario que tenga s� o s� todos los atributos
			this.setTieneDudas(tieneDudas);
		}

		public Alumno (String unNombre, String unDni, int nota1) { // FIRMA DE UN M�TODO
			//La FIRMA es distinta porque tiene un par�metro de m�s.
			this.setDni(unDni);
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2); 
			this.setTieneDudas(tieneDudas);
		}
		
		public Alumno (int nota1, String unNombre, String unDni ) { 
			// La FIRMA es distinta porque el orden est� cambiado.
			// Por m�s de que sean los mismos 3 par�metros que el m�todo anterior. 
			// Los tipos de datos que espera son diferentes.
			
			this.setDni(unDni); 
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2);
			this.setTieneDudas(tieneDudas);
		}
		
		// Si desde TestAlumnos pongo un nombre, una nota y un dni el segundo par�metro ser�a un entero...
		//...y en estos 3 constructores, ninguno tiene como segundo par�metro un tipo int).
		// Los 3 constructores esperan como segundo par�metro un String.
		
		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		//Defino M�TODOS:
		
		
		public void setNombre(String elNombre) { 
			//si le pido que me guarde un nombre
			//debo decirle por par�metro qu� nombre quiero que me guarde (String elNombre)
			// lo que har� este m�todo es: al atributo nombre, pasarle lo que le dieron/enviaron por par�metro.
			// esta en p�blico para poder ingresarle un valor de nombre, como todos los dem�s setters.
			// (y por el tipo de ejercitaci�n tambi�n los getters estar�n p�blicos).
			
			nombre = elNombre;
		
			/* Tambi�n se puede as�:
			 * this.nombre = elNombre;
			 * el atributo nombre de ESTA clase, recibe el par�metro.
			 * Aqu� estar�a de m�s, ya que estamos dentro de la clase donde se defini� ese atributo,
			 * pero igual se puede poner.
			 */
		}
		
		private String getNombre() { //no requerir� par�metros, obvio.
			return nombre;
			// o tambi�n puede ser "return this.nombre;"
			
		}
		
		//interesante: este m�todo ser� un getter aunque no se llame "get"
		//lo de getter y setter es por convenci�n, para facilitar la lectura del c�digo por parte de alguien m�s, ajeno.
		public String devolverNombre() {
			return this.getNombre();
		}
		//los de afuera de la clase no saben que existe getNombre, porque es privado
		//devolverNombre s� puede ser visto desde afuera de la clase, porque es p�blico
		// y a su vez devolverNombre s� puede ver a getNombre y llamarlo, porque es parte de la clase.
		
		
		public String getDni() {
			return dni;
		}
	
		public void setDni(String dni) {
			this.dni = dni;
		}
	
		public int getNota1() {
			return nota1;
		}
	
		public void setNota1(int nota1) {
			this.nota1 = nota1;
		}
	
		public int getNota2() {
			return nota2;
		}
	
		public void setNota2(int nota2) {
			this.nota2 = nota2;
		}
	
		public boolean isTieneDudas() {
			return tieneDudas;
		}
	
		public void setTieneDudas(boolean tieneDudas) {
			this.tieneDudas = tieneDudas;
		}

		
		public double calcularPromedio() { //no le pasamos par�metros porque "vive" en el mismo lugar que nota1 y nota2. Los ve, los conoce, igual.
			//"Vive" adentro de la misma definici�n de clase que tiene los atributos. (VISIBILIDAD)
			double promedio = 0;
			this.cantNotas=0; //Visto as� podr�a haber sido una variable local y no atributo de la clase.
							// Se la inicializa en 0 ac�, sino el promedio tiraba un n�mero raro en TestAlumnos.
			if (this.nota1>0) { //As� me aseguro no estar dividiendo por 0
				this.cantNotas++;
			} 
			if (this.nota2>0) { //As� me aseguro no estar dividiendo por 0
				this.cantNotas++;
			}
			if (this.cantNotas>1) {
				promedio = (this.nota1+this.nota2)/this.cantNotas;
			}
			
			return promedio;
		}
		
		
		// GENERATE toString() ---> para que me muestre todos los atributos de un objeto.
		@Override //directiva para el compilador, significa sobreescribir. Tiene que ver con la HERENCIA.
		//"Al m�todo toString que ya exist�a, pisalo y reemplazalo por esto."
		//Podr�a haberlo puesto en TestAlumnos, porque Java lo agrega en todas las clases por m�s de que yo no lo ponga.
		//Pero queda m�s feo desde TestAlumnos.
		public String toString() {
			return "Alumno [nombre=" + nombre + ", dni=" + dni + ", nota1=" + nota1 + ", nota2=" + nota2
					+ ", tieneDudas=" + tieneDudas + ", promedio=" + this.calcularPromedio() + ", cantNotas=" + cantNotas + "]";
		} // Si no quiero que se vea alg�n atributo simplemente lo borro aqu�.
		  // La idea es mostrar varios atributos juntos, no 1 solo, sino directamente llamo a alg�n getter.
		  // No me sirve para calcular, ya que es un String, para eso sino uso un getter, que me devolver� lo que sea un int como int, o double como double, etc.
		
		
}//CIERRE CLASS
