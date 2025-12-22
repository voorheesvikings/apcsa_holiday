import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean gameLoop = true;
        String heroName;

        System.out.println("Enter your name great Jomviking warrior: ");
        heroName = input.nextLine();

        // Main Game Loop
        while (gameLoop) {
            
            // Reset health and stats at the start of every NEW game/restart
            int health = 100; 

            // Decision 1
            System.out.println("----Beginning----");
            System.out.println("Hello " + heroName + ", I have a query for you.");
            System.out.println("Would you like to join me in hunting the krampus? (yes/no)");
            String decision1 = input.nextLine();

            if (decision1.equalsIgnoreCase("no")) {
                // LOSE Decision 1
                System.out.println("OHHHH NOOOOOOOOO " + heroName + "!");
                System.out.println("You Lost 100 Health Points. When walking back to your house you slipped on ice.");
                System.out.println("Next time maybe start adventuring instead of being a lazy bum.");
                System.out.println("\n--- RESTARTING ADVENTURE ---\n");
                continue; // Jumps back to the start of the while loop

            } else if (decision1.equalsIgnoreCase("yes")) {
                // WIN Decision 1 - Continue story
                System.out.println("\nYou have begun your grand adventure warrior!");
                System.out.println("After tracking the Krampus, you find him.");
                health += 10;
                System.out.println("Current Health: " + health);
                
                System.out.println("You see the monster, he's scrambling hin the forest, eating several town's men. Do you attack this beast with a 'Sword' or 'Bow'?");
                String decision2 = input.nextLine();

                if (decision2.equalsIgnoreCase("sword")) {
                    // LOSE Decision 2
                    System.out.println("You try stabbing Krampus but he flings you into the sky.");
                    System.out.println("The large destructive krampus flings you in the air as you attempt to strike him. You splat on cobbled stone on the ground, a bloody mess. You lost 100 Health Points.");
                    System.out.println("\n--- RESTARTING ADVENTURE ---\n");
                    continue; // Jumps back to start

                } else if (decision2.equalsIgnoreCase("bow")) {
                    // WIN Decision 2 - Continue story
                    System.out.println("\nYou injured the Krampus! He staggers back.");
                    health += 20; // Bonus for good choice
                    System.out.println("Current Health: " + health);

                    System.out.println("He charges at you, his raging blood evident with a mind set on damming you to hell  Do you 'Run' across the icy river, or 'Fight' like a WARRIOOOORRRRRR?");
                    String decision3 = input.nextLine();

                    if (decision3.equalsIgnoreCase("fight")) {
                        // LOSE Decision 3
                        System.out.println("He breaks your skull. You lost 100 health points.");
                        System.out.println("\n--- RESTARTING ADVENTURE ---\n");
                        continue;

                    } else if (decision3.equalsIgnoreCase("run")) {
                        // WIN GAME
                        System.out.println("\nThe Krampus chases you onto the ice...");
                        System.out.println("But he falls through and freezes! Congratulations you WINNNN WARRRIOOOOORRRRRRR!");
                        health += 20;
                        System.out.println("Final Health: " + health);
                        
                        // Play Again Logic
                        System.out.println("\nWould you like to play again? (yes/no)");
                        String again = input.nextLine().toLowerCase();
                        
                        if (again.equalsIgnoreCase("no")) {
                            System.out.println("You suck.");
                            gameLoop = false; 
                        } 
                        
                    } else {
                        // Invalid input for Decision 3
                        System.out.println("You hesitated and did nothing! The Krampus got you.");
                        System.out.println("--- RESTARTING ---");
                    }
                } else {
                    // Invalid input for Decision 2
                    System.out.println("You fumbled your weapon! The Krampus got you.");
                    System.out.println("--- RESTARTING ---");
                }
            } else {
                // Invalid input for Decision 1
                System.out.println("That wasn't a valid answer, warrior. Try again.");
            }
        }
        
        input.close();
    }
}