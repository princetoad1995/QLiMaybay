/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.HangVeDAO;
import Model.GiaHangVe;
import Model.HangVe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class HangVeDAOImpl extends BaseDAO implements HangVeDAO{

    @Override
    public List<HangVe> getListHangVe() {
        List<HangVe> list = new ArrayList<>();
        String sql = "SELECT * FROM tblHangVe";
        try {
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                HangVe hv = new HangVe();
                hv.setMaHangVe(rs.getInt("maHangVe"));
                hv.setTenHangVe(rs.getString("tenHangVe"));
                hv.setMota(rs.getString("mota"));
                list.add(hv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }

    @Override
    public boolean kiemtraMaChuyenbay(String maChuyenbay) {
        boolean check = false;
        String sql = "SELECT * FROM tblGiaHangVe WHERE maChuyenbay = '" 
                + maChuyenbay + "'";
        
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return check;
    }

    @Override
    public void themGiaHangVe(GiaHangVe giaHV) {
        String sql = "INSERT INTO tblGiaHangVe VALUES ("
                + giaHV.getHangVe().getMaHangVe() + ", '"
                + giaHV.getChuyenBay().getMaChuyenbay() + "', "
                + giaHV.getGiaHangVe() + ", "
                + giaHV.getSoluong() + ")";
        
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(HangVeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
    
}
