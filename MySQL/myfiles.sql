/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.1.31-community : Database - stock_main
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`stock_main` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `stock_main`;

/*Table structure for table `admin_login` */

DROP TABLE IF EXISTS `admin_login`;

CREATE TABLE `admin_login` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Table structure for table `billing` */

DROP TABLE IF EXISTS `billing`;

CREATE TABLE `billing` (
  `Bill_No` varchar(50) DEFAULT NULL,
  `Product_Name` varchar(50) DEFAULT NULL,
  `PricePP` varchar(50) DEFAULT NULL,
  `GST` varchar(50) DEFAULT NULL,
  `Quantity` varchar(50) DEFAULT NULL,
  `Total` varchar(50) DEFAULT NULL,
  `Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `Cat_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Category` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Cat_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Table structure for table `employee_details` */

DROP TABLE IF EXISTS `employee_details`;

CREATE TABLE `employee_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(20) DEFAULT NULL,
  `Last_Name` varchar(20) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Phone_No` varchar(20) DEFAULT NULL,
  `Email_Id` varchar(50) DEFAULT NULL,
  `Address` varchar(256) DEFAULT NULL,
  `D_O_B` date DEFAULT NULL,
  `Aadhar_no` varchar(20) DEFAULT NULL,
  `Qualification` varchar(50) DEFAULT NULL,
  `Experience` varchar(20) DEFAULT NULL,
  `Position` varchar(20) DEFAULT NULL,
  `Created_By` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Table structure for table `login_details` */

DROP TABLE IF EXISTS `login_details`;

CREATE TABLE `login_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Table structure for table `no_stock` */

DROP TABLE IF EXISTS `no_stock`;

CREATE TABLE `no_stock` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(50) DEFAULT NULL,
  `Category` varchar(50) DEFAULT NULL,
  `No_Stock` int(11) DEFAULT NULL,
  `GST` int(11) DEFAULT NULL,
  `Price_PP` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `Product_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(20) DEFAULT NULL,
  `Supplier_Name` varchar(20) DEFAULT NULL,
  `Supplier_Id` int(11) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  `Description` varchar(256) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `needed_stock` bigint(20) DEFAULT NULL,
  `Price_PP` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Product_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Table structure for table `supplier_bank_details` */

DROP TABLE IF EXISTS `supplier_bank_details`;

CREATE TABLE `supplier_bank_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Bank_Name` varchar(256) DEFAULT NULL,
  `Branch_Name` varchar(256) DEFAULT NULL,
  `Account_No` varchar(50) DEFAULT NULL,
  `IFSC_Code` varchar(30) DEFAULT NULL,
  `UPI_Id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Table structure for table `supplier_details` */

DROP TABLE IF EXISTS `supplier_details`;

CREATE TABLE `supplier_details` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Supplier_Name` varchar(20) DEFAULT NULL,
  `Company_Name` varchar(20) DEFAULT NULL,
  `GSTINNo` varchar(20) DEFAULT NULL,
  `Contact_No_1` bigint(20) DEFAULT NULL,
  `Contact_No_2` bigint(20) DEFAULT NULL,
  `EMail` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Supply_Category` varchar(50) DEFAULT NULL,
  `Website` varchar(50) DEFAULT NULL,
  `ODD` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
