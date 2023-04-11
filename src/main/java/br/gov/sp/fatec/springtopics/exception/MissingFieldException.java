package br.gov.sp.fatec.springtopics.exception;

public class MissingFieldException extends RuntimeException {
    public MissingFieldException(String message) {
        super(message);
    }
}

