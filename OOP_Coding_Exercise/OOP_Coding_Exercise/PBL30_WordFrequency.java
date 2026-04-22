import java.util.*;

class WordFrequencyCounter {
    private HashMap<String, Integer> freqMap = new LinkedHashMap<>();

    void processSentence(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
    }

    void display() {
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class PBL30_WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        WordFrequencyCounter wfc = new WordFrequencyCounter();
        wfc.processSentence(sentence);
        wfc.display();

        sc.close();
    }
}
