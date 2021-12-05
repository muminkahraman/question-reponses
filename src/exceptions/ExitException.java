package exceptions;

public class ExitException extends Exception{
    public ExitException(String msg){ super(msg); }
    public ExitException(){ super(); }

    @Override
    public String getMessage() {
        return "*** FIN DE LA PARTIE *** ";
    }
}
