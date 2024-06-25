package com.akshu.methods_collection;

public class DynamicArray<T> 
{
	private T[] array;
	private int size;
	private int capacity;

	public DynamicArray(int initialCapacity) {
		this.capacity = initialCapacity;
		this.array = (T[]) new Object[initialCapacity];
		this.size = 0;
	}

	public DynamicArray() {
		this(10); // Default initial capacity of 10
	}

	public void add(T element) {
		ensureCapacity();
		array[size++] = element;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return array[index];
	}

	public void set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		array[index] = element;
	}

	public int size() {
		return size;
	}

	private void ensureCapacity() 
	{
		if (size == capacity) {
			int newCapacity = capacity * 2;
			T[] newArray = (T[]) new Object[newCapacity];
			System.arraycopy(array, 0, newArray, 0, size);
			array = newArray;
			capacity = newCapacity;
		}
	}
}