package com.company.U1M6Summative.dao;

import com.company.U1M6Summative.model.InvoiceItem;
import com.company.U1M6Summative.model.Item;

import java.util.List;

public interface ItemDao {

    Item addItem(Item item);

    Item getItem(int itemId);

    List<Item> getAllItems();

    void updateItem(Item item);

    void deleteItem(int itemId);

    List<Item> getItemByInvoiceItemId(int invoiceItemId);


}
