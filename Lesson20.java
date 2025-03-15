public class Lesson20 {
    public static void main(String[] args) {
        Humans humans1 = new Humans("Humans", 25);
    }

    static class Humans {
        public Humans() {
            System.out.println( "Humans constructor");
            this.name = "Simon";
            this.age = 25;
        }

        public Humans(String name) {
            System.out.println( "Humans constructor2");
            this.name = "Simon";
            this.age = 25;
        }

        public Humans(String name, int age) {
            System.out.println( "Humans constructor3");
            this.name = "Simon";
            this.age = 25;
        }

        String name;
        int age;

        public void setName(String name) {this.name = name;}
        public void setAge(int age) {
            this.age = age;
        }
}
}