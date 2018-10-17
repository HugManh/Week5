/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Manh
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CamSanh camsanh = new CamSanh("Cam Sanh", 230 , "Viet Nam", 100000);
        CamCaoPhong camcaophong = new CamCaoPhong("Cam Cao Phong", 280, "Viet Nam", 120000);
        QuaTao quatao = new QuaTao("Tao Tau", 300, "Trung Quoc", 50000);
         
        System.out.println("**********KET QUA*********");
            camsanh.InThongTin();
        System.out.println("--------------------------");
            camcaophong.InThongTin();
        System.out.println("--------------------------");
            quatao.InThongTin();
        System.out.println("**************************");
    }
    
}
