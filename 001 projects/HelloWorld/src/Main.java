import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte age = 35;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//        Date now = new Date();
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        String message = "Hello World" + "!!";
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.indexOf("e"));
//        System.out.println(message.replace("!", "*"));

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;

//        int [] numbers = {2,3,5,1,4};
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

//        int [][] numbers = new int[2][3];
//        numbers[0][1] = 1;
//        int [][] numbers = {{1,2,3}, {4,5,6}};
//        System.out.println(Arrays.deepToString(numbers));

//        final float PI = 3.14F;
//        PI = 1;

//        int x = 1;
//        int y = x++;
//        int z = ++x;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        double x =1.1;
//        int y = (int)x+2;
//        System.out.println(y);

//        int result = Math.round(1.1F);
//        System.out.println(result);
//        System.out.println(Math.ceil(1.1F));
//        System.out.println(Math.round(Math.random()*100));

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(1234567.891);
//        System.out.println(result);

//        Scanner scanner  = new Scanner(System.in);
//        System.out.print("Name:");
//        String name = scanner.nextLine().trim();
//        System.out.println("you are "+ name);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");

        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period in Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
}