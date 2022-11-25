package com.springapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.jeuxServiceStub.jeuxServiceStub;
import com.springapi.models.jeux;

@RestController
public class jeuxcontroller {
    @GetMapping("/jeux")
    public List<jeux> getAlljeux() {
        return jeuxServiceStub.getAlljeux();
    }

    @GetMapping("/jeux/{jeuxid}")
    public jeux getjeuxDetails(@PathVariable int jeuxid) {
        return jeuxServiceStub.getjeuxDetails(jeuxid);
    }

    @PostMapping("/addjeux")
    public jeux addjeux(@RequestBody jeux jeux) {
        return jeuxServiceStub.addjeux(jeux);
    }

    @PutMapping("/updatejeux/{jeuxid}")
    public jeux updatejeux(@PathVariable int jeuxid, @RequestBody jeux jeux) {
        return jeuxServiceStub.updateJeux(jeuxid, jeux);
    }

    @DeleteMapping("/deletejeux/{jeuxid}")
    public jeux deletejeux(@PathVariable int jeuxid) {
        return jeuxServiceStub.deleteJeux(jeuxid);
    }

}
