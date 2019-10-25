package com.example.generics.test;

import java.util.List;

public class ShowClass<D> implements ShowInterface<D> {
    @Override
    public D show(D d) {
        return d;
    }

}

