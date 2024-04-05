package Pila;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ColaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> colaAtencion = new LinkedList<>(); //Crear una nueva cola utilizando la clase LinkedList de Java
		Scanner scanner = new Scanner(System.in); //Crear un objeto Scanner para leer la entrada del usuario
		boolean salir = false; //Variable para controlar la salida del bucle while
		
		while (!salir) {//Inicio del bucle while, se ejecuta mientras slir sea falso
			System.out.println("1. Agregar cliente a la cola de atención"); //Mostrar opción para agregar un cliente a al cola de atención
			System.out.println("2. Atender al próximo cliente de la cola"); //Mostrar opción para atender al proximo cliente de la cola
			System.out.println("3. Ver el proximo cliente de la cola"); // Mostrar opcion para ver al proximo cliente de la cola sin atenderlo
			System.out.println("4. Verificar si la cola de atencion esta vacia"); //Mostrar opcion para verificar si la cola de atencion esta vacia
			System.out.println("5. Salir"); //Mostrar opcion para salir del programa
			System.out.println(" Ingrese una opción"); //Leer la opcion ingresada por el usuario
			int opcion = scanner.nextInt(); //Leer la opcion ingresada por el usuario
			scanner.nextLine(); //Consumir el salto de linea despues de leer la opcion
			
			switch (opcion) {//Inicio del bloque switch, se valua el valor de la variable opcion.
				case 1:
					System.out.println("Ingrese el nombre del cliente a agregar a la cola"); //Solicitar al usuario que ingrese el nombre del cliente a agregar a la cola
					String cliente = scanner.nextLine();//Leer el nombre del cliente ingresado por el usuario
					colaAtencion.add(cliente); //Agregar el cliente a la cola utilizando el metodo add()
					System.out.println("Cliente agregado a la cola de atencion"); // Mostrar unn mensaje indicando que el lciente ha sido agregado a la cola
					break; // Salir del bloque switch
					
				case 2:
					if(!colaAtencion.isEmpty()) { //Verificar si la cola de atencion no está vacía
						String clienteAtendido = colaAtencion.poll(); //Atencder al próximo cliente de la cola utilizando el mpetodo poll()
						System.out.println("Cliente atendido: " + clienteAtendido); //Mostrar el nombre del cliente que ha sido atendido
					} else {
						System.out.println("La cola de atencion esta vacia. No hay clientes para atender. "); // Mostrar un mensaje indicando que la cola de atención está vacía
					}
					break; //Salir del bloque switch
					
				case 3:
					if(!colaAtencion.isEmpty()) { //Verificar si la cola de atención no está vacía
						String proximoCliente = colaAtencion.peek(); //Obtener el próximo cliente de la cola sin atenderlo utilizando el método peek()
						System.out.println("Proximo cliente en la cola: " + proximoCliente); //Mostrar el nombre del próximo cliente en la cola
					}
					break; //Salir del bloque switch
					
				case 4:
					boolean estaVacia = colaAtencion.isEmpty(); //Verificar si la cola de atención está vací utlizando el método isEmpty()
					System.out.println("La cola de atencion esta vacia: " + estaVacia); //Mostrar si la cola de atención está vacía o no
					break; //Salir del bloque de switch
					
				case 5:
					salir = true; //Establecer la variable salir a true para salir del bucle while
					break; //Salir del bloque switch
					
					default: 
						System.out.println("Opcion invallida. Intente nuevamente"); //Mostrar un mensaje indicando que la opción ingresada es inválida
						break; //Salir del bloque switch
			}
			System.out.println(); //Imprimir una línea en blanco para separar las interaciones del bucle while
		} 
		System.out.println("¡Hasta luego!"); //Mostramos un mesaje de despedia al salir del programa
	}

	

}
