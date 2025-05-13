import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class deal_or_no_deal
{
  public static void instruction_file_read()
  {
    try
    {
      File gameInstruction = new File("game_instruction.txt");
      Scanner instructionReader = new Scanner(gameInstruction);

      while(instructionReader.hasNextLine()) 
      {
        String instructionContent = instructionReader.nextLine();
        System.out.println(instructionContent);
      }

      instructionReader.close();
    }

    catch(FileNotFoundException e)
    {
      System.out.println("An error occurred. File not found.");
      e.printStackTrace();
    }
  }

  public static void suitcaseValues(int[] valuesSuitcases)
  {
    int index = 0,arraylength = valuesSuitcases.length;
    while (index < arraylength) 
    {
      int rNumber = 0;

      Random r_generator = new Random();
      rNumber = r_generator.nextInt(899999) + 100000;

      valuesSuitcases[index] = rNumber;
      index++;
    }
  }

  public static void table(Scanner user_input)
  {
    int[] valuesSuitcases = new int[30];
    int i,suitcase_number = 1;
    suitcaseValues(valuesSuitcases);

    System.out.println("\nSuitcases:");
    System.out.println("------------------------------------------------------------------------------------------------");
    System.out.print("| ");
    for(i=0;i < valuesSuitcases.length;i++)
    {
      if(suitcase_number < 10)
      {
        System.out.print("value 0" + suitcase_number + ": " + valuesSuitcases[i]);
      }

      else
      {
        System.out.print("value " + suitcase_number + ": " + valuesSuitcases[i]);
      }
      System.out.print(" | ");

      if(suitcase_number == 5 || suitcase_number == 10 || suitcase_number == 15 || suitcase_number == 20 || suitcase_number == 25)
      {
        System.out.print("\n");
        System.out.print("| ");
      }

      suitcase_number++;
    }
    System.out.println("\n------------------------------------------------------------------------------------------------");

    System.out.println("\n\nPlease choose a Suitcase:");
    int valueChoice = user_input.nextInt();
  }

  public static void user_choice(Scanner user_input)
  {
    System.out.println("\nWas moechten Sie tun:\n\nSpiel starten = 1\nAnwendung beenden = 2\nBitte geben Sie ihre Auswahl ein: ");
    int user_choice = user_input.nextInt();

    switch(user_choice)
    {
      case 1:
      {
          System.out.println("Spiel startet:");
          table(user_input);
          break;
      }

      case 2:
      {
        System.out.println("Anwendung wird beendet...");
        break;
      }
        
      default:
      {
        System.out.println("wrong input\n");
      }
    }
  }
  
  public static void offer_calc()
  {
    System.out.println("offer calculation:");
  }

  public static void main(String[] args)
  {   
    Scanner user_input = new Scanner(System.in);

    instruction_file_read();
    user_choice(user_input);

    user_input.close();
  }
}
