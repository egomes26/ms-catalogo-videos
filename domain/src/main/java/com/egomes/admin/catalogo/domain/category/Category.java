package com.egomes.admin.catalogo.domain.category;

import com.egomes.admin.catalogo.domain.AggregateRoot;
import com.egomes.admin.catalogo.domain.validation.ValidationHandler;

import java.time.Instant;
import java.util.UUID;

public class Category extends AggregateRoot<CategoryID> {
    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
                final CategoryID anId,
                final String aName,
                final String aDescription,
                final boolean isActive,
                final Instant aCreationDate,
                final Instant anUpdateDate,
                final Instant aDeleteDate
    ) {
        super(anId);
        this.name = aName;
        this.description = aDescription;
        this.active = isActive;
        this.createdAt = aCreationDate;
        this.updatedAt = anUpdateDate;
        this.deletedAt = aDeleteDate;
    }

    public static Category newCategory(final String aName,final String aDescription, final boolean isActive){
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();

        return new Category(CategoryID.unique(),aName,aDescription,isActive,now,now,null);

    }

    @Override
    public void validate(final ValidationHandler handler) {
        new CategoryValidator(this,handler).validate();
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
