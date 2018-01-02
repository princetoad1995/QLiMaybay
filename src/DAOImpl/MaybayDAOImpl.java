/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.MaybayDAO;
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
public class MaybayDAOImpl extends BaseDAO implements MaybayDAO{

    @Override
    public List<Maybay> getListMaybay() {
        List<Maybay> listMB = new ArrayList<>();
        String sql = "SELECT * FROM tblMaybay";
        
        try {
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Maybay mb = new Maybay();
                mb.setMaMaybay(rs.getInt("maMaybay"));
                mb.setTenMaybay(rs.getString("tenMaybay"));
                mb.setMota(rs.getString("mota"));
                
                listMB.add(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaybayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listMB;
    }
    
}
