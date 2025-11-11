public class Marks {
    private int totalSub;
    private int totalMarks;
    private double mean;
    private String grade;

    public Marks() {
        totalSub=0;
        totalMarks=0;
        mean=0;
        grade="";
    }

    public void setTotalSubjects(int totalSub) {
        this.totalSub=totalSub;
    }

    public void addMark(int mark) {
        totalMarks+=mark;
    }

    public void computeMean() {
        if (totalSub>0) {
            mean=(double) totalMarks/totalSub;
        } else {
            mean=0;
        }
    }

    public void computeGrade() {
        if (mean<=100 && mean>80) {
            grade = "A";
        } else if (mean<=80 && mean>60) {
            grade = "B";
        } else if (mean<=60 && mean>40) {
            grade = "C";
        } else if (mean<=40 && mean>20) {
            grade = "D";
        } else if (mean<=20 && mean>=0) {
            grade = "F";
        }
    }

    public double getMean() {
        return mean;
    }

    public String getGrade() {
        return grade;
    }

    public int getTotalSubjects() {
        return totalSub;
    }
}