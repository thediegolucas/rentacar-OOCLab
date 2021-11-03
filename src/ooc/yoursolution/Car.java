import java.util.HashMap;
import java.util.Map;
import ooc.enums.*;

package ooc.yoursolution;

/**
 *
 * @author marce
 */
public class Car implements CarInterface {

    private int id;
    private Make make;
    private double rate;
    private Map<Month, Boolean[]> map;

    public Car(int id, Make make, double rate) {
        this.id = id;
        this.make = make;
        this.rate = rate;
        createAvailability();
    }
