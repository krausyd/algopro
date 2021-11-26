import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public static boolean canSpell(String word, char[] letters) {
    Map<Character, Integer> magazine = new HashMap<>();
    for(char letter: letters) {
      if (!magazine.containsKey(letter)) {
        magazine.put(letter, 1);
      } else {
        magazine.put(letter, magazine.get(letter) + 1);
      }
    }

    for(char letter: word.toCharArray()) {
      if (!magazine.containsKey(letter) || magazine.get(letter) == 0) {
        return false;
      }
      magazine.put(letter, magazine.get(letter) - 1);
    }
    return true;
  }

}
