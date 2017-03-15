package com.izmo.dao;

import java.util.List;

import com.izmo.entity.Address;

public interface AddressDao {
    List<Address> listAddress();
    void saveAddress(Address obj);
    Address getAddressById(Long id);

}
