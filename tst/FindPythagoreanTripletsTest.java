import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPythagoreanTripletsTest {

  @Test
  public void testItWorks() {
    assertTrue(FindPythagoreanTriplets.findPythagoreanTriplets(new int[]{3,4,5}));
    assertTrue(FindPythagoreanTriplets.findPythagoreanTriplets(new int[]{3,5,12,5,13}));
    assertFalse(FindPythagoreanTriplets.findPythagoreanTriplets(new int[]{3,5,17,5,13}));
    assertTrue(FindPythagoreanTriplets.findPythagoreanTriplets(new int[]{0,1,2,3,4,5}));
  }
}