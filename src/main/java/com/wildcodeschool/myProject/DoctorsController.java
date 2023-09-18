package com.wildcodeschool.myProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorsController {

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String getDoctor1() {
        return "William Hartnell";
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String getDoctor2() {
        return "Patrick Troughton";
    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String getDoctor3() {
        return "Jon Pertwee";
    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String getDoctor4() {
        return "Tom Baker";
    }

    @RequestMapping("/")
    @ResponseBody
    public String getDoctorsLinks() {
        StringBuilder html = new StringBuilder();
        html.append("<ul>")
                .append("<li><a href=\"/doctor/1\">William Hartnell</a></li>")
                .append("<li><a href=\"/doctor/2\">Patrick Troughton</a></li>")
                .append("<li><a href=\"/doctor/3\">Jon Pertwee</a></li>")
                .append("<li><a href=\"/doctor/4\">Tom Baker</a></li>")
                .append("</ul>");
        return html.toString();
    }
}
