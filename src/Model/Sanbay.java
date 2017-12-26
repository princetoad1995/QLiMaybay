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
public class Sanbay {

    private int maSanbay;
    private String tenSanbay;
    private String diachi;
    private Thanhpho thanhpho;
    private String mota;

    public Sanbay() {
    }

    public Sanbay(int maSanbay, String tenSanbay, String diachi, Thanhpho thanhpho, String mota) {
        this.maSanbay = maSanbay;
        this.tenSanbay = tenSanbay;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.mota = mota;
    }

    public int getMaSanbay() {
        return maSanbay;
    }

    public void setMaSanbay(int maSanbay) {
        this.maSanbay = maSanbay;
    }

    public String getTenSanbay() {
        return tenSanbay;
    }

    public void setTenSanbay(String tenSanbay) {
        this.tenSanbay = tenSanbay;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Thanhpho getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(Thanhpho thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

}
