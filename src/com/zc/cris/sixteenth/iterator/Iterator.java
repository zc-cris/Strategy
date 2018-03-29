package com.zc.cris.sixteenth.iterator;

public interface Iterator<T> {

	default T getFirst() {
		return null;
	}

	default boolean hasNext() {
		return false;
	}

	default T getCurrent() {
		return null;
	}

	default T getLast() {
		return null;
	}

	default boolean hasPrevious() {
		return false;
	}

}
