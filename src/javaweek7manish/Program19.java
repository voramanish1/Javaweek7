package javaweek7manish;

public class Program19 {
    public static void main(String[] args) {


        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        double avg = sum / numbers.length;
        System.out.println("Average value of the array element is: " + avg);
    }
}
