package task3;

import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

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
}


/*private String bookIndex;
    private String bookName;

    public String getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(String bookIndex) {
        this.bookIndex = bookIndex;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book (String bookIndex, String bookName){


    }*/