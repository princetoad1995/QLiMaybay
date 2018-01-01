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
public class Maybay {
    private int maMaybay;
    private String tenMaybay;
    private String mota;

    public Maybay() {
    }

    public Maybay(int maMaybay, String tenMaybay, String mota) {
        this.maMaybay = maMaybay;
        this.tenMaybay = tenMaybay;
        this.mota = mota;
    }

    public int getMaMaybay() {
        return maMaybay;
    }

    public void setMaMaybay(int maMaybay) {
        this.maMaybay = maMaybay;
    }

    public String getTenMaybay() {
        return tenMaybay;
    }

    public void setTenMaybay(String tenMaybay) {
        this.tenMaybay = tenMaybay;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return tenMaybay; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
