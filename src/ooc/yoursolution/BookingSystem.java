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
        
        //Create an array list to store the cars from the txt document
        String st, name;
        List<Car> cars = new ArrayList<>();
        name = in.readLine();

        //While loop to separate information in the txt document
        while ((st = in.readLine()) != null) {
            String s[] = st.split(":");

            Make make = Make.valueOf(s[0]);
            double rate = Double.parseDouble(s[1]);
            int numCars = Integer.parseInt(s[2]);
            
            //For loop to check the number of cars
            for (int i=0; i<numCars; i++) {
                Car car = new Car(i, make, rate);
                cars.add(car);
            }
        }

        RentACarInterface rentACarInterface = new RentACar(cars, name);
        return rentACarInterface;
    }
}