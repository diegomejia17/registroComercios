package com.registro.comercio.Controller;

import com.registro.comercio.Service.API.DepartmentServiceAPI;
import com.registro.comercio.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceAPI departmentServiceAPI;
    @GetMapping("/department")
    List<Department> departmentList (){
        return departmentServiceAPI.getAll();
    }

}
