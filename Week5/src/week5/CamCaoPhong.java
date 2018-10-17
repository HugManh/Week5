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
public class CamCaoPhong extends QuaCam{
    public CamCaoPhong() {
        super(null, 0, null, 0);
    }
 
    public CamCaoPhong(String Ten, double CanNang, String NguonGoc, int GiaTien) {
        super(Ten, CanNang, NguonGoc, GiaTien);
    }
    
    @Override
    public void setTen(String Ten) {
        super.setTen("Cam Cao Phong");
    }
    
    @Override
    public void setNguonGoc(String NguonGoc) {
        super.setNguonGoc("Hoa Binh");
    }
 
    @Override
    public void setGiaBan(int GiaBan) {
        super.setGiaBan(120000); //To change body of generated methods, choose Tools | Templates.
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
