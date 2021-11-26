import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReconstructQueueTest {

  @Test
  public void testItWorks() {
    assertArrayEquals(new int[][] {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}},
        ReconstructQueue.reconstructQueue(new int[][] {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
  }
}