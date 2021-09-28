CREATE TABLE customer
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    first_name    VARCHAR(25)           NULL,
    last_name     VARCHAR(25)           NULL,
    email_address VARCHAR(30)           NULL,
    address       VARCHAR(200)          NULL,
    city          VARCHAR(30)           NULL,
    country       VARCHAR(30)           NULL,
    phone_number  VARCHAR(20)           NULL,
    CONSTRAINT pk_customer PRIMARY KEY (id)
);

ALTER TABLE customer
    ADD CONSTRAINT uc_customer_emailaddress UNIQUE (email_address);