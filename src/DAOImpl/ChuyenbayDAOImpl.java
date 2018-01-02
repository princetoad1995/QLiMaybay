/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ChuyenbayDAO;
import Model.Changbay;
import Model.Chuyenbay;
import Model.Maybay;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ChuyenbayDAOImpl extends BaseDAO implements ChuyenbayDAO{

    @Override
    public void addChuyenbay(Chuyenbay cb) {
        String sql = "INSERT INTO tblChuyenbay VALUES ("
                + "'" + cb.getMaChuyenbay() + "', "
                + cb.getChangbay().getMaChangbay() + ", "
                + "'" + cb.getNgayBay() + "', "
                + "'" + cb.getGioDi() + "', "
                + "'" + cb.getGioDen() + "', "
                + cb.getMaybay().getMaMaybay() + ")";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChuyenbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean kiemtraMaChuyenbay(String maChuyenbay) {
        boolean check = false;
        String sql = "SELECT * FROM tblChuyenbay WHERE maChuyenbay = '" 
                + maChuyenbay + "'";
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return check;
    }

    @Override
    public List<Chuyenbay> getListChuyenbay() {
        List<Chuyenbay> listCB = new ArrayList<>();
        String sql = "SELECT * FROM tblChuyenbay";
        
        try {
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Chuyenbay cb = new Chuyenbay();
                cb.setMaChuyenbay(rs.getString("maChuyenbay"));
                Changbay changbay = new Changbay();
                changbay.setMaChangbay(rs.getInt("maChangbay"));
                cb.setChangbay(changbay);
                cb.setNgayBay(rs.getDate("ngayBay"));
                cb.setGioDi(rs.getTime("gioDi"));
                cb.setGioDen(rs.getTime("gioDen"));
                Maybay maybay = new Maybay();
                maybay.setMaMaybay(rs.getInt("maMaybay"));
                cb.setMaybay(maybay);
                
                listCB.add(cb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listCB;
    }
    
}
