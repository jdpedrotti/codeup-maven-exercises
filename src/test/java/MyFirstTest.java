
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyFirstTest {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

    @Before
    public void setUpValues(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList2.add(1);
        arrayList2.add(2);
    }

    @Test
    public void testObjectSameness(){
        // this will currently fail, array contents are same, but arrayList and arrayList2 are diff objects
        assertSame(arrayList, arrayList2);
    }


    @Test
    public void additionMethodTest(){

        long input1 = 20;
        long input2 = 30;
        long expected = 50;

        assertEquals(expected, MathOperations.add(input1, input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;
        double expected = 4.51;

         assertEquals(expected, MathOperations.tip(cost, tip),0);
    }

    @Test
    public void testArrayEquality(){
        int [] startArray = {1,2,3,4,5};
        int [] endArray = {2,3,4,5,6};

        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }



}
