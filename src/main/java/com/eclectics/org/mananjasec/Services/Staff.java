package com.eclectics.org.mananjasec.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Staff {
    @Autowired
    StaffRepository staffRepository;
    public List<Staff>staffs= Arrays.asList<>()

}
