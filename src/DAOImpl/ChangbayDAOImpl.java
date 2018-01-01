/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ChangbayDAO;
import Model.Changbay;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void themChangbay(Changbay cb) {
        String sql = "INSERT INTO tblChangbay VALUES ("
                + cb.getMaSanbayDi() + ", "
                + cb.getMaSanbayDen() + ")";
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
