-- MySQL dump 10.13  Distrib 8.0.12, for Linux (x86_64)
--
-- Host: localhost    Database: trendz
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `V1`
--

DROP TABLE IF EXISTS `V1`;
/*!50001 DROP VIEW IF EXISTS `V1`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `V1` AS SELECT 
 1 AS `fname`,
 1 AS `lname`,
 1 AS `cust_id`,
 1 AS `sum(amount)`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'tanish','tanish'),(2,'pratik','pratik'),(3,'riya','riya');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bill` (
  `bill_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `amount` varchar(20) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`bill_id`),
  KEY `cust_id` (`cust_id`),
  KEY `admin_id` (`admin_id`),
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`),
  CONSTRAINT `bill_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (101,1,'2018-10-29','07:41:01 AM','89492',3),(102,2,'2018-10-29','07:42:24 AM','47497',3),(103,3,'2018-10-29','07:44:59 AM','40992',3),(104,4,'2018-10-29','10:53:10 AM','121995',3),(105,5,'2018-11-03','23:40:51 PM','122397',1),(106,1,NULL,NULL,NULL,1),(107,1,'2019-03-19','22:18:15 PM','157994',3),(108,6,'2019-03-19','22:38:17 PM',NULL,1),(110,6,'2019-03-20','11:54:58 AM','398980',1),(111,6,NULL,NULL,NULL,1),(116,1,'2019-07-08','17:51:14 PM','100000',3);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `number` bigint(20) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `locality` varchar(50) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cust_id`),
  KEY `admin_id` (`admin_id`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'kunil','kothari','Male',8552940134,'kunil9@gmail.com','Hyde park','Mumbai','Arunachal Pradesh','2018-10-16',2),(2,'riya','loya','Female',7741068050,'riya.loya@gmail.com','Amar Cottages','Pune','Assam','2018-10-03',3),(3,'Pratik','Mehta','Male',8237358545,'pratik9@gmail.com','HermesHeritage','Banglore','Assam','2018-10-14',3),(4,'riya','loya','Female',9850453050,'riya.loya@gmail.com','hadapsar','Mumbai','Andhra Pradesh','2018-10-09',3),(5,'bhavini','kothari','Female',9545966615,'bhavini@gmail.com','hyde park','Pune','Assam','2018-11-15',1),(6,'Tanish','Shah','Male',9172324321,'tanish2110@gmail.com','Mukundnagar','Pune','Assam','1998-10-21',1),(7,'Tanish','Shah','Male',8208083770,'tanish231@gmail.com','Mukunnnagar','Pune','Maharashtra','2017-03-16',1);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inventory` (
  `item_id` int(11) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `CP` int(11) DEFAULT NULL,
  `SP` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `admin_id` (`admin_id`),
  CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (100,'Sofa Set','Santiago Blue Sofa',17999,100000,14,3),(101,'Sofa Set','Segur Wood SofaSet',23499,40799,2,2),(200,'Bedroom Set','Taro Queen Size Bed',20499,47497,9,3),(300,'Wadrobes','Nariko',15999,38997,8,1),(400,'Dining Set','Tempura Dining Set',15999,38997,8,1),(500,'Artefacts','Polyresin Monk',249,1995,9,2),(600,'Bedroom Set','abc',13000,40000,4,1);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `profits` AFTER INSERT ON `inventory` FOR EACH ROW begin
declare p float;
declare id int;
set p=new.SP-new.CP;
select max(item_id) into id from inventory;
insert into profit values(id,p);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `link`
--

DROP TABLE IF EXISTS `link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `link` (
  `id` int(11) DEFAULT NULL,
  `bill_id` int(11) DEFAULT NULL,
  KEY `bill_id` (`bill_id`),
  KEY `id` (`id`),
  CONSTRAINT `link_ibfk_3` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`) ON DELETE CASCADE,
  CONSTRAINT `link_ibfk_4` FOREIGN KEY (`id`) REFERENCES `product` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `link`
--

LOCK TABLES `link` WRITE;
/*!40000 ALTER TABLE `link` DISABLE KEYS */;
INSERT INTO `link` VALUES (3,101),(9,103),(10,104),(12,104),(13,105),(15,107),(16,107),(19,110),(22,116);
/*!40000 ALTER TABLE `link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `prod_name` varchar(20) DEFAULT NULL,
  `prod_type` varchar(20) DEFAULT NULL,
  `mrp` float DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total_cost` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pid` (`pid`),
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`pid`) REFERENCES `inventory` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,100,'Santiago Blue Sofa','Sofa Set',40000,1,40000),(2,100,'Santiago Blue Sofa','Sofa Set',40000,1,40000),(3,100,'Santiago Blue Sofa','Sofa Set',40000,1,40000),(9,500,'Polyresin Monk','Artefacts',1995,1,1995),(10,100,'Santiago Blue Sofa','Sofa Set',60000,2,120000),(12,500,'Polyresin Monk','Artefacts',1995,1,1995),(13,101,'Segur Wood SofaSet','Sofa Set',40799,3,122397),(15,100,'Santiago Blue Sofa','Sofa Set',80000,1,80000),(16,300,'Nariko','Wadrobes',38997,2,77994),(19,101,'Segur Wood SofaSet','Sofa Set',40799,5,203995),(22,100,'Santiago Blue Sofa','Sofa Set',100000,1,100000);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profit`
--

DROP TABLE IF EXISTS `profit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `profit` (
  `profit_id` int(11) NOT NULL,
  `profit` int(11) DEFAULT NULL,
  PRIMARY KEY (`profit_id`),
  CONSTRAINT `profit_ibfk_1` FOREIGN KEY (`profit_id`) REFERENCES `inventory` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profit`
--

LOCK TABLES `profit` WRITE;
/*!40000 ALTER TABLE `profit` DISABLE KEYS */;
INSERT INTO `profit` VALUES (100,19001),(101,17300),(200,26998),(300,23198),(400,22998),(500,1746),(600,27000);
/*!40000 ALTER TABLE `profit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `t`
--

DROP TABLE IF EXISTS `t`;
/*!50001 DROP VIEW IF EXISTS `t`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `t` AS SELECT 
 1 AS `cust_id`,
 1 AS `fname`,
 1 AS `lname`,
 1 AS `sum(amount)`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `V1`
--

/*!50001 DROP VIEW IF EXISTS `V1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `V1` AS select `customer`.`fname` AS `fname`,`customer`.`lname` AS `lname`,`customer`.`cust_id` AS `cust_id`,sum(`bill`.`amount`) AS `sum(amount)` from (`customer` join `bill`) where (`customer`.`cust_id` = `bill`.`cust_id`) group by `customer`.`cust_id` having (sum(`bill`.`amount`) > 70000) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `t`
--

/*!50001 DROP VIEW IF EXISTS `t`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `t` AS select `customer`.`cust_id` AS `cust_id`,`customer`.`fname` AS `fname`,`customer`.`lname` AS `lname`,sum(`bill`.`amount`) AS `sum(amount)` from (`customer` join `bill` on((`bill`.`cust_id` = `customer`.`cust_id`))) group by `customer`.`cust_id` having (sum(`bill`.`amount`) > '90') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 17:59:12
