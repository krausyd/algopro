import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonDuplicateNumber {

  public static int findWithMap(int[] numbers) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int number: numbers) {
      if (map.containsKey(number)) {
        map.put(number, map.get(number) + 1);
      } else {
        map.put(number, 1);
      }
    }

    Entry<Integer, Integer> value =  map.entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .findFirst()
        .orElseGet(null);
    if (value != null) {
      return value.getKey();
    }

    return -1;
  }

  public static int findWithBitOperation(int[] numbers) {
    int unique = 0;
    for (int number: numbers) {
      unique ^= number;
    }
    return unique;
  }
}
