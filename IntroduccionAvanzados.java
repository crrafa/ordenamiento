package mOrdenamiento;

import java.util.Arrays;

public class IntroduccionAvanzados {
    public static void main(String[] args) {
        int [] lista1={592, 104, 183, 697, 155, 694, 135, 417, 600, 641, 436, 870, 95, 
            881, 573, 919, 880, 3, 224, 415, 49, 71, 2, 985, 114, 630, 821, 358, 936, 
            214, 945, 259, 351, 315, 118, 124, 846, 507, 181, 283, 198, 1000, 943, 933, 
            684, 12, 165, 156, 910, 803};

        int [] lista2={92, 104, 183, 697, 155, 694, 135, 417, 600, 641, 436, 870, 95, 
            881, 573, 919, 880, 3, 224, 415, 49, 71, 2, 985, 114, 630, 821, 358, 936, 
            214, 945, 259, 351, 315, 118, 124, 846, 507, 181, 283, 198, 1000, 943, 933, 
            684, 12, 165, 156, 910, 803};
            
       int [] lista3={92, 104, 183, 697, 155, 694, 135, 417, 600, 641, 436, 870, 95, 
            881, 573, 919, 880, 3, 224, 415, 49, 71, 2, 985, 114, 630, 821, 358, 936, 
            214, 945, 259, 351, 315, 118, 124, 846, 507, 181, 283, 198, 1000, 943, 933, 
            684, 12, 165, 156, 910, 803};
          
        System.out.println("\tMetodo de ordenacion Shell");
            System.out.println("Lista desordenada");
            System.out.println(Arrays.toString(lista1));
            MetodosAvanzadosOrdenacion.ordenacionShell(lista1);
            System.out.println("Lista ordenada");
            System.out.println(Arrays.toString(lista1));  
        

        System.out.println("\n\tMetodo de ordenacion Quicksort");
            System.out.println("Lista desordenada");
            System.out.println(Arrays.toString(lista2));
            MetodosAvanzadosOrdenacion.quicksort(lista2);
            System.out.println("Lista ordenada");
            System.out.println(Arrays.toString(lista2));

            System.out.println("\tMetodo de ordenacion Mergesort");
            System.out.println("Lista desordenada");
            System.out.println(Arrays.toString(lista3));
            MetodosAvanzadosOrdenacion.mergesort(lista3);
            System.out.println("Lista ordenada");
            System.out.println(Arrays.toString(lista3));
    }
}
