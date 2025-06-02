import java.util.ArrayList;
import java.util.List;

// Main class
public class SessionManager {
    public static void main(String[] args) {
        // Create instances
        CanBeClosed browser = new MyBrowser();
        CanBeClosed file = new MyFile();

        // Add to list
        List<CanBeClosed> resources = new ArrayList<>();
        resources.add(browser);
        resources.add(file);

        // Lambda implementation of SessionCloser
        SessionCloser closer = list -> list.forEach(CanBeClosed::close);

        // Execute session closing
        closer.closeSession(resources);
    }
}

// Interface
interface CanBeClosed {
    void close();
}

// Browser implementation
class MyBrowser implements CanBeClosed {
    public void close() {
        System.out.println("Browser closed");
    }
}

// File implementation
class MyFile implements CanBeClosed {
    public void close() {
        System.out.println("File closed");
    }
}

// Functional interface
@FunctionalInterface
interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
