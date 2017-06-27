/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import javax.swing.JOptionPane;

/**
 *
 * @author Anthonny
 */
public class Client_registration {
    
     public static void menu_Client() {
        String menu = "Employee registration\n";
        int n1, n2, n3;
        int op = 0;

        menu += "1.Add Clients\n";
        menu += "2.Modify Clients\n";
        menu += "3.Delete Clients\n";
        menu += "4.End\n";
        menu += "Choose Option:\n";

        while (op != 3) {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:

                    Client_registration objeto = new Client_registration();
                    objeto.add_Client();

                    break;

                case 2:
                   Client_registration objeto2 = new Client_registration();
                    objeto2.modify_Client();

                    break;

                case 3:
                   Client_registration objeto3 = new Client_registration();
                    objeto3.delete_Client();

            }

        }

    }
    
    
    public static void add_Client(){
        
    }
    public static void modify_Client(){
        
    }
    public static void delete_Client(){
        
    }
    
    
}
