import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("For this lab please enter 7 floating point values\n\n");

        double [] list = new double[7]; //creating a list that will contains 7 values inputted by the user
        double sum = 0;

        for ( int i = 0; i < list.length; i++ ) {// for loop that asks the user to enter floating point values
            System.out.print("Enter a floating point number: \n");
            list[i] = (float) scanner.nextDouble(); //scanning in the floating point values
        }

        for ( int i = 0; i < list.length; i++ ){ //for loop that will find the sum all 7 numbers
            sum += list[i];
        }

        // finding the average of all the numbers in the array
        double average = sum / 7;
        System.out.printf("The average is %.2f", average);
        System.out.println();

        double smallest = list[0];
        for ( int i = 0; i < list.length; i++ ) { // for loop to find the smallest floating point in the array
            if (list[i] < smallest){
                smallest = list[i];
            }
        }
        System.out.printf("The smallest value is %.2f", smallest);
        System.out.println();

        double largest = list[0];
        for ( int i = 0; i < list.length; i++){ // for loop to find the largest floating point in the array
            if (list[i] > largest){
                largest = list[i];
            }
        }
        System.out.printf("The largest value is %.2f", largest);//outputs largest value in array
        System.out.println();

        // finding the range of a data set/this array
        double range = largest - smallest;
        System.out.printf("The range is %.2f", range);
    }
}