package com.zc.cris.sixteenth.iterator;

public class MyIterator<T> implements Iterator<T> {

	private MyAggregate<T> aggregate;
	private int currentCount = 0;

	// 处理聚集对象
	public MyIterator(MyAggregate<T> aggregate) {
		this.aggregate = aggregate;
	}

	/**
	 * 返回第一个值
	 */
	@Override
	public T getFirst() {
		return aggregate.get(0);
	}

	/**
	 * 判断聚集对象是否还有下一个元素
	 */
	@Override
	public boolean hasNext() {
		boolean flag = false;
		// 如果当前索引大于或等于聚集对象的最大长度时，返回 false
		if(this.currentCount >= aggregate.Count()) {
			return flag;
		}
		if (aggregate.get(this.currentCount) != null) {
			this.currentCount++;
			flag = true;
		}
		return flag;
	}

	/**
	 * 获取聚集对象的当前元素
	 */
	@Override
	public T getCurrent() {

		return this.aggregate.get(this.currentCount - 1);
	}

}
