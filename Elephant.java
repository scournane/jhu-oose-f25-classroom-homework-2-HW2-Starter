public class Elephant extends Animal {

   private String country;
   
   public Elephant(String nm, String ct, int age, double wgt) {
      super(wgt, nm, age);
      country = ct;
   }
   
   public String getCountry() {
      return country;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + country;
   }

}