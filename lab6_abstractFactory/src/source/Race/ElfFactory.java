package source.Race;

import source.Stats;

public class ElfFactory implements RaceAbstractFactory{

    @Override
    public Elf create(){
        return new Elf(new Stats(0, 0, 0, 0, 0, 0));
    }
}
