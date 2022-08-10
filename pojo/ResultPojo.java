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
public class ResultPojo {

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Double getPercentge() {
        return percentge;
    }

    public void setPercentge(Double percentge) {
        this.percentge = percentge;
    }

    public String getSelectedbyHr() {
        return selectedbyHr;
    }

    public void setSelectedbyHr(String selectedbyHr) {
        this.selectedbyHr = selectedbyHr;
    }
    private String jobid;
    private String pid;
    private Double percentge;
    private String selectedbyHr;
    
}
