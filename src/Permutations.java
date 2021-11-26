import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutations {
  public static int[][] permute(int[] numbers) {
    if (numbers.length > 0) {
      List<List<Integer>> resultValue = new ArrayList<>();
      permute(numbers, 0, resultValue);
      return resultValue.stream().map(array -> array.stream().mapToInt(i -> i).toArray())
          .toArray(int[][]::new);
    } else {
      return new int[0][0];
    }
  }

  private static void permute(int[] numbers, int startIndex, List<List<Integer>> permutations) {
    if (startIndex == numbers.length) {
      List<Integer> numbersAsList = new ArrayList<>() {{
        for(int i: numbers) {
          add(i);
        }
      }};
      permutations.add(numbersAsList);
      return;
    }

    for (int i=startIndex; i<numbers.length; i++) {
      swap(numbers, startIndex, i);
      permute(numbers, startIndex + 1, permutations);
      swap(numbers, startIndex, i);
    }
  }

  private static void swap(int[] numbers, int index1, int index2) {
    int helperValue = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = helperValue;
  }

  public static int[][] permuteIterative(int[] numbers) {
    if (numbers.length == 0) {
      return new int[0][0];
    }
    List<List<Integer>> permutations = new ArrayList<>();
    Queue<List<Integer>> queue = new ArrayDeque<>();
    queue.add(new LinkedList<>());
    for (int num : numbers) {
      int n = queue.size();
      for (int i = 0; i < n; i++) {
        List<Integer> prototype = queue.remove();
        for (int j = 0; j <= prototype.size(); j++) {
          List<Integer> permutation = new LinkedList<>(prototype);
          permutation.add(j, num);
          if (permutation.size() < numbers.length) {
            queue.add(permutation);
          } else {
            permutations.add(permutation);
          }
        }
      }
    }
    return permutations.stream().map(array -> array.stream().mapToInt(i -> i).toArray())
        .toArray(int[][]::new);
  }
}
