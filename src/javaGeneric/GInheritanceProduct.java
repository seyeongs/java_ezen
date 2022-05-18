package javaGeneric;

public class GInheritanceProduct<T, M, C> extends MultiGenericProduct<T, M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	

}
