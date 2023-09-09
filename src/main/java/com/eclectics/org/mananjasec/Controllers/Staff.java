package com.eclectics.org.mananjasec.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Staff {
    @Autowired
    StaffService  staffService;
    // Get Method
    @GetMapping(path="staffs")
    public List<Staff>getStaffs(){
        return staffService.getStaffs();
    }
}
