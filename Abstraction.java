// process of hiding implementation details and shwoing only functionality to the users
// Abstrct Class: 0% to 100% 


//  abstract keyword is used for declaring class and method in abstrct class
 abstract class Furniture{
    void greet(){
        System.out.println("Hello");
    }
    abstract void printName();
}
class Closet extends Furniture{
    void printName(){
        System.out.println("closet");
    }
}

public class Abstraction {
    public static void main (String[] args){
        // Furniture furniture = new furniture()
        Closet closet = new Closet();
        closet.greet();
        closet.printName();
    }

    
}
