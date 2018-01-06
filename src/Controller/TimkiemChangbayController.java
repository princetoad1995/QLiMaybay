/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Changbay;
import Model.Sanbay;
import Model.Thanhpho;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface TimkiemChangbayController {
    public Changbay timkiemChangbay(int maChangbay);
    
    public List<Thanhpho> getListThanhpho();
    
    public List<Sanbay> getListSanbayTuThanhPho(int maThanhpho);
    
    public Sanbay getSanbay(int maSanbay);
    
    public void suaChangbay(Changbay cb);
    
    public void xoaChangbay(int maChangbay);
}
