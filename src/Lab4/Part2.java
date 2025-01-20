package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Part2.labs lab = new Part2.labs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания 1,2,3 или 4");
        int numlab = scanner.nextInt();
        switch (numlab) {
            case 1:
                lab.lab41();
                break;
            case 2:
                lab.lab42();
                break;
            case 3:
                lab.lab43();
                break;
            case 4:
                lab.lab44();
                break;
        }
    }
    static class labs {
        public void lab41() {
//            int[] mas = {0, -3, 7, 4, 5, 4, 3};  //false
            int[] mas = {1, 2, 3, 4, 5, 6, 7};     //true
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
        public void lab43() {

            int[] mas1={5, 6, 7, 2};
            System.out.println("Результат:" + Arrays.toString(mas1));
            int first=mas1[0];
            int last=mas1[mas1.length-1];
            mas1[0]=last;
            mas1[mas1.length-1]=first;
            System.out.println("Результат:" + Arrays.toString(mas1));
        }
        public void lab44() {
            int[] mas1 = {1, 2, 3, 1, 2, 4};
            int unique = -1;
            boolean isUnique;

            for (int j = 0; j < mas1.length; j++) {
                isUnique = true;


                for (int k = 0; k < mas1.length; k++) {
                    if (j != k && mas1[j] == mas1[k]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique == true) {
                    unique = mas1[j];
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
