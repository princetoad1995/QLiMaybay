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
    private int maMaybay;
    private int maChangbay;

    public Chuyenbay() {
    }

    public Chuyenbay(int maChuyenbay, Time gioDi, Time gioDen, int maMaybay, int maChangbay) {
        this.maChuyenbay = maChuyenbay;
        this.gioDi = gioDi;
        this.gioDen = gioDen;
        this.maMaybay = maMaybay;
        this.maChangbay = maChangbay;
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

    public int getMaMaybay() {
        return maMaybay;
    }

    public void setMaMaybay(int maMaybay) {
        this.maMaybay = maMaybay;
    }

    public int getMaChangbay() {
        return maChangbay;
    }

    public void setMaChangbay(int maChangbay) {
        this.maChangbay = maChangbay;
    }
    
    
}
