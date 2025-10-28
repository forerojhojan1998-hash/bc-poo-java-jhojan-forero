public class Main {
    public static void main(String[] args) {
        // Crear un objeto Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 45000, 12, true);

        // Mostrar información del libro
        libro1.mostrarInfo();

        // Calcular un descuento del 10%
        double nuevoPrecio = libro1.calcularDescuento(10);
        System.out.println("Precio con 10% de descuento: $" + nuevoPrecio);

        // Usar getter y setter
        System.out.println("Título del libro: " + libro1.getTitulo());
        libro1.setPrecio(40000);
        System.out.println("Nuevo precio actualizado: $" + 40000);
    }
}
