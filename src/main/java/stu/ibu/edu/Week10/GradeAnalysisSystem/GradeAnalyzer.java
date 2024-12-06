package stu.ibu.edu.Week10.GradeAnalysisSystem;

import java.util.List;

public class GradeAnalyzer {
    private List<Integer> grades;
    public GradeAnalyzer(List<Integer> grades){
        this.grades = grades;
    }

    public double printSum(){
        double sum = 0;
        for(int i : this.grades){
            sum+=i;
        }
        return sum;
    }
    public double calculateAverage(){
        double sum = printSum();
        return (sum/this.grades.size());
    }
}
