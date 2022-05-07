-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bwzgakr98dbpwoirh7xb-mysql.services.clever-cloud.com:3306
-- Generation Time: Apr 14, 2022 at 01:52 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bwzgakr98dbpwoirh7xb`
--

-- --------------------------------------------------------

--
-- Table structure for table `estudios`
--

CREATE TABLE `estudios` (
  `id` bigint(20) NOT NULL,
  `casa_de_estudios` varchar(255) DEFAULT NULL,
  `fecha_inicio` varchar(255) DEFAULT NULL,
  `fecha_termino` varchar(255) DEFAULT NULL,
  `titulo_estudios` varchar(255) DEFAULT NULL,
  `url_logo` varchar(255) DEFAULT NULL,
  `persona_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `estudios`
--

INSERT INTO `estudios` (`id`, `casa_de_estudios`, `fecha_inicio`, `fecha_termino`, `titulo_estudios`, `url_logo`, `persona_id`) VALUES
(96, 'Academia Numen', '2022', '', 'Desarrollador Web Full Stack', 'https://i.ibb.co/GWWxRSZ/numen.jpg', 1),
(97, 'Argentina Programa', '2021', NULL, 'Full Stack Developer', 'https://i.ibb.co/346BKsN/arg-programa.png', 1),
(98, 'Udemy', '2022', NULL, 'Master en JavaScript: Aprender JS, jQuery, Angular, NodeJS', 'https://i.ibb.co/CP3NM1Q/udemy.png', 1),
(99, 'Domestika', '2022', NULL, 'Introducción a la programación en JavaScript', 'https://i.ibb.co/qkX3mwZ/domestika.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `experiencia_laboral`
--

CREATE TABLE `experiencia_laboral` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_finalizacion` varchar(255) DEFAULT NULL,
  `fecha_inicio` varchar(255) DEFAULT NULL,
  `nombre_empresa` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `persona_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia_laboral`
--

INSERT INTO `experiencia_laboral` (`id`, `descripcion`, `fecha_finalizacion`, `fecha_inicio`, `nombre_empresa`, `puesto`, `persona_id`) VALUES
(110, 'Trabajé como representante en el área de Asistencia al Cliente de la empresa TimeWarner Cable, brindando soporte técnico y vendiendo productos y servicios.', '2011', '2010', 'TeleTech', 'Custormer Service Representative', 1),
(115, 'Me desempeñé en el área de servicio al cliente dentro del Proyecto Guthy Renker del área BPS de Hewlett Packard.', '2014', '2014', 'Guthy Renker', 'Customer Service Representative ', 1),
(116, 'Me desempeñé en el área de servicio al cliente dentro del Proyecto Viviendo Mejor del laboratorio Novartis del área BPS de Hewlett Packard.', '2016', '2014', 'Novartis', 'Asistencia al Paciente ', 1);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(117);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ocupacion` varchar(255) DEFAULT NULL,
  `sobremi` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `email`, `nombre`, `ocupacion`, `sobremi`, `telefono`, `url_imagen`) VALUES
(1, 'Pettinaroli', 'carolinapettinaroli@gmail.com', 'Carolina', 'FullStack Developer', 'Aficionada de los juegos de mesa y de computadora. Amante de los viajes, un buen café en algún bar (sola o con amigos). Siempre buscando saber y aprender más.', '5491166942078', 'https://i.ibb.co/48PNr1G/foto.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `personas`
--

CREATE TABLE `personas` (
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ocupacion` varchar(255) DEFAULT NULL,
  `sobremi` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personas`
--

INSERT INTO `personas` (`id`, `apellido`, `email`, `nombre`, `ocupacion`, `sobremi`, `telefono`, `url_imagen`) VALUES
(1, 'Pettinaroli', 'carolinapettinaroli@gmail.com    ', 'Carolina    ', 'FullStack Developer    ', 'Aficionada de los juegos de mesa y de computadora. Amante de los viajes, el cine, la música, los libros y un buen café en algún bar (sola o con amigos). Siempre buscando saber y aprender más.    ', '1166942078    ', 'https://i.ibb.co/48PNr1G/foto.jpg   ');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre_proyecto` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL,
  `url_proyecto` varchar(255) DEFAULT NULL,
  `persona_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id`, `descripcion`, `nombre_proyecto`, `url_imagen`, `url_proyecto`, `persona_id`) VALUES
(111, '', 'Funyversity Webpage', 'https://i.ibb.co/M57MFGy/funyversity.jpg', 'https://funiversity.la/', 1),
(112, NULL, 'Página Web para el Colegio Compañía de María', 'https://i.ibb.co/pxDgvzJ/ciamaria.jpg', 'https://companiademariacespedes.edu.ar/', 1),
(113, NULL, 'Backend de AbsolutFit', 'https://i.ibb.co/Sd2MH2t/absolutfit.jpg', NULL, 1),
(114, NULL, 'Página Web para Agencia de Turismo', 'https://i.ibb.co/CQMnsMh/berlin.jpg', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `role_nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `role_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `skills`
--

CREATE TABLE `skills` (
  `id` bigint(20) NOT NULL,
  `porcentaje` varchar(255) DEFAULT NULL,
  `skill` varchar(255) DEFAULT NULL,
  `persona_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skills`
--

INSERT INTO `skills` (`id`, `porcentaje`, `skill`, `persona_id`) VALUES
(1, '60', 'Java', 1),
(95, '50', 'JavaScript', 1),
(100, '80', 'HTML', 1),
(101, '60', 'CSS', 1),
(102, '60', 'Angular', 1),
(103, '30', 'SQL', 1),
(104, '100', 'Inglés', 1),
(105, '60', 'Italiano', 1),
(106, '40', 'Alemán', 1),
(107, '85', 'Liderazgo', 1),
(108, '100', 'Responsabilidad', 1),
(109, '80', 'Trabajo en Equipo', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `nombre_usuario` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `nombre`, `nombre_usuario`, `password`) VALUES
(1, 'carolinapettinaroli@gmail.com', 'admin', 'admin', '$2a$10$sQ6X1qPESC8M4YMMmyDhTOsc4D2L0rUW9MCINdgH0SSiUYODTtFdK'),
(4, 'santiysofi@gmail.com', 'user', 'user', '$2a$10$0zQCZE8rqijCB00ZV0PmGeA2RdsApAyyvgQFJGllJQKkNcVjh5Qzi');

-- --------------------------------------------------------

--
-- Table structure for table `usuario_rol`
--

CREATE TABLE `usuario_rol` (
  `usuario_id` bigint(20) NOT NULL,
  `rol_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(1, 1),
(1, 2),
(4, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `estudios`
--
ALTER TABLE `estudios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKc27dkivql1ci19cjs8obv9o7c` (`persona_id`);

--
-- Indexes for table `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjs91dru4mnpoinlk8s8t393ug` (`persona_id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKh6utpl6n6sqojwpd5hdya8b13` (`persona_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skills`
--
ALTER TABLE `skills`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK37t1gpsyr0jp5cul2pxs39thg` (`persona_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_nc516pyaj79w6s99ttssnbh3i` (`nombre_usuario`);

--
-- Indexes for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD PRIMARY KEY (`usuario_id`,`rol_id`),
  ADD KEY `FK86tr79d4ggs6pkctuihun5x4i` (`rol_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `estudios`
--
ALTER TABLE `estudios`
  ADD CONSTRAINT `FKc27dkivql1ci19cjs8obv9o7c` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);

--
-- Constraints for table `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD CONSTRAINT `FKjs91dru4mnpoinlk8s8t393ug` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);

--
-- Constraints for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD CONSTRAINT `FKh6utpl6n6sqojwpd5hdya8b13` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);

--
-- Constraints for table `skills`
--
ALTER TABLE `skills`
  ADD CONSTRAINT `FK37t1gpsyr0jp5cul2pxs39thg` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);

--
-- Constraints for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK86tr79d4ggs6pkctuihun5x4i` FOREIGN KEY (`rol_id`) REFERENCES `role` (`id`),
  ADD CONSTRAINT `FKcq4ibmspqf9iv6ske186blke8` FOREIGN KEY (`usuario_id`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
