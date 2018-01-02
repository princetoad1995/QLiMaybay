/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ChuyenbayDAO;
import Model.Chuyenbay;
import java.sql.SQLException;
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
    
}
