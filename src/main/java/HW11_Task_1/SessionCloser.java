package HW11_Task_1;

import java.awt.*;
import java.util.List;

public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
