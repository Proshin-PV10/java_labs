package Lab5;
import java.util.Arrays;
import java.util.Scanner;

public class sringLabs {
    public static void main(String[] args) {
        sringLabs lab = new sringLabs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания 1, 2, 3, 4 или 5");
        int numlab = scanner.nextInt();
        switch (numlab) {
            case 1:
                lab.lab51();
                break;
            case 2:
                lab.lab52();
                break;
            case 3:
                lab.lab53();
                break;
            case 4:
                lab.lab54();
                break;
            case 5:
                lab.lab55();
                break;
        }
    }

    public void lab51() {
        String text = "Sample Output:The given string is: This is a test string The string reversed word by word is: sihT si a tset gnirts";
        String[] words = text.split("\\W");
        System.out.println(Arrays.toString(words));
        String longestWord = "";
        int size = 0;
        for (int i = 0; i < words.length; ) {
            if (words[i].length() > size) {
                size = words[i].length();
                longestWord = words[i];
            } else {
                i++;
            }
        }
        System.out.println(longestWord);
    }

    public void lab52() {
        String word = "Samar";
        StringBuilder output = new StringBuilder(word).reverse();
        String inverse = output.toString();
        if (word.equalsIgnoreCase(inverse)) {
            System.out.println("Слово " + word + " является палиндромом");
        } else System.out.println("Слово " + word + " не является палиндромом");
    }

    public void lab53() {
        String text = "Встретились Бяка и Бука. Никто не издал ни звука. Никто не подал и знака — Молчали Бука и Бяка. И Бука Думал со скукой: «Чего он так смотрит — букой?» А Бяка думал: «Однако Какой он ужасный Бяка…»";
        String itog = text.replaceAll("(?i)Бяка", "[вырезано цензурой]");
        System.out.println(itog);
    }

    public void lab54() {
        String text = "Ехал грека через реку. \n" +
                "Видит грека - в реке рак. \n" +
                "Сунул грека руку в реку. \n" +
                "Рак за руку грека - цап! ";
        String sub = "ре";
        int count = 0;
        int i = 0;
        while ((i = text.indexOf(sub, i)) != -1) {
            count++;
            i += sub.length();
        }
            System.out.println("Количество вхождений подстроки : " + count);
        }
    public void lab55() {
        String text = "Sample Output:\n" +
                "The given string is: This is a test string\n" +
                "The string reversed word by word is:\n" +
                "sihT si a tset gnirts\n";

        String[] words = text.split("\\W");
        String[] sdrow= new String[words.length];
        for(int i=0;i< words.length;i++){
            sdrow[i]=new StringBuilder(words[i]).reverse().toString();
        }
        String txet = String.join(" ", sdrow);
        System.out.println(txet);
        }
    }








