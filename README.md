# IMPLEMENTACION DE PILA
## Descripción del codigo

Este código es un programa en Java que simula el manejo de una pila de platos sucios en una cocina. </p>
## Explicación paso a paso del código:

Se importan dos clases de Java: **Scanner** y **Stack**. 
**Scanner** se utiliza para leer la entrada del usuario, mientras que **Stack** se utiliza para representar una pila en la que almacenaremos los platos sucios.

Se crea una nueva instancia de la clase **Stack** llamada **pilaPlatos**, que almacenará los platos sucios.
 Se crea un objeto **Scanner** llamado **scanner** para leer la entrada del usuario.
Se establece una variable booleana **salir** en **false** para controlar la salida de un bucle.

Se inicia un bucle **while** que se ejecutará mientras **salir** sea **false**.

Dentro del bucle, se muestran varias opciones al usuario, como agregar un plato sucio, lavar el plato superior, 
  ver el plato superior, verificar si la pila está vacía, buscar un plato en la pila o salir del programa.

Se solicita al usuario que ingrese una opción.
Se lee la opción ingresada por el usuario utilizando el objeto **scanner**.

Se utiliza una estructura **switch** para realizar diferentes acciones según la opción seleccionada por el usuario.

- Si el usuario elige la opción 1, se le solicita que ingrese el nombre del plato sucio,
  luego se agrega ese plato a la pila utilizando el método **push()**.
- Si elige la opción 2, se verifica si la pila no está vacía y, en ese caso, 
  se limpia el plato superior de la pila (se elimina) utilizando el método **pop()**.

- Si elige la opción 3, se verifica si la pila no está vacía y, en ese caso, 
  se muestra el nombre del plato superior sin eliminarlo utilizando el método **peek()**.

- Si elige la opción 4, se verifica si la pila está vacía y se muestra un mensaje correspondiente.

- Si elige la opción 5, se le solicita que ingrese el nombre del plato que desea buscar en la pila, 
  luego se busca el plato utilizando el método **search()** y se muestra la posición del plato en la pila si se encuentra.

- Si elige la opción 6, se establece **salir** en **true**, lo que termina el bucle y finaliza el programa.
- Si elige una opción inválida, se muestra un mensaje indicando que la opción es inválida.
Se imprime una línea en blanco para mejorar la legibilidad entre iteraciones del bucle.
Una vez que el usuario elige salir del programa, se imprime "Hasta luego" y el programa termina.

![Captura de pantalla 2024-04-05 172504](https://github.com/Marilin8/Pilas_colas2/assets/124939061/9665ffae-59ca-46a2-88ea-4241c738babc)

# IMPLEMENTACION DE COLA
## Descripción del codigo

Este código es un programa en Java que simula la atención de clientes en un banco utilizando una cola. 
## Explicación paso a paso del código:

Se importan tres clases de Java: **LinkedList**, **Queue** y **Scanner**. **LinkedList** se utiliza para implementar una cola,
  **Queue** es una interfaz que representa una cola y **Scanner** se utiliza para leer la entrada del usuario.

Se crea una nueva instancia de la clase **LinkedList** y se asigna a una variable llamada **colaAtencion**. Esta cola almacenará 
  los nombres de los clientes que están esperando ser atendidos en el banco.

Se crea un objeto **Scanner** llamado **scanner** para leer la entrada del usuario.

Se establece una variable booleana **salir** en **false** para controlar la salida de un bucle.

Se inicia un bucle **while** que se ejecutará mientras **salir** sea **false**.

Dentro del bucle, se muestran varias opciones al usuario, como agregar un cliente a la cola de atención, 
  atender al próximo cliente, ver el próximo cliente en la cola, verificar si la cola está vacía o salir del programa.

- Se solicita al usuario que ingrese una opción.
- Se lee la opción ingresada por el usuario utilizando el objeto **scanner**.

Se utiliza una estructura **switch** para realizar diferentes acciones según la opción seleccionada por el usuario.

- Si el usuario elige la opción 1, se le solicita que ingrese el nombre del cliente y luego se agrega ese cliente a la cola de atención utilizando el método **add()**.
- Si elige la opción 2, se verifica si la cola de atención no está vacía y, en ese caso, se atiende al próximo cliente de la cola utilizando el método **poll()**.
- Si elige la opción 3, se verifica si la cola de atención no está vacía y, en ese caso,
  se muestra el nombre del próximo cliente en la cola sin eliminarlo utilizando el método **peek()**.
- Si elige la opción 4, se verifica si la cola de atención está vacía y se muestra un mensaje correspondiente.
- Si elige la opción 5, se establece **salir** en **true**, lo que termina el bucle y finaliza el programa.
- Si elige una opción inválida, se muestra un mensaje indicando que la opción es inválida.
Se imprime una línea en blanco para mejorar la legibilidad entre iteraciones del bucle.
Una vez que el usuario elige salir del programa, se imprime "¡Hasta luego!" y el programa termina.

![Captura de pantalla 2024-04-05 173901](https://github.com/Marilin8/Pilas_colas2/assets/124939061/66fa84ec-8127-4cef-8799-6d834f12b16d)

