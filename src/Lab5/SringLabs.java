package Lab5;
import java.util.Arrays;
import java.util.Scanner;

public class SringLabs {
    public static void main(String[] args) {
        SringLabs lab = new SringLabs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания 1, 2, 3, 4 или 5");
        int numlab = scanner.nextInt();
        String text = "Sample Output:The given string is: This is a test string The string reversed word by word is: sihT si a tset gnirts";
        String word = "Samar";
        String text2 = "Встретились Бяка и Бука. Никто не издал ни звука. Никто не подал и знака — Молчали Бука и Бяка. И Бука Думал со скукой: «Чего он так смотрит — букой?» А Бяка думал: «Однако Какой он ужасный Бяка…»";
        String text3 = "Ехал грека через реку. \n" +
                "Видит грека - в реке рак. \n" +
                "Сунул грека руку в реку. \n" +
                "Рак за руку грека - цап! ";
        String sub = "ре";
        String text4 = "Sample Output:\n" +
                "The given string is: This is a test string\n" +
                "The string reversed word by word is:\n" +
                "sihT si a tset gnirts\n";
        switch (numlab) {
            case 1:
                lab.lab51(text);
                break;
            case 2:
                lab.lab52(word);
                break;
            case 3:
                lab.lab53(text2);
                break;
            case 4:
                lab.lab54(text3, sub);
                break;
            case 5:
                lab.lab55(text4);
                break;
        }
    }

    public void lab51(String text) {

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

    public void lab52(String word) {
        StringBuilder output = new StringBuilder(word).reverse();
        String inverse = output.toString();
        if (word.equalsIgnoreCase(inverse)) {
            System.out.println("Слово " + word + " является палиндромом");
        } else System.out.println("Слово " + word + " не является палиндромом");
    }

    public void lab53(String text2) {

        String itog = text2.replaceAll("(?i)Бяка", "[вырезано цензурой]");
        System.out.println(itog);
    }

    public void lab54(String text3,String sub) {


        int count = 0;
        int i = 0;
        while ((i = text3.indexOf(sub, i)) != -1) {
            count++;
            i += sub.length();
        }
        System.out.println("Количество вхождений подстроки : " + count);
    }
    public void lab55(String text4) {
        String[] words = text4.split("\\W");
        String[] sdrow= new String[words.length];
        for(int i=0;i< words.length;i++){
            sdrow[i]=new StringBuilder(words[i]).reverse().toString();
        }
        String txet = String.join(" ", sdrow);
        System.out.println(txet);
    }
}








