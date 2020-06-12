import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person person){
        Person[] arrayCopy = Arrays.copyOf(array, array.length + 1);

        arrayCopy[arrayCopy.length - 1] = person;
        return arrayCopy;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] peeps = new Person[3];
        peeps[0] = new Person("T-bone");
        peeps[1] = new Person("Lizzzzard");
        peeps[2] = new Person("Trapper");

        peeps = addPerson(peeps, new Person("Lilly"));

        for (Person person : peeps){
            System.out.println(person.getName());
        }
    }
}
