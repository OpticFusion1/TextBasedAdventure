public class Location1 {
    static boolean windowopen = false;
    private static void things(){
        System.out.println("--------------------");
        System.out.println("1) Door");
        System.out.println("2) Window");
        System.out.println("--------------------");
    }
    static void Story(){
        System.out.println("You are standing outside of a small house.");
        System.out.println("What would you like to do?");
        action.action();
        choice.choice();
        switch (choice.choice){
            case 1:{
                System.out.println("Look at what?");
                things();
                choice.choice();
                switch(choice.choice){
                    case 1:{
                        System.out.println("It's locked");
                        break;
                    }
                    case 2:{
                        System.out.println("It appears to be unlocked");
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Move where?");
                things();
                choice.choice();
                switch(choice.choice){
                    case 1:{
                        System.out.println("The door is locked");
                        break;
                    }
                    case 2:{
                        if (windowopen == true){
                            Adventure.location = 2;
                        }
                        else{
                            System.out.println("The window is closed");
                        }
                        break;
                    }
                }
                break;
            }
            case 3:{
                inventory.inventory();
                inventory.list();
                System.out.println("Which item would you like to use?");
                inventory.item();
                break;
            }
            case 4:{
                System.out.println("Use what?");
                things();
                choice.choice();
                switch (choice.choice){
                    case 1:{
                        System.out.println("It's locked...");
                        break;
                    }
                    case 2:{
                        if (windowopen == false){
                            System.out.println("It slides open");
                            windowopen = true;
                        }
                        else{
                            System.out.printf("It slides closed");
                            windowopen = false;
                        }
                        break;
                    }
                }
                break;
            }
            case 5:{
                System.out.println("There is nobody to talk to");
            }
        }
    }
}
