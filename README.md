# Biblioteca en Java
Este proyecto implementa una biblioteca en Java que gestiona libros y revistas. Permite a los usuarios tomar prestados y devolver ítems de la biblioteca. El sistema clasifica los ítems en libros y revistas y utiliza interfaces y clases abstractas para organizar el código y manejar la lógica de préstamo.
## ¿Qué que herramientas utilizamos?
1. `Interfaz` **Loanable**: Define los métodos para la gestión de ítems prestables, incluyendo **checkOut()** y **returnItem()**.
2. `Clases Abstractas`: **Item** es una clase abstracta que representa un ítem en la biblioteca con atributos comunes como **id**, titulo, y **autor**.
3. `Herencia`: **Book** y **Magazine** heredan de **Item** y también implementan la interfaz **Loanable**.
4. `Polimorfismo`: Utilizado para gestionar ítems de diferentes tipos (libros y revistas) a través de métodos en la clase **User**.
5. `Arreglos y Listas`: Usados para almacenar y gestionar los ítems y usuarios en la biblioteca.
6. `Estructura de Control`: Iterativa (bucles) y condicional para gestionar el préstamo y la devolución de ítems.

##  Descripción del Código
`Clases`
 1. *Item*:
 - Clase abstracta que define los atributos y métodos comunes para
       los ítems (ID, título, autor). Incluye el método abstracto
       showDetails() que debe ser implementado por las clases hijas.
 2. *Book*:
 - Hereda de Item e implementa la interfaz Loanable. Añade el
       atributo numeroHojas y redefine showDetails() para mostrar
       información específica sobre el libro.
 - Métodos de la interfaz Loanable:
   - **checkOut()**: Imprime un mensaje indicando que el libro ha sido revisado. 
   - **returnItem()**: Imprime un mensaje indicando que el libro ha sido devuelto.
3. *Magazine*:
 - Hereda de Item e implementa la interfaz Loanable. Añade el
       atributo frecuencia y redefine **showDetails()** para mostrar
       información específica sobre la revista.
4. Métodos de la interfaz **Loanable**:
 -  **checkOut()**: Imprime un mensaje indicando que la revista ha sido revisada.
 - **returnItem()**: Imprime un mensaje indicando que la revista ha sido devuelta.
4. User:
 - Clase que representa a un usuario de la biblioteca. Tiene métodos
       para tomar prestado y devolver ítems.
 - Utiliza instanceof para verificar el tipo de ítem (libro o
       revista) y realiza las acciones correspondientes.
5. Biblioteca:
 -  Clase que gestiona los ítems y usuarios de la biblioteca. Permite
       añadir ítems y usuarios y listar todos los ítems.

## Funcionalidades

 - Préstamo de Ítems: Los usuarios pueden tomar prestados libros y
   revistas. Los métodos prestadoItem en User y checkOut en Book y
   Magazine gestionan este proceso.
 - Devolución de Ítems: Los usuarios pueden devolver libros y revistas.
   Los métodos returnItem en User y returnItem en Book y Magazine
   gestionan este proceso.
 - Visualización de Ítems: Cada ítem puede mostrar sus detalles a través
   del método showDetails.
## Retos Encontrados y Cómo Fueron Solucionados
**Gestión de Diferentes Tipos de Ítems:** 
 - Utilización del operador *instanceo*f en el método **prestadoItem** de la  clase **User** para diferenciar entre **Book** y **Magazine**. Esto permite ejecutar código específico para cada tipo de ítem.
 
**Implementación de Interfaces y Herencia:** 
 - Implementación de la interfaz **Loanable** para manejar el préstamo y la devolución de ítems. Uso de clases abstractas y herencia para definir un comportamiento común para todos los ítems.
**Estructura de Datos:**
 
 - Utilización de listas (**ArrayList**) para gestionar ítems y usuarios en
   la biblioteca.
## *Uso del Operador instanceof*
En el contexto del programa, el operador **instanceof** se utiliza para verificar el tipo de un objeto en tiempo de ejecución. En el método **prestadoItem** de la clase **User**, **instanceof** permite determinar si un ítem es un Book "Libro" o un Magazine "Revista". Esto es esencial para ejecutar el código adecuado para cada tipo de ítem:
**if (item instanceof Book)**: Verifica si item es una instancia de Book.
**else if (item instanceof Magazine)**: Verifica si item es una instancia de Magazine.
Esto asegura que los mensajes y acciones sean específicos para el tipo de ítem gestionado.
