package resumen;

/*Clase Alumno (es un molde o plantilla de cómo debe ser un alumno.)
 * 
 * 
 * ESTA CLASE NO HACE NADA, NO TIENE MAIN. ES UN MOLDE.
 * Sólo hará algo cuando alguna otra clase de afuera ponga new Alumno.
 * (La probaremos en la clase TestAlumnos)
 * 
 * La clase tiene ATRIBUTOS (datos, caracteristicas, propiedades): 
 * 
 * -------(DEBEN SER PRIVADOS)------- (Encapsulamiento/Visibilidad).
 * (sólo se debería poder acceder a editarlos a través de métodos designados para tal fin).
 * 
 * nombre
 * dni
 * domic
 * telef
 * fecnac
 * tieneDudas
 * 
 * 
 * Y tiene MÉTODOS (comportamientos):
 * 
 * -----(Acá va a haber métodos para modificar los atributos)-----
 * -------------(SETTERS: Ej setLimite() // GETTERS: Ej getDni() )---------------
 * (NOTA: no siempre todos los atributos tendrán getters y/o setters).
 * 
 * - setters: son los que nos permiten MODIFICAR el contenido de atributos de una clase.
 * no devuelve nada, es un método void.
 * - getters: son los métodos que nos permiten VER el contenido de atributos de una clase.
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
 * Nota: los métodos deben ser breves y no pedir más de UNA cosa.
 * No está bueno que, por ejem, un setNombre pida también por teclado,
 * (sólo tiene que guardar el dato en el objeto)
 * 
 * 
 * A partir de una clase se instancian (hacen realidad) los objetos.
 * Parecido a lo que hacíamos con Scanner teclado = new Scanner (System.in)
 * 
 * Haremos:
 * Alumno (tipo, molde de la Clase) alum1 (variable de tipo Alumno) = new Alumno() (contiene un nuevo objeto "Alumno")
 * O sea Alumno alum1 = new Alumno (); ----> creamos una instancia de la Clase Alumno
 * Se crea en memoria una variable que tendrá todos los atributos y métodos.
  */



// STATIC quiere decir que no se necesita que la clase se instancie para poder ejecutarse.
// era lo que hacíamos en Programación Estructurada. 
// Acá NO SE USA, acá en la clase Alumno.

// Si en Atributos yo pusiera private static int Legajo=10, por más de que instancie 34 objetos de esa misma clase...
// ...en todos, tendré legajo = 10.
// Se usa sólo para guardar constantes. Pero en las definiciones de clases, no se usan mucho.


// Si a algún atributo le pusiéramos FINAL, sería constante, pero se instanciará 34 veces.
// O sea, cada alumno tendría su atributo-constante. 



public class Alumno {
	
	
	// Crearé el molde:
	
	//Visibilidad: por default sería público. OJO. Nunca dejarlo sin definir.


	
//////////////////////////////////////////////////////////////////////////////////
	
	
	
		//Defino ATRIBUTOS:
	
		private String nombre;
		private String dni;
		private int nota1;
		private int nota2;
		private boolean tieneDudas;
		//private double promedio; //es lógico que tenga getter, pero no setter...
		//...ya que viene de un cálculo de nota1 y nota2, no me lo asignan.
		//En realidad no tiene sentido que promedio esté definido como atributo ya que lo calculo y hace return, de todas formas.
		//Se calcula a cada momento. Teniendo las notas, no tiene sentido guardarlo.
		//Es como tener atributo edad. No guardaría un atributo edad, con tener fecha de nacimiento cada vez...
		//...que quiera saber edad, calculo con la fecha de nacimiento respecto a la fecha de hoy, y listo.
		private int cantNotas; //puede tener un setter privado
	
		
		
////////////////////////////////////////////////////////////////////////////////		
		
		
		
		/*  --- C O N S T R U C T O R E S --- */
		
		
		
		/*EJEMPLO DE MÉTODO CONSTRUCTOR POR DEFECTO*/
		
		
		//El nombre será el mismo que el de la clase.
		//No tiene tipo de retorno (ni void, ni string, ni int, etc.)
		//Le dice a Java que tiene que construir TODA la, ya definida, estructura de atributos y métodos, en memoria.
		
		public Alumno () {   //public SOLO, no public class
			
		}
		
		
		/*EJEMPLO DE MÉTODO CONSTRUCTOR PARAMETRIZADO*/
		
		
		//Es igual que el anterior pero tiene distinta cantidad de parámetros. (El otro no tenía ninguno).
		public Alumno (String unNombre, String unDni) { // FIRMA DE UN MÉTODO    //public SOLO, no public class
			this.setDni(unDni); // también sería válido escribir "this.dni = unDni;" en vez de llamar al setter. Pero preferible con setter, por un tema de validación.
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2); //NO es necesario que tenga sí o sí todos los atributos
			this.setTieneDudas(tieneDudas);
		}

		public Alumno (String unNombre, String unDni, int nota1) { // FIRMA DE UN MÉTODO
			//La FIRMA es distinta porque tiene un parámetro de más.
			this.setDni(unDni);
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2); 
			this.setTieneDudas(tieneDudas);
		}
		
		public Alumno (int nota1, String unNombre, String unDni ) { 
			// La FIRMA es distinta porque el orden está cambiado.
			// Por más de que sean los mismos 3 parámetros que el método anterior. 
			// Los tipos de datos que espera son diferentes.
			
			this.setDni(unDni); 
			this.setNombre(unNombre);
			this.setNota1(nota1);
			this.setNota2(nota2);
			this.setTieneDudas(tieneDudas);
		}
		
		// Si desde TestAlumnos pongo un nombre, una nota y un dni el segundo parámetro sería un entero...
		//...y en estos 3 constructores, ninguno tiene como segundo parámetro un tipo int).
		// Los 3 constructores esperan como segundo parámetro un String.
		
		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		//Defino MÉTODOS:
		
		
		public void setNombre(String elNombre) { 
			//si le pido que me guarde un nombre
			//debo decirle por parámetro qué nombre quiero que me guarde (String elNombre)
			// lo que hará este método es: al atributo nombre, pasarle lo que le dieron/enviaron por parámetro.
			// esta en público para poder ingresarle un valor de nombre, como todos los demás setters.
			// (y por el tipo de ejercitación también los getters estarán públicos).
			
			nombre = elNombre;
		
			/* También se puede así:
			 * this.nombre = elNombre;
			 * el atributo nombre de ESTA clase, recibe el parámetro.
			 * Aquí estaría de más, ya que estamos dentro de la clase donde se definió ese atributo,
			 * pero igual se puede poner.
			 */
		}
		
		private String getNombre() { //no requerirá parámetros, obvio.
			return nombre;
			// o también puede ser "return this.nombre;"
			
		}
		
		//interesante: este método será un getter aunque no se llame "get"
		//lo de getter y setter es por convención, para facilitar la lectura del código por parte de alguien más, ajeno.
		public String devolverNombre() {
			return this.getNombre();
		}
		//los de afuera de la clase no saben que existe getNombre, porque es privado
		//devolverNombre sí puede ser visto desde afuera de la clase, porque es público
		// y a su vez devolverNombre sí puede ver a getNombre y llamarlo, porque es parte de la clase.
		
		
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

		
		public double calcularPromedio() { //no le pasamos parámetros porque "vive" en el mismo lugar que nota1 y nota2. Los ve, los conoce, igual.
			//"Vive" adentro de la misma definición de clase que tiene los atributos. (VISIBILIDAD)
			double promedio = 0;
			this.cantNotas=0; //Visto así podría haber sido una variable local y no atributo de la clase.
							// Se la inicializa en 0 acá, sino el promedio tiraba un número raro en TestAlumnos.
			if (this.nota1>0) { //Así me aseguro no estar dividiendo por 0
				this.cantNotas++;
			} 
			if (this.nota2>0) { //Así me aseguro no estar dividiendo por 0
				this.cantNotas++;
			}
			if (this.cantNotas>1) {
				promedio = (this.nota1+this.nota2)/this.cantNotas;
			}
			
			return promedio;
		}
		
		
		// GENERATE toString() ---> para que me muestre todos los atributos de un objeto.
		@Override //directiva para el compilador, significa sobreescribir. Tiene que ver con la HERENCIA.
		//"Al método toString que ya existía, pisalo y reemplazalo por esto."
		//Podría haberlo puesto en TestAlumnos, porque Java lo agrega en todas las clases por más de que yo no lo ponga.
		//Pero queda más feo desde TestAlumnos.
		public String toString() {
			return "Alumno [nombre=" + nombre + ", dni=" + dni + ", nota1=" + nota1 + ", nota2=" + nota2
					+ ", tieneDudas=" + tieneDudas + ", promedio=" + this.calcularPromedio() + ", cantNotas=" + cantNotas + "]";
		} // Si no quiero que se vea algún atributo simplemente lo borro aquí.
		  // La idea es mostrar varios atributos juntos, no 1 solo, sino directamente llamo a algún getter.
		  // No me sirve para calcular, ya que es un String, para eso sino uso un getter, que me devolverá lo que sea un int como int, o double como double, etc.
		
		
}//CIERRE CLASS
