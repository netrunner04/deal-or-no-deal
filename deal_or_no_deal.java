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
      //System.out.println("Willkommen zum Spiel Deal or No Deal:\n\nDie Spielbeschreibung:\nBei Deal or No Deal spielt ein Kandidat gegen eine Bank.\nDie Bank hat Geldkoffer, deren Beträge bekannt sind und auf einer Tafel angezeigt werden.\nDer Kandidat wählt einen Koffer und einige weitere Koffer zum Öffnen. Die Beträge in den geöffneten Koffern werden auf der Tafel gestrichen.\nDie Bank macht ein Angebot für den Koffer und wenn der Kandidat das Angebot annimmt ist das Spiel zu Ende.\nDanach geht es in Runden von Kofferöffnungen und Bankangebot weiter, bis der Kandidat das Angebot annimmt oder bis er den Inhalt des letzten Koffers erhält.\n");
      e.printStackTrace();
    }
  }

  public static void user_choice()
  {
    System.out.println("\nWas moechten Sie tun:\n\nSpiel starten = 1\nAnwendung beenden = 2\nBitte geben Sie ihre Auswahl ein: ");
      
    Scanner choice = new Scanner(System.in);
    int user_choice = choice.nextInt();
    choice.close();

    switch(user_choice)
    {
      case 1:
      {
          System.out.println("Spiel startet:");
          //call methods for the game content
          table();
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

  public static void table()
  {
    System.out.println("Please choose a value:");

    try
      {
        File valueInstr = new File("values_instruction.txt");
        Scanner valueinstrReader = new Scanner(valueInstr);

        while(valueinstrReader.hasNextLine())
          {
            String valueinstrContent = valueinstrReader.nextLine();
            System.out.println(valueinstrContent);
          }
        valueinstrReader.close();
      }

    catch(FileNotFoundException e2)
    {
      System.out.println("An error occurred. File not found.");
      //System.out.println("Willkommen zum Spiel Deal or No Deal:\n\nDie Spielbeschreibung:\nBei Deal or No Deal spielt ein Kandidat gegen eine Bank.\nDie Bank hat Geldkoffer, deren Beträge bekannt sind und auf einer Tafel angezeigt werden.\nDer Kandidat wählt einen Koffer und einige weitere Koffer zum Öffnen. Die Beträge in den geöffneten Koffern werden auf der Tafel gestrichen.\nDie Bank macht ein Angebot für den Koffer und wenn der Kandidat das Angebot annimmt ist das Spiel zu Ende.\nDanach geht es in Runden von Kofferöffnungen und Bankangebot weiter, bis der Kandidat das Angebot annimmt oder bis er den Inhalt des letzten Koffers erhält.\n");
      e2.printStackTrace();
    }

    Scanner readChoice = new Scanner(System.in);
    int valueChoice = readChoice.nextInt();
    readChoice.close();
    System.int.println(valueChoice);
  }
  
  public static void offer_calc()
  {
    System.out.println("offer calculation:");
  }

  public static void main(String[] args)
  {      
    instruction_file_read();
    user_choice();
  }
}
