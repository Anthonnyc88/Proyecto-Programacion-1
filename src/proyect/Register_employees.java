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
public class Register_employees {
    
     public static void menu_employees() {
        String menu = "Employee registration\n";
        int n1, n2, n3;
        int op = 0;

        menu += "1.Add Employees\n";
        menu += "2.Modify Employees\n";
        menu += "3.Delete Employees\n";
        menu += "4.End\n";
        menu += "Choose Option:\n";

        while (op != 4) {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:

                    Register_employees objeto = new Register_employees();
                    objeto.add_Employees();

                    break;

                case 2:
                    Register_employees objeto2 = new Register_employees();
                    objeto2.modify_Employees();

                    break;

                case 3:
                    Register_employees objeto3 = new Register_employees();
                    objeto3.delete_Employees();

            }

        }

    }

    
    
 // functions the add , modify and delete
    
    public static void add_Employees(){
        
    }
    public static void modify_Employees(){
        
    }
    
    public static void delete_Employees(){
        
    }
    
}
