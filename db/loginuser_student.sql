-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: loginuser
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `regdate` varchar(50) NOT NULL,
  `secret_question` varchar(50) NOT NULL,
  `secret_answer` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'a','a','a','a','2016-03-04','a','a'),(2,'üa','a','a','a','2016-03-05','a','a'),(3,'a','a','a','a','2016-03-05','a','a'),(4,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(5,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(6,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(7,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(8,'ü','ü','ü','ü','2016-03-05','ü','ü'),(11,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(12,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(14,'Ã¼','Ã¼','Ã¼','Ã¼','2016-03-05','Ã¼','Ã¼'),(22,'2','2','2','2','2016-03-07','2','2'),(123,'123','123','123','123','2016-03-20','123','123'),(150,'gürkan','çatak','g','g','2016-03-05','g','g'),(1233,'','','','','2016-03-09','',''),(1555,'a','a','aa','a','2016-03-06','a','a'),(150111000,'Gürkan','Çatak','gurkancatak.tr90@gmail.com','','2016-05-10','what is your second name?','Forgive'),(150111001,'Gürkan','Çatak','gurkancatak.tr90@gmail.com','gurkan123','2016-05-10','what is your second name?','Forgive'),(150111058,'muhammed','altıntaş','asdf','150','2016-04-10','150','150'),(150111069,'gÃ¼rkan','Ã§','g','a','2016-03-04','a','a');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-11 15:41:48
