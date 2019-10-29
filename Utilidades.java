package utilidades;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilidades
{

  public static void runSystemCommand(String command) {

      try {
         Process p = Runtime.getRuntime().exec(command);
         BufferedReader inputStream = new BufferedReader(
               new InputStreamReader(p.getInputStream()));

         String s = "";
         // reading output stream of the command
         while ((s = inputStream.readLine()) != null) {
            System.out.println(s);
         }

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

    public static void main(String[] args) {
               
 String inputValue = JOptionPane.showInputDialog("Inserte ip");       
               
      runSystemCommand("ping " + inputValue);
}

   
   }
