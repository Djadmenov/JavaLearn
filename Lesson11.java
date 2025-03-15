public class Lesson11 {
    public static void main(String[] args) {
        int[] a = new int [5];
        System.out.println(a[0]);
        /*a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;*/
        for (int i = 0; i < a.length; i++) {
            a[i] = i*3;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        int [] a1 = {3, 6, 9};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

    }
}
