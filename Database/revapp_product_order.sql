-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: revapp
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `product_order`
--

DROP TABLE IF EXISTS `product_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `payment` varchar(45) DEFAULT NULL,
  `status` varchar(50) DEFAULT 'Pending',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_order`
--

LOCK TABLES `product_order` WRITE;
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
INSERT INTO `product_order` VALUES (21,'PRODUCT-ORD-00963','Shreya Chaurasia','shreya.chaurasia127@gmail.com','kpp,Kpp,Lucknow,India,226007','9140331520','Cow Milk','60.0','COD','Pending'),(22,'PRODUCT-ORD-00776','Shreya Chaurasia','shreya.chaurasia127@gmail.com','kpp,Kpp,Lucknow,India,226007','9140331520','Paneer 2','500.0','COD','Pending'),(23,'PRODUCT-ORD-00636','Prateek','prateek@gmail.com','Srinivas,GH,Pune,Maharastra,225501','7894561230','Zeera Chah','111.0','COD','Pending'),(24,'PRODUCT-ORD-00799','Prateek','prateek@gmail.com','Srinivas,GH,Pune,Maharastra,225501','7894561230','Curd-Extra Creamy','58.0','COD','Pending'),(25,'PRODUCT-ORD-00597','Tej','tejnarayan055@gmail.com','191, Heeralal Nagar, Sarojini Nagar,Post Office,Lucknow,Uttar Pradesh,226008','07318128805','Cow Milk','60.0','COD','Pending'),(26,'PRODUCT-ORD-00147','Tej','tejnarayan055@gmail.com','191, Heeralal Nagar, Sarojini Nagar,Post Office,Lucknow,Uttar Pradesh,226008','07318128805','Toned Milk','110.0','COD','Pending'),(27,'PRODUCT-ORD-00270','Tej','tejnarayan055@gmail.com','191, Heeralal Nagar, Sarojini Nagar,Post Office,Lucknow,Uttar Pradesh,226008','07318128805','Tofu Paneer(250gm)','120.0','COD','Pending'),(28,'PRODUCT-ORD-00836','Tej','tejnarayan055@gmail.com','191, Heeralal Nagar, Sarojini Nagar,Post Office,Lucknow,Uttar Pradesh,226008','07318128805','Mango Flavoured','70.0','COD','Pending'),(29,'PRODUCT-ORD-0070','Tej','tejnarayan055@gmail.com','191, Heeralal Nagar, Sarojini Nagar,Post Office,Lucknow,Uttar Pradesh,226008','07318128805','Mozzarella Cheese','100.0','COD','Pending'),(30,'PRODUCT-ORD-00263','Shreya Chaurasia','shreya.chaurasia127@gmail.com','Krishna Nagar,Knagar,Lucknow,Uttar Pradesh,245678','9140331520','Oreo Tub  ','180.0','COD','Pending'),(31,'PRODUCT-ORD-00840','Akhil','akhil@gmail.com','Prayagraj colony,BBD,Lucknow,Uttar Pradesh,222013','1478523691','Cow Milk','60.0','COD','Pending'),(32,'PRODUCT-ORD-00941','Akhil','akhil@gmail.com','Prayagraj colony,BBD,Lucknow,Uttar Pradesh,222013','1478523691','Curd - Plain','20.0','COD','Pending'),(33,'PRODUCT-ORD-00482','Tej','tejnarayan055@gmail.com','Mehendi pur,knagar,Lucknow,Uttar Pradesh,200045','07318128805','Cow Milk','60.0','COD','Pending'),(34,'PRODUCT-ORD-00969','Tej','tejnarayan055@gmail.com','Mehendi pur,knagar,Lucknow,Uttar Pradesh,200045','07318128805','Tofu Paneer(250gm)','120.0','COD','Pending'),(35,'PRODUCT-ORD-0075','Shreya Chaurasia','shreya.chaurasia127@gmail.com','Krishna Nagar,Kpp,Lucknow,Uttar Pradesh,222013','9140331520','Cow Ghee (Small Pack)','50.0','COD','Pending'),(36,'PRODUCT-ORD-0019','Shreya Chaurasia','shreya.chaurasia127@gmail.com','Krishna Nagar,Kpp,Lucknow,Uttar Pradesh,222013','9140331520','Curd-Low Fat','60.0','COD','Pending'),(37,'PRODUCT-ORD-00946','Tej','tejnarayan055@gmail.com','xyz,Post Office,Lucknow,Uttar Pradesh,333333','07318128805','Choco Bar','30.0','COD','Pending'),(38,'PRODUCT-ORD-00808','Tej','tejnarayan055@gmail.com','Krishna Nagar,Kpp,Lucknow,Uttar Pradesh,225501','07318128805','Choco Bar','30.0','COD','Pending'),(39,'PRODUCT-ORD-00441','Tej','tejnarayan055@gmail.com','Krishna Nagar,Kpp,Lucknow,Uttar Pradesh,225501','07318128805','Cow Milk','60.0','COD','Pending'),(40,'PRODUCT-ORD-00500','Tej','tejnarayan055@gmail.com','Krishna Nagar,Kpp,Lucknow,Uttar Pradesh,225501','07318128805','Paneer 2','500.0','COD','Pending');
/*!40000 ALTER TABLE `product_order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-04 19:47:49
