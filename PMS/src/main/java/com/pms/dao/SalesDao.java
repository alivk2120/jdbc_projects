package com.pms.dao;

import com.pms.entity.Sale;

public interface SalesDao {
public boolean addSales(Sale s);
public int getSales();
public int updateSales(int sid,double revenue);
public int searchSalesById(int id);
public int deleteSalesById(int id);
}
