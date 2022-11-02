public class prime_number {
    public static void main(String[] args) {

            for(int I=0;I<=15;I++){

                int c=0;

                for(int j=1;j<=I;j++)

                    if(I%j==0)

                        c++;

                if(c==2)

                    System.out.println(I+" is a prime number");

            }

        }

    }


