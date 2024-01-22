/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codes;

import java.sql.Connection;

/**
 *
 * @author Heshan
 */
public class ContractEmployee implements Employee{

    @Override
    public void save(int empId, String name, double salary, DatabaseConnection dbConnection) {
        Connection connection = dbConnection.connect();
          
            System.out.println("Saved Tempary Employee: " + empId + ", " + name + ", " + salary);
    }
    
}
