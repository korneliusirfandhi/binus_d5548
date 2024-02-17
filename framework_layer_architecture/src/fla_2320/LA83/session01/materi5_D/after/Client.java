package fla_2320.LA83.session01.materi5_D.after;

class Client {

    public static void main(String[] args) {
        System.out.println("***A demo that follows the DIP.***");

        // Using Oracle now
        Database database = new OracleDatabase();
        UserInterface userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E001");

        // Using MySQL now
        database = new MySQLDatabase();
        userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E002");

        // Changing the target database
        //userInterface = new UserInterface(new OracleDatabase());
        userInterface.setDatabase(new OracleDatabase());
        userInterface.saveEmployeeId("E002");


    }

}
