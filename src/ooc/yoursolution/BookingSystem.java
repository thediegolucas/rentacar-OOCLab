/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

/**
 *
 * @author diegolucas
 */

import java.io.BufferedReader;      // Imported packages
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.*;

public class BookingSystem implements BookingSystemInterface {
    
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        // Create an array list to store the cars
        String st, name;
        List<Car> cars = new ArrayList<>();
        name = in.readLine();

    }
}