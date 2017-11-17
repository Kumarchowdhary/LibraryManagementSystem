/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.25-MariaDB : Database - librarymanagementsystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`librarymanagementsystem` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `librarymanagementsystem`;

/*Table structure for table `batch` */

DROP TABLE IF EXISTS `batch`;

CREATE TABLE `batch` (
  `batch_id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_year` varchar(255) DEFAULT NULL,
  `uni_shift` varchar(255) DEFAULT NULL,
  `uni_group` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `prog_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`batch_id`),
  KEY `pro_id` (`prog_id`),
  CONSTRAINT `batch_ibfk_1` FOREIGN KEY (`prog_id`) REFERENCES `program` (`prog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `batch` */

insert  into `batch`(`batch_id`,`batch_year`,`uni_shift`,`uni_group`,`remarks`,`prog_id`) values (2,'2013','morning','pre-engineering','yes',1);

/*Table structure for table `bookissue` */

DROP TABLE IF EXISTS `bookissue`;

CREATE TABLE `bookissue` (
  `issue_id` int(11) NOT NULL AUTO_INCREMENT,
  `issue_date` varchar(255) DEFAULT NULL,
  `return_date` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `std_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`issue_id`),
  KEY `book_id` (`book_id`),
  KEY `std_id` (`std_id`),
  CONSTRAINT `bookissue_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),
  CONSTRAINT `bookissue_ibfk_2` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `bookissue` */

insert  into `bookissue`(`issue_id`,`issue_date`,`return_date`,`remarks`,`std_id`,`book_id`) values (1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `isbn` varchar(255) DEFAULT NULL,
  `publish` varchar(255) DEFAULT NULL,
  `edition` varchar(255) DEFAULT NULL,
  `purchase` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `books_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `booktype` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `books` */

insert  into `books`(`book_id`,`book_title`,`author`,`isbn`,`publish`,`edition`,`purchase`,`price`,`remarks`,`type_id`) values (3,'math','paras','10245','yes','yes','No','1000','hello',3);

/*Table structure for table `booktype` */

DROP TABLE IF EXISTS `booktype`;

CREATE TABLE `booktype` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `booktype` */

insert  into `booktype`(`type_id`,`type`,`remarks`) values (3,'science','good');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `fac_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`dept_id`),
  KEY `fac_id` (`fac_id`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`fac_id`) REFERENCES `faculty` (`fac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `department` */

insert  into `department`(`dept_id`,`dept_name`,`remarks`,`fac_id`) values (1,'software engineering','good',1),(2,'Bio Medical','good',1),(3,'electronics','vip',1);

/*Table structure for table `faculty` */

DROP TABLE IF EXISTS `faculty`;

CREATE TABLE `faculty` (
  `fac_id` int(11) NOT NULL AUTO_INCREMENT,
  `fac_name` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `faculty` */

insert  into `faculty`(`fac_id`,`fac_name`,`remarks`) values (1,' Faculty of Electrical, Electronic and Communication Engineering','yes');

/*Table structure for table `program` */

DROP TABLE IF EXISTS `program`;

CREATE TABLE `program` (
  `prog_id` int(11) NOT NULL AUTO_INCREMENT,
  `prog_name` varchar(255) DEFAULT NULL,
  `prog_duration` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`prog_id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `program_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `program` */

insert  into `program`(`prog_id`,`prog_name`,`prog_duration`,`remarks`,`dept_id`) values (1,'B.E','4 years','hello',1),(3,'B.E','4 years','hello',1);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `std_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_name` varchar(255) DEFAULT NULL,
  `std_fname` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `roll_no` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`std_id`),
  KEY `batch_id` (`batch_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`batch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`std_id`,`std_name`,`std_fname`,`surname`,`contact_no`,`roll_no`,`gender`,`remarks`,`batch_id`) values (3,'paras','nandan','maheshwari','03313278590','13sw39','male','hello',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
