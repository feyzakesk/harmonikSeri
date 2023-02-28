import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Harmonik seri formulü 1 + (1/2) + (1/3) + (1/n)
        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını giriniz : ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1 ; i <= n ; i++){
            result += (1/i);

        }
        System.out.println(result);

    }
}
