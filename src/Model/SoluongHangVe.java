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
public class SoluongHangVe {
    private int maChuyenbay;
    private int maHangVe;
    private int soluong;

    public SoluongHangVe() {
    }

    public SoluongHangVe(int maChuyenbay, int maHangVe, int soluong) {
        this.maChuyenbay = maChuyenbay;
        this.maHangVe = maHangVe;
        this.soluong = soluong;
    }

    public int getMaChuyenbay() {
        return maChuyenbay;
    }

    public void setMaChuyenbay(int maChuyenbay) {
        this.maChuyenbay = maChuyenbay;
    }

    public int getMaHangVe() {
        return maHangVe;
    }

    public void setMaHangVe(int maHangVe) {
        this.maHangVe = maHangVe;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
