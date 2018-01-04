/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ChangbayDAO;
import Model.Changbay;
import Model.Sanbay;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ChangbayDAOImpl extends BaseDAO implements ChangbayDAO {

    @Override
    public Changbay getChangbay(int maChangbay) {
        Changbay cb = new Changbay();
        String sql = "SELECT * FROM tblChangbay WHERE maChangbay = " + maChangbay;
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cb.setMaChangbay(rs.getInt("maChangbay"));
                Sanbay sbDi = new Sanbay();
                Sanbay sbDen = new Sanbay();
                sbDi.setMaSanbay(rs.getInt("maSanbayDi"));
                cb.setSanbayDi(sbDi);
                sbDen.setMaSanbay(rs.getInt("maSanbayDen"));
                cb.setSanbayDen(sbDen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cb;
    }

    @Override
    public void themChangbay(Changbay cb) {
        String sql = "INSERT INTO tblChangbay VALUES ("
                + cb.getSanbayDi().getMaSanbay() + ", "
                + cb.getSanbayDen().getMaSanbay() + ")";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Changbay> getListChangbay() {
        List<Changbay> listCB = new ArrayList<>();
        String sql = "SELECT * FROM tblChangbay";

        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Changbay cb = new Changbay();
                cb.setMaChangbay(rs.getInt("maChangbay"));
                Sanbay sbDi = new Sanbay();
                Sanbay sbDen = new Sanbay();
                sbDi.setMaSanbay(rs.getInt("maSanbayDi"));
                cb.setSanbayDi(sbDi);
                sbDen.setMaSanbay(rs.getInt("maSanbayDen"));
                cb.setSanbayDen(sbDen);

                listCB.add(cb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return listCB;
    }

    @Override
    public Changbay timkiemChangbay(int maChangbay) {
        Changbay cb = new Changbay();
        String sql = "SELECT * FROM tblChangbay WHERE maChangbay = " + maChangbay;

        try {
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                cb.setMaChangbay(rs.getInt("maChangbay"));
                Sanbay sbDi = new Sanbay();
                Sanbay sbDen = new Sanbay();
                sbDi.setMaSanbay(rs.getInt("maSanbayDi"));
                cb.setSanbayDi(sbDi);
                sbDen.setMaSanbay(rs.getInt("maSanbayDen"));
                cb.setSanbayDen(sbDen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cb;
    }

    @Override
    public void suaChangbay(Changbay cb) {
        String sql = "UPDATE tblChangbay SET maSanbayDi = " + cb.getSanbayDi().getMaSanbay() 
                + " AND maSanbayDen = " + cb.getSanbayDen().getMaSanbay() + " "
                + "WHERE maChangbay = " + cb.getMaChangbay();
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void xoaChangbay(int maChangbay) {
        String sql = "DELETE FROM tblChangbay WHERE maChangbay = " + maChangbay;
        
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
