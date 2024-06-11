
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class AppTest {
    @Test
    public void testMin() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(10, App.min(numbers));
    }

    @Test
    public void testMax() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(5, App.max(numbers));
    }

    @Test
    public void testSum() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(BigInteger.valueOf(15), App.sum(numbers));
    }    

    @Test
    public void testMult() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(BigInteger.valueOf(120), App.mult(numbers));
    }
    @Test 
    public void testMultSpeed() {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            numbers.add(i);
        }
        long sTime = System.currentTimeMillis();
        App.mult(numbers);        
        long fTime = System.currentTimeMillis();
        
        long xTime = fTime-sTime;
        assertTrue("Time error: fuction mult execute more than 0,1 second",xTime <= 100);
        
    }

}
