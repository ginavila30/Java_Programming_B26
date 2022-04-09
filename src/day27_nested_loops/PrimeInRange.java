package day27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            boolean prime= true; // I can also use int count = 0;
            for (int j = 2; j  <i; j++) {

                if(i%j==0){ prime=false;} //{count++;}

            }
            if (prime){//if(count==0)
                System.out.print(i+", ");
            }

        }
    }
}
