package com.PamFields;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // need to create the lakes as objects to ensure I have all the information needed
        ArrayList <Object> lakesAndDistance= new ArrayList<Object>();//This way, I can check against the arraylist
        //Now I'm adding the lakes
        Lake harriet = new Lake("Harriet");
        lakesAndDistance.add(harriet);
        Lake cedar = new Lake("Cedar");
        lakesAndDistance.add(cedar);
        Lake como = new Lake("Como");
        lakesAndDistance.add(como);
        //Now I'm trying to get the user to tell me which hashmap to update
        System.out.println("What lake did you run around?");//Get lake
        String lake = stringScanner.nextLine();
        for (Lake l: lakesAndDistance){
            System.out.println("What was your time for "+l.getName()+" Lake?");//Get time
            Double time = numberScanner.nextDouble();
            l.dateTime.add(LocalDate.now());//Here is where I get stuck
            l.dateTime.add(l.getName());
        }
        }
        }
    //stringScanner.close();
    //numberScanner.close();
}

