import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NonDuplicateNumberTest {

  @Test
  public void testWithMaps() {
    assertEquals(1, NonDuplicateNumber.findWithMap(new int[] {4, 3, 2, 1, 2, 4, 3}));
    assertEquals(100,NonDuplicateNumber.findWithMap(new int[] {4, 3, 2, 5, 2, 4, 5, 100, 3}));
  }

  @Test
  public void testWithBitOperation() {
    assertEquals(1, NonDuplicateNumber.findWithBitOperation(new int[] {4, 3, 2, 1, 2, 4, 3}));
    assertEquals(100,NonDuplicateNumber.findWithBitOperation(new int[] {4, 3, 2, 5, 2, 4, 5, 100, 3}));
  }
}