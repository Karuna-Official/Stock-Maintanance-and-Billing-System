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

/*Data for the table `admin_login` */

insert  into `admin_login`(`Id`,`Username`,`Password`) values 
(1,'Admin','Admin@123'),
(2,'rohith','rohith');

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

/*Data for the table `billing` */

insert  into `billing`(`Bill_No`,`Product_Name`,`PricePP`,`GST`,`Quantity`,`Total`,`Date`) values 
('1','Microprocessor 8081','1000','12','1','1000','2024-07-22'),
('2','Microprocessor 8086','1000','12','2','2240','2024-07-22'),
('2','Keyboard','1200','18','3','4248','2024-07-22'),
('2','Mouse','1200','13','2','2712','2024-07-22'),
('3','Keyboard','1200','18','2','2832','2024-08-22'),
('4','Microprocessor 8086','1000','12','1','1120','2024-08-22'),
('4','Keyboard','1200','18','2','2832','2024-08-22'),
('4','Mouse','1200','13','3','4068','2024-08-22');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `Cat_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Category` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Cat_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `category` */

insert  into `category`(`Cat_Id`,`Category`) values 
(1,'Computer'),
(2,'Laptop'),
(3,'Mobile'),
(4,'TV'),
(5,'CPU'),
(6,'Light');

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

/*Data for the table `employee_details` */

insert  into `employee_details`(`Id`,`First_Name`,`Last_Name`,`Age`,`Gender`,`Phone_No`,`Email_Id`,`Address`,`D_O_B`,`Aadhar_no`,`Qualification`,`Experience`,`Position`,`Created_By`) values 
(1,'KarunaKaran','K',23,'Male','6382475002','karuna@gmail.com','Kalayarkovil','2003-02-10','1234-1234-1234','BE','0-2 Years','Admin','God'),
(2,'Manikanadan','S',23,'Male','7639250813','manikandan@gmail.com','pattukottai','2000-06-06','1234-5678-9098','BE.CSE','0 - 2 Years','Admin','Admin'),
(3,'Pathmesh','E',22,'Male','9876543210','pathu10@gmail.com','asdasds','2003-01-03','1029-3847-5637','BE.CSE','0 - 2 Years','Employee','Admin'),
(4,'Rohith','K',22,'Male','0987867672','rohithrv@gmai.com','Pudukkottai','2002-09-27','0099-8776-6554','BE.CSE','0 - 2 Years',NULL,NULL);

/*Table structure for table `login_details` */

DROP TABLE IF EXISTS `login_details`;

CREATE TABLE `login_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `login_details` */

insert  into `login_details`(`Id`,`Username`,`Password`) values 
(1,'admin','admin');

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

/*Data for the table `no_stock` */

insert  into `no_stock`(`Id`,`Product_Name`,`Category`,`No_Stock`,`GST`,`Price_PP`) values 
(1,'Microprocessor 8086','Computer',25,12,'1000'),
(2,'Keyboard','Computer',25,18,'1200'),
(3,'Mouse','Computer',269,13,'1200'),
(4,'Asus rog','Laptop',10,20,'50000');

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

/*Data for the table `stock` */

insert  into `stock`(`Product_Id`,`Product_Name`,`Supplier_Name`,`Supplier_Id`,`category`,`Description`,`contact`,`needed_stock`,`Price_PP`) values 
(1,'Microprocessor 8086','Joel',1,'Computer','Used for computers','9877542246',19,12),
(2,'Keyboard','manikandan',1,'Computer','used to type','9867856466',2000,5),
(3,'Mouse','manikandan',1,'Computer','used for computer','8797876732',5,300),
(4,'Asus rog','Mani',1,'Laptop','Laptop','9876543212',2,50000);

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

/*Data for the table `supplier_bank_details` */

insert  into `supplier_bank_details`(`Id`,`Bank_Name`,`Branch_Name`,`Account_No`,`IFSC_Code`,`UPI_Id`) values 
(1,'sbi','pattukkottai','0987654321122','sbi000123','98798697@oksbi');

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

/*Data for the table `supplier_details` */

insert  into `supplier_details`(`ID`,`Supplier_Name`,`Company_Name`,`GSTINNo`,`Contact_No_1`,`Contact_No_2`,`EMail`,`Address`,`Supply_Category`,`Website`,`ODD`) values 
(1,'Manikandan','Manik','12313431',9876544223,2343214123,'Karunakarangmail.com','asdaecdcx','Compter','www.google.com','2 days');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
