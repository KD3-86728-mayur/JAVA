package assignment;

public class ExceptionLineTooLong extends RuntimeException {
	
	ExceptionLineTooLong(){
		
	}
	
	ExceptionLineTooLong(String message){
		super(message);
	}

}
