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
-- Table structure for table `student_submission`
--

DROP TABLE IF EXISTS `student_submission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_submission` (
  `hwname` varchar(50) NOT NULL,
  `groupname` varchar(50) NOT NULL,
  `code` longtext,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`hwname`,`groupname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_submission`
--

LOCK TABLES `student_submission` WRITE;
/*!40000 ALTER TABLE `student_submission` DISABLE KEYS */;
INSERT INTO `student_submission` VALUES ('cse333hw1','gurkanmuhammedgroup1','import java.io.BufferedReader;\r\nimport java.io.FileReader;\r\nimport java.io.IOException;\r\nimport java.util.Arrays;\r\nimport java.io.FileWriter;\r\n\r\npublic class code{\r\n\r\n	public static void main(String[] args) {\r\n\r\n\r\n		try (BufferedReader br = new BufferedReader(new FileReader(args[0])))\r\n		{\r\n			\r\n			int lines = 0;\r\n			while (br.readLine() != null) lines++; // to get text\'s number of lines \r\n			\r\n			String sCurrentLine;\r\n			BufferedReader br2 = new BufferedReader(new FileReader(args[0])); //to read and sort the text\r\n			\r\n			String[] array; //create a new array\r\n			array = new String[lines];\r\n		\r\n			int i=0;\r\n			while ((sCurrentLine = br2.readLine()) != null) {//fill array with text content\r\n				array[i] = sCurrentLine;\r\n				i++;\r\n			}\r\n			Arrays.sort(array); //sort array\r\n			\r\n			\r\n			FileWriter fw = new FileWriter(\"output.txt\");\r\n\r\n			for (i = 0; i < array.length; i++) { //write content of the array to file\r\n				fw.write(array[i] + System.lineSeparator());\r\n			}\r\n			fw.close();\r\n			\r\n			\r\n			System.out.println(\"Process is finished.\");\r\n			\r\n\r\n		} catch (IOException e) {\r\n			e.printStackTrace();\r\n		} \r\n\r\n	}\r\n}','2016-05-08 13:19:14');
/*!40000 ALTER TABLE `student_submission` ENABLE KEYS */;
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
