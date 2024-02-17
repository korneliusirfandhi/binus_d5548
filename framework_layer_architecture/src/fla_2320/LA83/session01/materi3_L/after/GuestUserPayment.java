package fla_2320.LA83.session01.materi3_L.after;

class GuestUserPayment implements NewPayment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        //Some code, if any
    }
}