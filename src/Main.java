import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(goForAWalk(25, -20.5));
        System.out.println(goForAWalk(25, 10));
        System.out.println(goForAWalk(15, 10));
        System.out.println(goForAWalk(50, 10));
        System.out.println(goForAWalk(50, 36.7));

        System.out.println(goForAWalk(randomNumber(0,70), 36.7));  // DZ na soobrazitelnost'


    }

    public static int randomNumber(int minAge, int maxAge) {
        int randomNumber = (int) Math.floor(Math.random() * (maxAge - minAge + 1) + minAge);
        System.out.println("Age: " + randomNumber + "; Temperature: " + 10);
        System.out.println(goForAWalk(randomNumber, 10));
        return randomNumber;
    }


    public static String goForAWalk(int age, double temp) {
        if ((age >= 20 && age <= 45) && (temp > (-20) && temp < 30)) {
            return "Can go for a walk";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Can go for a walk!";
        } else if (age > 45 && temp >= (-10) & temp <= 25) {
            return "Can go for a walk!!";
        } else {
            return "Stay at home!!!";
        }
    }
}