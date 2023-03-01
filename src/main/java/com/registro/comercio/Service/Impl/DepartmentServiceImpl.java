package com.registro.comercio.Service.Impl;

import com.registro.comercio.Commons.GenericServiceImpl;
import com.registro.comercio.DAO.DepartmentDAO;
import com.registro.comercio.Service.API.DepartmentServiceAPI;
import com.registro.comercio.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl extends GenericServiceImpl<Department, Long> implements DepartmentServiceAPI {
    private final DepartmentDAO departmentDAO;

    @Override
    public CrudRepository<Department, Long> getDao() {
        return departmentDAO;
    }
}
