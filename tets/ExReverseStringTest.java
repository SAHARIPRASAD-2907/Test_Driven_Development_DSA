import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExReverseStringTest {
    @Test
    public void test1(){
        ExReverseString x = new ExReverseString();
        String str = "abcd";
        assertEquals("dcba",x.reverseString(str));
    }
    @Test
    public void test2(){
        ExReverseString x = new ExReverseString();
        String str = "a";
        assertEquals("a",x.reverseString(str));
    }
    @Test
    public void test3(){
        ExReverseString x = new ExReverseString();
        String str = "";
        assertEquals("No String to reverse",x.reverseString(str));
    }
}