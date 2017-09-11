import java.util.*;

public class ExGen{
  ArrayList<Object> myList = new ArrayList<Object>();
  
  public void createList(){
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    System.out.println(myList);
  }
  public void tryCatch(){
    for(int i = 0; i < myList.size(); i++){
      try{
        Integer castedValue = (Integer) myList.get(i);
        myList.set(i, castedValue);
        System.out.println(myList.get(i));
      }
      catch (ClassCastException error){
        System.out.println("ERROR ON INDEX {" + i + "}");
      }
    }
  }
}
