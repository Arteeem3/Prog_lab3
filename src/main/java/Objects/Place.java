package Objects;

import Enums.PlaceEnum;
import Interfaces.NameInterface;

public class Place implements NameInterface {
    private final PlaceEnum place;

    public Place(PlaceEnum place) {
        this.place = place;
    }

    @Override
    public String getName() {
        return this.place.toString();
    }

    @Override
    public String toString() {
        return getName();
    }
}
