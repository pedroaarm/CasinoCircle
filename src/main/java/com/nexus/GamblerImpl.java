package com.nexus;

class GamblerImpl implements Gambler {
    private int id;

    GamblerImpl(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
