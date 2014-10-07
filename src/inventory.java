
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class inventory {
    public static int transporter = 0;
    public static int logs = 1;
    static boolean[] inventory;
    public static void inventory(){
        inventory = new boolean[2];
    }
    public static void list(){
        System.out.println("Inventory Contents:");
        System.out.println("-------------------");
        for(int x = 0; x<2; x++){
            if (inventory[x]==true){
                if (x == 0){
                    System.out.println("1) Transporter");
                }
                if (x == 1){
                    System.out.println("2) Logs");
                }
                choice.choice();
                switch(choice.choice){
                    case 1:{
                        teleport.teleport();
                    }
                }
            }
            
            else{
                System.out.println("-------------------");
            }
        }
    }
    public static void item(){
        if (inventory[0] == true){
            if(inventory[0] && choice.choice == 1){
                teleport.teleport();
            }
            else{
            }
        }
    }
}