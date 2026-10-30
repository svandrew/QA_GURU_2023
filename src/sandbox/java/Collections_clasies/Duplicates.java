package Collections_clasies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicates {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                List.of("степ5", "степ3", "степ1", "степ2", "степ5", "степ6", "степ1", "степ2", "степ3"));
        Set<String> seen = new HashSet<>();
        
        Set<String> duplicates = new LinkedHashSet<>(); // для хранения в порядке записи

        for (String e : words) {
            if (!seen.add(e)) {
                duplicates.add(e);
            }
        }

        // для хранения в сортированном порядке (по алфавиту в данном случае)
        Collection<String> sortedDuplicates = new TreeSet<>(duplicates);

        System.out.println(duplicates);
        System.out.println(sortedDuplicates);
    }
}

