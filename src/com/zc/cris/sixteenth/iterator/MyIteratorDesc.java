package com.zc.cris.sixteenth.iterator;

public class MyIteratorDesc<T> implements Iterator<T> {

	private MyAggregate<T> aggregate;
	private int currentCount;

	// 处理聚集对象
	public MyIteratorDesc(MyAggregate<T> aggregate) {
		this.aggregate = aggregate;
		this.currentCount = aggregate.Count()-1;
	}

	/**
	 * 返回最后一个值
	 */
	@Override
	public T getLast() {
		if(aggregate.Count() > 0) {
			return aggregate.get(aggregate.Count()-1);
		}
		return null;
	}

	/**
	 * 判断聚集对象从后往前是否还有下一个元素
	 */
	@Override
	public boolean hasPrevious() {
		boolean flag = false;
		// 如果当前索引小于0时，返回 false
		if(this.currentCount < 0) {
			return flag;
		}
		if (aggregate.get(this.currentCount) != null) {
			this.currentCount--;
			flag = true;
		}
		return flag;
	}

	/**
	 * 获取聚集对象的当前元素
	 */
	@Override
	public T getCurrent() {

		return this.aggregate.get(this.currentCount + 1);
	}

}
