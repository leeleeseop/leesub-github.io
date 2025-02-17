package com.beetmarket.goodsqna.service;

import java.util.List;

import com.beetmarket.goodsqna.vo.Goods_QnaVO;
import com.webjjang.util.page.PageObject;

public interface Goods_QnaService {

	public List<Goods_QnaVO> list(PageObject pageObject, Long goodsNo);
	
	public Integer write(Goods_QnaVO vo);
	
	public Integer update(Goods_QnaVO vo);
  
	public Integer answeranwrite(Goods_QnaVO vo);

	public Integer delete(Goods_QnaVO vo);
	
	public Integer answerdelete(Goods_QnaVO vo);
}
