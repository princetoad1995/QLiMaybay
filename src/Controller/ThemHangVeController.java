/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Chuyenbay;
import Model.GiaHangVe;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface ThemHangVeController {
    public List<Chuyenbay> getListChuyenbay();
    public boolean kiemtraMaChuyenbay(String maChuyenbay);
    public void themGiaHangVe(GiaHangVe giaHV);
}
