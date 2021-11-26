
import java.util.HashSet;
import java.util.Set;

public class FindPythagoreanTriplets {

  public static boolean findPythagoreanTriplets(int[] numbers) {
    Set<Integer> squares = new HashSet<>();
    for(int number: numbers) {
      squares.add(number * number);
    }

    for(int i: numbers) {
      for (int j: numbers) {
        if (squares.contains(i * i + j * j)) {
          return true;
        }
      }
    }

    return false;
  }

}
