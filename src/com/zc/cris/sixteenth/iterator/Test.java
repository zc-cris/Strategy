package com.zc.cris.sixteenth.iterator;


public class Test {
	
	/**
	 * 通过自定义的迭代器和聚集对象完成多数据类型的遍历
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyAggregate<String> aggregate = new MyAggregate<>();
		aggregate.add("james");
		aggregate.add("curry");
		aggregate.add("哈登");
		aggregate.add("cris");
		
		Iterator<String> iterator = aggregate.getIterator();
		String first = iterator.getFirst();
		System.out.println(first);
		// 循环遍历聚集对象（通过自定义的正向迭代器）
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrent());
		}
		
		Iterator<String> iteratorDesc = aggregate.getIteratorDesc();
		String last = iteratorDesc.getLast();
		System.out.println(last);
		// 循环遍历聚集对象（通过自定义的反向迭代器）
		while(iteratorDesc.hasPrevious()) {
			System.out.println(iteratorDesc.getCurrent());
		}
		
	}

}
