package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("사과", 500);
    map.put("바나나", 500);
    map.put("망고", 1000);
    map.put("딸기", 1000);

    List<String> list = new ArrayList<>();
    for (String fruit : map.keySet()) {
      if (map.get(fruit).equals(1000)) {
        list.add(fruit);
      }
    }
    System.out.println(list);
  }
}
