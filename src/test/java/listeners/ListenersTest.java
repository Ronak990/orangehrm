package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.CustomListners.class)
public class ListenersTest {

    @Test
    void test1(){
        System.out.println("This is a test1");
        Assert.assertEquals("A","A");
    }

    @Test
    void test2(){
        System.out.println("This is a test2");
        Assert.assertEquals("A","B");
    }

    @Test
    void test3(){
        System.out.println("This is a test3");
        throw new SkipException("This is a skip execution");

    }
}
