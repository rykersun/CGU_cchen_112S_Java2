package org.example;

import java.util.Scanner;

public class b1144142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name? ");
        String name = sc.nextLine();

        System.out.print("SSN? ");
        String code = sc.nextLine();

        try {
            if(isValid(code)) {
                System.out.println(name + " " + code + " is valid");
            }
        }
        catch (SocSecException e) {
            System.out.println(e.getMessage());
        }

    }
    public static boolean isValid(String ssn) throws SocSecException {
        if (ssn.length() != 11) {
            throw new SocSecException("wrong number of characters");
        }
        else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            throw new SocSecException("dashes at wrong positions");
        }
        else if (!Character.isDigit(ssn.charAt(0)) ||
                 !Character.isDigit(ssn.charAt(1)) ||
                 !Character.isDigit(ssn.charAt(2)) ||
                 !Character.isDigit(ssn.charAt(4)) ||
                 !Character.isDigit(ssn.charAt(5)) ||
                 !Character.isDigit(ssn.charAt(7)) ||
                 !Character.isDigit(ssn.charAt(8)) ||
                 !Character.isDigit(ssn.charAt(9)) ||
                 !Character.isDigit(ssn.charAt(10))
        ) {
            throw new SocSecException("contains a character that is not a digit");
        }
        else {
            return true;
        }
    }
}
