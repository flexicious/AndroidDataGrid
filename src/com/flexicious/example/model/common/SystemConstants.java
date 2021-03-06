package com.flexicious.example.model.common;

	/**
	 * When is actionscript getting ENUMS!!
	 */	

	public class SystemConstants
	{
		public static final ReferenceData usCountry = new ReferenceData(1,"US","United States");
		public static ReferenceData[] cities = new ReferenceData[]{new ReferenceData(0,"Grand Rapids"),
			new ReferenceData(2,"Albany"),
			new ReferenceData(3,"Stroudsburgh"),
			new ReferenceData(4,"Barrie"),
			new ReferenceData(5,"Springfield")};
		public static ReferenceData[] states = new ReferenceData[]{new ReferenceData(1,"MI","Michigan"),
			new ReferenceData(2,"NY","New York"),
			new ReferenceData(3,"PA","Penn"),
			new ReferenceData(4,"NJ","New Jersey"),
			new ReferenceData(5,"OH","Ohio"),
			new ReferenceData(6,"NC","North Carolina")};

		public static ReferenceData[] dealStatuses  = new ReferenceData[]{
			new ReferenceData(1,"Prospect"),
			new ReferenceData(2,"Qualified"),
			new ReferenceData(3,"In Process"),
			new ReferenceData(4,"Cancelled"),
			new ReferenceData(5,"Complete")
		};
		
		public static ReferenceData[] invoiceStatuses = new ReferenceData[]{
			new ReferenceData(1,"Draft"),
			new ReferenceData(2,"Approved"),
			new ReferenceData(3,"Transmitted"),
			new ReferenceData(4,"Paid"),
			new ReferenceData(5,"Cancelled")
		};
		
		public static ReferenceData[]  billableConsultants = new ReferenceData[]{
			new ReferenceData(1,"Jason Bourne"),
			new ReferenceData(2,"Lars Wilson"),
			new ReferenceData(3,"Tarah Silverman"),
			new ReferenceData(4,"Betty White"),
			new ReferenceData(5,"Kristian Donovan")
		};
		
		 
	}

