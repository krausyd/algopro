import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sort3NumsTest {

  @Test
  public void testItWorksHashMap() {
    assertArrayEquals(new int[] {1, 1, 3, 3, 3, 4},  Sort3Nums.sortNumsHashMap(new int[] {4, 1, 3, 3, 1, 3}));
  }

  @Test
  public void testItWorksSwap() {
    assertArrayEquals(new int[] {1, 1, 3, 3, 3, 4},  Sort3Nums.sortNumSwap(new int[] {4, 1, 3, 3, 1, 3}, 3));
    assertArrayEquals(new int[] {1, 2, 2, 3},  Sort3Nums.sortNumSwap(new int[] {2, 1, 3, 2}, 2));
  }

}