package javaGeneric;

public class MultiGenericProduct<T, M> { //멀티타입 파라미터 작성
		private T kind;
		private M model;
		public T getKind() {
			return kind;
		}
		public void setKind(T kind) {
			this.kind = kind;
		}
		public M getModel() {
			return model;
		}
		public void setModel(M model) {
			this.model = model;
		}

		
		

}
