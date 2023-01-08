package pl.infoshare.aop.broken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokenController {

    private final BrokenService brokenService;

    public BrokenController(BrokenService brokenService) {
        this.brokenService = brokenService;
    }

    @GetMapping("break-api")
    public void breakApi() {
        brokenService.breakCode();
    }
}
