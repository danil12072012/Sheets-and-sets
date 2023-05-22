package pro.sky.sheetsandsets1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Employee {

    @JsonProperty("lastName")
    private final String surnameEmployee;
    @JsonProperty("firstName")
    private final String nameEmployee;

    public Employee(String surnameEmployee, String nameEmployee) {


        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;

    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }


    @Override
    public String toString() {
        return ". ФИО: " + surnameEmployee + " " + nameEmployee ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(surnameEmployee, employee.surnameEmployee) && Objects.equals(nameEmployee, employee.nameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surnameEmployee, nameEmployee);
    }
}
