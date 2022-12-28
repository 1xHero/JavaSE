package Race;

import Main.Stats;

public class ChampionFactory implements RaceAbstractFactory{

    @Override
    public Champion create(){
        return new Champion(new Stats(0, 0, 0, 0, 0, 0));
    }
}
