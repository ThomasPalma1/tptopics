package br.gov.sp.fatec.springtopics.controller;


import br.gov.sp.fatec.springtopics.entity.Address;
import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.service.InterfaceAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private InterfaceAddressService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Address newAddress(@RequestBody Address address) {
        return service.newAddress(address);
    }

    @GetMapping
    public List<Address> searchForAllAddresses() {
        return service.searchForAllAddresses();

    }

    @GetMapping(value = "/id/{address}")
    public Address addressFindByID(@PathVariable("address") Long id) {

        return service.addressFindById(id);
    }

}
