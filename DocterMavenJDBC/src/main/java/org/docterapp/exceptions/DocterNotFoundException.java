package org.docterapp.exceptions;

public class DocterNotFoundException extends  Exception{
    public DocterNotFoundException() {
    }

    public DocterNotFoundException(String message) {
        super(message);
    }
}
