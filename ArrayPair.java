/**
class that holds a pair of objects of an array type
implements the PairInterface Interface
array of size 2 to represent the 2 objects of the pair
referred to as 'first' object and 'second' object of the pair 
*/

public class ArrayPair<String> implements PairInterface {

   //declare 2 strings
   String first;
   String second; 
   
   //setting the order of the strings within the array
   ArrayPair(String first, String second) {
      this.first = first;
      this.second = second;
   }
   
   //method to set first object 
   public void setFirst(Object first) {
      this.first = (String)first;
   }
   
   //method to set second object 
   public void setSecond(Object second) {
      this.second = (String)second;
   }
   
   
   //method to return first object
   public String getFirst() {
      return first;
   }
   
   //return second object
   public String getSecond() {
      return second;
   }
   
}