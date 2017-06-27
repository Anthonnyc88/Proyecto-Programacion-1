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
public class Admin_menu {

    public static void administrator_Menu() {
        String menu = "ADMINISTRATOR'S MENU\n";
        int n1, n2, n3;
        int op = 0;

        menu += "1.Registro de puestos\n";
        menu += "2.Registro de colaboradores\n";
        menu += "3.Registro de clientes\n";
        menu += "4.Registro de proyectos\n";
        menu += "Escoja Opción:\n";

        while (op != 3) {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:
                    Register_posts objeto = new Register_posts();
                    objeto.menu_Posts(); //Enlaza el menu de puestos
                    break;

                case 2:
                    Register_employees objeto2 = new Register_employees();
                    objeto2.menu_employees();
                    break;
                    
                    
                case 3:
                    Client_registration objeto3 = new Client_registration();
                    objeto3.menu_Client();
                    break;
                    
                    
                    
                case 4:
                    Register_proyect objeto4 = new Register_proyect();
                    objeto4.menu_Proyect();
                    break;

            }

        }

    }

}
