/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ex39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class appEx39 {

    public static ArrayList<Map> sortMaps(ArrayList<Map> map){

        Map<Integer, String> firstNames = map.get(0);
        Map<Integer, String> lastNames = map.get(1);
        Map<Integer, String> positions = map.get(2);
        Map<Integer, String> seperationDates = map.get(3);
        while(true){
            for(int i = 0; i < firstNames.size(); i++){

            }
        }


    }

    public static void printMaps(ArrayList<Map> map){
        System.out.print("Name                 | Position        | Seperation Date\n--------------------------------------------------\n");
        int[] printOrder = new int[map.get(1).size()];

        for(int i = 0; i < map.get(1).size(); i++){
            if(map.get(1).get(i+1).toString() != null){
                String nextName = map.get(1).get(i+1).toString();
                char firstLetter = nextName.charAt(0);

              //  if(map.get(1).get(i+1.t))
            }
        }

        for(int i = 0; i < map.get(0).size(); i++){
            String name = map.get(0).get(i).toString() + " " + map.get(1).get(i).toString();
            String seperationDate = "";
            try{
                seperationDate =map.get(3).get(i).toString();
            }
            catch (Exception e){
                seperationDate = "";
            }

            System.out.printf("%-20s | %-20s | %-12s\n", name, map.get(2).get(i).toString(), seperationDate);
        }
    }

    public static void main( String[] args ) {
        Scanner userInputScanner = new Scanner(System.in);

        ArrayList<Map> mapList = new ArrayList<Map>();

        Map<Integer, String> firstNames = new HashMap<Integer, String>();
        Map<Integer, String> lastNames = new HashMap<Integer, String>();
        Map<Integer, String> positions = new HashMap<Integer, String>();
        Map<Integer, String> seperationDates = new HashMap<Integer, String>();
        firstNames.put(0, "John");
        firstNames.put(1, "Tou");
        firstNames.put(2, "Michaela");
        firstNames.put(3, "Jake");
        firstNames.put(4, "Jacquelyn");
        firstNames.put(5, "Sally");
        lastNames.put(0, "Johnson");
        lastNames.put(1, "Xiong");
        lastNames.put(2, "Michaelson");
        lastNames.put(3, "Jacobson");
        lastNames.put(4, "Jackson");
        lastNames.put(5, "Webber");
        positions.put(0, "Manager");
        positions.put(1, "Software Engineer");
        positions.put(2, "District Manager");
        positions.put(3, "Programmer");
        positions.put(4, "DBA");
        positions.put(5, "Web Developer");
        seperationDates.put(0, "2015-12-31");
        seperationDates.put(1, "2016-10-05");
        seperationDates.put(2, "2015-12-19");
        seperationDates.put(5, "2015-12-18");

        mapList.add(firstNames);
        mapList.add(lastNames);
        mapList.add(positions);
        mapList.add(seperationDates);

        printMaps(mapList);
    }
}
