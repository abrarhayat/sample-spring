package com.hayat.springdemoapp2.utils;

import com.hayat.springdemoapp2.model.Grocery;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Abrar Hayat
 * @since November 2022
 **/
public class IOUtils {
    public static List<Grocery> getGroceries() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        List<Grocery> groceries = new ArrayList<>();
        JSONArray array = (JSONArray) parser.parse(
                new FileReader(System.getProperty("user.dir") + File.separator + "grocery.json"));
        for (Object o : array) {
            JSONObject jsonObject = (JSONObject) o;
            String title = (String) jsonObject.get("title");
            String type = (String) jsonObject.get("type");
            String filename = (String) jsonObject.get("filename");
            String height = Long.toString((long)jsonObject.get("height"));
            String width = Long.toString((long)jsonObject.get("width"));;
            String price = Double.toString((double)jsonObject.get("price"));;
            String rating = Long.toString((long)jsonObject.get("rating"));;
            groceries.add(new Grocery(title, type, filename, height, width, price, rating));
        }
        return groceries;
    }

}
