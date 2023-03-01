package com.registro.comercio.Service.Impl;

import com.registro.comercio.Commons.GenericServiceImpl;
import com.registro.comercio.DAO.RepresentativeDAO;
import com.registro.comercio.Service.API.RepresentativeServiceAPI;
import com.registro.comercio.model.Representantive;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;

@RequiredArgsConstructor
public class RepresentativeServiceImpl extends GenericServiceImpl<Representantive, Long> implements RepresentativeServiceAPI {
    private final RepresentativeDAO representativeDAO;

    @Override
    public CrudRepository<Representantive, Long> getDao() {
        return representativeDAO;
    }
}
