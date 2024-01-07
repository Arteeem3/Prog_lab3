package AbstractClasses;

import Enums.ActionEnum;
import Interfaces.ActionInterface;
import Interfaces.NameInterface;


public abstract class Obj implements NameInterface, ActionInterface{

    protected String name;
    private ActionEnum action;

    public Obj(String name, ActionEnum actionEnum) {
        this.name = name;
        this.action = actionEnum;
    }

    public String getName() {
        return this.name;
    }

    public String getAction() {
        return this.action.toString();
    }

    public void setAction(ActionEnum actionEnum) {
        this.action = actionEnum;
    }

    @Override
    public String toString() {
        return getName() + " " + getAction();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return (this == o || hashCode() == o.hashCode());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
