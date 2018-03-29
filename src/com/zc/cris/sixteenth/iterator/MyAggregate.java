package com.zc.cris.sixteenth.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyAggregate<T>{

	private List<T> list = new ArrayList<>();
	
	/**
	 * 获取处理当前聚集类的迭代器
	 */
	public Iterator<T> getIterator() {
		return new MyIterator<>(this);
	}
	/**
	 * 获取处理当前聚集类的迭代器(反向)
	 */
	public Iterator<T> getIteratorDesc() {
		return new MyIteratorDesc<T>(this);
	}
	
	/**
	 * 获取指定位置的元素
	 * @param index
	 * @return
	 */
	public T get(Integer index) {
		if(index > list.size()) {
			throw new RuntimeException("当前索引大于最大长度");
		}
		return this.list.get(index);
	}
	
	/**
	 * 获取当前聚集类的长度
	 * @return
	 */
	public Integer Count() {
		return this.list.size();
	}
	
	/**
	 * 为当前聚集类添加元素
	 * @param t
	 */
	public void add(T t) {
		this.list.add(t);
	}
	

}
