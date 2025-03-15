public class Lesson9 {
public static void main(String[] args) {
    /*int x= 0;
    while(true){
        if(x==5){
            break;
        }
        System.out.println(x);
        x++;
    }
    System.out.println("Вышли из цикла");*/

    for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
    }
}
}
