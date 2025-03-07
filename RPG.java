/* Ben Dickman
* 3/7/2025
* Homework 3
* The objective of this assignment is to practice incorporating arrays into a java program made more complex
  through the use of selection statements and loops to simulate a simple role-playing game (RPG). */


  import java.util.Scanner; 
  import java.util.Random;
  
  public class RPG { 
      public static void main(String[] args) {
      

          int[] enemies = { 3,5, 8 ,20, 15 };     
          int enemyIndex = 0; 
          final int MAX_HEALTH = 25; 
          int currentHealth = MAX_HEALTH; 
          int gold = 0; 
          Scanner scanner = new Scanner(System.in); 
          Random random = new Random();
         

          System.out.println("The Player has entered the Dungeon!");
          printGameStats(enemies, currentHealth, gold);
      

          while (enemyIndex < enemies.length && currentHealth > 0) { 
              System.out.println("Oh no!! An Enemy Has Appeared!  (" + enemies[enemyIndex] + ")"); 
  

              boolean validInput = false;    
              while (!validInput) { 
                  System.out.print("What would you like to do? (Attack, Heal, flee?) ");
                  String choice = scanner.next().toLowerCase();
                      

                  if (choice.equals("attack")) {
                      System.out.println("The Player Hit for " + (2 + 3) + " Damage!"); 
                      validInput = true;
                  } else if (choice.equals("heal")) { 
                      int healAmount = random.nextInt(5) + 2; 
                      currentHealth += healAmount; 
                      if (currentHealth > MAX_HEALTH) 
                          currentHealth = MAX_HEALTH; 
                      System.out.println("Player Healed.. Health now: " + currentHealth); 
                      validInput = true;
                  } else if (choice.equals("flee")) { 
                      System.out.println("\n" + (enemies.length - enemyIndex) + " Enemies Left Undefeated.");
                      System.out.println("The Player ran away... with " + gold + " gold!!"); 
                      scanner.close(); 
                      return; 
                  } else {
                      System.out.println("Invalid input. choose Attack, Heal, or Flee? "); 
                  } 
              } 
                  

              if (enemies[enemyIndex] > 0) { 
                  int enemyAttack = random.nextInt(3) + 2;
                  currentHealth -= enemyAttack; 
                  System.out.println("The Enemy Hit for " + enemyAttack + " Damage!"); 
              } else { 
                  System.out.println("Enemy Defeated!!");
                  gold += getGold(enemyIndex); 
                  enemyIndex++;
              } 
  

              if (currentHealth <= 0) { 
                  gold /= 2; 
                  System.out.println("The player has been Defeated!! lost half your gold :( "); 
                  System.out.println("The player barely escaped with " + gold + " gold!"); 
                  scanner.close();
                  return; 
              }
  

              printGameStats(enemies, currentHealth, gold);   
          } 
  

          System.out.println("Player Victorious!! All Enemies Defeated!!");
          System.out.println("The player escaped with " + gold + " gold!"); 
          scanner.close(); 
      } 
  

      private static void printGameStats(int[] enemies, int currHealth, int gold) { 
          System.out.print("Enemies Stats: [");
          for (int i = 0; i < enemies.length; i++) { 
              System.out.print(enemies[i]); 
              if (i < enemies.length - 1) { 
                  System.out.print(",  ");
              } 
          } 


          System.out.println("]");
          System.out.println("Player Health:  " + currHealth);
          System.out.println("Gold:   " + gold); 
      } 
  

      private static int getGold(int enemyIndex) { 
          return 10 + (enemyIndex * 2);
      }
  }
  