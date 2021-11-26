import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutationsTest {

  @Test
  public void testItWorks() {
    int[][] actuals = Permutations.permute(new int[]{ 3, 1, 2});
    assertArrayEquals(new int[][] {{3, 1, 2}, {3, 2, 1}, {1, 3, 2}, {1, 2, 3}, {2, 1, 3}, {2, 3, 1}}, actuals);
    assertArrayEquals(new int[0][0], Permutations.permute(new int[0]));
    actuals = Permutations.permuteIterative(new int[]{ 3, 2, 1});
    //assertArrayEquals(new int[][] {{3, 1, 2}, {3, 2, 1}, {1, 3, 2}, {1, 2, 3}, {2, 1, 3}, {2, 3, 1}}, actuals);
    actuals = Permutations.permuteIterative(new int[]{ 3, 2, 1, 4});
  }
}