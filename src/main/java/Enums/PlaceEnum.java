package Enums;

public enum PlaceEnum {
    FromRoof("с крыши"),
    Table("за стол"),
    Floor("на пол");

    private final String place;

    PlaceEnum(String place) {
        this.place = place;
    }

    public String getPlace() {
        return this.place;
    }

    @Override
    public String toString() {
        return getPlace();
    }

}
