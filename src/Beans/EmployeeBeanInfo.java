/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;



/**
 *
 * @author c3
 */
public class EmployeeBeanInfo extends SimpleBeanInfo {
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors(){
        
        try {
            PropertyDescriptor pd1=new PropertyDescriptor("id",Employee.class);
            PropertyDescriptor pd2=new PropertyDescriptor("salary",Employee.class);
            PropertyDescriptor pd3=new PropertyDescriptor("address",Employee.class);
            
            PropertyDescriptor[] pd={pd1,pd2,pd3};
            
            return pd;
        } catch (IntrospectionException ex) {
            System.out.println("Exception : "+ex);
        }
        
        return null;
    }
    
    @Override
    public MethodDescriptor[] getMethodDescriptors(){
        
        try {
            MethodDescriptor md1=new MethodDescriptor(Employee.class.getMethod("print"));
            MethodDescriptor md2=new MethodDescriptor(Employee.class.getMethod("add",int.class,int.class));
            
            MethodDescriptor[] md={md1,md2};
            
            return md;
        } catch (Exception ex) {
            System.out.println("Exception : "+ex);
        } 
        return null;
        
    }
    
}
