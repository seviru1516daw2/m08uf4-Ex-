/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;
/**
 *
 * @author dc1415daw2
 */
import java.io.*;
public class Jenkins {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("index.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Treballant amb l'IC Jenkins");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    2a Modificació del projecte jenkins);bw.newLine()");
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
}