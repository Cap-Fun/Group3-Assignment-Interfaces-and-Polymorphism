/*Author: Paola Flores ID T00651883
Jasleen Bains ID T00651489
ADD YOUR STUDENDT ID HERE*/

public class Driver
{
     public static void main(String[] args)
     {
          //testing the set() and get()
          AngryDuck pato = new AngryDuck();
          pato.setName("Pato");
          System.out.println(pato.getName());
          pato.setColor("Yellow");
          System.out.println(pato.getColor());
          //testing hit actually reducing health 
          pato.hit();
          pato.fly();
          //testing when animal is not flying
          System.out.println(pato.isItFlying());
          //testing toString() to show name and color of the animal
          System.out.println(pato.toString());
          
          AngryDuck poli = new AngryDuck("Poli","white");
          
          System.out.println();
          
          CuriousBunny blacky = new CuriousBunny("Blacky","black");
          //testing the action of hopping
          blacky.hop();
          blacky.hit();
          //testing the method to get the current health of the character
          System.out.println("The health of the character is " + blacky.getHealth());
          //testing toString() to show name and color of the animal
          System.out.println(blacky.toString());
          
          System.out.println();
          
          HappyPig pinky = new HappyPig ("Pinky", "pink");
          pinky.hit();
          //testing rolling action
          pinky.roll();
          pinky.hit();
          //testing toString() to show name and color of the animal
          System.out.println(pinky.toString());
          
          System.out.println();
          
          LoudGoose violet = new LoudGoose();
          //testing setters
          violet.setName("Violet");
          violet.setColor("purple");
          violet.hit();
          //testing if animal is flying while being alive
          System.out.println(violet.isItFlying());
          //testing getHealth()
          System.out.println("The health of the character is " + violet.getHealth());
          //testing swimming action
          violet.swim();
          //testing toString() to show name and color of the animal
          System.out.println(violet.toString());
          
          System.out.println();
          
          //Testing if the total of animals alive is working properly
          System.out.print("Animals alive ");
          Animal.getCount();
          
          System.out.println();
          
          System.out.println("New thing testing:------------------------------ " ); 
          System.out.println(blacky.getPosition());
          System.out.println();
          System.out.println( pato.getPosition()); 
          pato.teleport(1100,500);
          System.out.println( pato.getPosition()); 
          pato.teleport(1000,500);
          System.out.println();
          blacky.teleport(1100,500);
          blacky.teleport(500,500);
          blacky.teleport(600,500);
          
          System.out.println();
          
          //Testing attaker interface
          System.out.println("Testing Attacker Interface:-----------------------");
          System.out.println("A fight is about to start!!!");
          System.out.println();
          System.out.print("Violet is going to attack, ");
          violet.attack(pinky);
          violet.getKillCount();
          System.out.println();
          System.out.print("Pato is going to attack, ");
          pato.attack(violet);
          System.out.println();
          System.out.print("Violet is going to attack, ");
          violet.attack(pato);
          System.out.println();
          System.out.print("Violet is going to attack, ");
          violet.attack(blacky);
          System.out.println();
          System.out.print("Pato is going to attack, ");
          pato.attack(violet);
          pato.getKillCount();
          //testing that dead animals cannot attack
          System.out.println();
          violet.attack(pato);
          //testing to attack animals from the same class (it should not attack)
          System.out.println();
          System.out.print("Pato is going to attack, ");
          pato.attack(poli);
          
          System.out.println();
          System.out.print("Animals alive ");
          Animal.getCount();
 
     }//end of main()
     
}//end of class
