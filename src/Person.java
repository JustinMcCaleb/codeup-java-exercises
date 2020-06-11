public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello from %s!\n", this.name);
    }

    //Generic constructor needed when a more specific one (like below) is defined. Without this generic constructor a person object can not be created in main method without calling a String name when creating a new person object.
    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args){

        //Using the getter and setter methods to assign value/print out value
        Person p1 = new Person();
        p1.setName("Justin");
//        System.out.println(p1.getName());
        p1.sayHello();

        //Using a constructor to set name value and getter to print out name value
        Person p2 = new Person("Cheyenne");
//        System.out.println(p2.getName());


        //My prediction is that the first sout will return true because the strings are being compared in the correct way, and the second will return false because what is being compared is the reference to the two individual objects.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //My prediction is that the sout will return true. After person1 is created a new Person data type with the variable name person2 is created and assigned the object of person1. So I believe the reference as well as the data are the same for both.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //My prediction is that the first three sout's will return "John", and that the fourth will return "Jane"
        //The above prediction is WRONG, here is why: the line "Person person2 = person1" is "reassigning" the name of person1 to person2. However, person1 is still accessible through that name. I know... confusing.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Alex");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("Trapper");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
