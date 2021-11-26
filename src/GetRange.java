public class GetRange {
  public static int[] getRange(int[] orderedArray, int target) {
    int lower = binarySearch(target, orderedArray, 0, orderedArray.length -1, true);
    int upper = binarySearch(target, orderedArray, lower, orderedArray.length -1, false);
    if (lower <= upper) {
      return new int[]{lower, upper};
    }
    return new int[0];
  }

  private static int binarySearch(int target, int[] array, int start, int end, boolean findFirst) {
    while(start <= end) {
      int mid = (end + start) / 2;
      if ((array[mid] < target) || (array[mid] == target && !findFirst)) {
        start = mid + 1;
      } else if ((array[mid] > target) || (array[mid] == target && findFirst)) {
        end = mid - 1;
      }
    }
    return (findFirst) ? start : end;
  }
}
