package com.biz.iolist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

// @Data
public class IolistVO {

	private long io_seq;	//number
	private String io_date;	//varchar2(10 byte)
	private String io_pcode;	//nvarchar2(5 char)
	private String io_ccode;	//nvarchar2(5 char)
	private String io_inout;	//varchar2(1 byte)
	private int io_qty;	//number
	private int io_price;	//number
	private int io_total;	//number
	
}
