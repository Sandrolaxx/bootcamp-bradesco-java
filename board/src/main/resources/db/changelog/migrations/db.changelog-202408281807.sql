--comment: set unblock_reason nullable

ALTER TABLE BLOCKS ALTER COLUMN unblock_reason TYPE VARCHAR(255);

--rollback ALTER COLUMN unblock_reason DROP NOT NULL;