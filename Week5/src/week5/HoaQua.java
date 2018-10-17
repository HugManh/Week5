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
public class HoaQua {
    private String Ten;
    private double CanNang;
    private String NguonGoc;
    private int GiaBan;

    public HoaQua(String Ten, double CanNang, String NguonGoc, int GiaBan) {
        this.Ten = Ten;
        this.CanNang = CanNang;
        this.NguonGoc = NguonGoc;
        this.GiaBan = GiaBan;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
 
    public String getTen() {
        return Ten;
    }
 
    public void setCanNang(double CanNang) {
        this.CanNang = CanNang;
    }
 
    public double getCanNang() {
        return CanNang;
    }
 
    public void setNguonGoc(String NguonGoc) {
        this.NguonGoc = NguonGoc;
    }
 
    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getGiaBan() {
        return GiaBan;
    }
    
    public void InThongTin(){
        System.out.println("Ten mat hang: " + getTen() +
                           "\nCan nang: "   + getCanNang() +
                           "\nGia ban: " + getGiaBan() +
                           "\nNguon goc xuat xu: " + getNguonGoc());
    }
    
}
