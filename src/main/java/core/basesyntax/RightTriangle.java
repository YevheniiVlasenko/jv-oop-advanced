package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawer{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }


    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
            + "area: " + getArea() + " sq. units, "
            + "first leg: " + firstLeg + " units, "
            + "second leg: " + secondLeg + " units, "
            + "color: " + color
        );
    }
}