package com.project.project.controllers;

import com.project.project.model.Holiday;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidayController {
//    @RequestMapping("/holiday")
@RequestMapping(value = "/holiday/{display}", method = RequestMethod.GET)
    public String displayHoliday(Model model,
                                 @PathVariable String display,
                                 @RequestParam(required = false) boolean festival,
                                 @RequestParam(required = false) boolean federal) {
        if (display != null && display.equals("all") ) {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        } else  if (display != null && display.equals("federal")) {
            model.addAttribute("federal", true);
        } else if (display != null && display.equals("festival")) {
            model.addAttribute("festival", true);
        }

        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
        );

        Holiday.Type[] types = Holiday.Type.values();
        System.out.println(types);

        for (Holiday.Type type: types) {
            model.addAttribute(type.toString(), holidays.stream().filter(day -> day.getType().equals(type)).collect(Collectors.toList()));

        }


        System.out.println(model);
        return "holidays.html";
    }
}
