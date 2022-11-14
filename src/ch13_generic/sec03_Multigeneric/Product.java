package ch13_generic.sec03_Multigeneric;

public class Product<K, M> {
	private K kind;
	private M model;
	
	
	public Product() {
		super();
	}

	public Product(K kind, M model) {
		super();
		this.kind = kind;
		this.model = model;
	}
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
}
