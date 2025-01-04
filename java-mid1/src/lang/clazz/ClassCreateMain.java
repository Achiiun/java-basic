package lang.clazz;

public class ClassCreateMain {
  public static void main(String[] args) throws Exception{
//    Class helloClass = Hello.class;
    Class helloCalss = Class.forName("lang.clazz.Hello");
    Hello hello = (Hello) helloCalss.getDeclaredConstructor().newInstance();
    String result = hello.hello();
    System.out.println("result = " + result);
  }
}
