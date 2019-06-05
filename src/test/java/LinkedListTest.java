import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task3.LinkedList;

import static org.hamcrest.CoreMatchers.*;

public class LinkedListTest {
    private LinkedList actualList;
    private String firstElement = "Carrie";
    private String secondElement = "Misery";

    @Before
    public void init() {
        actualList = new LinkedList();
        actualList.add(firstElement);
    }

    @Test
    public void testAddElementToEmptyList() {
        Assert.assertThat("List size is incorrect.", actualList.size(), is(1));
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(firstElement));
    }

    @Test
    public void testAddElementToExistingNotEmptyList() {
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(firstElement));
        actualList.add(secondElement);
        Assert.assertThat("Incorrect element value.", actualList.get(1), is(secondElement));
    }

    @Test
    public void testAddElementWithNullValueToExistingList() {
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(firstElement));
        actualList.add("");
        Assert.assertThat("Incorrect element value.", actualList.get(1), is(""));
    }

    @Test
    public void testGetElementValueByIndex() {
        actualList.add(secondElement);
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(firstElement));
    }

    @Test
    public void testRemoveElementByIndex() {
        actualList.add(secondElement);
        actualList.remove(0);
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(secondElement));
        Assert.assertThat("List size is incorrect.", actualList.size(), is(1));
    }

    @Test
    public void testRemoveElementByValue() {
        actualList.add(secondElement);
        actualList.remove(secondElement);
        Assert.assertThat("Incorrect element value.", actualList.get(0), is(firstElement));
        Assert.assertThat("List size is incorrect.", actualList.size(), is(1));
    }

    @Test
    public void testListIsEmptyAfterRemovingElementByIndex() {
        actualList.remove(0);
        Assert.assertThat("List size is incorrect.", actualList.size(), is(0));
    }

    @Test
    public void testListIsEmptyAfterRemovingElementByValue() {
        actualList.remove(firstElement);
        Assert.assertThat("List size is incorrect.", actualList.size(), is(0));
    }

}



