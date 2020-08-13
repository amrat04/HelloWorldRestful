package com.springboottutorials.demoProject1.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {


    public static void main(String args[]){

    /*    String s = "Wed";
        int k = 25;

        List<String> weekdays = new ArrayList<String>(
                Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        int i = k % weekdays.size();
        System.out.println(i);
        int newNumber = weekdays.indexOf("Wed")+i;
        System.out.println("The new day is "+weekdays.get(newNumber));*/

        String s = "188212";
        ArrayList<ArrayList<String>> arrList = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempList = new ArrayList<>();
        searchAlgo(arrList, s, 0, tempList);

        ArrayList<String> finalList = new ArrayList<>();

        for(ArrayList<String> list: arrList){
            StringBuilder sb = new StringBuilder();
            list.forEach(sb::append);
            sb.setLength(sb.length() - 1);
            finalList.add(sb.toString());
        }

        System.out.println(finalList.size());

    }
    public static void searchAlgo(ArrayList<ArrayList<String>> result, String str, int start, ArrayList<String> list){

        if(list.size() >= 4 && start != str.length()) {
            return;
        }

        if((list.size() + str.length() - start + 1) < 4){
            return;
        }


        if(list.size() == 4 && start==str.length()){
            ArrayList<String> temp = new ArrayList<String>(list);
            result.add(temp);
            return;
        }

        for(int i=1; i<=3; i++){

            if(start + i > str.length())
                break;

            String substring = str.substring(start, start+i);

            if(i>1 && str.charAt(start)=='0'){
                break;
            }

            if(Integer.valueOf(substring)>255)  // validating that number is less then 255
                break;

            list.add(substring);
            searchAlgo(result, str, start + i, list);
            list.remove(list.size()-1);
        }
    }
}
