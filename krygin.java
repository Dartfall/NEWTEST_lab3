package brokenrobotgame.model.events;

import java.util.EventObject;
// 2
public class RobotActionEvent extends EventObject {
    public RobotActionEvent(Object source) { 
        super(source); // 5
    } 
} 
