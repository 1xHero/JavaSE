package source.Race;

import source.Stats;

public abstract class CharacterRace {

    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();
}
