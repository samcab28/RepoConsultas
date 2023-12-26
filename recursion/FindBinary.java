package recursion;

public class FindBinary {

    public static void main(String[] args){
        System.out.println(findBinary(4498,""));
        System.out.println(findBinary(45698,""));


    }

    public static String findBinary(int decimal, String result){
        if(decimal == 0){
            return result;
        }

        result = decimal % 2 + result;
        return findBinary(decimal/2,result);
    }
}
