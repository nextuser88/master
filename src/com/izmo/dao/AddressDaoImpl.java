package com.izmo.dao;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.izmo.entity.Address;

@Repository
public class AddressDaoImpl implements AddressDao {
    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
    @Override
    public List<Address> listAddress() {
	return (List<Address>) sessionFactory.getCurrentSession().createCriteria(Address.class).list();
    }

    @Override
    public void saveAddress(Address obj) {
	sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    @Override
    public Address getAddressById(Long id) {
	return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
    }

}
