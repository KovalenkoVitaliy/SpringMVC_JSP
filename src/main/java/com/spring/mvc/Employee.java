package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
//    @NotEmpty(message = "surname is must be")
    @NotBlank(message = "surname is must be")
    private String surname;
    @Min(value =500, message = "must be greater than 499")
    @Max(value=1000, message = "must be less than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carbrend;
    private Map<String, String> carBrends;
    private String[] languges;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguges() {
        return languges;
    }

    public void setLanguges(String[] languges) {
        this.languges = languges;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public String getCarbrend() {
        return carbrend;
    }

    public void setCarbrend(String carbrend) {
        this.carbrend = carbrend;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");
        carBrends = new HashMap<>();
        carBrends.put("BMW", "BMW");
        carBrends.put("Lada", "Lada");
        carBrends.put("Audi", "Audi");
        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
