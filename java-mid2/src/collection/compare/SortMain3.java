package collection.compare;

import java.util.Arrays;

public class SortMain3 {
  public static void main(String[] args) {
    MyUser user1 = new MyUser("a", 30);
    MyUser user2 = new MyUser("b", 21);
    MyUser user3 = new MyUser("c", 10);

    MyUser[] array = {user1, user2, user3};
    System.out.println("기본 데이터");
    System.out.println(Arrays.toString(array));

    System.out.println("Comparable 기본 정렬");
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    System.out.println("IdComparator 정렬");
    Arrays.sort(array, new IdComparator());
    System.out.println(Arrays.toString(array));

    System.out.println("IdComparator.reversed 정렬");
    Arrays.sort(array, new IdComparator().reversed());
    System.out.println(Arrays.toString(array));
  }
}
