import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort3Nums {
  public static int[] sortNumsHashMap(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    for(int num: nums) {
      if (!numsMap.containsKey(num)) {
        numsMap.put(num, 1);
      } else {
        numsMap.put(num, numsMap.get(num) + 1);
      }
    }

    List<Integer> result = new ArrayList<>();
    for(Entry<Integer, Integer> entry: numsMap.entrySet()) {
      result.addAll(Collections.nCopies(entry.getValue(), entry.getKey()));
    }

    return result.stream().mapToInt(i-> i).toArray();
  }

  public static int[] sortNumSwap(int[] nums, int pivot) {
    int left = 0;
    int right = nums.length - 1;
    int index = 0;
    while (index <= right) {
      if (nums[index] == pivot) {
        index++;
      } else if (nums[index] < pivot) {
        swap(nums, left++, index++);
      } else {
        swap(nums, right--, index);
      }
    }

    return nums;
  }

  private static void swap(int[] nums, int index1, int index2) {
    int helperValue = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = helperValue;
  }
}
