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
public class Function {

    Queue q = new Queue();
    Stack s = new Stack(10);

    public void sendMess() {
        System.out.println("Enter your message:");
        System.out.println("");
        String inputMess = "";
        
        do {
            Scanner scan = new Scanner(System.in);
            inputMess = scan.nextLine();
//          q.enqueue(inputMess);
//        } while (!q.isEmpty()) {
//        String x = q.dequeue().getMess();
//        s.push(x);
            if (!("send").equals(inputMess)) {

                q.Enqueue(inputMess);

            }

        } while (!("send").equals(inputMess));

        while (!q.isEmpty()) {
            String x = q.Dequeue().GetMessage();
            s.Push(x);
        }
    }

    public void disMess() {
        if (s.isEmpty()) {
            System.out.println("No message in memory");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("All messages: ");
            System.out.println("------------------------------------------");            
            while (!s.isEmpty()) {
                System.out.println(s.Pop());
            }
        }
    }
    
    public void clearMess() {
        s.Clear();
        System.out.println("Memory cleared");
    }
}
