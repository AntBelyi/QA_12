package hw_11;

import java.util.List;

@FunctionalInterface

public interface SessionCloser  {
    void closeSession(List<CanBeCloused> entities);
}