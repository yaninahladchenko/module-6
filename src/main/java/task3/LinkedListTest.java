package task3;

public class LinkedListTest {
    public static void main(String[] args) {
        //https://medium.com/@jillplatts/6-minute-beginners-guide-to-java-s-linked-list-data-structure-bb2fbcca81b1

        LinkedList list = new LinkedList();

        list.add("Carrie");
        list.add("The Shining");
        list.add("Rage");
        list.add("Roadwork");
        list.add("Christine");

        // Output the present list
        System.out.println("The list is:");
        list.print();

        // Adding new elements to the end
        list.add("Misery");
        list.add("Lisey's Story");
        // printing the new list
        System.out.println("The new List is:" );
        list.print();

        // Remove element by index
        list.remove(2);
        // Remove element by key
        list.remove("Misery");
        // printing the new list without removed element
        System.out.println("The new List without removed elements is:");
        list.print();
        //get element 0 from linked list
        System.out.println("The element is: " + list.get(0));
        //get element 4 from linked list
        System.out.println("The element is: " + list.get(4));
    }
}


