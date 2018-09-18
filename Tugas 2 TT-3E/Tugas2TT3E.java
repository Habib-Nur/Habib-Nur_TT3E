/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2.tt.pkg3e;

/**
 *
 * @author HABIB NUR ROHMAN
 */
public class Tugas2TT3E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (b == 0 || b == n - 1 || a == 0 || a == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}
