/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author fsr19
 */
public interface IAddress {
    String getStreetName();
    String getStreetNumber();
    String getZipCode();
    String getCountry();
    
    @Override
    String toString();
}
