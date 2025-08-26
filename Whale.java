public class Whale extends Animal {

   private boolean waterType;
   private double maxDiveDepth;

   public Whale(String nm, int age, double wgt, boolean typ, double mdd) {
      super(wgt, nm, age);
      waterType = typ;
      maxDiveDepth = mdd;
   }
   
   public boolean isWaterType() {
      return waterType;
   }
   
   public double getMaxDiveDepth() {
      return maxDiveDepth;
   }

   @Override
   public String toString() {
      return super.toString() + ", " + waterType + ", " + maxDiveDepth;
   }

}