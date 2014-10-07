/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class location2 {
    private static boolean beenHere;
    private static void things(){
        System.out.println("1) Fireplace");
        System.out.println("2) Table");
        System.out.println("3) Door");
        System.out.println("Window");
    }
    
    static void story(){
        if (locations.location2 == false){
            System.out.println("You enter the house and see a man at the table, staring at you and smiling.");
            System.out.println("'Ive been expecting you... Your in urgent need of something to do so I've got a quest for you. Do you accept it?");
            System.out.println("1) Sure");
            System.out.println("2) No, go away.");
            choice.choice();
            switch(choice.choice){
                case 1:{
                    System.out.println("Great! Here, take this!");
                    inventory.inventory[0] = true;
                    break;
                }
                default:{
                    System.out.println("Well too bad! Take this!");
                    inventory.inventory[0] = true;
                    break;
                }
            }
            System.out.println("****************************");
            System.out.println("*You recieved a transporter*");
            System.out.println("****************************");
            System.out.println("You can use the teleporter to travel anywhere that you have already been...Because what type of cruel person would make you write things to remember where to go?");
            System.out.println("All you have to do is type in the right number and you'll go there.");
            System.out.println("This location is 85624132");
            System.out.println("Well...I'll be sitting here if you need me...");
            System.out.println("--------------------");
            locations.location2 = true;
        }
        System.out.println("You look around the room and see a few logs in a small fireplace. To the left is a table with a few drawers in it. Behing you is the door, now unlocked, and the window you just came through");
        action.action();
        choice.choice();
        switch(choice.choice){
            case 1:{
                System.out.println("Look at what?");
                things();
                choice.choice();
                switch(choice.choice){
                    case 1:{
                        System.out.println("There are logs in the fireplace");
                        break;
                    }
                }
                break;
            }
            case 3:{
                inventory.list();
            }
        }
    }
    private static void takelogs(){
        System.out.println("Would you like to take the logs?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        choice.choice();
        if (choice.choice == 1){
            System.out.println("--You took the logs--");
        }
    }
}