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
public class CamSanh extends QuaCam{
    public CamSanh() {
        super(null, 0, null, 0);
    }
     
     
    public CamSanh(String Ten, double CanNang, String NoiNhapKhau, int Soluong) {
        super(Ten, CanNang, NoiNhapKhau, Soluong);
    }
 
    @Override
    public void setTen(String Ten) {
        super.setTen("Cam Sanh");
    }

    @Override
    public void setNguonGoc(String NguonGoc) {
        super.setNguonGoc("Hàm Yen"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setGiaBan(int GiaBan) {
        super.setGiaBan(100000); //To change body of generated methods, choose Tools | Templates.
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
