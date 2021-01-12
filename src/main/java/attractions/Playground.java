package attractions;

import behaviours.ISecurity;
import people.Visitor;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
            return TRUE;
        }

        return FALSE;
    }
}
