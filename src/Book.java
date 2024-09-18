import Intefaz.Loanable;

public class Book extends Item implements Loanable {
    int numeroHojas = 0;

    public Book(String id, String titulo, String autor, int numeroHojas) {
        super(id, titulo, autor);
        this.numeroHojas = numeroHojas;
    }

    public int getnumeroHojas() {
        return numeroHojas;
    }

    public void setnumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Libro con el ID: " + getId() + ", Con el titulo " + getTitulo() + ", del autor " + getAutor());
    }

   
    @Override
    public void checkOut() {
        //Solo se imprime cuando aun no estaba asignado el condicional If para saber si era libro o revista
        //Caso contrario se imprimira dos veces que ha sido revizado como se podra observar en la revista
     // System.out.println("El libro ha sido revizado");
    }

    @Override
    public void returnItem() {
       // System.out.println("Libro regresado ");
    }
       

}
