package pilasYColas;



public class NodoCola<E> implements Comparable<NodoCola<E>>{

	private E data; 
	private NodoCola<E> next;
	
	public NodoCola(E ele) {
		data = ele;
	}
	
	public void setNext(NodoCola<E> next) {
		this.next = next;
	}
	
	public NodoCola<E> getNext(){
		return next;
	}
	
	public E getData() {
		return data;
	}

	@Override
	public int compareTo(NodoCola<E> o) {
		
		return 0;
	}

	
}