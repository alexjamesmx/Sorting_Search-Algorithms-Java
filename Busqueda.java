package arreglos;

public class Busqueda {


    public static void main(String[] args) {


        String stringTotal = "Alex es el mejor";
        String stringBuscado= "mejor";

        System.out.println("BUSQUEDA KMP PARA STRINGS");
        int index = violenceMatch(stringTotal,stringBuscado);
        System.out.println("index:"+index);
        int[] arreglo1 = {3,23,54,546,1000};
        System.out.println("=========================\nBUSCO LA PALABRA: '" + stringBuscado + "' \nen el string: '" + stringTotal + "' \n" + Ordenamiento.generaString(arreglo1) + " ESTE ES MI ARREGLO");
        long tiempoInicial, tiempoFinal, tiempoTotal;

        tiempoInicial = System.nanoTime();
        System.out.println("\nBUSUEDA SECUENCIAL SIMPLE PARA ARRAYS\nPosicion: [" + busquedaSimple(arreglo1,5, 546) + "] Busco el 546 en este caso");
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println("La búsqueda lineal o secuencial es el algoritmo de búsqueda más simple. Si bien ciertamente es el más simple,\n" +
                " definitivamente no es el más común, debido a su ineficiencia. Es un algoritmo de fuerza bruta. Muy raramente se utiliza en producción y,\n" +
                " en la mayoría de los casos, otros algoritmos lo superan.");
        System.out.println("Tiempo total: " + tiempoFinal);

        tiempoInicial = System.nanoTime();
        System.out.println("\nBUSUEDA BINARIA PARA ARRAYS\nPosicion: [" + busquedaBinaria(arreglo1,5, 546) + "]  Busco el 546 en este caso");
        tiempoFinal = System.nanoTime();
        tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println("Divide la colección de entrada en mitades iguales y con cada iteración compara el elemento objetivo con el elemento del medio.\n" +
                "Si se encuentra el elemento, la búsqueda finaliza. De lo contrario, continuamos buscando el elemento dividiendo y seleccionando la partición apropiada de la matriz, en función de si el elemento objetivo es más pequeño o más grande que el elemento del medio.\n" +
                "Por eso es importante tener una colección ordenada para la búsqueda binaria");
        System.out.println("Tiempo total: " + tiempoFinal+"\n");



        int arregloJumpSearch[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        int index2 = jumpSearch(arregloJumpSearch, x);

        System.out.println("BUSQUEDA JUMPSEARCH\nNumero " + x +
                " esta en posicion " + index2);
        System.out.println("Esta búsqueda es similar a la búsqueda binaria,\n" +
                "pero en lugar de saltar hacia adelante y hacia atrás,\nsolo saltaremos hacia adelante." +
                " Tenga en cuenta que Jump Search también requiere que se ordene la colección.");

    }

    public static int busquedaSimple(int vector[], int n, int dato) {
        int i;
        for(i=0; i<n; i++){
            if(dato==vector[i]) {
                return i;
            }
        }
        return -1;
    }
//Se asume que los elementos previamente ordenados.
    public static int busquedaBinaria(int  vector[], int n, int dato) {
        int centro,inf=0,sup=n-1;
        while(inf<=sup){
            centro=((sup+inf)/2);
            if(vector[centro]==dato)       return centro;
            else if(dato < vector[centro]) sup=centro-1;
            else                           inf=centro+1;
        }
        return -1;
    }

    public static int violenceMatch(String stringTotal, String stringBuscado){
        char[] charTotal = stringTotal.toCharArray();
        char[] charBuscado = stringBuscado.toCharArray();
        int totalLength = charTotal.length;
        int buscadoLength = charBuscado.length;
        int totalIndex = 0;
        int bucadoIndex = 0;
        while(totalIndex < totalLength && bucadoIndex < buscadoLength){
            if(charTotal[totalIndex] == charBuscado[bucadoIndex]){
                totalIndex++;
                bucadoIndex++;
            }else{
                // Error de coincidencia de personaje
                totalIndex = totalIndex - (bucadoIndex - 1);
                bucadoIndex = 0;
            }
        }
        if(bucadoIndex == buscadoLength){
            return totalIndex - bucadoIndex;
        }else{
            return -1;
        }
    }


    public static int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < x)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if (arr[prev] == x)
            return prev;
        return -1;
    }
}



