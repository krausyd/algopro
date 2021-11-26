public class PushDominos {

  public static String push(final char[] dominoes) {
    String result = "";
    final int[] forces = new int[dominoes.length];
    final int max_force = dominoes.length;
    int force = 0;
    for(int i=0; i<dominoes.length; i++) {
      switch(dominoes[i]) {
        case 'R':
          force = max_force;
          break;
        case 'L':
          force = 0;
          break;
        default:
          force = Math.max(0, force - 1);
      }
      forces[i] = force;
    }
    for(int i=dominoes.length-1; i>=0; i--) {
      switch(dominoes[i]) {
        case 'L':
          force = max_force;
          break;
        case 'R':
          force = 0;
          break;
        default:
          force = Math.max(0, force - 1);
      }
      forces[i] -= force;
    }
    for(int i=0; i<forces.length; i++) {
      result += (forces[i] > 0) ? "R" : ((forces[i] < 0) ? "L" : ".");
    }
    return result;
  }
}
