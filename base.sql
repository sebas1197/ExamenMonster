-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: federacionfutboldb
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `localidad_partido`
--

DROP TABLE IF EXISTS `localidad_partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `localidad_partido` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `PARTIDO` int NOT NULL,
  `CODIGO_LOCALIDAD` varchar(45) DEFAULT NULL,
  `DISPONIBILIDAD` int unsigned DEFAULT NULL,
  `PRECIO` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_partido_localidad_idx1` (`PARTIDO`),
  CONSTRAINT `fk` FOREIGN KEY (`PARTIDO`) REFERENCES `partido_futbol` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localidad_partido`
--

LOCK TABLES `localidad_partido` WRITE;
/*!40000 ALTER TABLE `localidad_partido` DISABLE KEYS */;
INSERT INTO `localidad_partido` VALUES (2,3,'Palco',100,35.00);
/*!40000 ALTER TABLE `localidad_partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido_futbol`
--

DROP TABLE IF EXISTS `partido_futbol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partido_futbol` (
  `CODIGO` int NOT NULL AUTO_INCREMENT,
  `EQUIPO_LOCAL` varchar(45) DEFAULT NULL,
  `EQUIPO_VISITA` varchar(45) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `LUGAR` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido_futbol`
--

LOCK TABLES `partido_futbol` WRITE;
/*!40000 ALTER TABLE `partido_futbol` DISABLE KEYS */;
INSERT INTO `partido_futbol` VALUES (3,'LIGA','EMELEC','2022-07-15','Casa Blanca');
/*!40000 ALTER TABLE `partido_futbol` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-15 11:13:56
