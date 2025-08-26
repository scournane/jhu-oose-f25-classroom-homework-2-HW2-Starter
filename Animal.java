public class Animal {

   // you could make these protected, but they don't need to
   // be directly accessed by the subclasses at this point
   private String name;
   private int age;
   private double weight;
   
   public Animal(double wgt, String nm, int age) {
      weight = wgt;
      name = nm;
      this.age = age;
   }
   
   public String getName() {
      return name;
   }
   
   public int getAge() {
      return age;
   }
   
   public double getWeight() {
      return weight;
   }

   @Override
   public String toString() {
      return getClass() + ": " + name + ", " + age + ", " + weight;
   }

}
