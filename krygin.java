package brokenrobotgame.model.events;
// 1
import java.util.EventObject;
// 2
public class RobotActionEvent extends EventObject {
    public RobotActionEvent(Object source) { 
        super(source); // 5
    } 
} 
// 3