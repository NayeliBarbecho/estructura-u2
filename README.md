# Universidad Politecnica Salesiana

# Descripcion de Proyecto 
Se necesita desarrollar un programa para gestionar una lista de contactos telefónicos. 
Cada contacto tiene un nombre, un número de teléfono, una Coleccion de Correos y 
un Diccionario que almacenara las redes sociales del contacto.

El programa debe permitir agregar, buscar y eliminar 
contactos de la lista utilizando un árbol binario de búsqueda.

# Estructura del Proyecto:
* `ArbolContacto`: Implementa todas las operaciones necesarias para manejar la lista de contactos utilizando el árbol binario de búsqueda. Permite insertar nuevos contactos en orden, eliminar contactos específicos y realizar recorridos en el árbol (inorden, preorden, postorden) para obtener los contactos ordenados de diferentes maneras. También verifica si el árbol está balanceado y calcula su altura. Adicionalmente, incluye la funcionalidad para agregar direcciones de correo electrónico y enlaces de redes sociales a los contactos existentes.
   
*  `Contacto`:  Proporciona una estructura de datos simple pero efectiva para almacenar y gestionar información sobre un contacto, incluyendo su nombre, número de teléfono, correos electrónicos y perfiles de redes sociales.
   
 * `Nodo`:  Es una clase fundamental para construir el árbol binario de búsqueda. Cada objeto de tipo Nodo contiene un objeto de tipo Contacto y referencias a sus nodos hijos izquierdo y derecho, permitiendo la organización jerárquica de los contactos.
   
 * `Main (Practica_ArbolesBinarios)`: Clase principal que contiene el punto de entrada del programa y se encarga de interactuar con el usuario a través de una interfaz sencilla para manejar el árbol binario de búsqueda que almacena los contactos. Permite agregar, buscar, eliminar y modificar información de los contactos, así como realizar diferentes tipos de recorridos del árbol y obtener estadísticas como el número de contactos y niveles del árbol
   
  # Explicacion de Metodos dentro de la Clase ArbolContacto  
  
  1. `Insertar` : Realiza la inserción de un nuevo contacto en el árbol binario de búsqueda de forma recursiva, asegurando que el árbol esté siempre ordenado para permitir búsquedas eficientes.

 2. `inOrderRecursivo` : Realiza un recorrido inorden del árbol de manera recursiva, visitando primero el subárbol izquierdo, luego el nodo actual y finalmente el subárbol derecho.
    
 3. `postOrderRecursivo ` : Realiza un recorrido postorden del árbol de manera recursiva, visitando primero los subárboles izquierdo y derecho, y luego el nodo actual.

 4. `preOrderRecursivo ` : Realiza un recorrido en preorden del árbol de manera recursiva, visitando primero el nodo actual, luego los subárboles izquierdo y derecho.

 5. `printTreeNode` : Devuelve el nodo raíz del árbol binario de búsqueda, desde donde se accede a todos los demás nodos.

6. estaBalanceado: Verifica si el árbol está balanceado, es decir, si la diferencia de alturas entre su subárbol izquierdo y derecho no excede una unidad.

7. obtenerAltura: Calcula la altura de un subárbol en el árbol binario de búsqueda, es decir, la longitud del camino más largo desde la raíz hasta una hoja en el subárbol.

8. eliminarContacto: Permite eliminar un contacto del árbol binario de búsqueda por su nombre, utilizando una función auxiliar para realizar la eliminación de manera recursiva en el árbol.

9. encontrarMinimo: Busca y devuelve el nodo con el valor mínimo (sucesor más pequeño) en un subárbol, utilizado para el caso de eliminación de un nodo con dos hijos.

10. agregarCorreo y agregarRedSocial: Permiten agregar correos electrónicos y enlaces de redes sociales a un contacto específico en el árbol binario de búsqueda.

11. buscarContacto, getNumeroContactos y getNumeroNiveles: Permiten buscar un contacto en el árbol, obtener el número total de contactos y el número de niveles del árbol, respectivamente.

12. imprimirAnchura: Realiza el recorrido por niveles del árbol binario de búsqueda y muestra los contactos almacenados en el orden en que se visitan, comenzando desde la raíz y avanzando nivel por nivel.
13. actualizarDatos:se encarga de actualizar los datos de un contacto existente con los datos de un nuevo contacto, pero solo actualiza aquellos campos del contacto original que no son nulos en el nuevo contacto. La idea es evitar sobrescribir datos importantes del contacto original con valores nulos del nuevo contacto.
14. agregarRedSocial:Permite agregar una red social y su respectivo usuario asociado a un contacto en un diccionario de redes sociales. El diccionario se encuentra dentro de la clase que contiene este método, y se denomina redesSociales.
15. modificarRedSocial: Permite modificar la cuenta asociada a una red social específica en el diccionario redesSociales, siempre y cuando la red social exista en el diccionario.
