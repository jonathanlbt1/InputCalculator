import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int counter = 0;
        double avg = 0;

        while(sc.hasNextInt()){
                sum += sc.nextInt();
                counter += 1;
        }
        sc.nextLine();
        avg = Math.round(sum / counter);

        sc.close();
        System.out.println("SUM = " + (int) sum + " AVG = " + (int) avg);
    }
}
