public class Lesson15 {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        person1.name = "Sandibek";
        person1.age = 25;
        person1.speak();
        Persons person2 = new Persons();
        person2.name = "John Doe";
        person2.age = 35;
        person2.sayHello();
    }
}
class Persons{
    String name;
    int age;

    public void speak(){
        System.out.println("My name is " + name + "," + age + " years old");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}