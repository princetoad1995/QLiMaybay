/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.ThemHangVeController;
import DAO.ChuyenbayDAO;
import DAOImpl.ChuyenbayDAOImpl;
import Model.Chuyenbay;
import Model.HangVe;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ThemHangVeControllerImpl implements ThemHangVeController{

    @Override
    public List<Chuyenbay> getListChuyenbay() {
        ChuyenbayDAO cbDAO = new ChuyenbayDAOImpl();
        return cbDAO.getListChuyenbay();
    }

    @Override
    public boolean kiemtraMaChuyenbay(String maChuyenbay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void themHangVe(HangVe hv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
