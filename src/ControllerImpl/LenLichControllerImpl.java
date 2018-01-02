/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.LenLichController;
import DAO.ChangbayDAO;
import DAO.ChuyenbayDAO;
import DAO.MaybayDAO;
import DAOImpl.ChangbayDAOImpl;
import DAOImpl.ChuyenbayDAOImpl;
import DAOImpl.MaybayDAOImpl;
import Model.Changbay;
import Model.Chuyenbay;
import Model.Maybay;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public class LenLichControllerImpl implements LenLichController{

    @Override
    public List<Changbay> getListChangbay() {
        ChangbayDAO cbDAO = new ChangbayDAOImpl();
        return cbDAO.getListChangbay();
    }

    @Override
    public List<Maybay> getListMaybay() {
        MaybayDAO mbDAO = new MaybayDAOImpl();
        return mbDAO.getListMaybay();
    }

    @Override
    public boolean kiemtraMaChuyenbay(String maChuyenbay) {
        ChuyenbayDAO cbDAO = new ChuyenbayDAOImpl();
        return cbDAO.kiemtraMaChuyenbay(maChuyenbay);
    }

    @Override
    public void addChuyenbay(Chuyenbay cb) {
        ChuyenbayDAO cbDAO = new ChuyenbayDAOImpl();
        cbDAO.addChuyenbay(cb);
    }
    
}
