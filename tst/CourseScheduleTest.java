import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {

  @Test
  public void testItWorks() {
    assertTrue(CourseSchedule.canFinish(new int[][] {{0, 1}}));
    assertTrue(CourseSchedule.canFinish(new int[][] {{0, 1}, {1, 2}, {1, 3}}));
    assertFalse(CourseSchedule.canFinish(new int[][] {{0, 1}, {1, 0}}));
    assertFalse(CourseSchedule.canFinish(new int[][] {{0, 1}, {1, 2}, {1, 3}, {1, 4}, {4, 1}}));
  }
}