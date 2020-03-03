//driver code for FamousPerson.java

import java.io.*; //needed for file input
import java.util.*; // Iterator
import ch05.collections.*;
import support.FamousPerson.*;

public class FamousPersonDriver {
   public static void main(String[] args) throws IOException {
   
      // instantiate collection
      final int CAPACITY = 50;
      ArrayList<Integer> hashValue=new ArrayList<Integer>();

      // set up file reading
      FileReader famousFile = new FileReader("FamousCS.txt");
      Scanner info = new Scanner(famousFile);
      info.useDelimiter("[,\n]"); 

      Scanner scan = new Scanner(System.in);
      FamousPerson person;
      String fname, lname, fact;
      int year;

      // read the info from the file and put in collection
      while (info.hasNext()) {
         fname = info.next(); 
         lname = info.next();
         year = info.nextInt(); 
         fact = info.next();
         person = new FamousPerson(fname, lname, year, fact);
         hashValue.add(person.hashCode());
      }
      System.out.println("\nOutputting the values from the array in sorted order: ");
      sortArray(hashValue);

      //replace each array value A with the value A%1000 and output in sorted order
      for(int i=0;i<hashValue.size();i++) {
         hashValue.set(i,hashValue.get(i)%1000);
      }
      System.out.println("\nReplacing each array value A with the value A%1,000 and outputting the values in sorted order: ");
      sortArray(hashValue);
  
      //replace each array value A with the value A%100 and output in sorted order
      for(int i=0;i<hashValue.size();i++) {
         hashValue.set(i,hashValue.get(i)%100);
      }
      System.out.println("\nReplacing each array value A with the value A%100 and outputting the values in sorted order: ");
      sortArray(hashValue);
      
      //replace each array value A with the value A%10 and output in sorted order
      for(int i=0;i<hashValue.size();i++) {
         hashValue.set(i,hashValue.get(i)%10);
      }
      System.out.println("\nReplacing each array value A with the value A%10 and outputting the values in sorted order: ");
      sortArray(hashValue); 
   }
   
   
   //method to sort the array collection and print
   public static void sortArray(ArrayList<Integer> hashValue) {
      Collections.sort(hashValue);
      for(int i=0;i<hashValue.size();i++) {
          System.out.println(hashValue.get(i));
      }
   }
}