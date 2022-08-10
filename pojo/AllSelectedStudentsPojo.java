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
public class AllSelectedStudentsPojo extends ParticipantPojo {
    private String comapnyname;
    private String jobtitle;
    private String jobid;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getComapnyname() {
        return comapnyname;
    }

    public void setComapnyname(String comapnyname) {
        this.comapnyname = comapnyname;
    }
    
}
