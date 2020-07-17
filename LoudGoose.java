
public class LoudGoose extends WaterFowl implements Attacker
{
     private int killCount;
     public LoudGoose()
     {
          super();
     }//end of LoudGoose()
     
     public LoudGoose(String name, String primaryColor)
     {
          super(name, primaryColor);
     }//end of LoudGoose()
     
     public void fly()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = true;
               System.out.println(super.name + " is flying");
          }
     }//end of fly()
     
     public void swim()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = false;
               System.out.println(super.name + " is swimming");
          }
     }//end of swim()
     public void attack(HappyPig animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(CuriousBunny animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(LoudGoose animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(AngryDuck animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public int getKillCount()
     {
          return killCount;
     }//end of getKillCount()
}//end of class
