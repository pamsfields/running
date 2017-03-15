package com.PamFields;

        import java.util.ArrayList;
        import java.util.Date;
        import java.util.Scanner;

public class Lake {

    //Data needed to determine how fast you were able to run around the lake
    ArrayList dateTime;//Date and times of run
    String name; //Name

    public void setName(String name) {this.name = name;}

    public String getName() {
        return this.name;
    }

    Object getDateTime(Date date) {
        return dateTime.get(date);
    }//Thought this might be helpful

    public void addtime(String lakename) {
        Scanner numberScanner = new Scanner(System.in);
        Double atime = 1.0;
        System.out.println("Please enter the times for the runs around Lake " + lakename + ".  Type 0 to complete data entry.");
        while (atime > 0) {
            if (numberScanner.hasNextDouble()) {
                atime = numberScanner.nextDouble();
                if (atime == 0) {
                    break;
                }
                this.dateTime.add(atime);
            } else {
                System.out.println("Please type minutes and seconds as a decimal number.");
                numberScanner.next();
            }
        }

        String n;
        Lake(String n) {//Constructor of object
            n = name;
        }
    }
}
