package com.group5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
    @RequestMapping("edit_data_html/person_data")
    public String person_data(){
        return "edit_data_html/person_data";
    }
    @RequestMapping("edit_data_html/soliloquy")
    public String soliloquy(){
        return "edit_data_html/soliloquy";
    }
    @RequestMapping("edit_data_html/criteria")
    public String criteria(){
        return "edit_data_html/criteria";
    }
    @RequestMapping("edit_data_html/photo_album")
    public String photo_album(){
        return "edit_data_html/photo_album";
    }
    @RequestMapping("edit_data_html/edit_password")
    public String edit_password(){
        return "edit_data_html/edit_password";
    }
}
