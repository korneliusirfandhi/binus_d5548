package fla_2320.LA83.session01.materi4_I.before;

interface Fax {
    void faxType();
}

class LanFax implements Fax {
    @Override
    public void faxType() {
        System.out.println("Using lan fax to send the fax.");

    }
}

class EFax implements Fax {
    @Override
    public void faxType() {
        System.out.println("Using internet fax(efax) to send the fax.");
    }
}