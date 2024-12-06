package JunitTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
//import static org.junit.Assert.*;
//import static org.junit.*;
public class CalcTest {
    @Test
    public void test(){
         Calc a=new Calc();
         int actual=a.divide(20,2);
         int expectedResult=10;
         assertEquals(expectedResult,actual);
    }



}
