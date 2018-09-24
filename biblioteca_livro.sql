-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.16.04.1

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
-- Table structure for table `livro`
--

DROP TABLE IF EXISTS `livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `livro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anoEdicao` int(11) DEFAULT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `dataCadastro` varchar(255) DEFAULT NULL,
  `imagem` tinyblob,
  `notaUsuarios` int(11) DEFAULT NULL,
  `resenha` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livro`
--

LOCK TABLES `livro` WRITE;
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` VALUES (16,1994,'GOF','12 / 12 /1994',NULL,10,'Fala sobre soluções recorrentes do mundo orientado a objeto.','Design Patterns'),(17,2000,'Amanda','12 / 12 /2000',NULL,8,'livro sobre auto-ajuda','The secret'),(18,2010,'Robert','12 / 12 /2010',NULL,9,'A importancia do foco.','A unica coisa'),(19,2007,'Ricardo Cerbasi','10 / 10 /2007',NULL,10,'Fala sobre a importancia dos casais se planejarem financeiramente.','Casais Enriquecem Juntos'),(20,2008,'Gary Chapman','13 / 11 /2008',NULL,10,'Dá dica para casais','As 5 linguagens do amor'),(21,2009,'Robert T Kiyosaki','14 / 12 /2009',NULL,10,'Fala de um pai formado e outro que não é','Pai rico pai Pobre'),(22,2011,'Armando Robert','25 / 10 /2015',NULL,8,'Ensino o loop do habito	','O poder do Habito '),(23,1999,'Hal Elrod','23 / 12 /1999',NULL,7,'Dicas de como se acordar cedo','O milagre da manhã'),(24,1987,'Napoleon Hill','12 / 12 /1987',NULL,10,'Segredo que muitas pessoas utilizaram para enriquecer','Pense e enriqueca'),(25,2006,'Dale Carnegie','23 / 04 /2006',NULL,10,'Treinamento para se comportar diante do publico','Como falar em publico');
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-23 23:10:03
