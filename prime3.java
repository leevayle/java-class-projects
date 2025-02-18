public class PrimeNumberSum {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        int divisor = 2;
        while (divisor < num) {
            if (num % divisor == 0) {
                return false; 
            }
            divisor++;
        }

        return true; 
    }

    public static void main(String[] args) {
        int num = 2; 
        int sum = 0;

        while (num <= 100) {
            if (isPrime(num)) {
                sum += num;
            }
            num++;
        }

        System.out.println("\n Sum =  " + sum);
    }
}