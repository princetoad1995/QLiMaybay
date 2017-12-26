/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.NguoiDAO;
import Database.DBConnection;
import Model.HangVe;
import Model.Nguoi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class NguoiDAOImpl extends BaseDAO implements NguoiDAO {

    @Override
    public int dangnhap(String username, String password) {
        String sql = "SELECT * FROM tblNguoi WHERE taikhoan = '" + username 
                + "' AND matkhau = '" + password + "'";   
        Nguoi nguoi = new Nguoi();      
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                nguoi.setChucnang(rs.getInt("chucnang"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NguoiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return nguoi.getChucnang();
    }

}
