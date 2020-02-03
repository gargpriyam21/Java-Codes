package Lecture20;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	
	private ArrayList<T> data;
	private boolean isMin;
	
	public Heap(){
		this(false);
	}
	
	public Heap(boolean isMin){
		this.data=new ArrayList<>();
		this.isMin=isMin;
	}
	
	public Heap(T[] arr, boolean isMin){
		this(isMin);
		
		for(int i = 0; i<arr.length; i++){
			this.data.add(arr[i]);
		}
		
		for(int i = (arr.length/2) -1 ; i>=0 ; i-- ){
			this.downHeapify(i);
		}
	}
	
	public int size(){
		return this.data.size();
	}
	
	public boolean isEmpty(){
		return this.size()==0;
	}
	
	public T getHP(){
		return this.data.get(0);
	}
	
	public void add(T item){
		this.data.add(item);
		this.upHeapify(this.data.size()-1);
	
	}
	
	private void upHeapify(int ci){
		if(ci==0){
			return;
		}
		int pi=(ci-1)/2;
		if(!isLarger(pi,ci)){
			swap(pi,ci);
			this.upHeapify(pi);
		}
	}
	
	private void swap(int i,int j){
		T temp=this.data.get(i);
		this.data.set(i, this.data.get(j));
		this.data.set(j, temp);
	}
	
	private boolean isLarger(int i,int j){
		T ithItem=this.data.get(i);
		T jthItem=this.data.get(j);
		if(this.isMin){
			return ithItem.compareTo(jthItem)<0;
		}
		
		return ithItem.compareTo(jthItem)>0;
	}

	public T remove(){
		T rv=this.data.get(0);
		swap(0,this.data.size()-1);
		this.data.remove(this.data.size()-1);
		this.downHeapify(0);
		return rv;
	}
	
	private void downHeapify(int pi){
		int lci=2*pi+1;
		int rci=2*pi+2;
		 int mi=pi;
		if(lci<this.data.size()&&isLarger(lci,mi)){
			mi=lci;
		}
		if(rci<this.data.size()&&isLarger(rci,mi)){
			mi=rci;
		}
		if(mi!=pi){
			this.swap(mi, pi);
			this.downHeapify(mi);
		}
	}

    public void display(){
    	this.displayNode(0);
    }
    
    private void displayNode(int idx){
    	int lci=2*idx+1;
    	int rci=2*idx+2;
    	
    	T node=this.data.get(idx);
    	String str="";
    	if(lci<this.data.size()){
    		T lc=this.data.get(lci);
    		str+=lc+"=>";
    	}else{
    		str+="END=>";
    	}
    	str+=node;
    	if(rci<this.data.size()){
    		T rc=this.data.get(rci);
    		str+="<="+rc;
    	}else{
    		str+="<=END";
    	}
    	System.out.println(str);
    	if(lci<this.data.size()){
    		this.displayNode(lci);
    	}
    	if(rci<this.data.size()){
    		this.displayNode(rci);
    	}
    }
}
