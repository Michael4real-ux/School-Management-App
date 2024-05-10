package com.damilola.schoolmodel;

public class Applicant {
    private String applicantName;
    private int applicantAge;
    private String applicantGender;
    private String applicantAddress;
    private String applicantLevel;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getApplicantGender() {
        return applicantGender;
    }

    public void setApplicantGender(String applicantGender) {
        this.applicantGender = applicantGender;
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress) {
        this.applicantAddress = applicantAddress;
    }

    public String getApplicantLevel() {
        return applicantLevel;
    }

    public void setApplicantLevel(String applicantLevel) {
        this.applicantLevel = applicantLevel;
    }

    public Applicant(String applicantName, int applicantAge, String applicantGender, String applicantAddress, String applicantLevel) {
        this.applicantName = applicantName;
        this.applicantAddress = applicantAddress;
        this.applicantGender = applicantGender;
        this.applicantAge = applicantAge;
        this.applicantLevel = applicantLevel;
    }
}
