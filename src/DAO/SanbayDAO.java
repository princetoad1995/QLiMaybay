/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Sanbay;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface SanbayDAO {
    public List<Sanbay> getListSanBayTuThanhPho(int maThanhpho);
    
    public Sanbay getSanbay(int maSanbay);
}
