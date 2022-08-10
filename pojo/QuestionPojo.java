/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.pojo;

/**
 *
 * @author Dell
 */
public class QuestionPojo {

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getQno() {
        return Qno;
    }

    public void setQno(int Qno) {
        this.Qno = Qno;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String Option1) {
        this.Option1 = Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String Option2) {
        this.Option2 = Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String Option3) {
        this.Option3 = Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public void setOption4(String Option4) {
        this.Option4 = Option4;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }
    private String jobid;
    private int Qno;
    private String Question;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private int correctOption;
}
