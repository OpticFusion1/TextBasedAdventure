/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author David
 */
public class teleport{
    public static void teleport(){
        System.out.println("The transporter booted up");
        System.out.println("Where would you like to go?");
        Scanner transport = new Scanner(System.in);
        if (transport.nextLong() == 85624132){
            Adventure.location = 2;
        }
        else{
            System.out.println(".........Nothing happened.");
        }
    }
}
