package conditionals;

public class Conditionals {
    public static void main(String[] args){

        int number = 0;
        System.out.println("Number: " + number);

        if(number % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        if(number < 0){
            System.out.println("The number is negative");
        }
        else if (number > 0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is zero");
        }

    }
}
