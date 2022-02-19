package arreglos;

public class PruebaOrdenamientos {


    public static void main(String[] args) {
        Ordenamiento b = new Ordenamiento();
        int[] arreglo1 = new int[20];
        int[] arreglo2;
        int[] arreglo3;
        int[] arreglo4;
        int[] arreglo5;
        int[] arreglo6;
        long tiempoInicial, tiempoFinal, tiempoTotal;
        long bubletiempo,inserttiempo,cocktiempo,buckettiempo,countingtiempo, mergetiempo;
        //LLENAR PRIMER ARREGLO Y SEGUNDO
        Ordenamiento.arregloAleatorio(arreglo1);
        arreglo2 = arreglo1.clone();//copia y distinta direccion de memoria
        arreglo3 = arreglo1.clone();//copia y distinta direccion de memoria
        arreglo4 = arreglo1.clone();//copia y distinta direccion de memoria
        arreglo5 = arreglo1.clone();//copia y distinta direccion de memoria
        arreglo6 = arreglo1.clone();//copia y distinta direccion de memoria

        //IMPRIMIMOS ARREGLOS
        System.out.println("=========ARREGLOS=======");

        //BUBLE SORT
        System.out.println("\nBUBBLE SORT ARREGLO 1");
        tiempoInicial = System.nanoTime();
        System.out.print("Arreglo 1: " + Ordenamiento.generaString(arreglo1));
        Ordenamiento.bubbleSort(arreglo1);
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println("\n"+Ordenamiento.generaString(arreglo1));
        bubletiempo = tiempoTotal;

        //INSERT SORT
        System.out.println("\nINSERT SORT ARREGLO 2");
        tiempoInicial = System.nanoTime();
        System.out.println("Arreglo 2: " + Ordenamiento.generaString(arreglo2));
        Ordenamiento.insertSort(arreglo2);
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println(Ordenamiento.generaString(arreglo2));
        inserttiempo = tiempoTotal;

        //COCKTAIL SORT
        System.out.println("\nCocktail SORT SORT ARREGLO 3");
        tiempoInicial = System.nanoTime();
        System.out.println("Arreglo 3: " + Ordenamiento.generaString(arreglo3));
        Ordenamiento.cocktailSort(arreglo3);
        tiempoFinal = System.nanoTime();
       tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println(Ordenamiento.generaString(arreglo3));
        cocktiempo = tiempoTotal;

        //BUCKET SORT
        System.out.println("Bucket Sort ARREGLO 4");
        tiempoInicial = System.nanoTime();
        System.out.println("\nArreglo 4: " + Ordenamiento.generaString(arreglo4));
        Ordenamiento.bucketSort(arreglo4, arreglo4.length);
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println(Ordenamiento.generaString(arreglo4));
        buckettiempo = tiempoFinal;

        //COUNTING  SORT
        System.out.println("Counting Sort ARREGLO 5");
        tiempoInicial = System.nanoTime();
        System.out.println("\nArreglo 5: " + Ordenamiento.generaString(arreglo5));
        Ordenamiento.countSort(arreglo5, arreglo5.length);
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println(Ordenamiento.generaString(arreglo4));
        countingtiempo = tiempoTotal;
        //COUNTING  SORT
        System.out.println("Merge Sort ARREGLO 6");
        tiempoInicial = System.nanoTime();
        System.out.println("\nArreglo 6: " + Ordenamiento.generaString(arreglo6));
        Ordenamiento.mergeSort(arreglo6,arreglo6.length);
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println(Ordenamiento.generaString(arreglo6));
        mergetiempo = tiempoTotal;

        //COMPARACION DE TIEMPOS
        System.out.println("\nTiempo total BUBBLE Sort: " + bubletiempo + " nanosegundos");
        System.out.println("Tiempo total INSERT Sort: " + inserttiempo + " nanosegundos");
        System.out.println("Tiempo total COCKTAIL Sort: " + cocktiempo + " nanosegundos");
        System.out.println("Tiempo total BUCKET Sort: " + buckettiempo + " nanosegundos");
        System.out.println("Tiempo total COUNTING Sort: " + countingtiempo + " nanosegundos");
        System.out.println("Tiempo total MERGE Sort: " + mergetiempo + " nanosegundos");


    }

}
