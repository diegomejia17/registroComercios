package com.registro.comercio.Service.Impl;

import com.registro.comercio.Commons.GenericServiceImpl;
import com.registro.comercio.DAO.BranchDAO;
import com.registro.comercio.Service.API.BrachServiceAPI;
import com.registro.comercio.Service.API.ComerceServiceAPI;
import com.registro.comercio.model.Brach;
import com.registro.comercio.model.Comerce;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
@RequiredArgsConstructor
public class BrachServiceImpl extends GenericServiceImpl<Brach, Long> implements BrachServiceAPI {
    private final BranchDAO branchDAO;
    @Override
    public CrudRepository<Brach, Long> getDao() {
        return branchDAO;
    }
}
