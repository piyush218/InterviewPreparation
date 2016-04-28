package Generics;

public class OrderedPair<K, V> implements Pair<K, V>
{
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	
}
