/*
 * Partying around the world
 * Partying around the world
 * Partying around the world
 * My name is Skwisgaar, let's go to a Swiss bar
 * Drink some brewskies, hang out with some floozies
 * Then we'll gets slurpees, maybe gets herpes
 * Keeps the partys goings! Keeps the partys goings!
 */
package planets;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Matt
 */
public class Planets {


    public static void main(String[] args) {
        //creates new scanner to gather user input and declares an int for the planet choice and doubles for the earth weight and effective weight respectively.
        Scanner input = new Scanner (System.in);
        int planetChoice;
        double earthWeight;
        double effectiveWeight;
        DecimalFormat f = new DecimalFormat("0.0");
        
        
    JOptionPane.showMessageDialog(null, "The President has forgotten how much you weigh on different planets. Are you a bad enough dude to enter the Loopy Planetarium?");
    
    do{
        //Prints to the screen and awaits a user input
        System.out.print("How much do you weigh(lbs) on Earth? Enter a numerical value:");
            earthWeight = input.nextDouble();
        //This conditional statement brings up an error message if the user enters a negative number
            if (earthWeight < 0){
                JOptionPane.showMessageDialog (null, "Weight cannot be a negative number", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //This do while loop ensures that the user does not enter a negative number. If they do it repeats the prompt (probably a better way to do this)
    }while (earthWeight <= 0);    
        
            
            
            
     do{//alyssa this is the start of the do while loop (switch goes inside of it)
         //Prints the options to the screen and anticipates user input
        System.out.print("Choose a planet from the following list: \n 1. Mercury \n 2. Venus \n 3. Mars \n 4. Jupiter \n 5. Saturn \n 6. Uranus \n 7. Neptune \n 8. Pluto \n");
         System.out.print("Enter the numerical value associated with the planet: ");
            planetChoice = input.nextInt();
         //Switch has 8 cases for each planet and a default case for numbers outside of the switch scope (1-8)   
         switch(planetChoice){
            case 1:
                effectiveWeight = earthWeight * 0.37;//effective weight is calculated by multiplaying earth weight (user input) by gravity constant for each planet
                String mercury = "You weigh " + effectiveWeight; //concatenation
                mercury = mercury.concat( " lbs on Mercury"); //concat method at the end for fun
                System.out.println(mercury); //prints the stored data in "mercury" variable to the screen
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight)); //format method to get the decimals rounded to one place
                break; //ends the loop
            
            case 2:
                effectiveWeight = earthWeight * 0.88;
                String venus = "You weigh " + effectiveWeight;
                venus = venus.concat( " lbs on Venus");
                System.out.println(venus);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 3:
                effectiveWeight = earthWeight * 0.38;
                String mars = "You weigh " + effectiveWeight;
                mars = mars.concat( " lbs on Mars");
                System.out.println(mars);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 4:
                effectiveWeight = earthWeight * 2.64;
                String jupiter = "You weigh " + effectiveWeight;
                jupiter = jupiter.concat( " lbs on Jupiter");
                System.out.println(jupiter);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 5:
                effectiveWeight = earthWeight * 1.15;
                String saturn = "You weigh " + effectiveWeight;
                saturn = saturn.concat( " lbs on Saturn");
                System.out.println(saturn);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 6:
                effectiveWeight = earthWeight * 1.15;
                String uranus = "You weigh " + effectiveWeight;
                uranus = uranus.concat( " lbs on Uranus");
                System.out.println(uranus);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 7:
                effectiveWeight = earthWeight * 1.12;
                String neptune = "You weigh " + effectiveWeight;
                neptune = neptune.concat( " lbs on Neptune");
                System.out.println(neptune);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                break;
                
            case 8:
                effectiveWeight = earthWeight * 0.04;
                String pluto = "You weigh " + effectiveWeight;
                pluto = pluto.concat( " lbs on Pluto");
                System.out.println(pluto);
                System.out.print("Rounded to one decimal place:");
                System.out.println(f.format(effectiveWeight));
                System.out.print("Ceres, Eris, Makemake, and Haumea want to have a word with you, though.");
                break;
                
            default:
                System.out.println("************************");
                System.out.println("Invalid input. Try again"); // this will default to an error if a wrong number selected
                System.out.println("************************");
                break;
        }
      }while( planetChoice > 8 || planetChoice < 1 );//do while loop ensures that if the user enters a number greater than the scope of the switch (1-8) it will continue to ask the user for input
       // System.exit(0);//not sure if this was needed but it was on home and learn
     
     
    }
    
}
