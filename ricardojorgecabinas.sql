-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-05-2016 a las 20:02:43
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ricardojorgecabinas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquilermodem`
--

CREATE TABLE `alquilermodem` (
  `codigoalquiler` bigint(20) UNSIGNED NOT NULL,
  `fechainicioalquiler` date NOT NULL,
  `fechafinalquiler` date NOT NULL,
  `fechadevolucion` date NOT NULL,
  `preciodia` int(11) NOT NULL,
  `multa` int(11) NOT NULL,
  `codigomodem` bigint(20) UNSIGNED NOT NULL,
  `cedulacliente` varchar(50) NOT NULL,
  `cedulausuario` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cedulacliente` varchar(50) NOT NULL,
  `nombrecliente` text NOT NULL,
  `telefonocliente` text NOT NULL,
  `correocliente` text NOT NULL,
  `fechanacimientocliente` date NOT NULL,
  `direccioncliente` text NOT NULL,
  `estadocliente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cedulacliente`, `nombrecliente`, `telefonocliente`, `correocliente`, `fechanacimientocliente`, `direccioncliente`, `estadocliente`) VALUES
('default', 'default', 'default', 'default', '0000-00-00', 'default', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planminutos`
--

CREATE TABLE `planminutos` (
  `codigoplan` bigint(20) UNSIGNED NOT NULL,
  `nombreplan` varchar(30) NOT NULL,
  `cantidadminutos` int(11) NOT NULL,
  `cantidadminutosfijos` int(11) NOT NULL,
  `fechaproximarecarga` date NOT NULL,
  `costominuto` int(11) NOT NULL,
  `preciominuto` int(11) NOT NULL,
  `minutosacumulables` tinyint(1) NOT NULL,
  `cantidadminimaminutos` int(11) NOT NULL,
  `estadoplanminutos` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `planminutos`
--

INSERT INTO `planminutos` (`codigoplan`, `nombreplan`, `cantidadminutos`, `cantidadminutosfijos`, `fechaproximarecarga`, `costominuto`, `preciominuto`, `minutosacumulables`, `cantidadminimaminutos`, `estadoplanminutos`) VALUES
(1, 'Movistar', 300, 100, '2016-06-02', 200, 300, 1, 50, 1),
(2, 'Claro', 200, 200, '2016-05-31', 100, 50, 1, 40, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocion`
--

CREATE TABLE `promocion` (
  `codigopromocion` bigint(20) UNSIGNED NOT NULL,
  `fechainiciopromocion` date NOT NULL,
  `fechafinpromocion` date NOT NULL,
  `tipopromocion` varchar(20) NOT NULL,
  `condicion` int(11) NOT NULL,
  `beneficio` int(11) NOT NULL,
  `descripcion` text NOT NULL,
  `estadopromocion` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocionalquilermodem`
--

CREATE TABLE `promocionalquilermodem` (
  `codigoalquiler` bigint(20) UNSIGNED NOT NULL,
  `codigopromocion` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocionventaminutos`
--

CREATE TABLE `promocionventaminutos` (
  `codigoventa` bigint(20) UNSIGNED NOT NULL,
  `codigopromocion` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recarga`
--

CREATE TABLE `recarga` (
  `codigorecarga` bigint(20) UNSIGNED NOT NULL,
  `fecharecarga` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `valorecarga` int(11) NOT NULL,
  `minutos` int(11) NOT NULL,
  `codigoplan` bigint(20) UNSIGNED NOT NULL,
  `cedulausuario` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usbmodem`
--

CREATE TABLE `usbmodem` (
  `codigomodem` bigint(20) UNSIGNED NOT NULL,
  `nombremodem` varchar(20) NOT NULL,
  `proveedor` varchar(20) NOT NULL,
  `disponibilidad` varchar(50) NOT NULL,
  `costodia` int(11) NOT NULL,
  `preciodia` int(11) NOT NULL,
  `estadousbmodem` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedulausuario` varchar(50) NOT NULL,
  `nombreusuario` text NOT NULL,
  `contrasena` text NOT NULL,
  `tipousuario` varchar(20) NOT NULL,
  `telefonosuario` text NOT NULL,
  `direccionusuario` text NOT NULL,
  `correousuario` text NOT NULL,
  `estadousuario` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cedulausuario`, `nombreusuario`, `contrasena`, `tipousuario`, `telefonosuario`, `direccionusuario`, `correousuario`, `estadousuario`) VALUES
('12345', 'administrador1', 'admin1', 'administrador', '', '', '', 1),
('123456', 'vendedor1', 'vendedor1', 'vendedor', '', '', '', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventaminutos`
--

CREATE TABLE `ventaminutos` (
  `codigoventa` bigint(20) UNSIGNED NOT NULL,
  `fechaventa` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `minutosvendidos` int(11) NOT NULL,
  `minutosfacturados` int(11) NOT NULL,
  `preciominuto` int(11) NOT NULL,
  `codigoplan` bigint(20) UNSIGNED NOT NULL,
  `cedulacliente` varchar(50) NOT NULL,
  `cedulausuario` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventaminutos`
--

INSERT INTO `ventaminutos` (`codigoventa`, `fechaventa`, `minutosvendidos`, `minutosfacturados`, `preciominuto`, `codigoplan`, `cedulacliente`, `cedulausuario`) VALUES
(1, '2016-05-26 04:35:58', 4, 4, 50, 2, 'default', '123456'),
(2, '2016-05-26 04:40:37', 10, 10, 300, 1, 'default', '123456'),
(3, '2016-05-26 05:00:48', 9, 9, 300, 1, 'default', '123456'),
(5, '2016-05-29 21:37:31', 1, 1, 50, 2, 'default', '12345');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alquilermodem`
--
ALTER TABLE `alquilermodem`
  ADD PRIMARY KEY (`codigoalquiler`),
  ADD UNIQUE KEY `codigoalquiler` (`codigoalquiler`),
  ADD KEY `codigomodem` (`codigomodem`,`cedulacliente`,`cedulausuario`),
  ADD KEY `foraneaalquilercliente` (`cedulacliente`),
  ADD KEY `foraneaalquilerusuario` (`cedulausuario`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedulacliente`);

--
-- Indices de la tabla `planminutos`
--
ALTER TABLE `planminutos`
  ADD PRIMARY KEY (`codigoplan`),
  ADD UNIQUE KEY `codigoplan` (`codigoplan`);

--
-- Indices de la tabla `promocion`
--
ALTER TABLE `promocion`
  ADD PRIMARY KEY (`codigopromocion`),
  ADD UNIQUE KEY `codigopromocion` (`codigopromocion`);

--
-- Indices de la tabla `promocionalquilermodem`
--
ALTER TABLE `promocionalquilermodem`
  ADD PRIMARY KEY (`codigoalquiler`,`codigopromocion`),
  ADD KEY `foraneaalquilerpromocionpromocion` (`codigopromocion`);

--
-- Indices de la tabla `promocionventaminutos`
--
ALTER TABLE `promocionventaminutos`
  ADD PRIMARY KEY (`codigoventa`,`codigopromocion`),
  ADD KEY `foraneaventapromocionpromocion` (`codigopromocion`);

--
-- Indices de la tabla `recarga`
--
ALTER TABLE `recarga`
  ADD PRIMARY KEY (`codigorecarga`),
  ADD UNIQUE KEY `codigorecarga` (`codigorecarga`),
  ADD KEY `codigoplan` (`codigoplan`),
  ADD KEY `cedulausuario` (`cedulausuario`);

--
-- Indices de la tabla `usbmodem`
--
ALTER TABLE `usbmodem`
  ADD PRIMARY KEY (`codigomodem`),
  ADD UNIQUE KEY `codigomodem` (`codigomodem`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cedulausuario`);

--
-- Indices de la tabla `ventaminutos`
--
ALTER TABLE `ventaminutos`
  ADD PRIMARY KEY (`codigoventa`),
  ADD UNIQUE KEY `codigoventa` (`codigoventa`),
  ADD KEY `codigoplan` (`codigoplan`,`cedulacliente`,`cedulausuario`),
  ADD KEY `codigoplan_2` (`codigoplan`,`cedulacliente`,`cedulausuario`),
  ADD KEY `foraneaventausuario` (`cedulausuario`),
  ADD KEY `foraneaventacliente` (`cedulacliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alquilermodem`
--
ALTER TABLE `alquilermodem`
  MODIFY `codigoalquiler` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `planminutos`
--
ALTER TABLE `planminutos`
  MODIFY `codigoplan` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `promocion`
--
ALTER TABLE `promocion`
  MODIFY `codigopromocion` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `recarga`
--
ALTER TABLE `recarga`
  MODIFY `codigorecarga` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usbmodem`
--
ALTER TABLE `usbmodem`
  MODIFY `codigomodem` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `ventaminutos`
--
ALTER TABLE `ventaminutos`
  MODIFY `codigoventa` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alquilermodem`
--
ALTER TABLE `alquilermodem`
  ADD CONSTRAINT `foraneaalquilercliente` FOREIGN KEY (`cedulacliente`) REFERENCES `cliente` (`cedulacliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaalquilermodem` FOREIGN KEY (`codigomodem`) REFERENCES `usbmodem` (`codigomodem`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaalquilerusuario` FOREIGN KEY (`cedulausuario`) REFERENCES `usuario` (`cedulausuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `promocionalquilermodem`
--
ALTER TABLE `promocionalquilermodem`
  ADD CONSTRAINT `foraneaalquilerpromocionalquiler` FOREIGN KEY (`codigoalquiler`) REFERENCES `alquilermodem` (`codigoalquiler`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaalquilerpromocionpromocion` FOREIGN KEY (`codigopromocion`) REFERENCES `promocion` (`codigopromocion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `promocionventaminutos`
--
ALTER TABLE `promocionventaminutos`
  ADD CONSTRAINT `foraneaventapromocionpromocion` FOREIGN KEY (`codigopromocion`) REFERENCES `promocion` (`codigopromocion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaventapromocionventa` FOREIGN KEY (`codigoventa`) REFERENCES `ventaminutos` (`codigoventa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `recarga`
--
ALTER TABLE `recarga`
  ADD CONSTRAINT `foranearecargaplan` FOREIGN KEY (`codigoplan`) REFERENCES `planminutos` (`codigoplan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foranearecargausuario` FOREIGN KEY (`cedulausuario`) REFERENCES `usuario` (`cedulausuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventaminutos`
--
ALTER TABLE `ventaminutos`
  ADD CONSTRAINT `foraneaventacliente` FOREIGN KEY (`cedulacliente`) REFERENCES `cliente` (`cedulacliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaventaplan` FOREIGN KEY (`codigoplan`) REFERENCES `planminutos` (`codigoplan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `foraneaventausuario` FOREIGN KEY (`cedulausuario`) REFERENCES `usuario` (`cedulausuario`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
