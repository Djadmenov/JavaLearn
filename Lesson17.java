public class Lesson17 {
    public static void main(String[] args) {
        Personas person1 = new Personas();
        //person1.name = "Sandibek";
        person1.setNameAndAge("Sandibek", 25);
        //person1.age = 25;
        person1.speak();

        Personas person2 = new Personas();
        String s1 = "Simon";
        //person2.name = "John Doe";
        //person2.age = 35;
        person2.setNameAndAge(s1, 35);
        person2.speak();
        //person2.sayHello();
        //int years1 = person1.calculate();
        //int years2 = person2.calculate();
        //System.out.println(years1);
        //System.out.println(years2);
    }
}
class Personas{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculate(){
        int years = 65 - age;
        return years;
    }

    public void speak(){
        System.out.println("My name is " + name + "," + age + " years old");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
