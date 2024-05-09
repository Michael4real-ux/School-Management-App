package com.damilola.schoolmodel;

public class Staff extends Personnel {
    private int staffId;
    private String position;
    private double salary;



    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Staff(String name, int age, String gender, String address, int staffId, String position, double salary) {
        super(name, age, gender, address);
        this.staffId = staffId;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
