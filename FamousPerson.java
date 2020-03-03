public class FamousPerson implements Comparable<FamousPerson> {

   String firstName;
   String lastName;
   int year;
   String fact;
  
   FamousPerson(String f,String l,int y,String fa) {
       firstName=f;
       lastName=l;
       year=y;
       fact=fa;
   }
  
   @Override
   public int hashCode() {
      // Returns a hash code value for this FamousPerson object.
      return Math.abs((lastName.hashCode() * 3) + firstName.hashCode());
   }
  
   @Override
   public boolean equals(Object obj) {
      // Returns true if 'obj' is a FamousPerson with same first and last
      // names as this FamousPerson, otherwise returns false.
      if (obj == this) 
         return true;
      else
         if (obj == null || obj.getClass() != this.getClass())
         return false;
      else
         //FamousPerson fp = (FamousPerson) obj;
         return (this.firstName.equals(firstName) &&
         this.lastName.equals(lastName));
      }
   @Override
   public int compareTo(FamousPerson other) {
   // Precondition: 'other' is not null
   //
   // Compares this FamousPerson with 'other' for order. Returns a
   // negative integer, zero, or a positive integer as this object
   // is less than, equal to, or greater than 'other'.
   if (!this.lastName.equals(other.lastName))
      return this.lastName.compareTo(other.lastName);
   else
      return this.firstName.compareTo(other.firstName);
   }
}