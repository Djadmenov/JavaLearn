/**
 * The Lesson18 class demonstrates working with nested static classes and encapsulation through the implementation
 * of a Persony class with private fields and corresponding getter and setter methods.
 * It also shows basic interaction with objects, including setting values, retrieving them, and performing actions.
 */
public class Lesson18 {
    public static void main(String[] args) {
        Persony person1 = new Persony();
        person1.setName("Sandibek");
        person1.setAge(25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.speak();
    }

    static class Persony {
        private String name;
        private int age;

        public void setName(String username) {
            if (username.isEmpty()){
                System.out.println("Введите своё имя");
            };
            name = username;
        }

        public String getName() {
            return name;
        }

        public void setAge(int userAge) {
            if (userAge<0){
                System.out.println("Введи свой возраст");
            }
            age = userAge;
        }

        public int getAge() {
            return age;
        }

        public void speak() {
            System.out.println("My name is " + name + ", " + age + " years old");

        }
    }
}