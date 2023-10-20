// katelynn.graham@malad.us
// Objects Arraylist for Software and Programming CT
// By Katelynn Graham

import java.util.ArrayList;
//Parent Class
public class Animal{
    public static void main (String [] args) {
        Bunny bn = new Animal.Bunny (); }
    // This array list creates a way to print out all bunnies using bunny5
    static Animal.main bunnylist=new Animal.main();

    // Name for the bunnies
    String bunnyName;
    //Variable for bunny color
    String bunnyColor;
    // Variable for bunny age
    String bunnyAge;
    //Actions of the bunnies
        class Animal {
            String action;
            Animal (String actn) {
                this.action = actn;
            }
        }
    //Child Class
class Bunny extends Animal {
    //Bunny inherits traits from Animal
    //The method for the objects
    public Bunny(String string, int i, String string2) {
    }
    public Bunny() {
    }
    public void Bunny (String name, int age, String color) {
        //Setting the bunny name
        bunnyName = name;
        //Sets the bunny age
        bunnyAge = String.valueOf(age);
        //Sets the bunny color
        bunnyColor = color;
    }
    //additional bunny class members
    public static (String[] args) {
        // first object
        Object bunny5 = new Bunny("Sammy", 2, "white");
        bunnylist.add(bunny5);
        // Second object
        bunny5 = new Bunny("Carrot", 1, "greyish");
        bunnylist.add(bunny5);
        //Third object
        bunny5 = new Bunny("Lacey", 4, "black");
        bunnylist.add(bunny5);
        //Fourth object
        bunny5 = new Bunny("Celery", 6, "red");
        //printing the arraylist
        for(int i=0; i<bunnylist.size () ;i++) {
        bunny5=bunnylist.get(i);
        System.out.println(bunny5);
        //The bunnies' action
        // the .action method will create a new constructor
        Animal.Bunny.Bunny(); {
            this.action = "hop";
        }
        }
    }
}
//to print out the bunnies
public class main {

    public void add(Object bunny5) {
    }

    public int size() {
        return 0;
    }

    public Object get(int i) {
        return null;
    }
}
}