/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Changbay;
import Model.HangVe;
import Model.Maybay;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface LenLichController {
    public List<Changbay> getListChangbay();
    public List<Maybay> getListMaybay();
}
