package javaweek7manish;

public class Program20 {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(contains(array,3));
        System.out.println(contains(array,13));
        System.out.println(contains(array,8));


    }

    private static boolean contains(int[] array,int b) {
        for(int n : array){
            if(b==n){
                return true;
            }
        }
        return false;
    }
}