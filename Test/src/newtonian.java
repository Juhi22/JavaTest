public class newtonian extends telescope {

    private boolean needToCollimate;


    public newtonian(int diameter, int focalLength, boolean needToCollimate) {
        super(diameter, focalLength);
        this.needToCollimate = needToCollimate;
    }

    public boolean isNeedToCollimate() {
        return needToCollimate;
    }

    public void setNeedToCollimate(boolean needToCollimate) {
        this.needToCollimate = needToCollimate;
    }
}
