CREATE TABLE IF NOT EXISTS `dog_hairdresser`.`owner` (
    `owner_id`         INT(255)     NOT NULL AUTO_INCREMENT COMMENT '',
    `name`             VARCHAR(50)  NOT NULL                COMMENT '',
    `cellphone_number` VARCHAR(20) NOT NULL                 COMMENT '',
    `address`          TEXT NULL
    PRIMARY KEY (`owner_id`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='';


CREATE TABLE IF NOT EXISTS `dog_hairdresser`.`pet` (
    `customer_number` INT(255)     NOT NULL AUTO_INCREMENT COMMENT '',
    `dog_name`        VARCHAR(20)  NOT NULL                COMMENT '',
    `breed`           VARCHAR(255) NOT NULL                COMMENT '',
    `color`           VARCHAR(20)      NULL                COMMENT '',
    `allergic`        VARCHAR(20)      NULL                COMMENT '',
    `special_care`    VARCHAR(20)      NULL                COMMENT '',
    `observations`    TEXT             NULL                COMMENT '',
    PRIMARY KEY (`customer_number`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='';