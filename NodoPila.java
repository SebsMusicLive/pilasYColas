package pilasYColas;



public class NodoPila<E> implements Comparable<NodoPila<E>>{

	private E data; 
	private NodoPila<E> next;
	
	public NodoPila(E ele) {
		data = ele;
	}
	
	public void setNext(NodoPila<E> next) {
		this.next = next;
	}
	
	public NodoPila<E> getNext(){
		return next;
	}
	
	public E getData() {
		return data;
	}

	@Override
	public int compareTo(NodoPila<E> o) {
		
		return 0;
	}

	
}