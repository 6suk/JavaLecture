package ch13_generic.sec06_wildcard;

public class Applicant<T> {
	public T kind;

	public Applicant(T kind) {
		super();
		this.kind = kind;
	}
	
}
