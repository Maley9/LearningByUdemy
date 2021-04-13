package com.company.PrivExample.ProtExample;

import com.company.PrivExample.ProtExample.pacage1.BasicClass;
import com.company.PrivExample.ProtExample.pacage2.OtherClass;


// NIEOKRESLONY DOSTEP == PROTECTED
// GETTERY SETTERY == PRIVATE

public class Test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        OtherClass otherClass = new OtherClass();

        basicClass.setName("Other");
        System.out.println(basicClass.getName());
    }
}
