package br.gov.sp.fatec.springtopics.service;

import br.gov.sp.fatec.springtopics.entity.Address;
import br.gov.sp.fatec.springtopics.exception.MissingFieldException;
import br.gov.sp.fatec.springtopics.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements InterfaceAddressService {
    @Autowired
    private AddressRepository addressRepo;

    public Address newAddress(Address address) {
        if (address == null || address.getZipCode() == null) {
            throw new MissingFieldException("Zip Code field is required");
        }
        return addressRepo.save(address);
    }


    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public List<Address> searchForAllAddresses() {
        return addressRepo.findAll();
    }

    @Override
    public Address addressFindById(Long id) {
        Optional<Address> optionalAddress = addressRepo.findById(id);
        return optionalAddress.orElse(null);
    }
}
