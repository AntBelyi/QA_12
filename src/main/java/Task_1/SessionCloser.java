package Task_1;

import java.util.List;

public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
