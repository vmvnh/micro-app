CREATE TABLE user_service.users
(
    id          UUID DEFAULT gen_random_uuid() NOT NULL,
    username    VARCHAR(15)                    NOT NULL,
    lastname    VARCHAR(15)                    NOT NULL,
    birthday    DATE                           NOT NULL,
    passport    VARCHAR(10)                    NOT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);
