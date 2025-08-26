public class Snake extends Animal {

   private double length;
   private boolean venom;

   public Snake(String nm, int age, double wgt, double len, boolean vn) {
      super(wgt, nm, age);
      length = len;
      venom = vn;
   }
   
   public double getLength() {
      return length;
   }
   
   public boolean isVenom() {
      return venom;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + length + ", " + venom;
   }

}