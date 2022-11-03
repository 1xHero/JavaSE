package source.Race;

import source.Stats;

public class HalflingFactory implements RaceAbstractFactory{

    @Override
    public Halfling create(){
        return new Halfling(new Stats(0, 0, 0, 0, 0, 0));
    }
}
