-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: Universidade
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `Alunos`
--

DROP TABLE IF EXISTS `Alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Alunos` (
  `Nome` varchar(50) NOT NULL,
  `Matricula` int(11) NOT NULL,
  `Nascimento` date NOT NULL,
  `Sexo` char(1) NOT NULL,
  `CodigoAluno` int(11) NOT NULL,
  `CodigoCurso` int(11) NOT NULL,
  `ValorN1` float NOT NULL,
  `ValorN2` float NOT NULL,
  `MediaFinal` float NOT NULL,
  `Frequencia` int(11) NOT NULL,
  `Situacao` varchar(30) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `HistoricoEscolar` varchar(100) NOT NULL,
  PRIMARY KEY (`CodigoCurso`),
  CONSTRAINT `Alunos_FK` FOREIGN KEY (`CodigoCurso`) REFERENCES `Cursos` (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alunos`
--

LOCK TABLES `Alunos` WRITE;
/*!40000 ALTER TABLE `Alunos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CV`
--

DROP TABLE IF EXISTS `CV`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CV` (
  `Graduacao` varchar(30) NOT NULL,
  `PosGraduacao` varchar(30) NOT NULL,
  `Congressos` varchar(30) NOT NULL,
  `CursosTecnicos` varchar(30) NOT NULL,
  `Publicacoes` varchar(30) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`Tipo`),
  CONSTRAINT `CV_FK` FOREIGN KEY (`Tipo`) REFERENCES `Professores` (`Area`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CV`
--

LOCK TABLES `CV` WRITE;
/*!40000 ALTER TABLE `CV` DISABLE KEYS */;
/*!40000 ALTER TABLE `CV` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Capacitacao`
--

DROP TABLE IF EXISTS `Capacitacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Capacitacao` (
  `Tipo` varchar(30) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Descricao` varchar(150) NOT NULL,
  `Instituicao` varchar(100) NOT NULL,
  `Titulacao` varchar(100) NOT NULL,
  KEY `Capacitacao_FK` (`Tipo`),
  CONSTRAINT `Capacitacao_FK` FOREIGN KEY (`Tipo`) REFERENCES `CV` (`Tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Capacitacao`
--

LOCK TABLES `Capacitacao` WRITE;
/*!40000 ALTER TABLE `Capacitacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Capacitacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cursos`
--

DROP TABLE IF EXISTS `Cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cursos` (
  `Codigo` int(11) NOT NULL,
  `Nome` tinytext NOT NULL,
  `CodigoDepartamento` int(11) NOT NULL,
  `CargaHoraria` int(11) NOT NULL,
  `ProfessorResponsavel` varchar(100) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `FrkDepCurso` (`CodigoDepartamento`),
  CONSTRAINT `FrkDepCurso` FOREIGN KEY (`CodigoDepartamento`) REFERENCES `Departamentos` (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cursos`
--

LOCK TABLES `Cursos` WRITE;
/*!40000 ALTER TABLE `Cursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Departamentos`
--

DROP TABLE IF EXISTS `Departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Departamentos` (
  `Codigo` int(11) NOT NULL,
  `Nome` tinytext NOT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Departamentos`
--

LOCK TABLES `Departamentos` WRITE;
/*!40000 ALTER TABLE `Departamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Disciplinas`
--

DROP TABLE IF EXISTS `Disciplinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Disciplinas` (
  `CodigoCurso` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Nome` tinytext NOT NULL,
  `Creditos` char(1) NOT NULL,
  `Laboratorio` char(1) NOT NULL,
  `Prelecao` char(1) NOT NULL,
  `CodigoDepartamento` int(11) NOT NULL,
  `CargaHoraria` int(11) NOT NULL,
  `PreRequisito` varchar(100) NOT NULL,
  `RequisitoPara` varchar(50) NOT NULL,
  PRIMARY KEY (`CodigoCurso`,`Numero`),
  CONSTRAINT `FrkCursoDisciplina` FOREIGN KEY (`CodigoCurso`) REFERENCES `Cursos` (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Disciplinas`
--

LOCK TABLES `Disciplinas` WRITE;
/*!40000 ALTER TABLE `Disciplinas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Disciplinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Escola`
--

DROP TABLE IF EXISTS `Escola`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Escola` (
  `Nome` varchar(30) NOT NULL,
  `Telefone` int(11) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Site` varchar(30) NOT NULL,
  `Diretor` varchar(100) NOT NULL,
  `CodigoEscola` int(11) NOT NULL,
  PRIMARY KEY (`CodigoEscola`),
  CONSTRAINT `Escola_FK` FOREIGN KEY (`CodigoEscola`) REFERENCES `Departamentos` (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Escola`
--

LOCK TABLES `Escola` WRITE;
/*!40000 ALTER TABLE `Escola` DISABLE KEYS */;
/*!40000 ALTER TABLE `Escola` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Funcionarios`
--

DROP TABLE IF EXISTS `Funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Funcionarios` (
  `Tipo` varchar(50) NOT NULL,
  `Matricula` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Sexo` char(3) NOT NULL,
  `RG` int(11) NOT NULL,
  `CPF` varchar(30) NOT NULL,
  `Telefone1` int(11) NOT NULL,
  `Telefone2` int(11) NOT NULL,
  `CodigoEscola` int(11) NOT NULL,
  PRIMARY KEY (`CodigoEscola`),
  CONSTRAINT `Funcionarios_FK` FOREIGN KEY (`CodigoEscola`) REFERENCES `Escola` (`CodigoEscola`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Funcionarios`
--

LOCK TABLES `Funcionarios` WRITE;
/*!40000 ALTER TABLE `Funcionarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Professores`
--

DROP TABLE IF EXISTS `Professores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Professores` (
  `Area` varchar(50) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Codigo` int(11) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Sexo` char(3) NOT NULL,
  `RG` int(11) NOT NULL,
  `CPF` varchar(30) NOT NULL,
  `Telefone1` int(11) NOT NULL,
  `Telefone2` int(11) NOT NULL,
  `EscolaVinculada` int(11) NOT NULL,
  PRIMARY KEY (`Area`),
  KEY `Professores_FK` (`Codigo`),
  CONSTRAINT `Professores_FK` FOREIGN KEY (`Codigo`) REFERENCES `Funcionarios` (`CodigoEscola`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Professores`
--

LOCK TABLES `Professores` WRITE;
/*!40000 ALTER TABLE `Professores` DISABLE KEYS */;
/*!40000 ALTER TABLE `Professores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Semestres`
--

DROP TABLE IF EXISTS `Semestres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Semestres` (
  `Ano` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  PRIMARY KEY (`Ano`,`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Semestres`
--

LOCK TABLES `Semestres` WRITE;
/*!40000 ALTER TABLE `Semestres` DISABLE KEYS */;
/*!40000 ALTER TABLE `Semestres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Turmas`
--

DROP TABLE IF EXISTS `Turmas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Turmas` (
  `CodigoCurso` int(11) NOT NULL,
  `NumeroDisciplina` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  `NumeroSubturma` int(11) NOT NULL,
  `AnoSemestre` int(11) NOT NULL,
  `NumeroSemestre` int(11) NOT NULL,
  `ProfessorResponsavel` varchar(50) NOT NULL,
  PRIMARY KEY (`CodigoCurso`,`NumeroDisciplina`,`Numero`,`NumeroSubturma`,`AnoSemestre`),
  KEY `Turmas_FK` (`AnoSemestre`,`NumeroSemestre`),
  KEY `Turmas_FK_1` (`ProfessorResponsavel`),
  CONSTRAINT `FrkTurma` FOREIGN KEY (`CodigoCurso`, `NumeroDisciplina`) REFERENCES `Disciplinas` (`CodigoCurso`, `Numero`),
  CONSTRAINT `Turmas_FK` FOREIGN KEY (`AnoSemestre`, `NumeroSemestre`) REFERENCES `Semestres` (`Ano`, `Numero`),
  CONSTRAINT `Turmas_FK_1` FOREIGN KEY (`ProfessorResponsavel`) REFERENCES `Professores` (`Area`),
  CONSTRAINT `Turmas_FK_2` FOREIGN KEY (`CodigoCurso`) REFERENCES `Alunos` (`CodigoCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Turmas`
--

LOCK TABLES `Turmas` WRITE;
/*!40000 ALTER TABLE `Turmas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Turmas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'Universidade'
--

--
-- Dumping routines for database 'Universidade'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-03 11:37:13
