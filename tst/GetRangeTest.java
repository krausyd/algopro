import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetRangeTest {
  @Test
  public void testItWorks() {
    assertArrayEquals(new int[] {6,8}, GetRange.getRange(new int[] {1,3,3,5,7,8,9,9,9,15,16}, 9));
    assertArrayEquals(new int[] {1,2}, GetRange.getRange(new int[] {1,3,3,5,7,8,9,9,9,15,16}, 3));
    assertArrayEquals(new int[0], GetRange.getRange(new int[] {1,3,3,5,7,8,9,9,9,15,16}, 4));
    assertArrayEquals(new int[] {0,0}, GetRange.getRange(new int[] {1,3,3,5,7,8,9,9,9,15,16}, 1));
    assertArrayEquals(new int[] {0,0}, GetRange.getRange(new int[] {9}, 9));
    assertArrayEquals(new int[0] , GetRange.getRange(new int[0], 9));
  }
}