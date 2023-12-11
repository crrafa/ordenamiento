package mOrdenamiento;

import java.util.Arrays;

public class IntroduccionBasicos {
   public static void main(String[] args) {
    int [] lista1={15, 7, 19, 46, 67, 21, 58, 45, 85, 40, 69, 98, 34, 38, 61, 91, 75, 57, 31, 17};
    int [] lista2={15, 7, 19, 46, 67, 21, 58, 45, 85, 40, 69, 98, 34, 38, 61, 91, 75, 57, 31, 17};
    int [] lista3={15, 7, 19, 46, 67, 21, 58, 45, 85, 40, 69, 98, 34, 38, 61, 91, 75, 57, 31, 17};
    int [] lista4={15, 7, 19, 46, 67, 21, 58, 45, 85, 40, 69, 98, 34, 38, 61, 91, 75, 57, 31, 17};
    int [] lista5={15, 7, 19, 46, 67, 21, 58, 45, 85, 40, 69, 98, 34, 38, 61, 91, 75, 57, 31, 17};
    
   
    System.out.println("\tMetodo de ordenacion Burbuja");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista1));
        MetodosBasicosOrdenacion.ordBurbuja(lista1);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista1));

    System.out.println("\n\tMetodo de ordenacion Burbuja v2");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista2));
        MetodosBasicosOrdenacion.ordBurbuja2(lista2);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista2));

    System.out.println("\n\tMetodo de ordenacion Intercambio");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista3));
        MetodosBasicosOrdenacion.ordIntercambio(lista3);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista3));

    System.out.println("\n\tMetodo de ordenacion Insercion");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista4));
        MetodosBasicosOrdenacion.ordInsercion(lista4);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista4));

    System.out.println("\n\tMetodo de ordenacion Selecccion");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista5));
        MetodosBasicosOrdenacion.ordSeleccion(lista5);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista5));
   }
}
