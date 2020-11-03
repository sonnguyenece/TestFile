import java.util.HashMap;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return 31+color.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            return this.color.equals(((Apple) obj).color);
        }
        return false;
    }
}