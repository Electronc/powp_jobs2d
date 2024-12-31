package edu.kis.powp.jobs2d.drivers.adapters;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class CustomLine extends AbstractLine {

    public CustomLine(float valueThickness, boolean isDotted, Color choiceColor) {
        thickness = valueThickness;
        dotted = isDotted;
        color = choiceColor;
    }

}
