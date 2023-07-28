package com.pms.dao;

import com.pms.entity.Supplier;

public interface SupplierDao {
public boolean addSupplier(Supplier sup);
public int getSupplier();
public int updateSupplier(int supid,String supaddress);
public int deleteSupplier(int supid);
public int searchSupplierById(int id);
public int searchSupplierByName(String name);
}
