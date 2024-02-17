package fla_2320.LA83.session01.materi1_S.after;

import java.util.Random;

class EmployeeIdGenerator {
    String empId;

    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        empId = empFirstName.substring(0, 1) + random;
        return empId;
    }

}
