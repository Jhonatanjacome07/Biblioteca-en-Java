public class App {
    public static void main(String[] args) throws Exception {
         // Crear usuarios
         User user1 = new User("Juan", "U001");
         User user2 = new User("Maria", "U002");
 
         // Crear ítems
         Book book1 = new Book("B001", "Clean Code", "Robert C. Martin", 355);
         Magazine mag1 = new Magazine("M001", "Tech Monthly", "Jane Doe", "Monthly");
 
         // Usuario 1 toma prestado el libro
         System.out.println("\nEl Usuario 1 pide prestado el Libro:");
         user1.prestadoItem(book1);
 
         // Usuario 2 toma prestada la revista
         System.out.println("\nEl Usuario 2 pide prestado la revista:");
         user2.prestadoItem(mag1);
 
         // Usuario 1 devuelve el libro
         System.out.println("\nEl usuario 1  ha regresado el libro:");
         user1.returnItem(book1);
 
         // Usuario 2 devuelve la revista
         System.out.println("\nEl usuario 2 ha regresado la revista:");
         user2.returnItem(mag1);
    }
}
