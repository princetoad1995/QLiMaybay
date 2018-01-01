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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ChangbayDAOImpl extends BaseDAO implements ChangbayDAO{

    @Override
    public Changbay getChangbay(int maChangbay) {
        Changbay cb = new Changbay();
        String sql = "SELECT * FROM tblChangbay WHERE maChangbay = " + maChangbay;
        try {
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                cb.setMaChangbay(rs.getInt("maChangbay"));
                Sanbay sb = new Sanbay();
                sb.setMaSanbay(rs.getInt("maSanbayDi"));
                cb.setSanbayDi(sb);
                sb.setMaSanbay(rs.getInt("maSanbayDen"));
                cb.setSanbayDen(sb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cb;
    }

    @Override
    public void themChangbay(Changbay cb) {
        String sql = "INSERT INTO tblChangbay VALUES ("
                + cb.getSanbayDi().getMaSanbay()+ ", "
                + cb.getSanbayDen().getMaSanbay()+ ")";
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
    
}
