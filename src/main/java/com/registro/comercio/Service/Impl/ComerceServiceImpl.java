package com.registro.comercio.Service.Impl;

import com.registro.comercio.Commons.GenericServiceImpl;
import com.registro.comercio.DAO.ComerceDAO;
import com.registro.comercio.Service.API.ComerceServiceAPI;
import com.registro.comercio.model.Comerce;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ComerceServiceImpl extends GenericServiceImpl<Comerce, Long> implements ComerceServiceAPI {
    private final ComerceDAO comerceDAO;
    @Override
    public CrudRepository<Comerce, Long> getDao() {
        return comerceDAO;
    }
}
