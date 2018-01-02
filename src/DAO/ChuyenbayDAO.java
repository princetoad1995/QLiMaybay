/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Chuyenbay;

/**
 *
 * @author PRINCE D. TOAD
 */
public interface ChuyenbayDAO {
    public void addChuyenbay(Chuyenbay cb);
    
    public boolean kiemtraMaChuyenbay(String maChuyenbay);
}
