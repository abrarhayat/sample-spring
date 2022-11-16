package com.hayat.springdemoapp2.controller;

import com.hayat.springdemoapp2.model.Grocery;
import com.hayat.springdemoapp2.utils.IOUtils;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

/**
 * @author Abrar Hayat
 * @since November 2022
 **/

@Controller
public class GroceryController {

    @GetMapping("/")
    public String getGrocery(Model model) throws IOException, ParseException {
        List<Grocery> groceries = IOUtils.getGroceries();
        model.addAttribute("groceries", groceries);
        model.addAttribute("count", groceries.size());
        return "grocery";
    }
}
