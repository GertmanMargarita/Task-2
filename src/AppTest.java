
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
        assertEquals(1, App._min(numbers));
    }

    @Test 
    public void testMinSpeed() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            numbers.add(i);
        }
        long sTime = System.currentTimeMillis();
        App._min(numbers);        
        long fTime = System.currentTimeMillis();
        
        long xTime = fTime-sTime;
        assertTrue("MIN - Time error: slower than 0,1 second",xTime <= 100);        
    }


    @Test
    public void testMax() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(5, App._max(numbers));
    }

    @Test 
    public void testMaxSpeed() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            numbers.add(i);
        }
        long sTime = System.currentTimeMillis();
        App._max(numbers);        
        long fTime = System.currentTimeMillis();
        
        long xTime = fTime-sTime;
        assertTrue("MAX - Time error: slower than 0,1 second",xTime <= 100);        
    }

    @Test
    public void testSum() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(BigInteger.valueOf(15), App._sum(numbers));
    }    

    @Test 
    public void testSumSpeed() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            numbers.add(i);
        }
        long sTime = System.currentTimeMillis();
        App._sum(numbers);        
        long fTime = System.currentTimeMillis();
        
        long xTime = fTime-sTime;
        assertTrue("SUM - Time error: slower than 0,1 second",xTime <= 100);        
    }

    @Test
    public void testMult() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(BigInteger.valueOf(120), App._mult(numbers));
    }
    @Test 
    public void testMultSpeed() {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            numbers.add(i);
        }
        long sTime = System.currentTimeMillis();
        App._mult(numbers);        
        long fTime = System.currentTimeMillis();
        
        long xTime = fTime-sTime;
        assertTrue("MULT - Time error: slower than 0,1 second",xTime <= 100);
        
    }
  
    @Test 
    public void GeneralTest() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));                
        int a1 = App._min(numbers);        
        int a2 = App._max(numbers);        
        BigInteger b1 = App._sum(numbers);        
        BigInteger b2 = App._mult(numbers);
        assertTrue("fuction is wrong", a1>0 && a2>0 && b1.intValue()>0 && b2.intValue()>0);
        
    }


}
