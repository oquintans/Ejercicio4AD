/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiarimg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class CopiarImg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            
            FileInputStream fich = new FileInputStream("texto3.txt");
          //  FileOutputStream fich2 = new FileOutputStream("foto2.jpg", true);
            BufferedInputStream f1 = new BufferedInputStream(new FileInputStream("foto.jpg"));
            BufferedOutputStream f2 = new BufferedOutputStream(new FileOutputStream("foto4.jpg", true));
//            int fichleer;
//            while ((fichleer = fich.read()) != -1) {
//
//                fich2.write(fichleer);
//            }
            int fichleer;
            while ((fichleer = f1.read()) != -1) {
                f2.write(fichleer);                
            }
       //     f2.write(fichleer);
            f2.write(fich.read());
            f2.write(fich.read());

            f1.close();
            f2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiarImg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiarImg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
