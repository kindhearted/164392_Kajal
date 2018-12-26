
import java.util.*;
import java.util.ArrayList;
 
public class ArrayListReversePrint {
 
  public static void main(String[] args) {
    //create an object of ArrayList
    List arrayList = new ArrayList();
   
    //Add elements to ArrayList object
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
   
    //Get an object of ListIterator using listIterator() method
    ListIterator listIterator = arrayList.listIterator();
 
    //Traverse in forward direction   
    System.out.println("Traversing ArrayList in forward direction using ListIterator");
    while(listIterator.hasNext())
      System.out.println(listIterator.next());
     
    /*
      Traverse the ArrayList in reverse direction using hasPrevious and previous
      methods of ListIterator. hasPrevious method returns true if 
      ListIterator has more elements to traverse in reverse direction.
      Previous method returns previous element in the list.
    */
    System.out.println("Traversing ArrayList in reverse direction  using ListIterator");
    while(listIterator.hasPrevious())
      System.out.println(listIterator.previous());
     
  }
}