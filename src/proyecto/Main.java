package proyecto;

import proyecto.models.Biblioteca;

import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {
        biblioteca.registrarLibro();
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("   Menu  ");
            System.out.println("1. Buscar Libro");
            //System.out.println("2. Visualizar Libros");
            System.out.println("2. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    biblioteca.ordenarDatos();
                    biblioteca.buscarLibro();
                    break;
                /*case 2:
                    biblioteca.visualizarLibros();
                    break;*/
                default:
                    System.out.println("Bye");
                    break;
            }
        } while (opcion != 2);
    }
}
