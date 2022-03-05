package brokenrobotgame.model.characteristics;

import brokenrobotgame.model.GameField;
import brokenrobotgame.model.events.RobotActionEvent;
import brokenrobotgame.model.events.RobotActionListener;
import brokenrobotgame.model.navigation.CellPosition;

import java.awt.*;
import java.util.EventObject;

public class Smoke extends AbstractCharacteristic
{
    public Smoke (GameField field, int valu)   {
        super(field, valu);
    }

    @Override
    public Color drawColor() {
        return new Color(176,176,176,8);
    }

    @Override
    public String drawName() {
        return value();
    }

    @Override
    public void update(EventObject event)
    {
        if(value()>0)
            setValue(value()-1);
    }

    public class SmokeDecreases implements RobotActionListener
    {
        @Override
        public void robotMadeMove(RobotActionEvent ee)
        {

                update(ee);
        }
    }
}
