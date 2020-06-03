public class ControlFlowExercises {

    public static void main(String[] args) {


          /////////////////////
         //// Loop Basics ////
        /////////////////////


            //While Loop

                //int i = 5;
                //while (i <= 15){
                //    System.out.print(i + " ");
                //    i++;
                //}


            //Do While Loop

                //int j = 100;
                //do {
                //    System.out.println(j);
                //    j -= 5;
                //}while (j >= -10);

                //long k = 2;
                //do {
                //    System.out.println(k);
                //    k *= k;
                //}while(k < 1000000);


            // Refactor above two loops into for loops

                //for (int l = 100; l >= -10; l-= 5) {
                //    System.out.println(l);
                //}

                //for (long m = 2; m < 1000000; m *= m) {
                //    System.out.println(m);
                //}



          ///////////////////////
         ////// Fizzbuzz ///////
        ///////////////////////


            for (int n = 0; n <= 100; n++) {
                if (n % 3 == 0 && n % 5 == 0) {
                    System.out.println("FizzBuzz");
                }else if (n % 3 == 0) {
                    System.out.println("Fizz");
                }else if (n % 5 == 0) {
                    System.out.println("Buzz");
                }else {
                    System.out.println(n);
                }
            }

    }
}
