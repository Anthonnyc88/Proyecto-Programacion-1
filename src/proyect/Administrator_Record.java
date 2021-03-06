/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import static proyect.Admin_menu.administrator_Menu;

/**
 *
 * @author Anthonny
 */
public class Administrator_Record {

    public void record() throws IOException {
        // TODO code application logic here (algoritmo que escribe archivo)
        try {
            String archivo = "Administrator.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String nombre = "";
            String contraseña = "";
            nombre = JOptionPane.showInputDialog("Username");
            contraseña = JOptionPane.showInputDialog("Passwoord");
            FileReader fr = new FileReader("Administrator.txt");
            BufferedReader lector = new BufferedReader(fr);

            String user = "";
            String password = "";

            String linea = lector.readLine();

            while (linea != null) {
                if (linea.contains(nombre) && linea.contains(contraseña)) {
                    user = linea;
                    password = linea;
                    System.out.println("Welcome");
                    administrator_Menu();
                    break;

                } else if (linea.equals(user) != linea.equals(contraseña) != linea.equals(contraseña) != linea.equals(user)) {
                    System.out.println("Usuario y Contraseña Incorrectas");
                    break;

                } else {
                    System.out.println("Usuario y Contraseña Incorrectas");
                    break;
                }
            }

            pw.close();

        } catch (Exception e) {

            System.err.println("No se encontro archivo" + e);
        }
    }

    public void change_Password() throws IOException {
        try {
            String archivo = "Administrator.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String nombre = "";
            String contraseña = "";
            nombre = JOptionPane.showInputDialog("Username");
            contraseña = JOptionPane.showInputDialog("Passwoord");
            FileReader fr = new FileReader("Administrator.txt");
            BufferedReader lector = new BufferedReader(fr);

            String newPass = "";
            String newLinea = "";
            boolean bandera = false;

            ArrayList<String> listaUsuarios = new ArrayList();
            String linea;
            
            while( (linea=lector.readLine()) != null ){
                listaUsuarios.add(linea);
            }
         
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (nombre.equals(listaUsuarios.get(i).split(" ")[0]) && contraseña.equals(listaUsuarios.get(i).split(" ")[1])) {
                    newPass = JOptionPane.showInputDialog("Digite la nueva contraseña");
                    newLinea = listaUsuarios.get(i).split(" ")[0] + " " + newPass;
                    listaUsuarios.set(i, newLinea);
                    
                    PrintWriter escritor = null;
                    FileWriter fichero = null;
                    try{
                        fichero = new FileWriter(archivo);
                        escritor = new PrintWriter(fichero);
                        escritor.flush();
                        for (String usuario : listaUsuarios) {
                            pw.write(usuario);
                            pw.println();
                        }
                        escritor.close();
                    } catch (Exception e) {
                        JOptionPane.showConfirmDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
                    }
                    bandera = true;    
                    JOptionPane.showMessageDialog(null, "Contraseña modificada.","Modificacion",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

            pw.close();

            if (!bandera) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            String error = "No se encontro archivo" + e;
            JOptionPane.showConfirmDialog(null, error,"Error",JOptionPane.ERROR_MESSAGE);
        }

    }
}
