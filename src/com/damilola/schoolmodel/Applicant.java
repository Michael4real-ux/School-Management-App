package com.damilola.schoolmodel;

public class Applicant {
    private String applicantName;
    private int applicationAge;
    private String applicantGender;
    private String applicantAddress;
    private String applicantLevel;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicationAge() {
        return applicationAge;
    }

    public void setApplicationAge(int applicationAge) {
        this.applicationAge = applicationAge;
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

    public Applicant(String applicantName, int applicationAge, String applicantGender, String applicantAddress, String applicantLevel) {
        this.applicantName = applicantName;
        this.applicantAddress = applicantAddress;
        this.applicantGender = applicantGender;
        this.applicationAge = applicationAge;
        this.applicantLevel = applicantLevel;
    }
}
