package codewars;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Set<String> duplicates = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (Character.toString(text.charAt(i)).equalsIgnoreCase(Character.toString(text.charAt(j)))) {
                    duplicates.add(Character.toString(text.charAt(i)).toLowerCase());
                    break;
                }
            }
        }
        return duplicates.size();
    }
}
