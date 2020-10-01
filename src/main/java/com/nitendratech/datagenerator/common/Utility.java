package com.nitendratech.datagenerator.common;

import java.util.List;
import java.util.Random;

/**
 * Created by nitendragautam on 10/21/2019.
 */
public class Utility {



    public static String getRandomFromList(List<String> inList, int listSize){

        Random random = new Random();
        return inList.get(random.nextInt(inList.size()));

    }

    public static String getRandomFromListWithBound(List<String> inList, int listSize){

        Random random = new Random();
        return inList.get(random.nextInt(listSize));

    }

    private static int getRandomNumbersInRange(int minBound,int maxBound){


        return new Random().nextInt(maxBound) +minBound;

    }




}
