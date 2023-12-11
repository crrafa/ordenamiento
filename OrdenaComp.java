package mOrdenamiento;

import java.util.Arrays;

public class OrdenaComp {
    public static void main(String args[])
    {
      final int M = 10000;
      int [] v = new int [M];
      int [] c = new int [M];
      long k1, k2;
  
      entrada(v);

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosBasicosOrdenacion.ordBurbuja(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación por burbuja: "+ (k2 - k1));  

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosBasicosOrdenacion.ordBurbuja2(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación por burbuja(2): "+ (k2 - k1));   

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();
      MetodosBasicosOrdenacion.ordIntercambio(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación por intercambio: "+ (k2 - k1));  

      System.arraycopy(v,0,c,0,v.length); 
       k1  = System.currentTimeMillis();   
      MetodosBasicosOrdenacion.ordInsercion(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación por inserción: "+ (k2 - k1));   

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosBasicosOrdenacion.ordSeleccion(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación por seleccion: "+ (k2 - k1));   

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosAvanzadosOrdenacion.ordenacionShell(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación Shell: "+ (k2 - k1));  

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosAvanzadosOrdenacion.quicksort(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación Quicksort: " + (k2 - k1)); 

      System.arraycopy(v,0,c,0,v.length);
      k1  = System.currentTimeMillis();   
      MetodosAvanzadosOrdenacion.mergesort(c);
      k2 = System.currentTimeMillis();
      System.out.println("\nTiempo ordenación Mergesort: " + (k2 - k1)); 
         
     System.out.println(Arrays.toString(c));                                  
    }
   
    static void entrada(int [] w)
    {
      int SUP =9999;
      for (int i = 0; i< w.length; i++)
         w[i] = (int)(Math.random() * SUP + 1);
    }  
}
