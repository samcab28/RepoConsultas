package recursion;

public class sumNaturalNumbers {

    public static void main(String[] args){
        System.out.println(sumNatural(25));
        System.out.println(sumNatural(354));
    }

    public static int sumNatural(int num){
        if(num <= 1){
            return num;
        }
        return num + sumNatural(num -1);
    }
}
