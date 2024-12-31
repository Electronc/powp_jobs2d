package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.constants.testFigureOption;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private testFigureOption testFigureOption;

	public SelectTestFigureOptionListener(DriverManager driverManager, testFigureOption testFigureOption) {
		this.driverManager = driverManager; this.testFigureOption = testFigureOption;}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (testFigureOption) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
				break;
		}
	}
}
