package com.egomes.admin.catalogo.domain;

import com.egomes.admin.catalogo.domain.validation.ValidationHandler;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID>{
    public AggregateRoot(final ID id) {
        super(id);
    }
}
