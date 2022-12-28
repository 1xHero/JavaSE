package com.lab8dndfx.race;

import com.lab8dndfx.Stats;

public class DwarfFactory implements RaceAbstractFactory{
    @Override
    public Dwarf create(){
        return new Dwarf(new Stats(0, 0, 0, 0, 0, 0));
    }
}
