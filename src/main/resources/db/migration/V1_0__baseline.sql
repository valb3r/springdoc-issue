CREATE TABLE product
(
    id              BIGINT NOT NULL,
    related_id      BIGINT,
    name            VARCHAR(255),
    description     VARCHAR(255),
    categories_list VARCHAR(255),
    CONSTRAINT pk_product PRIMARY KEY (id)
);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_PRODUCT FOREIGN KEY (related_id) REFERENCES product (id);

CREATE TABLE product_item
(
    id                    BIGINT NOT NULL,
    product_id            BIGINT,
    quantity              BIGINT NOT NULL,
    location_in_warehouse VARCHAR(255),
    CONSTRAINT pk_productitem PRIMARY KEY (id)
);

ALTER TABLE product_item
    ADD CONSTRAINT FK_PRODUCTITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

CREATE SEQUENCE springdoc_sequence INCREMENT BY 50;