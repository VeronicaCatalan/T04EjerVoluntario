public class BubbleSort {
    public static void main(String[] argv) {
        String[] arr = {"Victor Alonso","Susana Salcedo", "Carlos Cacho", "Pedro Perez", "Santiago Calatrava", "Alberto Cortina", "Pedro Ramirez", "Juan Sanchez"};

        String temp;// memoria de almecamiento de datos

        for (int i = 0; i < arr.length - 2; i++) {//-2 pq n-2
            for (int j = 0; j < arr.length - i - 1; j++) {// i -1, esto = n-3. compara la anterior con la siguiente (-1)
                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    //intercambio de posicion
                    temp = arr[j];
                    arr[j]=arr[j + 1];
                    arr[j + 1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

