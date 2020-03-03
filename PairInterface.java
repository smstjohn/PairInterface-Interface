/**
define a java interface named PairInterface
*/

public interface PairInterface <String> {

   //generic setters for first 2 objects
   public void setFirst(String first);
   public void setSecond(String second);
   
   //generic getters for first 2 objects
   String getFirst();
   String getSecond();

}