package Task;

import java.awt.*;

public class Enterprise {
    private String name;
    private Point location;

    public Enterprise(String name, Point location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String toString() {
        return "Enterprise: " + "\n" + "   Name: " + name + "\n" + "   Location: (" + location.x + ", " + location.y + ")";
    }
}
