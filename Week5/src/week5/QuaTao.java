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
public class QuaTao extends HoaQua{
    public QuaTao() {
        super(null, 0, null, 0);
    }

    public QuaTao(String Ten, double CanNang, String NguonGoc, int GiaTien) {
        super(Ten, CanNang, NguonGoc, GiaTien);
    }

    @Override
    public void setTen(String Ten) {
        super.setTen("Quả táo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGiaBan(int GiaBan) {
        super.setGiaBan(50000); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double TinhTien(){
        return getCanNang()*getGiaBan();
    }
    
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("\nThanh tien: " + TinhTien());//To change body of generated methods, choose Tools | Templates.
    } 
    
}
