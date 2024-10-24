package com.pluralsight;

import java.security.InvalidParameterException;

public class NameFormatter {

    private String name;
    private String lastName;
    private static String middleName;
    private static String prefix;
    private static String suffix;

    private NameFormatter(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static String format(String firstName, String lastName) {
        String concatonate = lastName + ", " + firstName;
        return concatonate;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {

        return lastName + ", " + prefix + " " + firstName + " " +middleName + " " + suffix;
    }
    /*
    LastName, Prefix FirstName MiddleName, Suffix
    Johnson, Dr. Mel B, PhD
    Johnson, Mel B, PhD
    Johnson, Mel
    */

    // Oscar Osmig Torres Maradiaga
    public static String format(String fullName) {

        if (fullName.equals(null)) {return null; }
        else {
            String[] linkParts = fullName.split(" ");
            if (linkParts.length == 2) {
                return format(linkParts[0], linkParts[1]);

            } else if (linkParts.length == 3) {
                return linkParts[2] + ", " + linkParts[0] + " " + linkParts[1];

            }else if (linkParts.length == 4) {
                    return linkParts[2] + ", " + linkParts[0] + " " + linkParts[1] + ", " + linkParts[3];

            } else if (linkParts.length == 5) {
                return linkParts[0] + ", " + linkParts[1] + " " + linkParts[2] + " " + linkParts[3] + ", " + linkParts[4];
            } else {
                throw new InvalidParameterException();
            }
        }
    }

    // #####################################################################
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getMiddleName() {
        return middleName;
    }

    public static void setMiddleName(String middleName) {
        NameFormatter.middleName = middleName;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static void setPrefix(String prefix) {
        NameFormatter.prefix = prefix;
    }

    public static String getSuffix() {
        return suffix;
    }

    public static void setSuffix(String suffix) {
        NameFormatter.suffix = suffix;
    }
}
