/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ThanhphoDAO;
import Model.Thanhpho;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ThanhphoDAOImpl extends BaseDAO implements ThanhphoDAO {

    @Override
    public List<Thanhpho> getListThanhpho() {
        List<Thanhpho> list = new ArrayList<>();
        String sql = "SELECT * FROM tblThanhpho";
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Thanhpho tp = new Thanhpho();
                tp.setMaThanhpho(rs.getInt("maThanhpho"));
                tp.setTenThanhpho(rs.getString("tenThanhpho"));
                list.add(tp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanhphoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ThanhphoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    @Override
    public Thanhpho searchThanhpho(int id) {
        Thanhpho tp = new Thanhpho();
        String sql = "SELECT * FROM tblThanhpho WHERE maThanhpho = " + id;
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tp.setMaThanhpho(rs.getInt("maThanhpho"));
                tp.setTenThanhpho(rs.getString("tenThanhpho"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanhphoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ThanhphoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return tp;
    }

}
