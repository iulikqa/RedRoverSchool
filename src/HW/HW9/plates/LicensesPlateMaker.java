package HW.HW9.plates;

public class LicensesPlateMaker {
    private String prefix;

    private int lastUsedNumer;

    public LicensesPlateMaker(String prefix, int lastUsedNumer) {
        this.prefix = prefix;
        this.lastUsedNumer = lastUsedNumer;
    }

    public LicensePlate makeNextPlate() {
        int nextNumer = lastUsedNumer + 1;
        lastUsedNumer = nextNumer;
        return new LicensePlate(prefix + "-" + lastUsedNumer);
    }
}
