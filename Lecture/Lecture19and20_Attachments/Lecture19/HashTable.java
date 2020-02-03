package Lecture19;

import Lecture14and15.Generics.LinkedList;

public class HashTable<K,V> {

	private class HTPair{
		K key;
		V value;
		HTPair(K key,V value){
			this.key=key;
			this.value=value;
		}
		
		public boolean equals(Object other){
			HTPair op=(HTPair) other;
			return this.key.equals(op.key);
		}
		
		public String toString(){
			return "{"+this.key+":"+this.value+"}";
		}
	}
    
	private LinkedList<HTPair>[] bucketArray;
	private int size;
	
	public static final int DEFAULT_CAPACITY=10;
	public HashTable() {
		this(DEFAULT_CAPACITY);
	}
	
	public HashTable(int capacity){
		this.bucketArray=(LinkedList<HTPair>[])new LinkedList[capacity];
		this.size=0;
	}
	
	public void put(K key,V value) throws Exception{
		int bi=HashFunction(key);
		LinkedList<HTPair> bucket=this.bucketArray[bi];
		HTPair pta=new HTPair(key, value);
		if(bucket==null){
			bucket=new LinkedList<>();
			bucket.addLast(pta);
			this.size++;
			this.bucketArray[bi]=bucket;
		}else{
			int foundAt=bucket.find(pta);
			if(foundAt==-1){
				bucket.addLast(pta);
				this.size++;
			}else{
				HTPair listpair=bucket.getAt(foundAt);
				listpair.value=value;
			}
		}
		
		double lambda=(this.size*1.0)/this.bucketArray.length;
		if(lambda>2){
			rehash();
		}
		
	}
	
	public V get(K key) throws Exception{
		int bi=HashFunction(key);
		LinkedList<HTPair> bucket=this.bucketArray[bi];
		HTPair pts=new HTPair(key, null);
		if(bucket==null){
			return null;
		}else{
			int foundAt=bucket.find(pts);
			if(foundAt==-1){
				return null;
			}else{
				HTPair listPair=bucket.getAt(foundAt);
				return listPair.value;
			}
		}
	}
	
	public V remove(K key) throws Exception{
		int bi=HashFunction(key);
		LinkedList<HTPair> bucket=this.bucketArray[bi];
		HTPair pts=new HTPair(key, null);
		if(bucket==null){
			return null;
		}else{
			int foundAt=bucket.find(pts);
			if(foundAt==-1){
				return null;
			}else{
				HTPair listPair=bucket.getAt(foundAt);
				bucket.removeAt(foundAt);
				this.size--;
				return listPair.value;
			}
		}
	}
	
	
	
	private void rehash() throws Exception{
		LinkedList<HTPair>[] oba=this.bucketArray;
		this.bucketArray=(LinkedList<HTPair>[])new LinkedList[2*oba.length];
		this.size=0;
		for(LinkedList<HTPair>ob:oba){
			while(ob!=null&&!ob.isEmpty()){
				HTPair op=ob.removeFirst();
				this.put(op.key, op.value);
			}
		}
	}
 
	public void display() throws Exception{
		for(LinkedList<HTPair> bucket:this.bucketArray){
			if(bucket!=null &&! bucket.isEmpty()){
				bucket.display();
			}else{
				System.out.println("NULL");
				System.out.println("***********************************");
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	
	private int HashFunction(K key){
		int hc=key.hashCode();
		hc=Math.abs(hc);
		int bi=hc%this.bucketArray.length;
		return bi;
	}
	

}
