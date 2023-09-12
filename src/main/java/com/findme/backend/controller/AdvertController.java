package com.findme.backend.controller;

import com.findme.backend.entity.Advert;
import com.findme.backend.service.advert.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advert")
public class AdvertController {
    private AdvertService advertService;

    @Autowired
    public AdvertController(AdvertService advertService) {
        this.advertService = advertService;
    }

    @GetMapping("")
    public List<Advert> getAdvertList() {
        return advertService.getList();
    }

    @GetMapping("/{advertId}")
    public Advert getAdvertList(@PathVariable int advertId) {
        return advertService.getById(advertId);
    }

    @PostMapping("")
    public Advert addAdvert(@RequestBody Advert advert) {
        advert.setId(0);
        return advertService.save(advert);
    }

    @PutMapping("")
    public Advert updateAdvert(@RequestBody Advert advert) {
        return advertService.update(advert);
    }

    @DeleteMapping("/{advertId}")
    public int deleteAdvert(@PathVariable int advertId) {
        return advertService.remove(advertId);
    }
}
