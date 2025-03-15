public class Lesson13 {
public static void main(String args[]){
    int[] num = {1,2,3};
    System.out.println(num[2]);

    int[] [] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    System.out.println(nums[1][2]);

    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums.length; j++){
            System.out.print(nums[i][j] + " ");
        }
        System.out.println();
    }

    String[][] s = new String[2][3];
    s[0][0] = "Hello";
    System.out.println(s[0][0]);
}}