package com.martiply.table;

public class TableStandardSale {
	
	public static final String TABLE_NAME = "standard_sale";
	
	public static final String ID = TableStandard.ID;
	public static final String SALE_PRICE = "salePrice";
	public static final String SALE_START = "saleStart";
	public static final String SALE_END = "saleEnd"; 

	public static final String ID_F = TABLE_NAME + "." + ID;
	public static final String SALE_PRICE_F = TABLE_NAME + "." + SALE_PRICE;
	public static final String SALE_START_F = TABLE_NAME + "." + SALE_START;
	public static final String SALE_END_F = TABLE_NAME + "." + SALE_END;
}
