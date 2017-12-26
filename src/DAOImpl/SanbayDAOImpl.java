/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.SanbayDAO;
import Model.Sanbay;
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
public class SanbayDAOImpl extends BaseDAO implements SanbayDAO{
    @Override
    public List<Sanbay> getListSanBayTuThanhPho(int maThanhpho) {
        List<Sanbay> list = new ArrayList<>();
        String sql = "SELECT * FROM tblSanbay WHERE maThanhpho = " + maThanhpho;
        try {
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Sanbay sb = new Sanbay();
                Thanhpho tp = new Thanhpho();
                sb.setMaSanbay(rs.getInt("maSanbay"));
                sb.setTenSanbay(rs.getString("tenSanbay"));
                sb.setDiachi(rs.getString("diachi"));
                tp.setMaThanhpho(rs.getInt("maThanhpho"));
                sb.setThanhpho(tp);
                sb.setMota(rs.getString("mota"));
                list.add(sb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SanbayDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
}
