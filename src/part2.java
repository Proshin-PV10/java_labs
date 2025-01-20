
import java.util.Arrays;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        part2.labs lab = new part2.labs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания 1,2,3 или 4");
        int numlab = scanner.nextInt();
        int[] mas = {1, 2, 3, 4, 5, 6, 7};
        int[] mas1={5, 6, 7, 2};
        int[] mas2 = {1, 2, 3, 1, 2, 4};
        switch (numlab) {
            case 1:

                lab.lab41(mas);
                break;
            case 2:

                lab.lab42();
                break;
            case 3:

                lab.lab43(mas1);
                break;
            case 4:

                lab.lab44(mas2);
                break;
        }
    }
    static class labs {
        public void lab41(int[] mas) {
            boolean good = true;
            for (int i = 0; mas.length-1 > i; i++)
                if (mas[i] >mas[i+1])  good = false;
            System.out.println(good);
        }
        public void lab42() {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите размер массива:");
            int size = scanner1.nextInt();
            int[] mas=new int[size];
            for(int j=0;size>j;j++) {
                System.out.println("Введите член массива:");
                mas [j] = scanner1.nextInt();
            }

            System.out.println("Результат:" + Arrays.toString(mas));
        }
        public void lab43(int[]mas1) {


            System.out.println("Результат:" + Arrays.toString(mas1));
            int first=mas1[0];
            int last=mas1[mas1.length-1];
            mas1[0]=last;
            mas1[mas1.length-1]=first;
            System.out.println("Результат:" + Arrays.toString(mas1));
        }
        public void lab44(int[]mas2) {

            int unique = -1;
            boolean isUnique;

            for (int j = 0; j < mas2.length; j++) {
                isUnique = true;


                for (int k = 0; k < mas2.length; k++) {
                    if (j != k && mas2[j] == mas2[k]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique == true) {
                    unique = mas2[j];
                    break;
                }
            }
            if (unique != -1) {
                System.out.println("Первое уникальное число: " + unique);
            } else {
                System.out.println("Уникальных чисел нет.");
            }
        }
    }
}
