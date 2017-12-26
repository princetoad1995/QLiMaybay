/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HangVe;
import Model.Sanbay;
import Model.Thanhpho;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface LenLichController {
    public List<Thanhpho> getListThanhpho();
    public List<Sanbay> getListSanbayTuThanhPho(int maThanhpho);
    public List<HangVe> getListHangVe();
}
