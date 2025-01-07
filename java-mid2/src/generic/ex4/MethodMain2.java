package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 300);

    AnimalMethod.checkUp(dog);
    AnimalMethod.checkUp(cat);

    Dog biggerDog = AnimalMethod.getBigger(dog, new Dog("멍멍이1", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
