/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;

/**
 *
 * @author PRINCE D. TOAD
 */
public class Chuyenbay {
    private int maChuyenbay;
    private Time gioDi;
    private Time gioDen;
    private Maybay maybay;
    private Changbay changbay;

    public Chuyenbay() {
    }

    public int getMaChuyenbay() {
        return maChuyenbay;
    }

    public void setMaChuyenbay(int maChuyenbay) {
        this.maChuyenbay = maChuyenbay;
    }

    public Time getGioDi() {
        return gioDi;
    }

    public void setGioDi(Time gioDi) {
        this.gioDi = gioDi;
    }

    public Time getGioDen() {
        return gioDen;
    }

    public void setGioDen(Time gioDen) {
        this.gioDen = gioDen;
    }

    public Maybay getMaybay() {
        return maybay;
    }

    public void setMaybay(Maybay maybay) {
        this.maybay = maybay;
    }

    public Changbay getChangbay() {
        return changbay;
    }

    public void setChangbay(Changbay changbay) {
        this.changbay = changbay;
    }

}
