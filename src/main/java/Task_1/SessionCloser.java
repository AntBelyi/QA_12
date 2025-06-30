package Task_1;

import java.util.List;

@FunctionalInterface

public interface SessionCloser  {
    void closeSession(List<CanBeCloused> entities);
}