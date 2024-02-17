package fla_2320.LA83.session01.materi5_D.before;

class UserInterface {
    private final OracleDatabase oracleDatabase;

    public UserInterface() {
        this.oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeeId(String empId) {
        // Assuming that this is a valid data.
        // So, storing it in the database.
        oracleDatabase.saveEmpIdInDatabase(empId);
    }

}
