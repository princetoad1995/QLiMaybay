/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.ThemChangbayController;
import DAO.ChangbayDAO;
import DAO.SanbayDAO;
import DAO.ThanhphoDAO;
import DAOImpl.ChangbayDAOImpl;
import DAOImpl.SanbayDAOImpl;
import DAOImpl.ThanhphoDAOImpl;
import Model.Changbay;
import Model.Sanbay;
import Model.Thanhpho;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ThemChangbayControllerImpl implements ThemChangbayController{
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
    public void themChangbay(Changbay cb) {
        ChangbayDAO cbDAO = new ChangbayDAOImpl();
        cbDAO.themChangbay(cb);
    }

}
