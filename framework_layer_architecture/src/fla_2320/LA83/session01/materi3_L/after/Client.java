package fla_2320.LA83.session01.materi3_L.after;


class Client {

    public static void main(String[] args) {

        System.out.println("***A demo that follows the LSP.***\n");
        PaymentHelper helper = new PaymentHelper();

        // Instantiating two registered users.
        RegisteredUserPayment robin = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jack = new RegisteredUserPayment("Jack");
        // Instantiating a guest user's payment.
        GuestUserPayment guestUser1 = new GuestUserPayment();

        // Consolidating the previous payment's info to the helper.
        helper.addPreviousPayment(robin);
        helper.addPreviousPayment(jack);

        // Consolidating new payment requests to the helper.        
        helper.addNewPayment(robin);
        helper.addNewPayment(jack);
        helper.addNewPayment(guestUser1);

        // Retrieve all the previous payments
        // of registered users.
        helper.showPreviousPayments();

        // Process all new payment requests
        // from all users.
        helper.processNewPayments();


    }

}
