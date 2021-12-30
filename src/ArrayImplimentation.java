/**
 *
 * https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm
 */

public class ArrayImplimentation {
    int size;
    int[] a;
    int length;
    String message;

    public ArrayImplimentation(int size) {
        this.a = new int[size];
        this.size = size;
        this.length = 0;
        this.message = "";
    }
    // Checking if array in empty (test done)
    public boolean EmptyArray(){
        return length == 0;
    }
    // Checking if array is full (test done)
    public boolean ArrayOverFlow(){
        return length >= size;
    }
    // Printing data in array
    public int TraverseArray(){
        if(EmptyArray()){
            System.out.println("Array is empty");
            return 0;
        }
        for(int i=0;i<size;i++){
            System.out.printf("Element a[%s]= %s \n",i,a[i]);
        }
        return 1;
    }
    // Inserting data in array (test done)
    public void InsertDataInArray(int data){
        if(ArrayOverFlow()) {
            message = "Array overflow";
            return;
        }
        a[length] = data;
        length++;

    }
    //Deleting an element in array (test done)
    public void DeleteDataInArray(){
        if(EmptyArray()){
            message = "Array underflow";
            return;
        }
        length--;
    }
    // Searching data in array and returning index
    public int SearchDateInArray(int data){
        if(EmptyArray()) return -1;
        for (int i = 0; i < length; i++) {
            if(a[i]==data) return i;
        }
        return -1;
    }
    // updating element with respect to index
    public int UpdateDataInArray(int updateFrom,int updateTo){
        if (EmptyArray()) return -1;
        int index = SearchDateInArray(updateFrom);
        if(index==-1) {
            message="No element found to update";
            return -1;
        }
        a[index] = updateTo;
       return 1;
    }
    // return array
    public int getArrayElement(int x){
        return a[x];
    }
    // return message
    public String getMessage(){
        return message;
    }

}
