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
-- Table structure for table `product_dtls`
--

DROP TABLE IF EXISTS `product_dtls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_dtls` (
  `productId` int NOT NULL AUTO_INCREMENT,
  `productname` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `productCategory` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_dtls`
--

LOCK TABLES `product_dtls` WRITE;
/*!40000 ALTER TABLE `product_dtls` DISABLE KEYS */;
INSERT INTO `product_dtls` VALUES (11,'Paneer 2','It is freshly prepared product.','500','paneer','available','paneer-fresh.png','admin'),(12,'Cow Ghee ','It is a good Quality Ghee.','1200','ghee','available','cow-ghee.png','admin'),(13,'Buffalo Ghee','It is rich source of Fat.','900','ghee','available','buffalo-ghee.png','admin'),(14,'Sweet Lassi','It is known as the lassi of Punjab.','50','lassi','available','sweet-lassi.png','admin'),(15,'Cow Milk','No preservatives used.','60','milk','available','cow-milk.png','admin'),(16,'FullCream Milk','This milk is comprised of high fat.','80','milk','available','fullcream-milk.png','admin'),(17,'Toned Milk','highly processed milk.','110','milk','available','tonemilk.png','admin'),(18,'Detoned Milk','This milk is very famous accross India.','100','milk','available','dbtoned-milk.png','admin'),(19,'Curd-Premium','It is highly processed and no preservatives added.','100','curd','available','curd-premium.png','admin'),(20,'Standardized Milk','This milk contain love from granny.','45','milk','available','standardized-milk.png','admin'),(21,'Chocolate Milk Shake','It is made from milk and chocolate.','30','milk-shake','available','milk-shake-chocolate.png','admin'),(22,'Strawberry Milk Shake','It is made from fresh Strawberries.','50','milk-shake','available','milk-shake-strawberry.png','admin'),(23,'Paneer-Lite','It is a low fat paneer.','140','paneer','available','paneer-lite.png','admin'),(24,'Cookie & Cream Shake','A rich, creamy blend of chocolate cookies and vanilla ice cream in a perfect milkshake.','50','milk-shake','available','cookie and cream shake.jpg','admin'),(25,'Butterscotch Shake','A rich, buttery butterscotch shake with a smooth, caramel flavor.','60','milk-shake','available','butterscotch shake.jpg','admin'),(26,'Mango Shake','A refreshing, creamy blend of ripe mangoes in a smooth shake.','40','milk-shake','available','mango shake.jpg','admin'),(27,'Strawberry Shake','A sweet, creamy blend of fresh strawberries in a smooth shake.','66','milk-shake','available','strawberry shake.jpg','admin'),(28,'Vanilla  Shake','A smooth, creamy shake with classic vanilla flavor','30','milk-shake','available','vanilla shake.jpg','admin'),(29,'Almond Mix','A nutty blend of creamy milk and rich almonds.','90','milk-shake','available','badam shake.jpg','admin'),(30,'Milk Mix Shake','It is a mixed nuts shake.','80','milk-shake','available','download.jpg','admin'),(31,'Mozzarella Cheese','Soft, creamy cheese with a mild flavor, ideal for melting.','100','cheese','available','mozzarella.jpg','admin'),(32,'Cubed Cheese','Cheese cut into small cubes, perfect for snacking or salads','160','cheese','available','cubes.jpg','admin'),(33,'Cheddar Cheese','Sharp, tangy cheese with a firm texture.','200','cheese','available','cheddar cheese.jpg','admin'),(34,'Cheese Sliced ','Cheese cut into thin, flat slices, ideal for sandwiches and burgers.','110','cheese','available','slices.jpg','admin'),(35,'Nestle Curd','Creamy and tangy curd from NestlÃ©, perfect for adding to dishes or enjoying on its own.','40','curd','available','nestle.jpg','admin'),(36,'Curd-Low Fat','Low-fat curd offers the same creamy texture with reduced fat content.','60','curd','available','low fat.jpg','admin'),(37,'Curd - Plain','Plain, creamy curd with a natural, mild flavor.','20','curd','available','natural.jpg','admin'),(38,'Curd-classic','Traditional, creamy curd with a mild flavor and added sugar.','45','curd','available','images.jpg','admin'),(39,'Curd-Premium-100%','Luxuriously creamy, 100% pure premium curd.','80','curd','available','premimum.jpg','admin'),(40,'Curd-Milky Mist','Rich and creamy curd with a fresh, milky flavor.','55','curd','available','milky mist.jpg','admin'),(42,'Curd-Extra Creamy','Ultra-rich and smooth curd with extra creaminess.','58','curd','available','creamy.jpg','admin'),(43,'Curd-Heritage','Authentic, rich curd with a traditional, creamy flavor.','60','curd','available','heritage.jpg','admin'),(44,'Curd-Amul','Creamy, tangy curd from Amul, known for its rich quality.','50','curd','available','masti amul.jpg','admin'),(45,'Curd-Anik','Creamy and smooth curd from Anik, offering a fresh, delicious taste.','42','curd','available','anik.jpg','admin'),(46,'Cow Ghee (Small Pack)','Rich and aromatic clarified butter made from cow\'s milk.','50','ghee','available','cow ghee chota.jpg','admin'),(47,'Pure Ghee','Rich, aromatic clarified butter, pure and full of flavor.','150','ghee','available','pure.jpg','admin'),(48,'Mango Flavoured','Creamy ice cream with a vibrant, tropical mango flavor.','70','ice-creams','available','mango tub.jpg','admin'),(49,'Black Current (150gm, Crunch-30%)','Black currant ice cream with 30% crunch, 150g of fruity, textured delight.','120','ice-creams','available','black current tub.jpg','admin'),(50,'Icy Strawberry (400gm)','Refreshing and frosty strawberry ice cream with a burst of fruity flavor.','380','ice-creams','available','strawberry tub.jpg','admin'),(51,'Tofu Paneer(250gm)','Soft, protein-rich tofu, often used as a plant-based alternative to paneer.','120','paneer','available','tofu paneer.jpg','admin'),(52,'Oreo Tub  ','A tub of creamy ice cream loaded with crunchy Oreo cookie pieces.','180','ice-creams','available','oreo.jpg','admin'),(53,'Masala Chaas','Spiced, refreshing buttermilk with a tangy flavor, perfect for cooling off.','30','others','available','masala chach.jpg','admin'),(54,'Choco Bar','A creamy ice cream bar coated in rich chocolate.','30','ice-bars','available','images.jpeg','admin'),(56,'Zeera Chah','It is Good For Health.','111','others','available','zeera chach.jpg','admin');
/*!40000 ALTER TABLE `product_dtls` ENABLE KEYS */;
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
