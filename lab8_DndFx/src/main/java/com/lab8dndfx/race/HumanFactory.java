package com.lab8dndfx.race;
import com.lab8dndfx.Stats;
public class HumanFactory implements RaceAbstractFactory{

    @Override
    public Human create(){
        return new Human(new Stats(0, 0, 0, 0, 0, 0));
    }
}