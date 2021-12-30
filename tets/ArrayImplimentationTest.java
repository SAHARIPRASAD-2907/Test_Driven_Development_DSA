import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayImplimentationTest {
    ArrayImplimentation dummyArray = new ArrayImplimentation(5);
    @Test
    public void ArrayIsEmptyFunction(){
        ArrayImplimentation arr = new ArrayImplimentation(10);
        boolean result = arr.EmptyArray();
        assertTrue(result);
    }
    @Test
    public void ArrayIsFull(){
        ArrayImplimentation arr = new ArrayImplimentation(2);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        boolean result = arr.ArrayOverFlow();
        assertTrue(result);
    }
    @Test
    public void InsertInTheBegining(){
        ArrayImplimentation arr = new ArrayImplimentation(2);
        arr.InsertDataInArray(1);
        assertEquals(1,arr.getArrayElement(0));
    }
    @Test
    public void InsertAtTheEnd(){
        ArrayImplimentation arr = new ArrayImplimentation(2);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        assertEquals(2,arr.getArrayElement(1));
    }
    @Test
    public void InsertBeyondArray(){
        ArrayImplimentation arr = new ArrayImplimentation(2);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        try{
            arr.InsertDataInArray(3);
        }catch (Error e){
            assertEquals("Array overflow",arr.getMessage());
        }
    }
    @Test
    public void DeleteElement(){
        ArrayImplimentation arr = new ArrayImplimentation(2);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        arr.DeleteDataInArray();
        assertEquals(1,arr.length);
    }
    @Test
    public void searchElement(){
        ArrayImplimentation arr = new ArrayImplimentation(5);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        arr.InsertDataInArray(3);
        arr.InsertDataInArray(4);
        assertEquals(3,arr.SearchDateInArray(4));
    }
    @Test
    public void updateElementTest(){
        ArrayImplimentation arr = new ArrayImplimentation(5);
        arr.InsertDataInArray(1);
        arr.InsertDataInArray(2);
        arr.InsertDataInArray(3);
        arr.InsertDataInArray(4);
        arr.UpdateDataInArray(3,5);
        assertEquals(5,arr.getArrayElement(2));
    }

}