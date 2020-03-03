/**
driver code to demo that the ArrayPair class works correctly with the PairInterface interface
*/
public class PairDriverClass{
   public static void main(String args []) {
      //declare and instantiate an array with 2 elements
      ArrayPair [] newArray = new ArrayPair [2];
      
      //set and display first pair
      System.out.println("My initial pair is: ");
      newArray [0] = new ArrayPair<String>("apple", "peach");
      System.out.println(newArray[0].getFirst() + " " + "and " + newArray[0].getSecond() + " ");
      
      //overriding the 2nd element and display updated pair
      System.out.println("\nMy updated pair is: ");
      newArray[0].setSecond("orange");
      System.out.println(newArray[0].getFirst() + " " + "and " + newArray[0].getSecond());
   }
}