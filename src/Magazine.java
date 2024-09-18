import Intefaz.Loanable;

public class Magazine extends Item implements Loanable {

    String frecuencia ;

    public Magazine(String id, String titulo, String autor, String frecuencia) {
        super(id, titulo, autor);
        this.frecuencia = frecuencia;
    }
    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "La revista con el ID " + getId() + ", Con el titulo " + getTitulo() + ", del autor " + getAutor());
    }

    @Override
    public void checkOut() {
        System.out.println("Revista revizada");
    }

    @Override
    public void returnItem() {
        System.out.println("Revista entregada");
    }

}
