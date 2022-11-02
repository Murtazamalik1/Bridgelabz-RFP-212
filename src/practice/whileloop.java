package practice;

public class whileloop {
   public static void main(String[] args) {
        int val = 56;
        for (int i = 2;i<56;i++){
            if (i%2==0)
                System.out.println( "even number is :"+i);
          //  System.out.println(i+"");
        }

        int count = 0;
        int number = 2;
        int loopcount = 1;

        while (count<60){
            if (number%2==0){
                count++;
                System.out.println(number+"");

            }
            number++;
            loopcount++;
        }
        System.out.println();
       System.out.println(loopcount+"");


        //print odd number

       int num = 100;
        for (int i=0;i<num;i++){
            if (i%2!=0){
                System.out.println(i+"");
            }
        }
        //even number factor

       int v = 40;
        for (int i=2;i<40;i++){
            if (v % i == 0){
                System.out.println(i+"\t");
            }
        }

    }

}
