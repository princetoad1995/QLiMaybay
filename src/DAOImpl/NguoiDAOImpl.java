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
        String sql = "SELECT * FROM tblNguoi2 WHERE taikhoan = " + username;
//                + " AND matkhau = " + password;
        Connection conn2 = DBConnection.getConnection();
        int test = 0;
        Nguoi nguoi = new Nguoi();
        
        try {
            Statement st = conn2.createStatement();
            ResultSet rs2 = st.executeQuery(sql);
//            rs2 = stmt.executeQuery(sql);
            while (rs2.next()) {
                System.out.println("1");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn2.close();
            } catch (SQLException ex) {
                Logger.getLogger(NguoiDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return test;
    }

}
