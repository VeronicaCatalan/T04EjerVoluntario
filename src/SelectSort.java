public class SelectSort {
    public static void main(String[] argv) {
        // crear matriz
        String[] arr = {"Victor Alonso", "Susana Salcedo", "Carlos Cacho", "Pedro Perez", "Santiago Calatrava", "Alberto Cortina", "Pedro Ramirez", "Juan Sanchez"};
        String menor;
        String temp; //memoria para almacenar datos

        for (int i = 0; i < arr.length - 1; i++) {
            menor = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(menor) < 0) {

                    //intercambiar posicion en el array
                    temp = arr[j];
                    arr[j]=temp;
                    menor=temp;
                }
            }
            arr[i] = menor;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}