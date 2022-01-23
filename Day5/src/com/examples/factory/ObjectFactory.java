package com.examples.factory;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class ObjectFactory {
   public static EmployeeDao getInstance() {
   return new EmployeeDaoImpl();
}
}