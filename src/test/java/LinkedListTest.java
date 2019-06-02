import org.junit.Assert;
import org.junit.Test;
import task3.LinkedList;

import static org.hamcrest.CoreMatchers.*;

public class LinkedListTest {

    @Test
    public void testAddElementToEmptyList() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        Assert.assertThat(actualList.size(), is(1));
        Assert.assertThat(actualList.get(0), is("Carrie"));
    }

    @Test
    public void testAddElementToExistingNotEmptyList() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        Assert.assertThat(actualList.get(0), is("Carrie"));
        actualList.add("Misery");
        Assert.assertThat(actualList.get(1), is("Misery"));
    }

    @Test
    public void testAddElementWithNullValueToExistingList() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        Assert.assertThat(actualList.get(0), is("Carrie"));
        actualList.add("");
        Assert.assertThat(actualList.get(1), is(""));
    }

    @Test
    public void testGetElementValueByIndex() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        actualList.add("Rage");
        actualList.add("Misery");
        Assert.assertThat(actualList.get(0), is("Carrie"));
    }

    @Test
    public void testRemoveElementByIndex() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        actualList.add("Misery");
        actualList.remove(0);
        Assert.assertThat(actualList.get(0), is("Misery"));
        Assert.assertThat(actualList.size(), is(1));
    }

    @Test
    public void testRemoveElementByValue() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        actualList.add("Misery");
        actualList.remove("Misery");
        Assert.assertThat(actualList.get(0), is("Carrie"));
        Assert.assertThat(actualList.size(), is(1));
    }

    @Test
    public void testListIsEmptyAfterRemovingElementByIndex() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        actualList.remove(0);
        Assert.assertThat(actualList.size(), is(0));
    }

    @Test
    public void testListIsEmptyAfterRemovingElementByValue() {
        LinkedList actualList = new LinkedList();
        actualList.add("Carrie");
        actualList.remove("Carrie");
        Assert.assertThat(actualList.size(), is(0));
    }

}



