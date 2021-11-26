
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReconstructQueue {

  public static int[][] reconstructQueue(int[][] queue) {
    List<int[]> reconstructed = new LinkedList<>();
    Comparator<int[]> heightComparator = Comparator.comparing(p -> p[0]);
    Comparator<int[]> horizonComparator = Comparator.comparing(p -> p[1]);
    Arrays.sort(queue, heightComparator.reversed().thenComparing(horizonComparator));

    for(int[] person: queue) {
      reconstructed.add(person[1], person);
    }

    return reconstructed.toArray(new int[reconstructed.size()][]);
  }

}
