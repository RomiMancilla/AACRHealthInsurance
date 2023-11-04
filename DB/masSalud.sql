-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 04, 2023 at 06:45 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `masSalud`
--

-- --------------------------------------------------------

--
-- Table structure for table `afiliados`
--

CREATE TABLE `afiliados` (
  `idAfiliado` int(11) NOT NULL,
  `nombreAfiliado` varchar(50) NOT NULL,
  `apellidoAfiliado` varchar(50) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `domicilioAfiliado` varchar(60) NOT NULL,
  `telefonoAfiliado` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `afiliados`
--

INSERT INTO `afiliados` (`idAfiliado`, `nombreAfiliado`, `apellidoAfiliado`, `dni`, `domicilioAfiliado`, `telefonoAfiliado`, `estado`) VALUES
(1, 'Luke ', 'Combs', '1234', 'Pacific Highway 23', '61 352 6984', 1),
(2, 'Chris', 'Martin', '1000', 'St Albert 831', '44 654 2587', 1),
(3, 'Taylor', 'Swift', '30872009', '5th Avenue 18', '212 646 737', 1),
(4, 'Katy', 'Perry', '29654887', 'Stone Street', '212 996 441', 1),
(5, 'Bruno', 'Mars', '31258774', 'Keahole Street 23', '808 223 111', 1),
(6, 'Harry', 'Styles', '35474312', 'Brick Lane 19', '44 356 887', 1),
(7, 'Selena ', 'Gomez', '36889442', 'Canon Drive 47', '254 331 000', 1),
(8, 'Shania', 'Twain', '22369887', 'Hollywood Boulevard 20', '323 222 887', 1),
(9, 'Keeny', 'Rogers', '15658741', 'Ocean Drive 74', '305 564 721', 1),
(10, 'Frank', 'Sinatra', '2000', 'Victoria Street', '44 555 234', 1),
(11, 'Dan ', 'Reynolds', '34658720', 'Malibu St 541', '44 963872', 1),
(12, 'Muriel', 'Day', '4235761', 'Grafton St', '353 587 732', 1),
(13, 'Shawn', 'Mendez', '38445122', '5th Avenue 983', '44 788 459', 1),
(14, 'Aron', 'Smith', '123', 'Avenida Siempre Viva', '011123456', 1),
(15, 'James', 'Bay', '34852775', 'Albert St 12', '44 565 100', 1),
(16, 'Ellie', 'Goulding', '29556741', 'Hyde Park St 323', '44 877 877', 1),
(17, 'Tyla', 'Jane', '38655741', 'The Corner 222', '44 857 965', 1),
(18, 'Richard', 'Marx', '24858633', 'Pacific Highway 51', '609 325 525', 1),
(19, 'Juan', 'Padilla', '25123123', 'Av. Nueva 123', '11456789', 1),
(23, 'Joe', 'Biden', '30123123', 'White House 000', '456789129', 1),
(26, 'Alan', 'Hayek', '30123456', 'Lincoln Boulevart 00', '456456', 1),
(28, 'Robin', 'Cook', '3000', 'Av X', '456456', 1),
(29, 'Alan', 'Turin', '456789', 'Birmingan', '456456123', 1),
(30, 'Waters', 'Roger', '5000', 'The Wall Apartament', '456456789', 1),
(31, 'Franz', 'Kafka', '6000', 'Praga', 'No tiene...', 1);

-- --------------------------------------------------------

--
-- Table structure for table `especialidades`
--

CREATE TABLE `especialidades` (
  `idEspecialidad` int(11) NOT NULL,
  `nombreEspecialidad` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `especialidades`
--

INSERT INTO `especialidades` (`idEspecialidad`, `nombreEspecialidad`, `estado`) VALUES
(1, 'Clinica Medica', 1),
(2, 'Dermatologia', 1),
(3, 'Endocrinologia', 1),
(4, 'Genetica Medica', 1),
(5, 'Ginecologia y Obstetricia', 1),
(6, 'Laboratorio', 1),
(7, 'Nefrologia', 1),
(8, 'Neurologia', 1),
(9, 'Odontologia', 1),
(10, 'Oftalmologia', 1),
(11, 'Oncologia', 1),
(12, 'Pediatria', 1),
(13, 'Reumatologia', 1),
(14, 'Psicologia', 1),
(15, 'Traumatologia y Ortopedia', 1),
(16, 'Urologia', 1),
(17, 'Cirugia General', 1),
(18, 'Cardiopatia', 1),
(22, 'Rayos X', 1),
(24, 'Cardiologia Pedriatrica', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ordenes`
--

CREATE TABLE `ordenes` (
  `idOrden` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `formaPago` varchar(50) NOT NULL,
  `importe` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idAfiliado` int(11) NOT NULL,
  `idPrestador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ordenes`
--

INSERT INTO `ordenes` (`idOrden`, `fecha`, `formaPago`, `importe`, `estado`, `idAfiliado`, `idPrestador`) VALUES
(1, '2023-11-01', 'MERCADOPAGO', 1500, 1, 1, 1),
(2, '2023-10-23', 'MERCADOPAGO', 1000, 1, 2, 2),
(3, '2023-10-23', 'DEBITO', 500, 1, 10, 10),
(4, '2023-08-23', 'EFECTIVO', 3500, 1, 10, 10),
(5, '2023-09-15', 'TRANSFERENCIABANCARIA', 3800, 1, 6, 17),
(6, '2023-08-23', 'TRANSFERENCIABANCARIA', 3100, 1, 18, 20),
(7, '2023-10-03', 'TRANSFERENCIABANCARIA', 3100, 1, 7, 18),
(8, '2023-07-19', 'DEBITO', 3500, 1, 11, 7),
(9, '2023-10-24', 'DEBITO', 4000, 1, 6, 8),
(10, '2023-06-21', 'DEBITO', 2800, 1, 5, 6),
(11, '2023-10-06', 'DEBITO', 4000, 1, 1, 6),
(12, '2023-07-20', 'CREDITO', 3500, 1, 5, 17),
(13, '2023-10-10', 'CREDITO', 3800, 1, 2, 2),
(15, '2023-11-22', 'CREDITO', 4000, 1, 14, 19),
(16, '2023-10-12', 'CREDITO', 4000, 1, 13, 16),
(17, '2023-04-18', 'CREDITO', 2800, 1, 8, 13),
(18, '2023-05-15', 'CREDITO', 2800, 1, 16, 8),
(22, '2023-03-12', 'EFECTIVO', 500, 1, 1, 2),
(26, '2023-03-13', 'EFECTIVO', 500, 1, 1, 2),
(29, '2023-03-14', 'EFECTIVO', 500, 1, 1, 2),
(31, '2023-10-21', 'EFECTIVO', 5000, 1, 4, 4),
(32, '2023-10-21', 'CREDITO', 4000, 1, 4, 8),
(33, '2023-10-21', 'CREDITO', 5000, 1, 10, 20),
(34, '2023-10-23', 'MERCADOPAGO', 3500, 1, 29, 17),
(35, '2023-10-23', 'DEBITO', 8000, 1, 30, 24),
(36, '2023-10-23', 'DEBITO', 7000, 1, 30, 26),
(37, '2023-10-23', 'OTROS', 6500, 1, 26, 17),
(38, '2023-10-31', 'OTROS', 6500, 1, 10, 24),
(39, '2023-10-31', 'EFECTIVO', 8000, 1, 26, 1),
(40, '2023-11-01', 'OTROS', 5900, 1, 17, 2);

-- --------------------------------------------------------

--
-- Table structure for table `prestadores`
--

CREATE TABLE `prestadores` (
  `idPrestador` int(11) NOT NULL,
  `nombrePrestador` varchar(50) NOT NULL,
  `apellidoPrestador` varchar(50) NOT NULL,
  `matricula` int(11) NOT NULL,
  `domicilioPrestador` varchar(60) NOT NULL,
  `telefonoPrestador` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idEspecialidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prestadores`
--

INSERT INTO `prestadores` (`idPrestador`, `nombrePrestador`, `apellidoPrestador`, `matricula`, `domicilioPrestador`, `telefonoPrestador`, `estado`, `idEspecialidad`) VALUES
(1, 'Thomas', 'Smith', 1234, 'Ocean Highway 470', '61 556 699', 1, 1),
(2, 'Mariah', 'Brown', 8871, 'Anna Bay St 41', '61 369 757', 1, 1),
(3, 'John', 'Cyrus', 100, 'Av SUR', '2155', 1, 6),
(4, 'Michelle', 'Miller', 4687, 'Abbey Road 87', '44 599 777', 1, 2),
(5, 'Richard', 'Davis', 5610, 'The Mall 53', '44 587 521', 1, 16),
(6, 'Carlie', 'Anderson', 4547, 'GrandView St 20', '254 740 874', 1, 2),
(7, 'Gabrielle', 'Aprile', 4741, 'Captain Cook 37', '353 751 993', 1, 12),
(8, 'Massimo', 'Di Lucca', 8789, 'Anna Frank  904', '44 976 444', 1, 10),
(9, 'Jane', 'Wilson', 7470, 'Hollywood Boulevard 32', '61 741 002', 1, 5),
(10, 'Ariana', 'King', 4441, 'Pitt St 30', '44 888 531', 1, 6),
(11, 'James', 'Martin', 357, 'Saint Martin 302', '61 655 871', 1, 7),
(12, 'Lucca', 'Di Cataldo', 6597, 'Canon Drive 30', '254 879 879', 1, 8),
(13, 'Gino', 'Di Marco', 8788, 'Summer St 3030', '441 555 321', 1, 9),
(14, 'Kevin', 'Mc Gregor', 2133, 'Atlantic 3000', '353 587 999', 1, 17),
(15, 'Robert', 'Kelly', 8874, 'Cleveland St 55', '61 875 241', 1, 11),
(16, 'Leonard', 'Harrys', 1179, 'Beverly St 55', '305 875 999', 1, 13),
(17, 'Matt', 'Ryan', 9902, 'Silver Line 598', '305 965 574', 1, 14),
(18, 'Amy', 'Walsh', 1818, 'Walker Lane 30', '44 875 555', 1, 15),
(19, 'Derry', 'Collins', 6589, 'River St 5400', '61 895 556', 1, 18),
(20, 'John', 'Wicht', 1000, 'Continental Hotel', '123123', 1, 8),
(23, 'Tom', 'Clancy', 9876, 'Gold Avenue 1506', '456789445', 1, 22),
(24, 'Arturo', 'Perez Reverte', 2000, 'Castilla 8590', '123456789', 1, 10),
(25, 'Diego', 'Golombeck', 3000, 'La Plata B.A.', '', 1, 22),
(26, 'Humberto', 'Eco', 4000, 'Madrid', '0950456', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `afiliados`
--
ALTER TABLE `afiliados`
  ADD PRIMARY KEY (`idAfiliado`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indexes for table `especialidades`
--
ALTER TABLE `especialidades`
  ADD PRIMARY KEY (`idEspecialidad`),
  ADD UNIQUE KEY `nombreEspecialidad` (`nombreEspecialidad`);

--
-- Indexes for table `ordenes`
--
ALTER TABLE `ordenes`
  ADD PRIMARY KEY (`idOrden`),
  ADD UNIQUE KEY `restriccion_idAfiliado_idPrestador_fecha` (`idAfiliado`,`idPrestador`,`fecha`),
  ADD KEY `idAfiliado` (`idAfiliado`,`idPrestador`),
  ADD KEY `idPrestador` (`idPrestador`);

--
-- Indexes for table `prestadores`
--
ALTER TABLE `prestadores`
  ADD PRIMARY KEY (`idPrestador`),
  ADD UNIQUE KEY `matricula` (`matricula`),
  ADD KEY `idEspecialidad` (`idEspecialidad`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `afiliados`
--
ALTER TABLE `afiliados`
  MODIFY `idAfiliado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `especialidades`
--
ALTER TABLE `especialidades`
  MODIFY `idEspecialidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `ordenes`
--
ALTER TABLE `ordenes`
  MODIFY `idOrden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `prestadores`
--
ALTER TABLE `prestadores`
  MODIFY `idPrestador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ordenes`
--
ALTER TABLE `ordenes`
  ADD CONSTRAINT `ordenes_ibfk_1` FOREIGN KEY (`idPrestador`) REFERENCES `prestadores` (`idPrestador`),
  ADD CONSTRAINT `ordenes_ibfk_2` FOREIGN KEY (`idAfiliado`) REFERENCES `afiliados` (`idAfiliado`);

--
-- Constraints for table `prestadores`
--
ALTER TABLE `prestadores`
  ADD CONSTRAINT `prestadores_ibfk_1` FOREIGN KEY (`idEspecialidad`) REFERENCES `especialidades` (`idEspecialidad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
