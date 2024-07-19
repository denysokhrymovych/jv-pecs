package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private int bladeHeight;

    public Bulldozer() {
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(int bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
