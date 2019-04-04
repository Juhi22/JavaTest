public abstract class telescope {

    private int diameter;

    private int focalLength;

    public telescope(int diameter, int focalLength) {
        this.diameter = diameter;
        this.focalLength = focalLength;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    @Override
    public String toString() {
        return "telescope{" +
                "diameter=" + diameter +
                ", focalLength=" + focalLength +
                '}';
    }
}
