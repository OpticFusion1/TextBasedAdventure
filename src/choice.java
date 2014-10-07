
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class choice {
    public static int choice;
    public static void choice() {
        Scanner response = new Scanner(System.in);
        choice = response.nextInt();
        System.out.println("--------------------");
    }
}
