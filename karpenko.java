package brokenrobotgame.model.events;

import java.util.EventListener;

//add new action

//add do somthing

public interface RobotActionListener extends EventListener {
    void robotMadeMove(RobotActionEvent e);
}
