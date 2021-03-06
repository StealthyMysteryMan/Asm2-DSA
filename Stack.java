/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_asm_app;

/**
 *
 * @author Tran Anh Tung
 */
public class Stack {
    
        public int topM;
        public final int stackCap;
        public String[] mess;   
        
        public Stack(int stackCap) {
            this.stackCap = stackCap;
            this.mess = new String[stackCap];
            this.topM = -1;
        }
        
        public boolean isEmpty() {
            return (this.topM == -1);
        }
        
        public void Push(String newMessage) {
            if(this.topM ==(this.stackCap -1 )) {
                System.out.println("MEMORY CAP REACHED");
            }
            else {
            this.mess[(++this.topM)] = newMessage;
            }
        }
        
        public String Pop() {
            String popMessage = "";
            try {
                popMessage =this.mess[this.topM];
                this.topM--;   
            }
            catch(Exception e) {     
                System.out.println("Empty");
            }return popMessage;
        }
        
        public void Clear() {
            while(!this.isEmpty()) {      
                this.Pop();
            }
            
        }
        
}
