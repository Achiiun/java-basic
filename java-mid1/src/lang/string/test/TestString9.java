package lang.string.test;

public class TestString9 {
  public static void main(String[] args) {
    String email = "hello@example.com";
    String[] result = email.split("@");
    String id = result[0];
    String domain = result[1];

    System.out.println("id = " + id);
    System.out.println("domain = " + domain);
  }
}
