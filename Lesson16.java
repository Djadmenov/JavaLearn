public class Lesson16 {
        public static void main(String[] args) {
            Persona person1 = new Persona();
            person1.name = "Sandibek";
            person1.age = 25;
            person1.speak();
            Persona person2 = new Persona();
            person2.name = "John Doe";
            person2.age = 35;
            person2.sayHello();
            int years1 = person1.calculate();
            int years2 = person2.calculate();
            System.out.println(years1);
            System.out.println(years2);
        }
    }
    class Persona{
        String name;
        int age;

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