import java.util.Scanner;

public class PrimeRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Strat Number : ");
        int start = sc.nextInt();


        System.out.println("Enter End Number : ");
        int end = sc.nextInt();

        int primeCount = 0;
        int sum = 0;

        System.out.println("Prime Numbers : ");

        for(int num = start ; num <= end ;num++){
            if(num <2){
                continue;
            }
            boolean isPrime = true;

            for(int i = 2 ; i<num ; i++){
                if(num % i ==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(num + " ");

                primeCount++;
                sum = sum + num;
            }
        }

        System.out.println("\nTotal number of primes: " + primeCount);
        System.out.println("Sum of prime numbers: " + sum);

        sc.close();
    }
}
