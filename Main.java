public class Main {

    public static void main(String[] args) {
    
        Elephant elphi = new Elephant("Elphi", "India", 2, 1000 );
        Horse flash = new Horse("Flash", "Mongolia", 5, 300, 135 );
        Snake cySly = new Snake("CySly", 1, 10, 1.3, false);
        Animal willy = new Whale("Willy", 10, 5000, true, 3000);
        
        System.out.println(elphi.getName() + " should be: Elphi");
        System.out.println(flash.getAge() + " should be: 5");
        System.out.println(cySly.getWeight() + " should be: 10.0");
        System.out.println(elphi.getCountry() + " should be: India");
        System.out.println(flash.getTopSpeed() + " should be: 135.0");
        System.out.println(cySly.isVenom() + " should be: false");
        
        System.out.println(willy.getName() + " should be: Willy");
        System.out.println(((Whale) willy).getMaxDiveDepth() + " should be: 3000.0");
        
        System.out.println();
        
        System.out.println(elphi);
        System.out.println(flash);
        System.out.println(cySly);
        System.out.println(willy);
    }
}
