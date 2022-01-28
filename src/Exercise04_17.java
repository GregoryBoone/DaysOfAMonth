import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DaysOfAMonth myObject = new DaysOfAMonth();

        System.out.println("Enter a year: ");

        int year = scanner.nextInt();

        System.out.println("Enter the first three letters of your month: ");

        String month = scanner.next();

        System.out.println(month + ", " + year + " has " + myObject.displayDays(year, month) + " days.");
    }
}
