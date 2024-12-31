package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    public static DriverCommand createRectangle(Job2dDriver driver, int x, int y, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver,x,y));
        complexCommand.addCommand(new OperateToCommand(driver, x, y + height));
        complexCommand.addCommand(new OperateToCommand(driver,x + width, y + height));
        complexCommand.addCommand(new OperateToCommand(driver,x + width, y));
        complexCommand.addCommand(new OperateToCommand(driver,x, y));
        return complexCommand;
    }

    public static DriverCommand createCircle(Job2dDriver driver, int x, int y, int radius) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver,x,y));
        for (int i = 0; i < 360; i++) {
            complexCommand.addCommand(new OperateToCommand(driver, (int) (x + radius * Math.cos(Math.toRadians(i))), (int) (y + radius * Math.sin(Math.toRadians(i)))));
        }
        return complexCommand;
    }
}
