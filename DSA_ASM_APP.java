/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_asm_app;

import java.util.Scanner;

/**
 *
 * @author Tran Anh Tung
 */
public class DSA_ASM_APP {

    public static void main(String[] args) {
        // TODO code application logic here
        Function func = new Function();
        int choice = 0;
        while (choice != 4)
        {
            System.out.println("1. Send something");
            System.out.println("2. Display message");
            System.out.println("3. Clear memory");
            System.out.println("4. Quit");
            Scanner scan = new Scanner(System.in);
            try {
                choice = scan.nextInt();
            }
            catch (Exception e) {
                System.out.println("Use brain bruhhh...");
            }
            switch (choice) {
                case 1: {
                    func.sendMess();
                    break;
                }
                case 2: {
                    func.disMess();
                    break;
                }
                case 3: {
                    func.clearMess();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please enter valid input (1-4)");
                    break;
                }
            }
        }
    }
    
}
