package Pila;
import java.util.Scanner;
import java.util.Stack;
public class Pila_PlatoSucios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una pila nueva para poder almacenar los platos sucios
				Stack<String> pilaPlatos = new Stack<>();
				//crear un objeto para Scanner pueda leer la entrada de usuario
				Scanner scanner = new Scanner(System.in);
				//Variable para controlar la salida del bucle
		        boolean salir = false;
		        
		        /*Iniciamos el bucle While, 
		        se ejecuta mientras salir sea falso*/
		        
		        while (!salir){
		        System.out.println("1. Agregar un plato sucio a la pila");
		        System.out.println("2. Lavar el plato superior de la pila");
		        System.out.println("3. Ver el plato superior de la pila");
		        System.out.println("4. Verificar si la pila esta vacia");
		        System.out.println("5. Buscar un plato en la pila");
		        System.out.println("6. Salir");
		        //Solicitar al usuario que ingrese una opcion
		        System.out.println("Ingrese una opcion:");
		        //Leer la opcion ingresada por el usuario
		        int opcion = scanner.nextInt();
		        //Consumir el salto de linea despues de leer la opcion
		        scanner.nextLine();
		        
		        //Inicio del bloque de Switch
		        switch(opcion) {
		        case 1:
		        	//Solicitar al usuario que ingrese el plato
		        	System.out.print("Ingrese el plato a la pila");
		        	//leer el plato ingresado
		        	String plato = scanner.nextLine();
		        	//Agregar el plato a la pila utilizando push()  
		        	pilaPlatos.push(plato);
		        	//Mostrar mensaje indicando que fue ingresado
		        	System.out.println("Plato agregado a la pila. ");
		        	break;
		        case 2:
		        	//Verificar si la pila no esta vacia
		        	if(!pilaPlatos.isEmpty()) {
		        		//Limpiar el plato superior = eliminarlo con pop()
		        		String platoLimpio = pilaPlatos.pop();
		        		System.out.println("Se lavo el plato superior: " + platoLimpio);
		        	}else {
		        		//Indicar que la pila esta vacia
		        		System.out.println("La pila esta vacia. No se puede lavar ningun plato");
		        	}
		        	break;
		        case 3:
		        	//Verificar si la pila no esta vacia
		        	if(!pilaPlatos.isEmpty()) {
		        		//Limpiar el plato superior = eliminarlo con pop()
		        		String platoSuperior = pilaPlatos.peek();
		        		System.out.println(" El plato superior es: " + platoSuperior);
		        	}else {
		        		//Indicar que la pila esta vacia
		        		System.out.println("La pila esta vacia.");
		        	}
		        	break;
		        case 4:
		        	//Veriricar si pila esta vacia
		        	boolean estaVacia = pilaPlatos.isEmpty();
		        	System.out.println("La pila de platos esta vacia: " + estaVacia);
		        	break;
		        case 5:
		        	//Solicitar al usuario que ingrese el plato a buscar en la pila
		        	System.out.println("ingrese el plato que desa buscar: ");
		        	//leer el plato a buscar por el usuario
		        	String platoBuscar = scanner.nextLine();
		        	//buscar el plato en la pila utilizando search()
		        	int distanciaDesdeSuperior = pilaPlatos.search(platoBuscar);
		        	//verificar si el plato se encuentra en la pila
		        	if(distanciaDesdeSuperior != -1) {
		        		//mostrar mensaje
		        		System.out.println("El plato '" + platoBuscar + "'se encuentra a una distancia" + distanciaDesdeSuperior + "desde la parte superior de la pila. ");
		        	}else {
		        		System.out.println("El plato '"+platoBuscar + "' no se encuentra en la pila");
		        	}
		        	break;
		        case 6:
		        	salir = true;
		        	break;
		        default:
		        	System.out.println("Opcion invalida, intente nuevamente ");
		        	break;
		        	
		        }
		        System.out.println();
			}
		        System.out.println("Hasta luego");
			}

	

}
