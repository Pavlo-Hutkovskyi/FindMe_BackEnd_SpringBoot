package com.findme.backend.service.advert;

import com.findme.backend.dao.AdvertDAO;
import com.findme.backend.entity.Advert;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService{

    private AdvertDAO advertDAO;

    @Autowired
    public AdvertServiceImpl(AdvertDAO advertDAO) {
        this.advertDAO = advertDAO;
    }

    @Override
    public List<Advert> getList() {
        return advertDAO.getList();
    }

    @Override
    public Advert getById(int advertId) {
        if(advertId == 0)
            throw new RuntimeException("Advert not found");
        return advertDAO.getById(advertId);
    }

    @Override
    @Transactional
    public Advert save(Advert advert) {
        if(advert == null)
            throw new RuntimeException("Advert is null");
        System.out.println(advert.getDescription());
        return advertDAO.save(advert);
    }

    @Override
    @Transactional
    public int remove(int advertId) {
        if(advertId == 0)
            throw new RuntimeException("Advert not found");
        return advertDAO.remove(advertId);
    }

    @Override
    @Transactional
    public Advert update(Advert advert) {
        if(advert == null)
            throw new RuntimeException("Advert is null");
        return advertDAO.update(advert);
    }
}
