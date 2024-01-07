package Enums;

public enum ActionEnum {
    Nothing(""),
    CameBack("вернулся"),
    Silent("умолчал обо всём"),
    IsntHappy("невесёлая"),
    Thought("долго ломал себе голову"),
    CalledOnDinner("позвала всех обедать"),
    Sit("сел(а)"),
    Dinner("на обед"),
    LovesUnhealthy("любит только вредное"),
    Unwrapped("развернул голубцы"),
    ThrewAway("выбросил капусту");

    private final String action;

    ActionEnum(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public String toString() {
        return getAction();
    }

}