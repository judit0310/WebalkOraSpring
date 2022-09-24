package hu.uni.miskolc.webalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class HallgatoRESTController {
    private final HallgatoService hallgatoService;

    public HallgatoRESTController(@Autowired HallgatoService hallgatoService) {
        this.hallgatoService = hallgatoService;
    }

    @GetMapping(value = "/students")
    public List<Hallgato> students() {
        List<Hallgato> result = hallgatoService.getHallgatok();
        return result;
    }

}
