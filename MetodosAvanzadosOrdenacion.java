package mOrdenamiento;

public class MetodosAvanzadosOrdenacion {

  //añadir mergesort

    public static void intercambiar(int []a, int i, int j)
    {
      int aux = a[i];
      a[i] = a[j];
      a[j]= aux ;
    }
    public static void intercambiar(long []a, int i, int j)
    {
      long aux = a[i];
      a[i] = a[j];
      a[j]= aux ;
    }
    public static void intercambiar(double[]a, int i, int j)
    {
      double aux = a[i];
      a[i] = a[j];
      a[j]= aux ;
    }

    public static void ordenacionShell(int a[])
    {
      int intervalo, i, j, k;
    int n= a.length;
      
    intervalo = n / 2;
      while (intervalo > 0)
      {
        for (i = intervalo; i < n; i++)
        {
          j = i - intervalo;
          while (j >= 0) 
          {
            k = j + intervalo;
            if (a[j] <= a[k])
              j = -1;    // par de elementos ordenado 
            else
            {
        intercambiar(a, j, j+1);
              j -= intervalo;
            }
          }
        }
        intervalo = intervalo / 2;
      }
    }
 
    public static void quicksort(int a[])
    {
      quicksort(a, 0, a.length-1);
    }

    private static void quicksort(int a[], int primero, int ultimo)
    {
    int i, j, central;
    double pivote;

    central = (primero + ultimo)/2;
    pivote = a[central];
    i = primero;
    j = ultimo;

   // Ilistrativo System.out.println("Pivote "+pivote+" "+central+ "  Primero "+primero+" Ultimo "+ultimo);

    do {
      while (a[i] < pivote) i++;
      while (a[j] > pivote) j--;
    
      if (i <= j) 
      {
        intercambiar(a, i, j);
        i++;
        j--;
      }
    }while (i <= j);
   
    if (primero < j)
      quicksort(a, primero, j); // mismo proceso con sublista izqda

    if (i < ultimo)
      quicksort(a, i, ultimo); // mismo proceso con sublista drcha
    }

    public static void mergesort(int a[])
    {
      mergesort(a, 0, a.length - 1);
    }
    private static void mergesort(int [] a, int primero,  int ultimo)
    {
      int central;
      if (primero < ultimo)
      {
        central = (primero + ultimo)/2;
        mergesort(a, primero, central);
        mergesort(a, central+1, ultimo);
        mezcla(a, primero, central, ultimo);
      }
    }
    // mezcla de dos sublistas ordenadas
    private static void mezcla(int[] a, int izda, int medio, int drcha)
    {
      int [] tmp = new int[a.length];
      int i, k, z;
      i = z = izda;
      k = medio + 1;
      // bucle para la mezcla, utiliza tmp[] como array auxiliar 
      while (i <= medio && k <= drcha)
      {
        if (a[i] <= a[k])
          tmp[z++] = a[i++];
        else
          tmp[z++] = a[k++];
      }
      // se mueven elementos no mezclados de sublistas
      while (i <= medio)
        tmp[z++] = a[i++];
      while (k <= drcha)
        tmp[z++] = a[k++];
      // Copia de elementos de tmp[] al array a[]
      System.arraycopy(tmp, izda, a, izda, drcha-izda+1);
    }

}
