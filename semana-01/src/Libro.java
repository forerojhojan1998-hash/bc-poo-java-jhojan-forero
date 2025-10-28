// Archivo: Libro.java
// Ejercicio 1: Clase Principal del Dominio
// Estudiante: Jhojan Forero Infante
// Ficha: 3228970A
// Dominio: Librería "Mundo del Libro"

public class Libro {

    // Atributos
    private String titulo;      // Texto
    private String autor;       // Texto
    private double precio;      // Número decimal
    private int stock;          // Entero
    private boolean disponible; // Booleano

    // Constructor
    public Libro(String titulo, String autor, double precio, int stock, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }

    // 1️⃣ Método void que imprime información del libro
    public void mostrarInfo() {
        System.out.println("📘 Información del Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock + " unidades");
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("-------------------------------");
    }

    // 2️⃣ Método que retorna un valor calculado (precio con descuento)
    public double calcularDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }

    // 3️⃣ Método getter (obtener el título)
    public String getTitulo() {
        return titulo;
    }

    // 4️⃣ Método setter (modificar el precio)
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
