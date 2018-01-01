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
    private Sanbay sanbayDi;
    private Sanbay sanbayDen;

    public Changbay() {
    }

    public Changbay(int maChangbay, Sanbay sanbayDi, Sanbay sanbayDen) {
        this.maChangbay = maChangbay;
        this.sanbayDi = sanbayDi;
        this.sanbayDen = sanbayDen;
    }

    public int getMaChangbay() {
        return maChangbay;
    }

    public void setMaChangbay(int maChangbay) {
        this.maChangbay = maChangbay;
    }

    public Sanbay getSanbayDi() {
        return sanbayDi;
    }

    public void setSanbayDi(Sanbay sanbayDi) {
        this.sanbayDi = sanbayDi;
    }

    public Sanbay getSanbayDen() {
        return sanbayDen;
    }

    public void setSanbayDen(Sanbay sanbayDen) {
        this.sanbayDen = sanbayDen;
    }

    

    @Override
    public String toString() {
        return maChangbay + "";
    }
}
