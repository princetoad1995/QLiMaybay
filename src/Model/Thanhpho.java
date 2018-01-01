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
public class Thanhpho {
    private int maThanhpho;
    private String tenThanhpho;

    public Thanhpho() {
    }

    public Thanhpho(int maThanhpho, String tenThanhpho) {
        this.maThanhpho = maThanhpho;
        this.tenThanhpho = tenThanhpho;
    }

    public int getMaThanhpho() {
        return maThanhpho;
    }

    public void setMaThanhpho(int maThanhpho) {
        this.maThanhpho = maThanhpho;
    }

    public String getTenThanhpho() {
        return tenThanhpho;
    }

    public void setTenThanhpho(String tenThanhpho) {
        this.tenThanhpho = tenThanhpho;
    }

    @Override
    public String toString() {
        return tenThanhpho; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
