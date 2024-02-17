package fla_2320.LA83.session01.materi2_O.after;

class ScienceDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 80) {
            System.out.println(student.regNumber + " has received a distinction in science.");
        }
    }
}
