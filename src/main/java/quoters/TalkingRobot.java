package quoters;

import aspects.aop.DatabaseRuntimeException;

public interface TalkingRobot {
    void talk() throws DatabaseRuntimeException;
}
