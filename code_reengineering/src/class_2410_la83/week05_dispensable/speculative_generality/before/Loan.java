package class_2410_la83.week05_dispensable.speculative_generality.before;

public class Loan {
    private double bunga;
    private int pokok, durasi;

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    public int getPokok() {
        return pokok;
    }

    public void setPokok(int pokok) {
        this.pokok = pokok;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void caraPinjam() {
        hitungAngsuran();
    }

    public double hitungAngsuran() {
        return pokok + ((1 / 365 * pokok * bunga) / durasi);
    }

    // speculative generality (requirement hanya sebatas hitung angsuran)
    public double hitungPenalti() {
        return 0;
    }
}
