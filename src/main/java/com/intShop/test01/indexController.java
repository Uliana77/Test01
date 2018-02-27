package com.intShop.test01;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/helloWorld")

public class indexController {
    List<String> list = new ArrayList<>();

    @PostMapping("/save")
    public int saveMessage(@RequestParam("newText") String massege) {

        list.add(massege);


        return list.size() - 1;
    }


}
