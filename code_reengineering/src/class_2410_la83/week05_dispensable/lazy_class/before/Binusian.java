package class_2410_la83.week05_dispensable.lazy_class.before;

public class Binusian {
    private String binusianId, nim;

    public Binusian() {

    }

    public Binusian(String binusianId) {
        this.binusianId = binusianId;
    }

    public String getBinusianId() {
        return binusianId;
    }

    public void setBinusianId(String binusianId) {
        this.binusianId = binusianId;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean validateBinusianId() {
        return BinusianValidator.validate(binusianId);
    }
}