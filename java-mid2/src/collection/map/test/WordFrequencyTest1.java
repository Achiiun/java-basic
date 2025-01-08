package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequencyTest1 {
  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

    Map<String, Integer> map = new HashMap<>();

    String[] fruits = text.split(" ");

    for (String fruit : fruits) {
      Integer count = map.get(fruit);
      if (count == null) {
        count = 0;
      }
      count++;
      map.put(fruit, count);
    }
    System.out.println(map);
  }
}
