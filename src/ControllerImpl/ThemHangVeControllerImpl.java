/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.ThemHangVeController;
import DAO.ChuyenbayDAO;
import DAO.HangVeDAO;
import DAOImpl.ChuyenbayDAOImpl;
import DAOImpl.HangVeDAOImpl;
import Model.Chuyenbay;
import Model.GiaHangVe;
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
        HangVeDAO hangveDAO = new HangVeDAOImpl();
        return hangveDAO.kiemtraMaChuyenbay(maChuyenbay);
    }

    @Override
     public void themGiaHangVe(GiaHangVe giaHV) {
         HangVeDAO hvDAO = new HangVeDAOImpl();
         hvDAO.themGiaHangVe(giaHV);
    }
    
}
