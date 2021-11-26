import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  public void twoSumTestReturnsValid() {
    assertArrayEquals(new int[]{ 1, 2 }, TwoSum.twoSum(new int[] { 2, 7, 11, 15}, 18));
  }

  @Test
  public void twoSumTestReturnsNull() {
    assertNull(TwoSum.twoSum(new int[] { 2, 7, 11, 15}, 14));
  }
}