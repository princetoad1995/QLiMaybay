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
public class Chongoi {
    private int maChongoi;
    private HangVe hangVe;

    public Chongoi() {
    }

    public Chongoi(int maChongoi, HangVe hangVe) {
        this.maChongoi = maChongoi;
        this.hangVe = hangVe;
    }

    public int getMaChongoi() {
        return maChongoi;
    }

    public void setMaChongoi(int maChongoi) {
        this.maChongoi = maChongoi;
    }

    public HangVe getHangVe() {
        return hangVe;
    }

    public void setHangVe(HangVe hangVe) {
        this.hangVe = hangVe;
    }

}
