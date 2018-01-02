/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Changbay;
import java.util.List;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface ChangbayDAO {
    public Changbay getChangbay(int maChangbay);
    
    public void themChangbay(Changbay cb);
    
    public List<Changbay> getListChangbay();
}
