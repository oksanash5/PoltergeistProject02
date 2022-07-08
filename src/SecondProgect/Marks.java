package SecondProgect;
//We have to calculate the average of marks obtained
//in three subjects by student A and in 4 subjects by student B
// Create class 'Marks' with an abstract method 'getAverage'
//that will be returning the average of marks.
//Provide implementation of abstract method in classes 'A' and 'B'.
// The constructor of student A takes the marks in three
// subjects as its parameters and the marks in four subjects
//as its parameters for student B. Test your code.
public abstract class Marks {
    double averageMarks;
    abstract double getAverage();

}
class StudentA extends Marks{
    double javaMark;
    double seleniumMark;
    double testingMark;
   StudentA(double javaMark,double seleniumMark, double testingMark){
    this.javaMark=javaMark;
    this.seleniumMark=seleniumMark;
    this.testingMark=testingMark;
}
    @Override
    double getAverage() {
        return averageMarks=(javaMark+seleniumMark+testingMark)/3;
    }
}
class StudentB extends Marks{
    double javaMark;
    double seleniumMark;
    double testingMark;
    double cucumberMark;
    StudentB(double javaMark,double seleniumMark, double testingMark, double cucumberMark){
        this.javaMark=javaMark;
        this.seleniumMark=seleniumMark;
        this.testingMark=testingMark;
        this.cucumberMark=cucumberMark;
    }
    @Override
    double getAverage() {
        return averageMarks=(javaMark+seleniumMark+testingMark+cucumberMark)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        StudentA A=new StudentA(90.5,94.6,95.7);
        System.out.println("The mark's average of Student A is "+A.getAverage());

        StudentB B=new StudentB(89.9,98.7,94,96.5);
        System.out.println("The mark's average of Student B is "+B.getAverage());
    }
}
