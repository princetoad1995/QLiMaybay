/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author PRINCE D. TOAD
 */
public class Ve {
    private int maVe;
    private Chongoi chongoi;
    private Chuyenbay chuyenbay;
    private String tenKhachhang;
    private Date ngaysinh;
    private String soID;
    private String kieuGiaytoID;
    private String quoctich;
    private Date ngayban;
    private int tongTien;

    public Ve() {
    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public Chongoi getChongoi() {
        return chongoi;
    }

    public void setChongoi(Chongoi chongoi) {
        this.chongoi = chongoi;
    }

    public Chuyenbay getChuyenbay() {
        return chuyenbay;
    }

    public void setChuyenbay(Chuyenbay chuyenbay) {
        this.chuyenbay = chuyenbay;
    }

    public String getTenKhachhang() {
        return tenKhachhang;
    }

    public void setTenKhachhang(String tenKhachhang) {
        this.tenKhachhang = tenKhachhang;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSoID() {
        return soID;
    }

    public void setSoID(String soID) {
        this.soID = soID;
    }

    public String getKieuGiaytoID() {
        return kieuGiaytoID;
    }

    public void setKieuGiaytoID(String kieuGiaytoID) {
        this.kieuGiaytoID = kieuGiaytoID;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
