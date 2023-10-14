import java.util.Scanner;

public class B2966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Adrian = {'A','B','C','A','B','C','A','B','C','A','B','C'};
        char[] Bruno = {'B','A','B','C','B','A','B','C','B','A','B','C'};
        char[] Goran = {'C','C','A','A','B','B','C','C','A','A','B','B'};
        int length = sc.nextInt();
        String temp = sc.next().toUpperCase();
        sc.close();
        int max = 0;
        int cnt1 = 0; int cnt2 = 0; int cnt3 = 0;
        int number = 0;
        for (int i = 0; i < length; i++) {
            if (number % 12 == 0) {number = 0;}
            if (temp.charAt(i) == Adrian[number]) {cnt1++;}
            if (temp.charAt(i) == Bruno[number]) {cnt2++;}
            if (temp.charAt(i) == Goran[number]) {cnt3++;}
            number++;
        }
        int[] arr = {cnt1, cnt2, cnt3};
        for (int i = 0; i < 3; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < 3; i++) {
            if (arr[i] == max) {
                switch (i) {
                    case 0:
                        System.out.println("Adrian");
                        break;
                    case 1:
                        System.out.println("Bruno");
                        break;
                    case 2:
                        System.out.println("Goran");
                        break;
                }
            }
        }
    }
}
