package com.martiply.table;

public class TableStandard {
	
	public static final String TABLE_NAME = "standard";
	
	public static final String ID = "id";
	public static final String OWNER_ID = TableOwner.OWNER_ID;
	public static final String ID_CUSTOM = "idCustom";
	public static final String GTIN = "gtin";	
	public static final String ID_TYPE = "idType";
	public static final String BRAND = "brand";
	public static final String NAME = "name";		
	public static final String CATEGORY = "category";
	public static final String DESCRIPTION = "description";
	public static final String URL = "url";	
	public static final String HIT = "hit";
	public static final String COND = "cond";
	public static final String PRICE = "price";
	public static final String CREATE_TS = "createTs";

	public static final String ID_F = TABLE_NAME + "." + ID;
	public static final String OWNER_ID_F = TABLE_NAME + "." + OWNER_ID;
	public static final String ID_CUSTOM_F = TABLE_NAME + "." + ID_CUSTOM;
	public static final String GTIN_F = TABLE_NAME + "." + GTIN;	
	public static final String ID_TYPE_F = TABLE_NAME + "." + ID_TYPE;
	public static final String BRAND_F = TABLE_NAME + "." + BRAND;
	public static final String NAME_F = TABLE_NAME + "." + NAME;		
	public static final String CATEGORY_F = TABLE_NAME + "." + CATEGORY;
	public static final String DESCRIPTION_F = TABLE_NAME + "." + DESCRIPTION;
	public static final String URL_F = TABLE_NAME + "." + URL;	
	public static final String HIT_F = TABLE_NAME + "." + HIT;
	public static final String COND_F = TABLE_NAME + "." + COND;
	public static final String PRICE_F = TABLE_NAME + "." + PRICE;
	public static final String CREATE_TS_F = TABLE_NAME + "." + CREATE_TS;

	public static String[] csvHeadersGeneral= {
			TableStandard.GTIN, 
			TableStandard.ID_CUSTOM, 
			TableStandard.BRAND, 
			TableStandard.NAME, 
			TableStandard.CATEGORY, 
			TableStandard.PRICE,
			"condition", 
			TableStandard.DESCRIPTION, 
			TableStandard.URL, 
			TableStandardSale.SALE_PRICE, 
			TableStandardSale.SALE_START, 
			TableStandardSale.SALE_END	
	};	

	public static String[] csvHeadersApparel = {
			TableStandard.GTIN, 
			TableStandard.ID_CUSTOM, 
			TableStandard.BRAND, 
			TableStandard.NAME, 
			TableStandard.CATEGORY, 
			TableStandard.PRICE,
			"condition", 
			TableStandard.DESCRIPTION, 
			TableStandard.URL, 
			TableStandardSale.SALE_PRICE, 
			TableStandardSale.SALE_START, 
			TableStandardSale.SALE_END,
			TableStandardApparel.GENDER, 
			TableStandardApparel.AGE, 
			TableStandardApparel.SIZE_SYSTEM, 
			TableStandardApparel.SIZE, 
			TableStandardApparel.COLOR, 
			TableStandardApparel.FEATURE,
			TableStandardApparel.MATERIAL, 
			TableStandardApparel.GROUP_ID		
	};	


}
