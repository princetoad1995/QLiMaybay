/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.LenLichController;
import DAO.HangVeDAO;
import DAO.SanbayDAO;
import DAO.ThanhphoDAO;
import DAOImpl.HangVeDAOImpl;
import DAOImpl.SanbayDAOImpl;
import DAOImpl.ThanhphoDAOImpl;
import Model.HangVe;
import Model.Sanbay;
import Model.Thanhpho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public class LenLichControllerImpl implements LenLichController{
    
    @Override
    public List<Thanhpho> getListThanhpho() {
        ThanhphoDAO tpDAO = new ThanhphoDAOImpl();
        return tpDAO.getListThanhpho();
    }

    @Override
    public List<Sanbay> getListSanbayTuThanhPho(int maThanhpho) {
        SanbayDAO sbDAO = new SanbayDAOImpl();
        return sbDAO.getListSanBayTuThanhPho(maThanhpho);
    }

    @Override
    public List<HangVe> getListHangVe() {
        HangVeDAO hvDAO = new HangVeDAOImpl();
        return hvDAO.getListHangVe();
    }
    
}
