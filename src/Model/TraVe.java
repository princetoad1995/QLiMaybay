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
public class TraVe {
    private int maTraVe;
    private int maVe;
    private int tienPhat;

    public TraVe() {
    }

    public TraVe(int maTraVe, int maVe, int tienPhat) {
        this.maTraVe = maTraVe;
        this.maVe = maVe;
        this.tienPhat = tienPhat;
    }

    public int getMaTraVe() {
        return maTraVe;
    }

    public void setMaTraVe(int maTraVe) {
        this.maTraVe = maTraVe;
    }

    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }
    
    
}
