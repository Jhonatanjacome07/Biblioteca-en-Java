import Intefaz.Loanable;

public class User {
    private String nombre;
    private String userId;

    public User(String nombre, String userId) {
        this.nombre = nombre;
        this.userId = userId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void prestadoItem(Item item) {
        if (item instanceof Book) {
            System.out.println(nombre + " pide prestado el libro " + item.getTitulo());
            System.out.println("Libro revisado.");
        } else if (item instanceof Magazine) {
            System.out.println(nombre + " pide prestado la revista " + item.getTitulo());
            System.out.println("Revista revisada.");
        }

        // Verificar si el ítem es prestable (Loanable)
        if (item instanceof Loanable) {
            ((Loanable) item).checkOut();
        }

    }

    public void returnItem(Item item) {
        if (item instanceof Book) {
            System.out.println(nombre + " ha devuelto el libro " + item.getTitulo());
        } else if (item instanceof Magazine) {
            System.out.println(nombre + " ha devuelto la revista " + item.getTitulo());
        }

        // Verificar si el ítem es prestable (Loanable)
        if (item instanceof Loanable) {
            ((Loanable) item).returnItem();
        }
    }

}
