import java.util.*;
import java.util.Map.Entry;
/*1157번 단어 공부*/
public class WordStudy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char result = func(sc.next());
        System.out.println(result);
    }

    static char func(String word) {
        String lowerCase = word.toUpperCase();
        char[] split = lowerCase.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : split) {
            hashMap.put(c , hashMap.getOrDefault(c,0) + 1);
        }


        Set<Entry<Character, Integer>> entries = hashMap.entrySet();

        int max = 0;
        char result = '0';

        for (Entry<Character, Integer> entry : entries) {

            if(entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == max) {
                result = '?';
            }

        }
        return result;
    }

}
