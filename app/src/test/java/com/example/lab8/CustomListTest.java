package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    /**
     * check for cities in custom list
     * add a city and check for it
     * do not add a city and check for it
     */
    public void hasCityTest(){
        list = MockCityList();
        City passCity = new City("Estevan", "SK");
        list.addCity(passCity);
        assertEquals(true, list.hasCity(passCity));
        City failCity = new City("Edmonton", "AB");
        assertEquals(false, list.hasCity(failCity));
    }

    /**
     * add city
     * get size
     * delete city
     * check size
     */
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        list.deleteCity(list.getItem(0));
        assertEquals(list.getCount(), listSize - 1);
    }
}

