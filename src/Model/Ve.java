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
    private int maChongoi;
    private int maChuyenbay;
    private String tenKhachhang;
    private Date ngaysinh;
    private String soID;
    private String kieuGiaytoID;
    private String quoctich;
    private Date ngayban;
    private int tongTien;

    public Ve() {
    }

    public Ve(int maVe, int maChongoi, int maChuyenbay, String tenKhachhang, Date ngaysinh, String soID, String kieuGiaytoID, String quoctich, Date ngayban, int tongTien) {
        this.maVe = maVe;
        this.maChongoi = maChongoi;
        this.maChuyenbay = maChuyenbay;
        this.tenKhachhang = tenKhachhang;
        this.ngaysinh = ngaysinh;
        this.soID = soID;
        this.kieuGiaytoID = kieuGiaytoID;
        this.quoctich = quoctich;
        this.ngayban = ngayban;
        this.tongTien = tongTien;
    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getMaChongoi() {
        return maChongoi;
    }

    public void setMaChongoi(int maChongoi) {
        this.maChongoi = maChongoi;
    }

    public int getMaChuyenbay() {
        return maChuyenbay;
    }

    public void setMaChuyenbay(int maChuyenbay) {
        this.maChuyenbay = maChuyenbay;
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
