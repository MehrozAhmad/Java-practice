import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterCount {
    public static void main(String[] args) {
        String input="My name is Mehroz";
        long duplicateCount=countDuplicateCharacter(input);
        System.out.println(duplicateCount);
    }

    public static long countDuplicateCharacter(String input){
        Map<Character,Long> characterCounts= input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));



        return characterCounts.entrySet().stream().filter(entry->entry.getValue()>1)
                .count();
    }
}
