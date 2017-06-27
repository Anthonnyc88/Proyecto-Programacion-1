/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthonny
 */
public class Register_posts {

    public static void menu_Posts() {
        String menu = "Job posting\n";
        int n1, n2, n3;
        int op = 0;

        menu += "1.Add Posts\n";
        menu += "2.Modify Posts\n";
        menu += "3.Delete Posts\n";
        menu += "4.End\n";
        menu += "Choose Option:\n";

        while (op != 3) {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:

                    Register_posts objeto = new Register_posts();
                    objeto.add_Posts();

                    break;

                case 2:
                    Register_posts objeto2 = new Register_posts();
                    //objeto2.modify_Posts();

                    break;

                case 3:
                    Register_posts objeto3 = new Register_posts();
                //objeto3.delete_Posts();

            }

        }

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Funtions the add , modify and delete posts.
    public static void add_Posts(String nombre) {
        //String nombre;

        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wi;
        String texto = "";
        

        try {
           
            f = new File(nombre);
            w = new FileWriter(f,true);//es un objeto que tiene como función escribir datos en un archivo.
            bw = new BufferedWriter(w); // objeto que reserva un espacio en memoria donde se guarda la información antes de ser escrita en un archivo.
            wi = new PrintWriter(bw);//Es el objeto que utilizamos para escribir directamente sobre el archivo de texto.
            // wi.write("Nuestra primer linea");
            //wi.append("\nSegunda linea");
            String nombre_Puesto;
            String sigla;
            nombre_Puesto = JOptionPane.showInputDialog("Nombre del puesto");
            sigla=JOptionPane.showInputDialog("Sigla del puesto");
           
            bw.write(nombre_Puesto);
            bw.write(sigla);
            bw.newLine();

            //wi.append("\nUltima linea");
            wi.close();
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error de :" + e);
        }
    }

    private void add_Posts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

//ublic static void modify_Posts() {
//
//    }
//
//    public static void delete_Posts() {
//
//    }
//
//}
