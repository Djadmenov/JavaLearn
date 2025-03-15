public class Lesson21 {
    public static void main(String[] args) {
        Humanes humans1 = new Humanes("Sandi", 25);
    }

    static class Humanes {
        private String name;
        private int age;




        public Humanes(String name, int age) {
            System.out.println( "Humans constructor2");
            this.name = name;
            this.age = age;
        }


        public void setName(String name) {this.name = name;}
        public void setAge(int age) {
            this.age = age;
        }
    }
}
