package task3;

public class LinkedListTest {
    public static void main(String[] args) {
        //https://medium.com/@jillplatts/6-minute-beginners-guide-to-java-s-linked-list-data-structure-bb2fbcca81b1

        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // Insert the values
        list.insert(list, 1);
        list.insert(list, 2);

        list.printList();

        list.deleteByKey(1);

        // Print the LinkedList
        printList(list);
        deleteByKey(list, 4);

        // Print the LinkedList
        printList(list);

        deleteByKey(list, 10);

        // Print the LinkedList
        printList(list);

        deleteAtPosition(list, 0);

        // Print the LinkedList
        printList(list);

        deleteAtPosition(list, 2);

        // Print the LinkedList
        printList(list);
        deleteAtPosition(list, 10);

        // Print the LinkedList
        printList(list);

    }
}
        /*LinkedList list = new LinkedList();

        list.add("Carrie");
        list.add("The Shining");
        list.add("Rage");
        list.add("Roadwork");
        list.add("Christine");

        // Output the present list
        System.out.println("The list is:" + list);

        // Adding new elements to the end
        list.add("Misery");
        list.add("Lisey's Story");
        // printing the new list
        System.out.println("The new List is:" + list);

        // Remove element by index
        list.remove(2);
        // printing the new list without removed element
        System.out.println("The new List without removed element is:" + list);
        //get element 4 from linked list
        list.get(4);
        // printing the element from list with index 4
        System.out.println("The element is: " + list.get(4));
    }
}*/


