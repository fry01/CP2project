/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author madan
 */
public class HrSystem {

    private static ArrayList<Employee> allEmployees;
    private static ArrayList<Department> allDepartments;
    private static ArrayList<PayScale> payScales;

    public static void setAllEmployees(ArrayList<Employee> allEmployees) {
        HrSystem.allEmployees = allEmployees;
    }

    public static void setAllDepartments(ArrayList<Department> allDepartments) {
        HrSystem.allDepartments = allDepartments;
    }

    public static void setPayScales(ArrayList<PayScale> payScales) {
        HrSystem.payScales = payScales;
    }

    public static int addEmployee(String firstName, String lastName, String address, char gender, PayScale payLevel) {
        Employee newEmp = new Employee(firstName, lastName, address, gender, payLevel);
        allEmployees.add(newEmp);
        return newEmp.getId();
    }

    public HrSystem() {

        allEmployees = new ArrayList<>();
        allDepartments = new ArrayList<>();
        payScales = new ArrayList<>();
    }

    public static int addDepartment(String name, String location) {

        Department newDep = new Department(name, location);
        allDepartments.add(newDep);

        return newDep.getId();
    }

 

    public static ArrayList<Employee> getAllEmployees() {
        return allEmployees;
    }

    public static ArrayList<Department> getAllDepartments() {
        return allDepartments;
    }

    public static ArrayList<PayScale> getPayScales() {
        return payScales;
    }

    public static void designateHead(int empId, int depId) {
        getAllDepartments().get(depId).setHead(getAllEmployees().get(empId));
    }

    public static void editEmployee(int indx, String f_name, String l_name, String address, char gender, int payScale_indx) {
        getAllEmployees().get(indx).setFirstName(f_name);
        getAllEmployees().get(indx).setLastName(l_name);
        getAllEmployees().get(indx).setAddress(address);
        getAllEmployees().get(indx).setPayLevel(payScales.get(payScale_indx));
    }

    public static boolean deleteDepartment(Department dep) {
        boolean found = false;
        for (int i = 0; i < allDepartments.size(); i++) {
            if (allDepartments.get(i).getId() == dep.getId()
                    && allDepartments.get(i).getName().equalsIgnoreCase(dep.getName())) {
                allDepartments.remove(i);
                found = true;
            }
        }
        return found;
    }

}
