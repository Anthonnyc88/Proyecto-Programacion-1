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
public class Register_proyect {
    
    
      public static void menu_Proyect() {
        String menu = "Job posting\n";
        int n1, n2, n3;
        int op = 0;

        menu += "1.Add Proyect\n";
        menu += "2.Modify Proyect\n";
        menu += "3.Delete Proyect\n";
        menu += "4.End\n";
        menu += "Choose Option:\n";

        while (op != 3) {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:

                    Register_proyect objeto = new Register_proyect();
                    objeto.add_Proyect();

                    break;

                case 2:
                    Register_proyect objeto2 = new Register_proyect();
                    objeto2.modify_Proyect();

                    break;

                case 3:
                    Register_proyect objeto3 = new Register_proyect();
                    objeto3.delete_Proyect();

            }

        }

    }

    
    public static void add_Proyect(){
        
    }
    public static void modify_Proyect(){
        
    }
    public static void delete_Proyect(){
        
    }
    
}
