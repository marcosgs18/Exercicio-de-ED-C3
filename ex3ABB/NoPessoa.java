package ex3ABB;

public class NoPessoa {

	private int info;
	private NoPessoa prox;

	public NoPessoa(int info) {
		super();
		this.info = info;
		this.prox = null; 
	}
	
	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public NoPessoa getProx() {
		return prox;
	}

	public void setProx(NoPessoa prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "No [info=" + info + ", prox=" + prox + "]";
	}
}