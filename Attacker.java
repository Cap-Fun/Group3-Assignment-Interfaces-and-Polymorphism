/*sets the general methods to be used when the characters attack each other*/
/* Jasleen Bains ID:- T00651489 */
 public interface Attacker
  
 {
   public void attack(AngryDuck animal);
   public void attack(LoudGoose animal);
   public void attack(HappyPig animal);
   public void attack(CuriousBunny animal);
   public int getKillCount();
 }
