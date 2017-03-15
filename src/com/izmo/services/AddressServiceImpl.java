package com.izmo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.izmo.dao.AddressDao;
import com.izmo.entity.Address;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressDao addressDao;
    @Override
    public List<Address> listAddress() {
	return addressDao.listAddress();
    }

    @Override
    public void saveAddress(Address obj) {
	addressDao.saveAddress(obj);
    }

    @Override
    public Address getAddressById(Long id) {
	return addressDao.getAddressById(id);
    }
    
}
