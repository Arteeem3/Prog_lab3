import Objects.Alive;
import Objects.Place;
import Objects.Thing;
import Enums.*;

public class Tale {
    static Alive baby = new Alive("Малыш", ActionEnum.Nothing);
    static Alive betan = new Alive("Бетан", ActionEnum.Nothing);
    static Alive bosse = new Alive("Боссе", ActionEnum.Nothing);
    static Alive dad = new Alive("Папа", ActionEnum.Nothing);
    static Alive mom = new Alive("Мама", ActionEnum.Nothing);
    static Thing golubtzi = new Thing("Голубцы", ActionEnum.Nothing);

    static Place floor = new Place(PlaceEnum.Floor);
    static Place roof = new Place(PlaceEnum.FromRoof);
    static Place table = new Place(PlaceEnum.Table);

    static public void telltale() {
        baby.setAction(ActionEnum.CameBack);
        System.out.println(baby + " " + roof);

        baby.setAction(ActionEnum.Silent);
        System.out.println(baby);

        mom.setAction(ActionEnum.IsntHappy);
        System.out.println(mom);

        baby.setAction(ActionEnum.Thought);
        System.out.println(baby);

        mom.setAction(ActionEnum.CalledOnDinner);
        System.out.println(mom);

        mom.setAction(ActionEnum.Sit);
        System.out.println(mom + " " + table);

        dad.setAction(ActionEnum.Sit);
        System.out.println(dad + " " + table);

        bosse.setAction(ActionEnum.Sit);
        System.out.println(bosse + " " + table);

        betan.setAction(ActionEnum.Sit);
        System.out.println(betan + " " + table);

        baby.setAction(ActionEnum.Sit);
        System.out.println(baby + " " + table);

        golubtzi.setAction(ActionEnum.Dinner);
        System.out.println(golubtzi);

        baby.setAction(ActionEnum.LovesUnhealthy);
        System.out.println(baby);

        baby.setAction(ActionEnum.Unwrapped);
        System.out.println(baby);

        baby.setAction(ActionEnum.ThrewAway);
        System.out.println(baby + " " + floor);
    }

}