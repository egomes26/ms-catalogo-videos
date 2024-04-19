package com.egomes.admin.catalogo.domain.exceptions;

import com.egomes.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktraceException{

    private final List<Error> errors;

    private DomainException(final String aMessage, final List<Error> anErros){
        super(aMessage);
        this.errors = anErros;
    }

    public static DomainException with(final Error anError){
        return new DomainException(anError.message(),List.of(anError));
    }


    public static DomainException with(final List<Error> anErrors){
        return new DomainException("",anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
