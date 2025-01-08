package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
  private Map<Product, Integer> cartMap = new HashMap<>();

  public void add(Product product, int addAmount) {
    int existingAmount = cartMap.getOrDefault(product, 0);
    cartMap.put(product, existingAmount + addAmount);
  }

  public void minus(Product product, int minusAmount) {
    int existingAmount = cartMap.getOrDefault(product, 0);

    int newAmount = existingAmount - minusAmount;
    if (newAmount <= 0) {
      cartMap.remove(product);
    } else {
      cartMap.put(product, newAmount);
    }
  }

  public void printAll() {
    System.out.println("==모든 상품 출력==");
    for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
      System.out.println("상품: " + entry.getKey() + ", 수량: " + entry.getValue());
    }
  }


}
