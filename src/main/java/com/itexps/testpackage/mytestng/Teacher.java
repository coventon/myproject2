/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.testpackage.mytestng;

/**
 *
 * @author Roma2
 */
public class Teacher {
    private String first;
    private String last;

    @Override
    public String toString() {
        return "Teacher{" + "first=" + first + ", last=" + last + '}';
    }

    
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    
    
}
