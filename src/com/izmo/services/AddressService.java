package com.izmo.services;
import java.util.List;
import com.izmo.entity.Address;

public interface AddressService {
    List<Address> listAddress();
    void saveAddress(Address obj);
    Address getAddressById(Long id);
}
