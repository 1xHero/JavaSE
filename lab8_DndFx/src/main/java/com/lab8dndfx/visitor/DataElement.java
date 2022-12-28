package com.lab8dndfx.visitor;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap accept(DataElementsVisitor visitor);
}
