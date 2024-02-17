package fla_2320.LA83.session01.materi4_I.before;

class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a document.");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }

}
