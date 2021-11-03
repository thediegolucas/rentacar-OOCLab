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
import java.util.List;
import ooc.enums.*;

public class RentACar implements RentACarInterface {

    private List<Car> cars;
    private String name;

    public RentACar(List<Car> cars, String name) {
        this.cars = cars;
        this.name = name;
    }

    @Override
    public List getCars() {
        return cars;
    }

    @Override
    public void setCars(List cars) {
        this.cars = cars;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        int currentDay, flag;

        for (Car car : cars) {
            if (car.getMake().equals(make)) {
                flag = 0;
                currentDay = day;
                for (int i=0; i<lengthOfRent; i++) {
                    if (!car.isAvailable(month, currentDay++)) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    return true;
                }
            }
        }

        return false;
    }
