/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codes;

/**
 *
 * @author Heshan
 */
public interface Employee {
    void save(int empId, String name, double salary, DatabaseConnection dbConnection);
}
