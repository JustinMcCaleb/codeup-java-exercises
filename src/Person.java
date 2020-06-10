public class Person {

    private String name;

    public String getName(){
        return name;
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
        System.out.println(p1.getName());

        //Using a constructor to set name value and getter to print out name value
        Person p2 = new Person("Cheyenne");
        System.out.println(p2.getName());


    }
}
