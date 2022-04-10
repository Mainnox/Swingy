package fr.mainox.swingy.console.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStart {
    //Put launch in the constructor to see if it's beautiful or not
    public static void launchconsole() {

        System.out.println("\n\nWelcome to the K-Game\n\nBe prepare to play to the most impresive text-based RPG of all time!");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean good = false;
            while (!good) {
                System.out.println("Please tap \"create\" for create a brand new hero or tap \"select\" to continue a existant one");
                String input = br.readLine();
                switch (input) {
                    case "select":
                        System.out.println("Select selected");
                        good = true;
                        break;
                    case "create":
                        System.out.println("Create selected");
                        good = true;
                        break;
                    default:
                        System.out.println(input + " is not a option!");
                        
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
