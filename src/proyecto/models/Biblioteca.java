package proyecto.models;

import java.util.Scanner;

public class Biblioteca {
    public Libro listaLibro[] = new Libro[5];
    public Libro aux;
    public void registrarLibro() {
        listaLibro[0] = new Libro("Piratas the Caribe", 3215, "Aventuras");
        listaLibro[1] = new Libro("50 Sombras de Gray", 1156, "Romance");
        listaLibro[2] = new Libro("Wally", 4564, "Aventuras");
        listaLibro[3] = new Libro("Naruto XD", 2165, "Anime");
        listaLibro[4] = new Libro("One Piece", 7256, "Anime");
    }

    /*public void buscarLibro(){
        String categoria;
        Scanner entrada = new Scanner(System.in);
        categoria = entrada.next();
        for (int i=0; i< listaLibro.length; i++) {
            if (categoria.equals(listaLibro[i].getCategoria())) {
                System.out.println("Libro encontrado");
                System.out.println("Informacion");
                System.out.println("Nombre: " + listaLibro[i].getNombre());
                System.out.println("Id: " + listaLibro[i].getId());
                //System.out.println("Categoria: " + listaLibro[i].getCategoria());
            }
        }
    }*/
    public void buscarLibro() {
        String categoria;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la categoria: ");
        categoria = entrada.next();
        visualizarLibro(categoria);
    }
    public void visualizarLibro(String categoria) {
        for (int i=0; i< listaLibro.length; i++){
            if (categoria.equals(listaLibro[i].getCategoria())){
                System.out.println("Libro encontrado");
                System.out.println("Informacion");
                System.out.println("Nombre: " + listaLibro[i].getNombre());
                System.out.println("Id: " + listaLibro[i].getId());
                //System.out.println("Categoria: " + listaLibro[i].getCategoria());
            }
        }
    }
    public void ordenarDatos() {
        int i, j;
        for ( i=0 ; i< listaLibro.length ; i++ ) {
            for ( j=i+1 ; j< listaLibro.length ; j++ ) {
                if ( listaLibro[i].getId() > listaLibro[j].getId()) {
                    aux = listaLibro[i];
                    listaLibro[i] = listaLibro[j];
                    listaLibro[j] = aux;
                }
            }
        }
        /*for (int i = 0; i<listaLibro.length; i++){
            for (int j = 0; j<listaLibro.length -1; j++){
                if (listaLibro[j].getId() > listaLibro[j + 1].getId()) {
                    aux = listaLibro[j];
                    listaLibro[j] = listaLibro[j + 1];
                    listaLibro[j + 1] = aux;
                }
            }
        }*/
    }
}
