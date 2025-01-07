package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        //마지막에 추가 //O(1)
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(1);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>(2);
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(3);
        System.out.println("integer = " + integer);
    }
}