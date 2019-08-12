
package com.company.simulator.vechicles;

import com.company.weather.Coordinates;

import java.util.UUID;

public class Aircraft {
    protected  long id = 1;
    protected String name;
    protected Coordinates coordinates;
    //private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.id = nextId();
        this.name = name;
        this.coordinates = coordinates;

    }

    private long nextId() {
        long val = -1;
        do {
            val = UUID.randomUUID().getMostSignificantBits();
        }
        while (val < 0);
        return val;
    }

}
