/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PRINCE D. TOAD
 */
public class Nguoi {

    private int ma;
    private String taikhoan;
    private String matkhau;
    private int chucnang;

    public Nguoi() {
    }

    public Nguoi(int ma, String taikhoan, String matkhau, int chucnang) {
        this.ma = ma;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.chucnang = chucnang;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getChucnang() {
        return chucnang;
    }

    public void setChucnang(int chucnang) {
        this.chucnang = chucnang;
    }

}
