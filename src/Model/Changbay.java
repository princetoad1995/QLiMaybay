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
public class Changbay {
    private int maChangbay;
    private int maSanbayDi;
    private int maSanbayDen;
    private String mota;

    public Changbay() {
    }

    public Changbay(int maChangbay, int maSanbayDi, int maSanbayDen, String mota) {
        this.maChangbay = maChangbay;
        this.maSanbayDi = maSanbayDi;
        this.maSanbayDen = maSanbayDen;
        this.mota = mota;
    }

    public int getMaChangbay() {
        return maChangbay;
    }

    public void setMaChangbay(int maChangbay) {
        this.maChangbay = maChangbay;
    }

    public int getMaSanbayDi() {
        return maSanbayDi;
    }

    public void setMaSanbayDi(int maSanbayDi) {
        this.maSanbayDi = maSanbayDi;
    }

    public int getMaSanbayDen() {
        return maSanbayDen;
    }

    public void setMaSanbayDen(int maSanbayDen) {
        this.maSanbayDen = maSanbayDen;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
}
