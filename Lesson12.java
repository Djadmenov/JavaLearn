public class Lesson12 {
    public static void main(String[] args) {
    String[] s = new String[3];
    s[0] = "Hello";
    s[1] = "World";
    s[2] = "HI";
    System.out.println(s[0]);
    System.out.println(s[1]);
    System.out.println(s[2]);
    System.out.println();
    for (int i = 0; i < s.length; i++) {
        System.out.println(s[i]);
    }

    System.out.println();

    for(String a:s){
        System.out.println(a);
    }

    int[] q1 = {1,2,3};
    int sum = 0;
    for (int x:q1){
        sum = sum+x;
    }
    System.out.println();
    System.out.println(sum);

    String w = null;
    System.out.println(w);
}
}
