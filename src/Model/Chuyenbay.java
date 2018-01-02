/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author PRINCE D. TOAD
 */
public class Chuyenbay {
    private String maChuyenbay;
    private Date ngayBay;
    private Time gioDi;
    private Time gioDen;
    private Maybay maybay;
    private Changbay changbay;

    public Chuyenbay() {
    }

    public String getMaChuyenbay() {
        return maChuyenbay;
    }

    public void setMaChuyenbay(String maChuyenbay) {
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

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    @Override
    public String toString() {
        return maChuyenbay; //To change body of generated methods, choose Tools | Templates.
    }

    
}
