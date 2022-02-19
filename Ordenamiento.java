package arreglos;
import java.util.*;

import polimorfismo.*;

import static java.util.Objects.hash;

public class Ordenamiento {

    public static void arregloAleatorio(int[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = (int) (Math.random() * rango);
        }
    }


    public static void cocktailSort(int a[]) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }

   public static void bucketSort(int[] arr, int bucketSize){
        // Create bucket array for storing lists
        List<Integer>[] buckets = new List[bucketSize];
        // Linked list with each bucket array index
        // as there may be hash collision
        for(int i = 0; i < bucketSize; i++){
            buckets[i] = new LinkedList<>();
        }
        // calculate hash and assign elements to proper bucket
        for(int num : arr){
            buckets[hash(num, bucketSize)].add(num);
        }
        // sort buckets
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int index = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                arr[index++] = num;
            }
        }
    }

    private static int hash(int num, int bucketSize){
        return num/bucketSize;
    }

   public static void countSort(int array[], int size) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
        int i=0,l=0,r = 0;
        while(l<left_size && r<right_size){
            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }
    public static void mergeSort(int [] arr, int len){
        if (len < 2){return;}

        int mid = len / 2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[len-mid];
        int k = 0;
        for(int i = 0;i<len;++i){
            if(i<mid){
                left_arr[i] = arr[i];
            }
            else{
                right_arr[k] = arr[i];
                k = k+1;
            }
        }
        mergeSort(left_arr,mid);
        mergeSort(right_arr,len-mid);
        merge(left_arr,right_arr,arr,mid,len-mid);
    }


    //CLASE -----------------------------------------------
    public static void arregloAleatorio(double[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = Math.random() * rango;
        }
    }

    public static void arregloAleatorio(float[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = (float) (Math.random() * rango);
        }
    }


    public static String palabraAleatoria(int numeroLetras) {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int longitud = letras.length;
        String texto = "";
        for (int i = 0; i < numeroLetras; i++) {
            int numeroAleatorio = (int) (Math.random() * longitud);
            texto = texto + letras[numeroAleatorio];
        }
        return texto;
    }

    public static void arregloAleatorio(String[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            arreglo[j] = palabraAleatoria(5);
        }
    }


    public static void insertSort(int[] arreglo) {
        int i = 1;
        while (i < arreglo.length) {
            int x = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > x) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = x;
            i = i + 1;
        }
    }

    public static void arregloAleatorio(Integer[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = (int) (Math.random() * rango);
        }
    }

    public static void arregloAleatorio(Double[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = Math.random() * rango;
        }
    }

    public static void arregloAleatorio(Float[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {
            int rango = arreglo.length + 1;
            arreglo[j] = (float) (Math.random() * rango);
        }
    }

    public static void insertSort(double[] arreglo) {
        int i = 1;
        while (i < arreglo.length) {
            double x = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > x) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = x;
            i = i + 1;
        }
    }

    public static void insertSort(float[] arreglo) {
        int i = 1;
        while (i < arreglo.length) {
            float x = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > x) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = x;
            i = i + 1;
        }
    }

    public static <Tipo extends Comparable<Tipo>> void insertSort(Tipo[] arreglo) {
        int i = 1;
        while (i < arreglo.length) {
            Tipo x = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j].compareTo(x) > 0) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = x;
            i = i + 1;
        }
    }

    public static void bubbleSort(int[] arreglo) {
        for (int k = 0; k < arreglo.length - 1; k++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(double[] arreglo) {
        for (int k = 0; k < arreglo.length - 1; k++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(float[] arreglo) {
        for (int k = 0; k < arreglo.length - 1; k++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    float temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    public static <Tipo extends Comparable<Tipo>> void bubbleSort(Tipo[] arreglo) {
        for (int k = 0; k < arreglo.length - 1; k++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    Tipo temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    public static String generaString(int[] arreglo) {
        String texto = arreglo[arreglo.length - 1] + "";
        for (int j = arreglo.length - 2; j >= 0; j--) {
            texto = arreglo[j] + "," + texto;
        }
        return "[" + texto + "]";
    }

    public static String generaString(double[] arreglo) {
        String texto = arreglo[arreglo.length - 1] + "";
        for (int j = arreglo.length - 2; j >= 0; j--) {
            texto = arreglo[j] + "," + texto;
        }
        return "[" + texto + "]";
    }

    public static String generaString(float[] arreglo) {
        String texto = arreglo[arreglo.length - 1] + "";
        for (int j = arreglo.length - 2; j >= 0; j--) {
            texto = arreglo[j] + "," + texto;
        }
        return "[" + texto + "]";
    }


    public static <Tipo> String generaString(Tipo[] arreglo) {
        String texto = arreglo[arreglo.length - 1] + "";
        for (int j = arreglo.length - 2; j >= 0; j--) {
            texto = arreglo[j] + "," + texto;
        }
        return "[" + texto + "]";
    }
}