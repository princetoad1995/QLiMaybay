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
public class GiaHangVe {
    private int maHangVe;
    private int maChuyenBay;
    private int giaHangVe;

    public GiaHangVe() {
    }

    public GiaHangVe(int maHangVe, int maChuyenBay, int giaHangVe) {
        this.maHangVe = maHangVe;
        this.maChuyenBay = maChuyenBay;
        this.giaHangVe = giaHangVe;
    }

    public int getMaHangVe() {
        return maHangVe;
    }

    public void setMaHangVe(int maHangVe) {
        this.maHangVe = maHangVe;
    }

    public int getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(int maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getGiaHangVe() {
        return giaHangVe;
    }

    public void setGiaHangVe(int giaHangVe) {
        this.giaHangVe = giaHangVe;
    }
    
    
}
