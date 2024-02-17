package fla_2320.LA83.session01.materi5_D.after;

class UserInterface {
    Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }
}
