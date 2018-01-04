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
public class HangVe {
    private int maHangVe;
    private String tenHangVe;
    private String mota;

    public HangVe() {
    }

    public HangVe(int maHangVe, String tenHangVe, String mota) {
        this.maHangVe = maHangVe;
        this.tenHangVe = tenHangVe;
        this.mota = mota;
    }

    public int getMaHangVe() {
        return maHangVe;
    }

    public void setMaHangVe(int maHangVe) {
        this.maHangVe = maHangVe;
    }

    public String getTenHangVe() {
        return tenHangVe;
    }

    public void setTenHangVe(String tenHangVe) {
        this.tenHangVe = tenHangVe;
    }

       public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
}
