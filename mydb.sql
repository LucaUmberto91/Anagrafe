-- MySQL dump 10.13  Distrib 8.0.17, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `archive`
--

DROP TABLE IF EXISTS `archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `archive` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archive`
--

LOCK TABLES `archive` WRITE;
/*!40000 ALTER TABLE `archive` DISABLE KEYS */;
/*!40000 ALTER TABLE `archive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `countries` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(26) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES (1,'?'),(2,'Cambodia'),(3,'Canada'),(4,'China'),(5,'Columbia'),(6,'Cuba'),(7,'Dominican-Republic'),(8,'Ecuador'),(9,'El-Salvador'),(10,'England'),(11,'France'),(12,'Germany'),(13,'Greece'),(14,'Guatemala'),(15,'Haiti'),(16,'Holand-Netherlands'),(17,'Honduras'),(18,'Hong'),(19,'Hungary'),(20,'India'),(21,'Iran'),(22,'Ireland'),(23,'Italy'),(24,'Jamaica'),(25,'Japan'),(26,'Laos'),(27,'Mexico'),(28,'Nicaragua'),(29,'Outlying-US(Guam-USVI-etc)'),(30,'Peru'),(31,'Philippines'),(32,'Poland'),(33,'Portugal'),(34,'Puerto-Rico'),(35,'Scotland'),(36,'South'),(37,'Taiwan'),(38,'Thailand'),(39,'Trinadad&Tobago'),(40,'United-States'),(41,'Vietnam'),(42,'Yugoslavia');
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `education_levels`
--

DROP TABLE IF EXISTS `education_levels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `education_levels` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `education_levels`
--

LOCK TABLES `education_levels` WRITE;
/*!40000 ALTER TABLE `education_levels` DISABLE KEYS */;
INSERT INTO `education_levels` VALUES (1,'10th'),(2,'11th'),(3,'12th'),(4,'1st-4th'),(5,'5th-6th'),(6,'7th-8th'),(7,'9th'),(8,'Assoc-acdm'),(9,'Assoc-voc'),(10,'Bachelors'),(11,'Doctorate'),(12,'HS-grad'),(13,'Masters'),(14,'Preschool'),(15,'Prof-school'),(16,'Some-college');
/*!40000 ALTER TABLE `education_levels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (18);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marital_statuses`
--

DROP TABLE IF EXISTS `marital_statuses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marital_statuses` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(21) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marital_statuses`
--

LOCK TABLES `marital_statuses` WRITE;
/*!40000 ALTER TABLE `marital_statuses` DISABLE KEYS */;
INSERT INTO `marital_statuses` VALUES (1,'Divorced'),(2,'Married-AF-spouse'),(3,'Married-civ-spouse'),(4,'Married-spouse-absent'),(5,'Never-married'),(6,'Separated'),(7,'Widowed');
/*!40000 ALTER TABLE `marital_statuses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `occupations`
--

DROP TABLE IF EXISTS `occupations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `occupations` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(17) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `occupations`
--

LOCK TABLES `occupations` WRITE;
/*!40000 ALTER TABLE `occupations` DISABLE KEYS */;
INSERT INTO `occupations` VALUES (1,'?'),(2,'Adm-clerical'),(3,'Armed-Forces'),(4,'Craft-repair'),(5,'Exec-managerial'),(6,'Farming-fishing'),(7,'Handlers-cleaners'),(8,'Machine-op-inspct'),(9,'Other-service'),(10,'Priv-house-serv'),(11,'Prof-specialty'),(12,'Protective-serv'),(13,'Sales'),(14,'Tech-support'),(15,'Transport-moving');
/*!40000 ALTER TABLE `occupations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `races`
--

DROP TABLE IF EXISTS `races`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `races` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(18) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `races`
--

LOCK TABLES `races` WRITE;
/*!40000 ALTER TABLE `races` DISABLE KEYS */;
INSERT INTO `races` VALUES (1,'Amer-Indian-Eskimo'),(2,'Asian-Pac-Islander'),(3,'Black'),(4,'Other'),(5,'White');
/*!40000 ALTER TABLE `races` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` tinyint(4) DEFAULT NULL,
  `education_level_id` tinyint(4) DEFAULT NULL,
  `race_id` tinyint(4) DEFAULT NULL,
  `sex_id` tinyint(4) DEFAULT NULL,
  `country_id` tinyint(4) DEFAULT NULL,
  `education_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES (16,28,NULL,NULL,2,23,10),(17,23,NULL,NULL,1,15,10);
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relationships`
--

DROP TABLE IF EXISTS `relationships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `relationships` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relationships`
--

LOCK TABLES `relationships` WRITE;
/*!40000 ALTER TABLE `relationships` DISABLE KEYS */;
INSERT INTO `relationships` VALUES (1,'Husband'),(2,'Not-in-family'),(3,'Other-relative'),(4,'Own-child'),(5,'Unmarried'),(6,'Wife');
/*!40000 ALTER TABLE `relationships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sexes`
--

DROP TABLE IF EXISTS `sexes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sexes` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sexes`
--

LOCK TABLES `sexes` WRITE;
/*!40000 ALTER TABLE `sexes` DISABLE KEYS */;
INSERT INTO `sexes` VALUES (1,'Female'),(2,'Male');
/*!40000 ALTER TABLE `sexes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sqlite_stat1`
--

DROP TABLE IF EXISTS `sqlite_stat1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sqlite_stat1` (
  `tbl` varchar(16) DEFAULT NULL,
  `idx` varchar(36) DEFAULT NULL,
  `stat` mediumint(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sqlite_stat1`
--

LOCK TABLES `sqlite_stat1` WRITE;
/*!40000 ALTER TABLE `sqlite_stat1` DISABLE KEYS */;
INSERT INTO `sqlite_stat1` VALUES ('records','unknown_value_please_contact_support',48842),('sexes','unknown_value_please_contact_support',2),('education_levels','unknown_value_please_contact_support',16),('occupations','unknown_value_please_contact_support',15);
/*!40000 ALTER TABLE `sqlite_stat1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sqlite_stat4`
--

DROP TABLE IF EXISTS `sqlite_stat4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sqlite_stat4` (
  `tbl` varchar(0) DEFAULT NULL,
  `idx` varchar(0) DEFAULT NULL,
  `neq` varchar(0) DEFAULT NULL,
  `nlt` varchar(0) DEFAULT NULL,
  `ndlt` varchar(0) DEFAULT NULL,
  `sample` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sqlite_stat4`
--

LOCK TABLES `sqlite_stat4` WRITE;
/*!40000 ALTER TABLE `sqlite_stat4` DISABLE KEYS */;
/*!40000 ALTER TABLE `sqlite_stat4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workclasses`
--

DROP TABLE IF EXISTS `workclasses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workclasses` (
  `id` tinyint(4) DEFAULT NULL,
  `name` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workclasses`
--

LOCK TABLES `workclasses` WRITE;
/*!40000 ALTER TABLE `workclasses` DISABLE KEYS */;
INSERT INTO `workclasses` VALUES (1,'?'),(2,'Federal-gov'),(3,'Local-gov'),(4,'Never-worked'),(5,'Private'),(6,'Self-emp-inc'),(7,'Self-emp-not-inc'),(8,'State-gov'),(9,'Without-pay');
/*!40000 ALTER TABLE `workclasses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-13 19:41:21
