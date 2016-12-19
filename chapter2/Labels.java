public class Labels {

  public static void main(String[] args) {
    int[][] list = {{1,2,3},{4,5,6},{7,8,9}};

    OUTER_LOOP: for (int i = 0; i < list.length; i++) {

      for (int j = 0; j < list[i].length; j++) {
        System.out.print(list[i][j]);
        if (list[i][j] == 5) {
          //break OUTER_LOOP;
          continue OUTER_LOOP;
        }
      }

      System.out.println();
    }

    System.out.println();

  }

}
