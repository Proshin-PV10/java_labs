
import java.util.Arrays;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        labs lab = new labs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания 1,2,3,4,5 или 6");
        int numlab = scanner.nextInt();
        int[] mas = {0, -3, 7, 4, 5, 4, 3};

        switch (numlab) {
            case 1:
                lab.lab41();
                break;
            case 2:
                lab.lab42();
                break;
            case 3:
                System.out.println("Введите первое число:");
                int x = scanner.nextInt();
                System.out.println("Введите второе число:");
                int y = scanner.nextInt();
                System.out.println("Введите третье число:");
                int z = scanner.nextInt();
                lab.lab43(x,y,z);
                break;
            case 4:
                System.out.println("Введите первое число:");
                int a = scanner.nextInt();
                System.out.println("Введите второе число:");
                int b = scanner.nextInt();
                System.out.println("Введите третье число:");
                int c = scanner.nextInt();
                lab.lab44(a,b,c);
                break;
            case 5:
                lab.lab45(mas);
                break;
            case 6:
                lab.lab46(mas);
                break;


        }
    }


    static class labs {
        public void lab41() {
            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        public void lab42() {
            String result1 = "Делится на 3: ";
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    result1 += i + ", ";
                }
            }
            System.out.println(result1);
            String result2 = "Делится на 5: ";
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0) {
                    result2 += i + ", ";
                }
            }
            System.out.println(result2);
            String result3 = "Делится на 3 и 5: ";
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    result3 += i + ", ";
                }
            }
            System.out.println(result3);
        }

        public void lab43(int x,int y,int z) {
            boolean good;
            if (x + y == z) {
                good = true;
            } else good = false;
            System.out.println(good);
        }

        public void lab44(int x, int y,int z) {

            boolean good;
            if (x < y && y < z) {
                good = true;
            } else good = false;
            System.out.println(good);
        }

        public void lab45(int[]mas) {
            System.out.println(Arrays.toString(mas));
            boolean good;
            if ((mas[0] == 3) || (mas[mas.length - 1] == 3)) {
                good = true;
            } else good = false;
            System.out.println(good);
        }

        public void lab46(int[]mas) {

            System.out.println(Arrays.toString(mas));
            boolean good = false;
            for (int i = 0; mas.length > i; i++)
                if (mas[i] == 1 || mas[i] == 3) {
                    good = true;
                } else good = false;
            System.out.println(good);
        }
    }
}
