package exceptions;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String mensajeError){
        super(mensajeError);
    }
}
