import javax.xml.transform.Source;
import java.util.Scanner;

public class StringDataCounter {

    //Write a program that reads the following message:

    public static void main(String[] args) {
        String input = "Notre Dame is a very old cathedral in Paris, France. It is one of France's most famous landmarks and many people visit it each year. The cathedral is on a small island on the River Seine. It is the cathedral of the Catholic Archdiocese of Paris, one of 23 archdioceses in France. The cathedral was built during two centuries. It is a very good example of Gothic Architecture in France. At the time it was finished, the cathedral was the biggest such building in Western Europe. Between 1844 and 1864, the building was renovated under the direction of Eugène Viollet-le-Duc, who incorporated elements into the design that the medieval building had not possessed before. The two rose windows which ornate the transept are among the biggest in Europe: each has a diameter of 13m.";

        System.out.println("Numarul total de cuvinte din acest string este: " + countWords(input));

        System.out.println("Numarul total de vocale din acest string este: " + countVowels(input));

        System.out.println("Numarul total de propozitii din acest string este: " + countSentences(input));
    }

    public static int countWords(String input) {

        int countWord = 1;

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' ') && (i < input.length() - 1)) {
                countWord++;
            }
        }
        return countWord;
    }

    public static int countVowels(String input) {

        char[] caractere = input.toCharArray();

        int countVowels = 0;

        for (char c : caractere) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowels++;
                    break;
            }
        }
        return countVowels;
    }

    public static int countSentences (String input) {

        int countSentences = 1;

        String [] sentences = input.split("\\.");
        int numberOfSentences = sentences.length;
        return numberOfSentences;
    }

}
