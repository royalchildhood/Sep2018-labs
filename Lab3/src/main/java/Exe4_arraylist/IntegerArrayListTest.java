package Exe4_arraylist;

public class IntegerArrayListTest {
    public static void main(String[] args) {
        IntegerArrayList myDynamicArray = new IntegerArrayList();

        // Insert 25
        for (int i = 0; i < 25; i++) {
            myDynamicArray.add(i);
        }

        System.out.println(myDynamicArray.getCurrentSize());

        // remove index 5
        myDynamicArray.remove(5);

        // remove 10 more
        for (int i = 0; i < 10; i++) {
            myDynamicArray.remove(i);
        }

        System.out.println(myDynamicArray.getCurrentSize());
        // print out current array
        for (int i = 0; i < myDynamicArray.getCurrentSize(); i++) {
            System.out.print(myDynamicArray.get(i) + " ");
        }
    }
}
