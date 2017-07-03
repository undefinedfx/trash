package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DataController {

    List<String> allwords = new ArrayList<>();
    {
        allwords.add("Absend");
        allwords.add("Accord");
        allwords.add("zero");
        allwords.add("zebra");
    }


    @RequestMapping("/findWordStartWith")
    @ResponseBody
    public List<String> findWordStartWith(String start) {
        return allwords.stream().filter(it -> it.startsWith(start)).collect(Collectors.toList());
    }

}
