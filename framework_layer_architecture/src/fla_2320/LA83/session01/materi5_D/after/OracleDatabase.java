package fla_2320.LA83.session01.materi5_D.after;

class OracleDatabase implements Database {
    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the Oracle database.");
    }
}
