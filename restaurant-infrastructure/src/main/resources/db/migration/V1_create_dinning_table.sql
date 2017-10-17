CREATE TABLE dinning
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    table_id INT(11) DEFAULT '0' NOT NULL,
    status VARCHAR(191) NOT NULL,
    started_at DATETIME,
    ended_at DATETIME,
    created_at DATETIME,
    updated_at DATETIME,
);

CREATE INDEX index_table_id_on_dinning ON dinning(table_id);
CREATE INDEX index_started_at_on_dinning ON dinning(started_at);
CREATE INDEX index_ended_at_on_dinning ON dinning(ended_at);
CREATE INDEX index_created_at_on_dinning ON dinning(created_at);
CREATE INDEX index_updated_at_on_dinning ON dinning(updated_at);
