public class Lesson14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sandi";
        person1.age = 25;
        System.out.println(person1.name + ", " + person1.age );
        Person person2 = new Person();
        person2.name = "John";
        person2.age = 35;
        System.out.println(person2.name + ", " + person2.age );
    }
}
class Person{
    String name;
    int age;
}