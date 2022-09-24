package hu.uni.miskolc.webalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;

/**
 * Hello world!
 */

@Controller
public class HallgatoController {
    private final HallgatoService hallgatoService;

    public HallgatoController(@Autowired HallgatoService hallgatoService) {
        this.hallgatoService = hallgatoService;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("HELLO");
        return "hello";
    }


    @GetMapping("/hello2")
    @ResponseBody
    public String hello2() {
        System.out.println("HELLO");
        return "hello";
    }



}
