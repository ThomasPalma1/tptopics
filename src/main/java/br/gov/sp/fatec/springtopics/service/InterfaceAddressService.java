package br.gov.sp.fatec.springtopics.service;

import br.gov.sp.fatec.springtopics.entity.Address;

import java.util.List;

public interface InterfaceAddressService {

    public Address newAddress(Address address);

    public List<Address> findAll();

    public List<Address> searchForAllAddresses();

    public Address addressFindById(Long id);
}
