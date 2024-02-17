package fla_2320.LA83.session01.materi3_L.after;

import java.util.ArrayList;
import java.util.List;

class PaymentHelper {
    List<PreviousPayment> previousPayments = new ArrayList<PreviousPayment>();
    List<NewPayment> newPayments = new ArrayList<NewPayment>();

    public void addPreviousPayment(PreviousPayment previousPayment) {
        previousPayments.add(previousPayment);
    }

    public void addNewPayment(NewPayment newPaymentRequest) {
        newPayments.add(newPaymentRequest);
    }

    public void showPreviousPayments() {
        for (PreviousPayment payment : previousPayments) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }

    public void processNewPayments() {
        for (NewPayment payment : newPayments) {
            payment.newPayment();
            System.out.println("***********");
        }
    }

}
