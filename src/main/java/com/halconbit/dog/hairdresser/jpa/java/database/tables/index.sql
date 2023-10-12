CREATE TABLE IF NOT EXISTS `dog_hairdresser`.`owner` (
    `Rfrnc`        INT(255)     NOT NULL AUTO_INCREMENT COMMENT 'Rfrnc        (English: Reference                          / Spanish: Referencia)',
    `Usrnm`        VARCHAR(20)  NOT NULL                COMMENT 'Usrnm        (English: Username                           / Spanish: Nombre de Usuario)',
    `Psswrd`       VARCHAR(255) NOT NULL                COMMENT 'Psswrd       (English: Password                           / Spanish: Contraseña)',
    `Rfrnc_Prsn`   INT    (255) NOT NULL                COMMENT 'Rfrnc_Prsn   (English: Reference. Person                  / Spanish: Referencia. Persona)',
    `UsrTyp_Rfrnc` INT    (255) NOT NULL                COMMENT 'UsrTyp_Rfrnc (English: User Type. Reference               / Spanish: Referencia. Tipo de Usuario)',
    `Cndtn`        INT    (2)   NOT NULL                COMMENT 'Cndtn        (English: Condition [0: Inactive, 1: Active] / Spanish: Estado [0: Inactivo, 1: Activo])',
    `Rmvd`         INT    (2)   NOT NULL                COMMENT 'Rmvd         (English: Removed [0: Inactive, 1: Active]   / Spanish: Eliminado [0: Inactivo, 1: Activo])',
    `Lckd`         INT    (2)   NOT NULL                COMMENT 'Lckd         (English: Locked [0: Inactive, 1: Active]    / Spanish: Bloqueado [0: Inactivo, 1: Activo])',
    `DtAdmssn`     DATE             NULL                COMMENT 'DtAdmssn     (English: Date of Admission                  / Spanish: Fecha de Ingreso)',
    `ChckTm`       TIME             NULL                COMMENT 'ChckTm       (English: Check In Time                      / Spanish: Hora de Ingreso)',
    PRIMARY KEY (`Rfrnc`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='0_Usrs (English: 0 - Users / Spanish: 0 - Usuarios)';


CREATE TABLE IF NOT EXISTS `dog_hairdresser`.`pet` (
    `Rfrnc`        INT(255)     NOT NULL AUTO_INCREMENT COMMENT 'Rfrnc        (English: Reference                          / Spanish: Referencia)',
    `Usrnm`        VARCHAR(20)  NOT NULL                COMMENT 'Usrnm        (English: Username                           / Spanish: Nombre de Usuario)',
    `Psswrd`       VARCHAR(255) NOT NULL                COMMENT 'Psswrd       (English: Password                           / Spanish: Contraseña)',
    `Rfrnc_Prsn`   INT    (255) NOT NULL                COMMENT 'Rfrnc_Prsn   (English: Reference. Person                  / Spanish: Referencia. Persona)',
    `UsrTyp_Rfrnc` INT    (255) NOT NULL                COMMENT 'UsrTyp_Rfrnc (English: User Type. Reference               / Spanish: Referencia. Tipo de Usuario)',
    `Cndtn`        INT    (2)   NOT NULL                COMMENT 'Cndtn        (English: Condition [0: Inactive, 1: Active] / Spanish: Estado [0: Inactivo, 1: Activo])',
    `Rmvd`         INT    (2)   NOT NULL                COMMENT 'Rmvd         (English: Removed [0: Inactive, 1: Active]   / Spanish: Eliminado [0: Inactivo, 1: Activo])',
    `Lckd`         INT    (2)   NOT NULL                COMMENT 'Lckd         (English: Locked [0: Inactive, 1: Active]    / Spanish: Bloqueado [0: Inactivo, 1: Activo])',
    `DtAdmssn`     DATE             NULL                COMMENT 'DtAdmssn     (English: Date of Admission                  / Spanish: Fecha de Ingreso)',
    `ChckTm`       TIME             NULL                COMMENT 'ChckTm       (English: Check In Time                      / Spanish: Hora de Ingreso)',
    PRIMARY KEY (`Rfrnc`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='0_Usrs (English: 0 - Users / Spanish: 0 - Usuarios)';