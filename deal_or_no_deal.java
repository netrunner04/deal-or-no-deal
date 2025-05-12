import java.io.File;
import java.io.FileNotFoundException;
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

  public static void table(Scanner user_input)
  {
    System.out.println("\nSuitcases:");

    System.out.println("\nPlease choose a Suitcase:");
    int valueChoice = user_input.nextInt();
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
