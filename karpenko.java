package brokenrobotgame.model.events;

import java.util.EventListener;

public interface RobotActionListener extends EventListener {
    void robotMadeMove(RobotActionEvent e);

    public int newAction() { return doSmth; }

    public int doSmth() { return 4; }
}
