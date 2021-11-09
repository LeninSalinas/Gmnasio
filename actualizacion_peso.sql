-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-11-2021 a las 00:10:04
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gimnasio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actualizacion_peso`
--

CREATE TABLE `actualizacion_peso` (
  `ID` int(11) NOT NULL,
  `IDcliente` int(11) NOT NULL,
  `pesoActual` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actualizacion_peso`
--

INSERT INTO `actualizacion_peso` (`ID`, `IDcliente`, `pesoActual`) VALUES
(1, 1, 120);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actualizacion_peso`
--
ALTER TABLE `actualizacion_peso`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDcliente` (`IDcliente`,`pesoActual`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actualizacion_peso`
--
ALTER TABLE `actualizacion_peso`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actualizacion_peso`
--
ALTER TABLE `actualizacion_peso`
  ADD CONSTRAINT `actualizacion_peso_ibfk_2` FOREIGN KEY (`IDcliente`) REFERENCES `clientes` (`ID`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
