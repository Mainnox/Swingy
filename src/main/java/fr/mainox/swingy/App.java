package fr.mainox.swingy;

import java.io.File;
import java.io.IOException;

import fr.mainox.swingy.console.view.ConsoleStart;
import fr.mainox.swingy.error.ErrorParsing;

public class App 
{
    private static void initSwingy(String[] args) {
        try {
            ErrorParsing.testerrorParsing(args);
            File heroFile= new File("heroList.txt");
            if (heroFile.createNewFile())
                System.out.println("heroList.txt as been created.");
            else
                System.out.println("Loading of the existing heroList");
        }
        catch  (ErrorParsing e) {
            System.out.println(e);
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("A error occured in the creation of the hero list.");
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static void main( String[] args )
    {
        initSwingy(args);
        switch (args[0]) {
            case "gui":
                break;
            case "console":
                ConsoleStart.launchconsole();
                break;
            default:
                System.out.println("Unexpecgted Error occured");
                System.exit(0);             
        }
    }
}
