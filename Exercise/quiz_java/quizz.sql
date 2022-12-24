-- MySQL dump 10.13  Distrib 8.0.30, for Linux (x86_64)
--
-- Host: localhost    Database: quizz
-- ------------------------------------------------------
-- Server version	8.0.30-0ubuntu0.20.04.2

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(200) NOT NULL,
  `password` text NOT NULL,
  `create_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'thanh_ngoc','Midnight1997.','2022-12-22 04:12:37'),(2,'ngoc_eri','Midnight1996.','2022-12-22 04:13:20');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_question` int NOT NULL,
  `content` text NOT NULL,
  `is_true` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_question` (`id_question`),
  CONSTRAINT `answers_ibfk_1` FOREIGN KEY (`id_question`) REFERENCES `question` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` VALUES (1,1,'String',1),(2,1,'int',0),(3,1,'long',0),(4,1,'float',0),(5,2,'false ',1),(6,2,'true ',0),(7,2,'0',0),(8,2,'NULL  ',0),(9,3,'Java Development Kit',1),(10,3,'Java Debug Kit',0),(11,3,'Java Develop Kit',0),(12,3,'Java Developer Kit',0),(13,5,'7',0),(14,5,'8',1),(15,5,'9',0),(16,5,'10',0),(17,4,'Máy ảo Java',1),(18,4,'Môi trường lập trình Java',0),(19,4,'Java bytecode',0),(20,4,'Thư viện Java',0),(21,6,'now()',1),(22,6,'of()',0),(23,6,'getDayOfYear()',0),(24,6,'minusDay()',0),(25,7,'equals()',1),(26,7,'==',0),(27,7,'equal()',0),(28,7,'=',0),(29,8,'Nhập chuỗi',1),(30,8,'Nhập số nguyên',0),(31,8,'Nhập số thực',0),(32,8,'Nhập ký tự',0),(33,9,'size()',0),(34,9,'length()',1),(35,9,'indexOf()',0),(36,9,'charAt()',0),(37,10,'java.net',0),(38,10,'java.io',0),(39,10,'java.util',1),(40,10,'java.awt',0),(41,11,'Java',0),(42,11,'Oak',1),(43,11,'Cafe',0),(44,11,'James golings',0),(45,12,'4',0),(46,12,'7',0),(47,12,'8',0),(48,12,'9',1),(49,13,'String',1),(50,13,'int',0),(51,13,'float',0),(52,13,'boolean',0),(53,14,'Mảng có thể lưu giữ các phần tử thuộc nhiều kiểu dữ liệu khác nhau',0),(54,14,'Chỉ số của mảng có thể sử dụng kiểu số thực',0),(55,14,'array.length được sử dụng để trả về số phần tử trong mảng',1),(56,14,'Chỉ số của mảng bắt đầu từ 0',0),(57,15,'Microsoft Windows',0),(58,15,'Linux',0),(59,15,'Mac OS',0),(60,15,'Tất cả các đáp án đều đúng',1),(61,16,'Class Cat{}',0),(62,16,'class Cat{}',1),(63,16,'class public Cat{}',0),(64,16,'public Cat class{}',0),(65,17,'1',0),(66,17,'2',0),(67,17,'3',0),(68,17,'vô số',1),(69,18,'1',1),(70,18,'3',0),(71,18,'5',0),(72,18,'7',0),(73,19,'1',1),(74,19,'2',0),(75,19,'3',0),(76,19,'4',0),(77,20,'int a[][] = new int[][3];',1),(78,20,'int a[][] = new int[2][3];',0),(79,20,'int a[][] = new int[2][];',0),(80,20,'int a[][] = { {}, {}, {}}',0),(81,21,'Là kiểu dữ liệu gồm các trường chứa một tập hợp cố định các hằng số',1),(82,21,'Là kiểu dữ liệu liệt kê các biến số ',0),(83,21,'Là một interface',0),(84,21,'Là một phương thức',0),(89,23,'Mảng có kích thước không đổi trong toàn bộ chương trình',0),(90,23,'Mảng là cấu trúc dữ liệu có khả năng lưu trữ nhiều phần tử với nhiều kiểu dữ liệu khác nhau',1),(91,23,'Mảng N phần tử được đánh chỉ số từ 0 đến N-1',0),(92,23,'Chỉ số mảng bắt đầu từ 0',0),(93,24,'!',1),(94,24,'>>',0),(95,24,'<<',0),(96,24,'>>>',0),(97,25,'Tìm kiếm thứ tự thứ n',0),(98,25,'Trả về ký tự có chỉ mục n - 1',0),(99,25,'Trả về ký tự có chỉ mục n',1),(100,25,'Trả về chỉ mục của ký tự n',0),(101,26,'super',1),(102,26,'this',0),(103,26,'abstract',0),(104,26,'class',0),(105,27,'abstract',1),(106,27,'super',0),(107,27,'return',0),(108,27,'interface',0),(109,28,'1',1),(110,28,'0',0),(111,28,'Bao nhiêu cũng được',0),(112,28,'2',0),(113,29,'Khai báo ngoại lệ',0),(114,29,'Ném ra ngoại lệ',1),(115,29,'Bắt ngoại lệ',0),(116,29,'Tạo custom exception',0),(117,30,'Khai báo ngoại lệ',1),(118,30,'Ném ra ngoại lệ',0),(119,30,'Bắt ngoại lệ',0),(120,30,'Tạo custom exception',0),(121,31,'Chèn bất kỳ giá trị nào vào sai index',1),(122,31,'Nhập sai giá trị cho mảng',0),(123,31,'Nhập sai kích thước mảng',0),(124,31,'Nhập giá trị là một số âm',0),(125,32,'Được thực thi khi không có ngoại lệ sảy ra',0),(126,32,'Không bao giờ được thực thi',0),(127,33,'JavaScript Oriented Object Notation',0),(128,33,'Java Oriented Object Notation',0),(129,34,'Chuyển đổi từ JSON sang mảng',0),(130,34,'Chuyển đổi từ JSON sang List',0),(131,35,'Có',0),(132,35,'Không',1),(133,35,'Không biết',0),(134,35,'Có thể có',0),(135,36,'FIFO',1),(136,36,'LIFO',0),(137,36,'FILO',0),(138,36,'Tất cả các đáp án trên đều sai',0),(139,37,'List không cho phép chứa phần tử trùng lặp',0),(140,37,'Set không cho phép chứa phần tử trùng lặp',1),(141,37,'Set cho phép chứa phần tử trùng lặp',0),(142,37,'Tất cả đáp án trên đều đúng',0),(143,38,'Lưu trữ dữ liệu theo cặp key - value',0),(144,38,'Key là duy nhất',0),(145,38,'Value là duy nhất',1),(146,38,'Tất cả đáp án trên',0),(147,39,'Là một lớp chứa các phương thức static để thao tác với các tập dữ liệu',1),(148,39,'Root interface trong hệ thống phân cấp Collection',0),(149,39,'Là một Functional Interface',0),(150,39,'Tất cả các đáp án đều sai',0),(151,40,'final',1),(152,40,'abstract',0),(153,40,'this',0),(154,40,'super',0);
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `comment` text,
  `type` enum('EASY','MEDIUM','HARD') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'Đâu không phải kiểu dữ liệu nguyên thủy trong Java?','String là kiểu dữ liệu tham chiếu','EASY'),(2,'Giá trị mặc định của kiểu boolean là?','Giá trị mặc định của boolean là false','EASY'),(3,'Viết tắt của JDK là?','JDK - Java Development Kit là một bộ phần mềm cung cấp môi trường phát triến ứng dụng viết bằng ngôn ngữ Java  ','EASY'),(4,'JVM là gì?','JVM - Java Virtual Machine: là máy ảo Java','EASY'),(5,'Trong Java, bao gồm bao nhiêu kiểu dữ liệu nguyên thủy?','8: char, byte, short, int, long, float, double, boolean','EASY'),(6,'Trong class LocalDate, để lấy ngày hiện tại, ta sử dụng phương thức?','Lớp LocalDate cung cấp phương thức static now() sử dụng để lấy ra ngày hiện tại','EASY'),(7,'Để so sánh nội dung chuỗi trong Java, ta sử dụng?','So sánh nội dung chuỗi, ta sử dụng equals()','EASY'),(8,'Phương thức next() trong class Scanner sử dụng để?','Lấy giá trị chuỗi trước khoảng trắng (Nhập chuỗi)','EASY'),(9,'Phương thức nào được sử dụng để lấy độ dài của chuỗi String?','Phương thức length() được sử dụng để lấy độ dài chuỗi','EASY'),(10,'Package nào trong Java chứa lớp Scanner dùng để nhập dữ liệu vào từ bàn phím','Lớp Scanner nằm trong package java.util','EASY'),(11,'Tên đầu tên của Java là gì?','Ban đâu java được đặt tên là Oak do xung quanh công ty Sun Microsystem có rất nhiều cây sồi ','EASY'),(12,'Với giá trị nào của x, biểu thức sau trả về giá trị true (với x thuộc kiểu int)?\nx % 3 == 0','9 chia hết cho 3','EASY'),(13,'Kiểu dữ liệu nào trong Java có thể chứa giá trị bao gồm cả số và chữ?','String cho phép chứa dữ liệu cả số và chữ','EASY'),(14,'Phát biểu nào sau đây là đúng?','Một mảng chỉ cho phép chứa các phần tử có cùng kiểu dữ liệu, chỉ số của mảng phải là kiểu int, chỉ số của mảng bắt đầu từ 0','EASY'),(15,'Java chạy trên hệ điều hành nào?','Một ứng dụng viết bằng ngôn ngữ Java có thể chạy trên các hệ điều hành như Windows, Linux, Solaris, Mac OS,... ','EASY'),(16,'Đâu là cách khai báo đúng về lớp Cat','class Cat{} là cách khai báo đúng','MEDIUM'),(17,'Một lớp trong Java có bao nhiêu lớp con?','Một lớp trong java có vô số lớp con','MEDIUM'),(18,'Một chương trình gồm hai class sẽ có bao nhiêu hàm main?','Chỉ cần một hàm main để chạy chương trình','MEDIUM'),(19,'Một lớp trong Java thì có thể có bao nhiêu lớp cha?','Một class trong Java chỉ có thể có duy nhất 1 lớp cha do Java không hỗ trợ đa kế thừa','MEDIUM'),(20,'Trong các khai báo dưới đây, khai báo nào là không hợp lệ?','Cách khai báo int a[][] = new int[][3]; là không hợp lệ do thiếu số hàng','MEDIUM'),(21,'Kiểu enum là gì?','Enum trong Java là một kiểu dữ liệu đặc biệt của java được sử dụng để định nghĩa các tập hợp các hằng số','MEDIUM'),(23,'Phát biểu nào sau đây là sai?','Một mảng chỉ cho phép chứa các phần tử có cùng kiểu dữ liệu, có kích thước không đổi trong toàn bộ chương trình, chỉ số của mảng bắt đầu từ 0','MEDIUM'),(24,'Để đảo giá trị của biến boolean, ta sử dụng toán tử nào?','! là toán tử phủ định','MEDIUM'),(25,'charAt(n) trong lớp String được sử dụng để?','charAt(n) được sử dụng để trả về ký tự thứ n','MEDIUM'),(26,'Khi cần tham chiếu tới phương thức của lớp cha trong lớp con, ta sử dụng từ khóa?','Từ khóa super là một tham chiếu, được sử dụng để tham chiếu trực tiếp đến đối tượng (biến, constructor, method) của lớp cha','MEDIUM'),(27,'Để tạo lớp trừu tượng, ta sử dụng từ khóa?','Để tạo lớp trừu tượng ta sử dụng từ khóa abstract. Ví dụ: \npublic abstract class Cat{}','MEDIUM'),(28,'Trong Functional interface có bao nhiêu phương thức abstract?','Functional interface là interface chỉ chứa duy nhất 1 phương thức trừu tượng','HARD'),(29,'Từ khóa throw sử dụng để?','throw sử dụng khi cần ném ra ngoại lệ','HARD'),(30,'Từ khóa throws sử dụng để?','throws sử dụng để khai báo ngoại lệ','HARD'),(31,'ArrayIndexOutOfBoundsException sẽ xảy ra khi nào?','Khi bạn nhập giá trị cho mảng vào sai index sẽ sảy ra ngoại lệ ArrayIndexOutOfBoundsException','HARD'),(32,'Khối finally được thực thi khi nào?','Khối finally luôn luôn được thực thi dù có hay không có ngoại lệ sảy ra','HARD'),(33,'JSON là viết tắt của?','JSON là viết tắt của JavaScript Object Notation, là một kiểu định dạng dữ liệu tuân theo một quy luật nhất định mà hầu hết các ngôn ngữ lập trình hiện nay đều có thể đọc được','HARD'),(34,'Phương thức toJson() trong lớp Gson được sử dụng để?','Phương thức toJson() được sử dụng để chuyển đổi từ object sang chuỗi JSON','HARD'),(35,'Set interface có cho phép chứa phần tử trùng lặp không?','Set được sử dụng để lưu trữ các phần tử duy nhất không bị trùng lặp nhau trong tập hợp','HARD'),(36,'Queue hoạt động theo nguyên tác nào?','Queue hoạt động theo nguyên tắc FIFO - First In First Out','HARD'),(37,'Sự khác nhau giữ List và Set là gì?','List cho phép chứa phần tử trùng lặp, Set không cho phép chứa phần tử trùng lặp','HARD'),(38,'Đâu không phải là đặc điểm của Map?','Map được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp key và value. Mỗi cặp key và value được gọi là mục nhập (entry). Map trong java chỉ chứa các giá trị key duy nhất','HARD'),(39,'Collections là gì?','Collections là một lớp chứa các phương thức static để thao tác với các tập dữ liệu','HARD'),(40,'Để ngăn chặn sự ghi đè phương thức, ta sử dụng từ khóa?','Từ khóa final giúp ngăn chặn sự ghi đè phương thức','HARD');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_account` int NOT NULL,
  `number_question` int NOT NULL,
  `correct_answer` int NOT NULL,
  `test_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `type` enum('EASY','MEDIUM','HARD') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (1,1,10,6,'2022-12-23 03:11:59','EASY'),(2,1,10,7,'2022-12-23 04:18:24','EASY'),(3,1,10,6,'2022-12-23 11:10:20','MEDIUM'),(4,1,10,7,'2022-12-23 11:11:14','MEDIUM'),(5,1,10,4,'2022-12-23 11:11:44','HARD');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-24 16:11:46
