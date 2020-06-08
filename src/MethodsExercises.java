public class MethodsExercises {

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        System.out.println(addition(2, 2) + " : 4");

        System.out.println(subtraction(5, 3) + " : 2");

        System.out.println(multiplication(6, 6) + " : 36");

        System.out.println(division(100, 10) + " : 10");

        System.out.println(modulus(5, 2) + " : 1");
    }
}
