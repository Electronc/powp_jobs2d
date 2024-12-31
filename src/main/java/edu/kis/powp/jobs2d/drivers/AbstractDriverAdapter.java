package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDriverAdapter extends AbstractDriver implements Job2dDriver {
    private final Job2dDriver abstractDriver;

    public AbstractDriverAdapter(Job2dDriver abstractDriver) {
        super(0, 0);
        this.abstractDriver = abstractDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        abstractDriver.operateTo(x, y);
    }

    @Override
    public String toString() {
        return abstractDriver.toString();
    }
}
