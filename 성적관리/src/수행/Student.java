package 수행;

public class Student {
    private String name;
    private int korean;
    private int english;
    private int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getTotal() {
        return korean + english + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return name + "\t" + korean + "\t" + english + "\t" + math + "\t" +
               getTotal() + "\t" + String.format("%.2f", getAverage()) + "\t" + getGrade();
    }
}