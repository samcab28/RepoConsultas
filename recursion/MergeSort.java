package recursion;

public class MergeSort {
    public static void main(String[] args){

        int[] data = new int[]{4,3,2,6,8,98,67,52};
        mergeSort(data, 0, data.length - 1);

        // Imprimir el resultado después de ordenar
        System.out.println("Arreglo ordenado:");
        for (int value : data) {
            System.out.print(value + " ");
        }
    }

    public static void mergeSort(int[] data, int start, int end){
        if(start < end){
            int mid = (start + end) / 2; // Usar la división por 2, no por end
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end){
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }

        while(i <= mid){
            temp[k++] = data[i++];
        }

        while(j <= end){
            temp[k++] = data[j++];
        }

        for(i = start; i <= end; i++){
            data[i] = temp[i - start];
        }
    }
}
