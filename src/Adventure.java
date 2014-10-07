public class Adventure{
    public static int location = 1;
    public static void main(String[] args){
	System.out.println("Are you ready to begin? (yes/no)");
        inventory.inventory();
        input.input();
	if (input.input.equals("yes")){
            boolean playing = true;
            System.out.println("Please enter your name:");
            String name;
            input.input();
            name = input.input;
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
            System.out.println("Here we go, "+ name);
            System.out.println("You wake up in a forest. You feel the cool breeze on your skin and smell the scent of pine in the air. In front of you lies a small house.");
            do{
                switch(location){
                    case 1:{
                        do{
                            Location1.Story();
                        }while(location == 1);
                        continue;
                    }
                    case 2:{
                        do{
                            location2.story();
                        }while(location == 2);
                        continue;
                    }
                    default:{
                        System.out.println("This part of the game is in developement");
                        playing = false;
                    }
                }
            }while(playing);
        }
        else{
            System.out.println("Return when ready");
        }
    }
}