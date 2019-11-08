-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema jurassicparkdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `jurassicparkdb` ;

-- -----------------------------------------------------
-- Schema jurassicparkdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jurassicparkdb` DEFAULT CHARACTER SET utf8 ;
USE `jurassicparkdb` ;

-- -----------------------------------------------------
-- Table `dinosaur`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dinosaur` ;

CREATE TABLE IF NOT EXISTS `dinosaur` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS jesse@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'jesse'@'localhost' IDENTIFIED BY 'jesse';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'jesse'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `dinosaur`
-- -----------------------------------------------------
START TRANSACTION;
USE `jurassicparkdb`;
INSERT INTO `dinosaur` (`id`, `name`) VALUES (1, 'Denver');
INSERT INTO `dinosaur` (`id`, `name`) VALUES (2, 'Steggy');

COMMIT;
