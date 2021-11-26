import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> numbersAsMap = new HashMap<>();
    for(int i=0; i<numbers.length; i++) {
      int diff = target - numbers[i];
      if (numbersAsMap.containsKey(diff)) {
        return new int[] {numbersAsMap.get(diff), i};
      } else {
        numbersAsMap.put(numbers[i], i);
      }
    }
    return null;
  }
}
