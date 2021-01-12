package stalls;

import behaviours.ISecurity;
import people.Visitor;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return TRUE;
        }

        return FALSE;
    }
}
