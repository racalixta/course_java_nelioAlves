package model.exceptions;

// também pode ser uma -> extends Exception (é obrigatório tratar no código fonte e colocar o Throws 'nome execiption')
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
