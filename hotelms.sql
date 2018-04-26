-- MySQL dump 10.13  Distrib 5.5.27, for Win64 (x86)
--
-- Host: localhost    Database: hotelms
-- ------------------------------------------------------
-- Server version	5.5.27

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
-- Table structure for table `attribute`
--

DROP TABLE IF EXISTS `attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attribute` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `attributeName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attribute`
--

LOCK TABLES `attribute` WRITE;
/*!40000 ALTER TABLE `attribute` DISABLE KEYS */;
INSERT INTO `attribute` VALUES (1,'房态'),(2,'客房等级'),(4,'支付方式'),(5,'出租方式'),(6,'结账单位'),(7,'旅客类别'),(8,'性别'),(9,'民族'),(10,'证件类型'),(11,'文化程度'),(12,'事由'),(13,'旅客级别'),(14,'对象类别'),(15,'计量单位'),(16,'预定状态'),(17,'结账状态');
/*!40000 ALTER TABLE `attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attributevalue`
--

DROP TABLE IF EXISTS `attributevalue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attributevalue` (
  `far_id` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `attributeDetailsName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`far_id`),
  KEY `FK_attributevalue_aid` (`aid`),
  CONSTRAINT `FK_attributevalue_aid` FOREIGN KEY (`aid`) REFERENCES `attribute` (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attributevalue`
--

LOCK TABLES `attributevalue` WRITE;
/*!40000 ALTER TABLE `attributevalue` DISABLE KEYS */;
INSERT INTO `attributevalue` VALUES (1,1,'空房'),(2,1,'自用房'),(3,1,'预定'),(4,1,'待清洁'),(5,1,'待维修'),(6,1,'不可用'),(7,1,'满'),(8,2,'单人普通房'),(9,2,'单人标准间'),(10,2,'二人普通房'),(11,2,'二人标准间'),(12,2,'豪华间'),(13,2,'会议室'),(14,2,'总统套房'),(15,4,'现金'),(16,4,'转账'),(17,4,'信用卡'),(18,5,'全日'),(19,5,'钟点'),(20,7,'国内旅客'),(21,7,'国外旅客'),(22,8,'男'),(23,8,'女'),(24,9,'汉'),(25,9,'苗'),(26,9,'壮 '),(27,9,'其它'),(28,10,'二代身份证'),(29,10,'护照'),(30,10,'其它'),(31,11,'无'),(32,11,'小学'),(33,11,'初中'),(34,11,'高中'),(35,11,'大专'),(36,11,'本科'),(37,11,'研究生'),(38,11,'硕士'),(39,11,'博士'),(40,11,'其它'),(41,12,'个人旅行'),(42,12,'公务出差'),(43,13,'首次'),(44,13,'熟客'),(45,13,'VIP'),(46,14,'团队'),(47,14,'散客'),(48,15,'瓶'),(49,15,'台'),(50,15,'条'),(51,15,'支'),(52,15,'个'),(53,15,'只'),(54,15,'包'),(55,15,'份'),(56,15,'碟'),(57,16,'未安排'),(58,16,'已安排'),(61,17,'已结账'),(62,17,'未结账'),(66,6,'旅客自付'),(67,6,'团队付款');
/*!40000 ALTER TABLE `attributevalue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commodity`
--

DROP TABLE IF EXISTS `commodity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commodity` (
  `commodityName` varchar(50) NOT NULL,
  `commodityTypeID` varchar(50) DEFAULT NULL,
  `salePrice` double DEFAULT NULL,
  `uOMID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`commodityName`),
  KEY `FK_commodity` (`commodityTypeID`),
  CONSTRAINT `FK_commodity` FOREIGN KEY (`commodityTypeID`) REFERENCES `commoditytype` (`commodityTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commodity`
--

LOCK TABLES `commodity` WRITE;
/*!40000 ALTER TABLE `commodity` DISABLE KEYS */;
INSERT INTO `commodity` VALUES ('asdfsdf','c32fa90c-cb15-45dd-b5ef-c408816be907',400,'碟'),('可乐','1',2321312,'瓶'),('可口可乐','2',15,'瓶'),('和其正','1',5,'瓶'),('娃哈哈','1',6,'瓶'),('娃哈哈12','1',6,'瓶'),('娃哈哈14','2',600,'瓶'),('娃哈哈17','1',6,'瓶'),('娃哈哈4','1',6,'瓶'),('娃哈哈76','1',6,'瓶'),('床单','5',500,'份'),('引用','2',234,'瓶'),('打得过','1',15,'瓶'),('晨光牛奶','1',6,'瓶'),('王老吉','1',10,'瓶'),('生活永平2','8',234,'瓶'),('生活用品','8',123,'瓶'),('百事可乐','1',5,'瓶'),('芒果哈哈','3',1334344,'支'),('芙蓉','4',300,'条'),('芙蓉王','4',300,'条'),('饮料','3',12,'瓶');
/*!40000 ALTER TABLE `commodity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commoditytype`
--

DROP TABLE IF EXISTS `commoditytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commoditytype` (
  `commodityTypeID` varchar(50) NOT NULL,
  `commodityTypeName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`commodityTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commoditytype`
--

LOCK TABLES `commoditytype` WRITE;
/*!40000 ALTER TABLE `commoditytype` DISABLE KEYS */;
INSERT INTO `commoditytype` VALUES ('1','餐饮类'),('2','饮料类'),('3','食品类'),('4','烟酒类'),('5','人为损坏类'),('6','其他'),('7','一次性用品类'),('8','生活用品'),('97c2dc3b-1c14-4e5e-99c5-f082d83e71d8','ffff'),('c32fa90c-cb15-45dd-b5ef-c408816be907','asdfas');
/*!40000 ALTER TABLE `commoditytype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumption`
--

DROP TABLE IF EXISTS `consumption`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consumption` (
  `checkInId` varchar(100) NOT NULL,
  `commodityName` varchar(20) DEFAULT NULL,
  `consumptionNumber` int(11) DEFAULT NULL,
  `consumptionMoney` double DEFAULT NULL,
  `consumptionTime` datetime DEFAULT NULL,
  PRIMARY KEY (`checkInId`),
  KEY `FK_consumption_commodityName` (`commodityName`),
  CONSTRAINT `FK_consumption_commodityName` FOREIGN KEY (`commodityName`) REFERENCES `commodity` (`commodityName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumption`
--

LOCK TABLES `consumption` WRITE;
/*!40000 ALTER TABLE `consumption` DISABLE KEYS */;
INSERT INTO `consumption` VALUES ('129d6028-1a4b-4392-9295-ebc1bb306cca','可乐',1,2321312,'2018-04-15 16:32:35'),('fasdfsad','可乐',1,2321312,'2018-04-15 16:31:09');
/*!40000 ALTER TABLE `consumption` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deposit`
--

DROP TABLE IF EXISTS `deposit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deposit` (
  `checkInId` varchar(100) NOT NULL,
  `depositRegisterTime` datetime DEFAULT NULL,
  `deposit` double DEFAULT NULL,
  `depositPayWayId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`checkInId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deposit`
--

LOCK TABLES `deposit` WRITE;
/*!40000 ALTER TABLE `deposit` DISABLE KEYS */;
INSERT INTO `deposit` VALUES ('129d6028-1a4b-4392-9295-ebc1bb306cca','2018-04-14 00:00:00',43543,NULL),('496f4fbf-566e-4c5f-8dd1-b0233e67a566','2018-04-14 00:00:00',12323,NULL),('8d123e48-6664-48ae-bab7-bf0f4cf8cc28','2018-04-14 00:00:00',234234,NULL),('a0417faa-82e9-43a5-9d34-5d2ade21e429','2018-04-14 03:32:33',300,'15'),('adcc7d75-bcad-4876-a438-70a3578913cd','2018-04-14 00:00:00',123423,NULL),('d396de99-760e-4b12-8b26-5e6a7be3e45d','2018-04-15 00:00:00',234,NULL),('e2762c25-a586-42a5-9f28-933ef4f89d67','2018-04-14 00:00:00',33333333,NULL),('f5a3fd95-ee9d-4e84-a335-ef2faa13f16a','2018-04-14 00:00:00',12321,NULL),('fsdfsadf','2018-04-14 03:37:39',423423,'15'),('fsdfsadfas','2018-04-14 03:37:54',23432,'16');
/*!40000 ALTER TABLE `deposit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passenger` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `genderID` varchar(20) DEFAULT NULL COMMENT '性别',
  `birthDate` datetime DEFAULT NULL COMMENT '出生日期',
  `nationID` varchar(20) DEFAULT NULL COMMENT '民族',
  `licenceIssuingAuthorty` varchar(50) DEFAULT NULL COMMENT '发证机关',
  `papersValidity` datetime DEFAULT NULL COMMENT '证件有效期',
  `profession` varchar(20) DEFAULT NULL COMMENT '职业',
  `educationDegreeID` varchar(20) DEFAULT NULL COMMENT '文化程度',
  `passengerLevelID` varchar(10) DEFAULT NULL COMMENT '旅客级别',
  `papersID` varchar(30) DEFAULT NULL COMMENT '证件类型',
  `papersNumber` varchar(30) DEFAULT NULL COMMENT '证件号码',
  `unitsOrAddress` varchar(50) DEFAULT NULL COMMENT '单位或住址',
  `thingReasonID` varchar(50) DEFAULT NULL COMMENT '事由',
  `whereAreFrom` varchar(50) DEFAULT NULL COMMENT '从何处来',
  `whereToGo` varchar(50) DEFAULT NULL COMMENT '到哪里去',
  `contactPhoneNumber` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `remarks` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (1,'asdf','22','2018-04-15 08:32:22','24','asdf',NULL,'asdf','31','43','28','asdf','asdf','42','山东','湖北','15066679999','啊哈哈哈哈哈哈'),(2,'asdf','22','2018-04-15 08:32:28','24','',NULL,'','31','44','28','8452311568456231','','41','广西','四川省','13920920583','adf'),(7,'转换功能','22','2018-04-15 08:32:31','24','fsadfas',NULL,'fsdafa','31','43','28','23424','fsdfsad','41','云南省','福建省','13920920583','fsadfsad'),(8,'张三','22','2018-04-15 08:32:32','24','公安局',NULL,'公务员','31','44','28','19946856845','天津市','42','河北省','湖北省','13920920583','工务处差，熟客，优惠'),(9,'张三三三三','22','2018-04-15 08:32:33','24','公安局',NULL,'公务员','31','44','28','19946856845','天津市','42','天津','湖南','13920920583','工务处差，熟客，优惠'),(11,'张三四四四','22','2018-04-15 08:32:35','24','公安局',NULL,'公务员','31','44','28','19946856845','天津市','42','青海','河南省','13920920583','工务处差，熟客，优惠'),(12,'丽丽李李','22','2018-04-15 08:32:35','24','发射点发射点',NULL,'fsdfsad','31','43','28','432453543','fadsf','41','新疆','吉林省','13920920583','fsdfasfsd'),(13,'王小未','22','2018-04-15 08:32:36','24','fsdfasd',NULL,'fsdfsad','31','43','28','19946856845','fsdfas','41','山西省','黑龙江省','13920920581','f飞洒地方撒旦方式'),(14,'赵六','22','2018-04-15 08:32:37','24','哦柑橘',NULL,'防守打法','31','43','28','19946856845','发射点发','41','山东省','江西省','13920920583','法师打a\'s'),(15,'李四','22','2018-04-15 08:32:39','24','公安局',NULL,'asdf','31','43','28','asdf','saf','41','陕西省','浙江省','13920920583','asd'),(16,'王五wu','22',NULL,'24','派出所',NULL,'工程师','31','43','28','894562394856231','江西','42','江苏','吉林','15958063958','打折'),(21,'哎嘿嘿','22','2018-04-15 08:32:42','24','河东省',NULL,'','31','43','28','89456','山西','41','甘肃','广东','13920920583','齐德隆动情'),(22,'王二狗','22','2018-04-15 08:32:43','24','西湖办事处',NULL,'','31','43','28','14323142134','却无二分的说法','41','浙江','成都','13920920583','this is special user.'),(24,'a','22',NULL,'24','a',NULL,'dfdfg','31','43','28','1231323','dfsd','41','gh','fghgh','15958063958','ertdert'),(26,'转换功能','22',NULL,'24','fsadfas',NULL,'fsdafa','31','43','28','23424','fsdfsad','41','云南省','福建省','13920920583','fsadfsad');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger_checkin`
--

DROP TABLE IF EXISTS `passenger_checkin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passenger_checkin` (
  `passengerCheckInId` varchar(100) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `roomNumber` varchar(20) DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  `rentOutTypeID` varchar(20) DEFAULT NULL,
  `passengerTypeID` varchar(20) DEFAULT NULL,
  `stayNumber` double DEFAULT NULL,
  `billUnitID` varchar(20) DEFAULT NULL,
  `depositPayWayID` varchar(20) DEFAULT NULL,
  `changingRoomNumber` int(11) DEFAULT NULL,
  `changRoomMoney` double DEFAULT NULL,
  `changRoomTime` datetime DEFAULT NULL,
  `sumConst` double DEFAULT NULL,
  `isBillID` varchar(10) DEFAULT NULL,
  `payTime` datetime DEFAULT NULL,
  PRIMARY KEY (`passengerCheckInId`),
  KEY `FK_passenger_checkin_roomNumber` (`roomNumber`),
  KEY `FK_passenger_checkin_pid` (`pid`),
  CONSTRAINT `FK_passenger_checkin_pid` FOREIGN KEY (`pid`) REFERENCES `passenger` (`pid`),
  CONSTRAINT `FK_passenger_checkin_roomNumber` FOREIGN KEY (`roomNumber`) REFERENCES `room` (`roomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger_checkin`
--

LOCK TABLES `passenger_checkin` WRITE;
/*!40000 ALTER TABLE `passenger_checkin` DISABLE KEYS */;
INSERT INTO `passenger_checkin` VALUES ('129d6028-1a4b-4392-9295-ebc1bb306cca',7,'201','2018-04-14 00:00:00','18','20',1323,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('496f4fbf-566e-4c5f-8dd1-b0233e67a566',14,'201','2018-04-14 00:00:00','18','20',1232,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('8d123e48-6664-48ae-bab7-bf0f4cf8cc28',9,'103','2018-04-14 00:00:00','18','20',123,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('a0417faa-82e9-43a5-9d34-5d2ade21e429',11,'103','2018-04-14 00:00:00','18','20',3,'66','15',2,343,'2018-04-14 00:00:00',343,'62','2018-04-14 00:00:00'),('adcc7d75-bcad-4876-a438-70a3578913cd',7,'903','2018-04-14 00:00:00','18','20',1232143,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('d396de99-760e-4b12-8b26-5e6a7be3e45d',26,'103','2018-04-15 00:00:00','18','20',23,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('e2762c25-a586-42a5-9f28-933ef4f89d67',12,'103','2018-04-14 00:00:00','18','20',12321,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('f5a3fd95-ee9d-4e84-a335-ef2faa13f16a',2,'103','2018-04-14 00:00:00','18','20',123,'66','15',NULL,NULL,NULL,NULL,'62',NULL),('fsdfsadf',1,'103','2018-04-13 08:44:14','18','20',3,'66','15',2,343,'2018-04-13 08:46:25',343,'61','2018-04-13 08:46:53'),('fsdfsadfas',9,'200','2018-04-13 00:00:00','19','21',6,'67','16',3,23423,'2018-04-13 00:00:00',543543,'62','2018-04-13 00:00:00');
/*!40000 ALTER TABLE `passenger_checkin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger_reserve`
--

DROP TABLE IF EXISTS `passenger_reserve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passenger_reserve` (
  `passengerReserveId` varchar(100) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `roomNumber` varchar(20) DEFAULT NULL,
  `predetermineDay` int(11) DEFAULT NULL,
  `deposit` double DEFAULT NULL,
  `payWayID` varchar(20) DEFAULT NULL,
  `arriveTime` datetime DEFAULT NULL,
  `reserveState` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`passengerReserveId`),
  KEY `FK_passenger_reserve_pid` (`pid`),
  KEY `FK_passenger_reserve_roomNumber` (`roomNumber`),
  CONSTRAINT `FK_passenger_reserve_pid` FOREIGN KEY (`pid`) REFERENCES `passenger` (`pid`),
  CONSTRAINT `FK_passenger_reserve_roomNumber` FOREIGN KEY (`roomNumber`) REFERENCES `room` (`roomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger_reserve`
--

LOCK TABLES `passenger_reserve` WRITE;
/*!40000 ALTER TABLE `passenger_reserve` DISABLE KEYS */;
INSERT INTO `passenger_reserve` VALUES ('002',2,'103',7,1200,'16','2018-04-17 06:36:17','58'),('fadfsdaf',2,'903',5,234,'15','2018-04-14 12:54:18','58');
/*!40000 ALTER TABLE `passenger_reserve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receivetarget`
--

DROP TABLE IF EXISTS `receivetarget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receivetarget` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `targetTypeID` varchar(10) DEFAULT NULL COMMENT '对象类别',
  `principal` varchar(20) DEFAULT NULL COMMENT '负责人',
  `teamName` varchar(30) DEFAULT NULL COMMENT '团队名称',
  `teamCode` varchar(20) DEFAULT NULL COMMENT '团队编号',
  `registerTime` datetime DEFAULT NULL COMMENT '登记时间',
  `contactPhoneNUmber` varchar(30) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receivetarget`
--

LOCK TABLES `receivetarget` WRITE;
/*!40000 ALTER TABLE `receivetarget` DISABLE KEYS */;
INSERT INTO `receivetarget` VALUES (6,'46','张三','FFF','FFGG','2018-04-12 00:00:00','18312636707'),(7,'46','王五','FFF','FFF','2018-04-12 00:00:00','13800138005'),(8,'46','fasdf','fasdfa','fasdfas','2018-04-12 00:00:00','13800138005'),(9,'46','fsadfas','fsadfas','fafsd','2018-04-12 00:00:00','18312636707'),(12,'46','张三','AACfsadfasd','007','2018-04-12 00:00:00','13798996646'),(14,'46','fsafas','dfsafsadfas','fsdafsad','2018-04-12 00:00:00','13920920543'),(16,'46','fsafasd','fsdfas','fsadfas','2018-04-12 00:00:00','18312636707'),(19,'46','fsadfas','fsdafas','fasdfasd','2018-04-12 00:00:00','13800138007'),(20,'46','fasdfas','fsadfas','ffsadfsadf','2018-04-12 00:00:00','18312636707'),(21,'46','王二麻子','王家大小','666','2018-04-13 00:00:00','13872649627'),(22,'46','GHJGH','FGHAgy分割A','DGFDFG','2018-04-15 00:00:00','13633335555');
/*!40000 ALTER TABLE `receivetarget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receivetarget_checkin`
--

DROP TABLE IF EXISTS `receivetarget_checkin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receivetarget_checkin` (
  `receivetargetCheckInId` varchar(100) NOT NULL,
  `tid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `roomNumber` varchar(20) DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  `rentOutTypeID` varchar(20) DEFAULT NULL,
  `passengerTypeID` varchar(20) DEFAULT NULL,
  `stayNumber` double DEFAULT NULL,
  `billUnitID` varchar(20) DEFAULT NULL,
  `depositPayWayID` varchar(20) DEFAULT NULL,
  `changingRoomNumber` int(11) DEFAULT NULL,
  `changRoomMoney` double DEFAULT NULL,
  `changRoomTime` datetime DEFAULT NULL,
  `sumConst` double DEFAULT NULL,
  `isBillID` varchar(10) DEFAULT NULL,
  `payTime` datetime DEFAULT NULL,
  PRIMARY KEY (`receivetargetCheckInId`),
  KEY `FK_receivetarget_checkin_tid` (`tid`),
  KEY `FK_receivetarget_checkin_roomNumber` (`roomNumber`),
  KEY `FK_receivetarget_checkin_pid` (`pid`),
  CONSTRAINT `FK_receivetarget_checkin_pid` FOREIGN KEY (`pid`) REFERENCES `passenger` (`pid`),
  CONSTRAINT `FK_receivetarget_checkin_roomNumber` FOREIGN KEY (`roomNumber`) REFERENCES `room` (`roomNumber`),
  CONSTRAINT `FK_receivetarget_checkin_tid` FOREIGN KEY (`tid`) REFERENCES `receivetarget` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receivetarget_checkin`
--

LOCK TABLES `receivetarget_checkin` WRITE;
/*!40000 ALTER TABLE `receivetarget_checkin` DISABLE KEYS */;
INSERT INTO `receivetarget_checkin` VALUES ('fasdfsad',7,2,'200','2018-04-14 16:33:31','19','21',34,'66','15',3,41234,'2018-04-14 16:37:21',13,'62','2018-04-14 16:39:07'),('testdemo',7,16,'201','2018-04-18 07:08:49','19','21',34,'66','15',1,8986,'2018-04-20 07:09:35',15,'62','2018-04-21 07:10:04');
/*!40000 ALTER TABLE `receivetarget_checkin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receivetarget_reserve`
--

DROP TABLE IF EXISTS `receivetarget_reserve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receivetarget_reserve` (
  `receivetargetReserveId` varchar(100) NOT NULL,
  `tid` int(11) DEFAULT NULL,
  `roomNumber` varchar(20) DEFAULT NULL,
  `predetermineDay` int(11) DEFAULT NULL,
  `deposit` double DEFAULT NULL,
  `payWayID` varchar(20) DEFAULT NULL,
  `arriveTime` datetime DEFAULT NULL,
  `reserveState` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`receivetargetReserveId`),
  KEY `FK_receivetarget_reserve_tid` (`tid`),
  KEY `FK_receivetarget_reserve_roomNumber` (`roomNumber`),
  CONSTRAINT `FK_receivetarget_reserve_roomNumber` FOREIGN KEY (`roomNumber`) REFERENCES `room` (`roomNumber`),
  CONSTRAINT `FK_receivetarget_reserve_tid` FOREIGN KEY (`tid`) REFERENCES `receivetarget` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receivetarget_reserve`
--

LOCK TABLES `receivetarget_reserve` WRITE;
/*!40000 ALTER TABLE `receivetarget_reserve` DISABLE KEYS */;
INSERT INTO `receivetarget_reserve` VALUES ('02864240-6f92-497c-98b0-cd147c60af36',6,'201',34,234,'15','2018-04-15 00:00:00','58'),('7ce1b9a3-f668-470c-a105-12e034f3048d',6,'101',123,12432,'15','2018-04-15 00:00:00','58'),('fsadfsadf',21,'103',4,232,'16','2018-04-14 09:16:47','57'),('hjkjkljljlafd',6,'101',3,12321,'15','2018-04-14 09:16:45','58');
/*!40000 ALTER TABLE `receivetarget_reserve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `roomNumber` varchar(20) NOT NULL,
  `roomStateID` varchar(20) DEFAULT NULL,
  `roomAmount` int(10) DEFAULT NULL,
  `guestRoomLevelID` varchar(20) DEFAULT NULL,
  `standardPriceDay` double DEFAULT NULL,
  `standardPrice` double DEFAULT NULL,
  `maxDuration` double DEFAULT NULL,
  `firstPrice` double DEFAULT NULL,
  `firstDuration` double DEFAULT NULL,
  PRIMARY KEY (`roomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES ('101','7',2,'11',180,90,2,80,1),('103','1',1,'8',200,90,2,30,1),('200','3',2,'11',120,90,2,20,1),('201','5',2,'8',190,60,2,30,1),('903','1',1,'8',9999,90,5,30,1),('豪华套房','1',2,'12',1919,100,3,200,2);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-26 22:53:48
