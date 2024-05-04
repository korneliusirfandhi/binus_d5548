package fla_2320.LA83.session08.decoratorpattern;

// membuat sebuah perumahan, dimana nantinya kategori perumahan mewah
// harga rumah menyesuaikan sesuai dengan fasilitas rumahnya
public abstract class Home {
    public double basePrice, additionalCost;

    public Home() {
        this.basePrice = 100000.0;
        this.additionalCost = 0.0;
    }

    public abstract double getPrice();
}
