package recursion;

public class BinarySearch {

    public static void main(String[] args){
        int[] A = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(A,0,9,4));
    }

    public static int binarySearch(int[] A, int left, int right, int x){
        if(left > right){
            return -1;
        }

        int mid = (left + right) / 2;

        if(x == A[mid]){
            return mid;
        }

        if(x < A[mid]){
            return binarySearch(A, left, mid -1 ,x);
        }

        return binarySearch(A, mid + 1, right, x);
    }
}
