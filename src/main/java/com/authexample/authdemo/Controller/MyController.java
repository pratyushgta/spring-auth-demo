/**
 * This class contains methods for implementing controller for SpringBoot Application
 * MSA-E7
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.authexample.authdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome!!</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }
}

