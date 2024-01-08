package Objects;

//Создаём класс со всеми неживыми объектами

import AbstractClasses.Obj;
import Enums.ActionEnum;

public class Thing extends Obj {
    public Thing(String name, ActionEnum actionEnum){
        super(name, actionEnum);
    }
}
