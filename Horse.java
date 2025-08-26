public class Horse extends Animal {

   private String country;
   private double topSpeed;

   public Horse(String nm, String ct, int age, double wgt, double ts) {
      super(wgt, nm, age);
      country = ct;
      topSpeed = ts;
   }
   
   public String getCountry() {
      return country;
   }
   
   public double getTopSpeed() {
      return topSpeed;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + country + ", " + topSpeed;
   }
}