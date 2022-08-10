/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.pojo;

import java.io.File;

/**
 *
 * @author Dell
 */
public class ParticipantPojo {

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public File getResume() {
        return Resume;
    }

    public void setResume(File Resume) {
        this.Resume = Resume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   private String pId;
   private String userId;
   private String Name;
   private String phone;
   private String password;
   private String Skills;
   private String Qualification;
   private File Resume;
   private String type;
    
    
}
