package _02_diy_array_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<E> implements List {
	E[] list;
	
	public ArrayList() {

		list = (E[]) new Object[0];
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub

		return list.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		E[] list2 = (E[]) new Object[list.length+1];
		for (int i = 0; i < list.length; i++) {
			list2[i]= list[i];
		}
		list2[list2.length-1] = (E) e;
		list = list2;
		
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		return (E)list[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length; i++) {
			if (index==i) {
				list[i]=(E) element;
			}
		}
		
		return list[index];
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
