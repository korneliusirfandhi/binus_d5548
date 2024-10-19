package class_2410_lb83.week05_dispensable.speculative_generality.after;

public class Loan {
    private double bunga, pokok, durasi;

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    public double getPokok() {
        return pokok;
    }

    public void setPokok(double pokok) {
        this.pokok = pokok;
    }

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    public double hitungAngsuran() {
        return pokok + ((1 / 365 * pokok * bunga) / durasi);
    }

}
