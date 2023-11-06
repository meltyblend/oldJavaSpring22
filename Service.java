import java.util.Scanner;

public class Service {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //console outputs
        System.out.println("Welcome to AirWaves\n");
        System.out.println("Please view our selection of plans\n\n");

        System.out.println("Plan A: Talk(< 500 Mins), Text(None), Data(None) - $49/month");
        System.out.println("Plan B: Talk(< 500 Mins), Text(Any), Data(None) - $55/month");
        System.out.println("Plan C: Talk(>= 500 Mins), Text(< 100), Data(None) - $61/month");
        System.out.println("Plan D: Talk(>= 500 Mins), Text(>= 100), Data(None) - $70/month");
        System.out.println("Plan E: Talk(Any), Text(Any), Data(< 3GB) - $79/month");
        System.out.println("Plan F: Talk(Any), Text(Any), Data(>= 3GB) - $87/month\n");

        // user inputs
        System.out.println("How many Talk Minutes would you like per month?");
        int min = scanner.nextInt();

        System.out.println("How many Text messages would you like per month?");
        int text = scanner.nextInt();

        System.out.println("How much Data do you need per month?");
        int data = scanner.nextInt();

        // calculations
        if (min < 500 && text == 0 && data == 0){
            System.out.println("Plan A would be the most suitable option for you! ");
        }
        else if (min < 500 && text > 100  && data == 0) {
            System.out.println("Plan B would be the most suitable option for you!");
        }
// important

        //hello
        //hi


        if (min >= 500 && text < 100 && data == 0){
            System.out.println("Plan C would be the most suitable option for you!");
        }
        else if (min >= 500 && text >= 100 && data == 0){
            System.out.println("Plan D would be the most suitable option for you!");
        }

        if (min > 500 && text > 100 && data < 3){
            System.out.println("Plan E would be the most suitable option for you!");
        }
        else if (min > 500 && text > 100 && data >= 3) {
            System.out.println("Plan F would be the most suitable option for you");
        }


    }
}