package com.biz.iolist.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.iolist.model.CompVO;

public interface CompService {
	
	public List<CompVO> SelectAll();
	
	public CompVO findByCCode(String c_code);
	
	public List<CompVO> findByCName(String c_name);

	public List<CompVO> findByCTel(String c_tel);
}
