/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.DangNhapController;
import DAO.NguoiDAO;
import DAOImpl.NguoiDAOImpl;

/**
 *
 * @author PRINCE D. TOAD
 */
public class DangnhapControllerImpl implements DangNhapController{

    @Override
    public int dangnhap(String username, String password) {
        NguoiDAO nguoiDAO = new NguoiDAOImpl();
        return nguoiDAO.dangnhap(username, password);
    }
    
}
