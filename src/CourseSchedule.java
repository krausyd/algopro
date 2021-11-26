import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CourseSchedule {

  public static boolean canFinish(int[][] courses) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for(int[] course: courses) {
      if (graph.containsKey(course[0])) {
        List<Integer> preReq = graph.get(course[0]);
        preReq.add(course[1]);
      } else {
        graph.put(course[0], new ArrayList<>(Arrays.asList(course[1])));
      }
    }

    for(Entry<Integer, List<Integer>> course: graph.entrySet()) {
      if (hasCycleWithCache(graph, course.getKey(), new ArrayList<>(), new HashMap<>())) {
        return false;
      }
    }
    return true;
  }

  private static boolean hasCycle(Map<Integer, List<Integer>> graph, Integer course, List<Integer> seen) {
    if (seen.contains(course)) {
      return true;
    }
    if (!graph.containsKey(course)) {
      return false;
    }

    seen.add(course);
    for(Integer neighbor: graph.get(course)) {
      if (hasCycle(graph, neighbor, seen)) {
        return true;
      }
    }

    seen.remove(course);
    return false;
  }

  private static boolean hasCycleWithCache(Map<Integer, List<Integer>> graph, Integer course, List<Integer> seen, Map<Integer, Boolean> cache) {
    if (cache.containsKey(course)) {
      return cache.get(course);
    }

    if (seen.contains(course)) {
      return true;
    }
    if (!graph.containsKey(course)) {
      return false;
    }
    boolean returnValue = false;
    seen.add(course);
    for(Integer neighbor: graph.get(course)) {
      if (hasCycle(graph, neighbor, seen)) {
        returnValue = true;
        continue;
      }
    }

    cache.put(course, returnValue);
    seen.remove(course);
    return returnValue;
  }

}
