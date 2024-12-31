package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.constants.testFigureOption;
import edu.kis.powp.jobs2d.drivers.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommandFactory;


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
			case FIGURE_JANE_1:
				FiguresJane.figureScript(new AbstractDriverAdapter(driverManager.getCurrentDriver()));
				break;
			case FIGURE_CIRCLE:
				DriverCommand circle = ComplexCommandFactory.createCircle(driverManager.getCurrentDriver(),0,0,100);
				circle.execute();
				break;
			case FIGURE_RECTANGLE:
				DriverCommand rectangle = ComplexCommandFactory.createRectangle(driverManager.getCurrentDriver(),0,0,100,50);
				rectangle.execute();
				break;
			default:
				break;
		}
	}
}
