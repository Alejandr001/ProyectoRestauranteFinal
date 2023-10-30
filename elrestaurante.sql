-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 03:18:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `elrestaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cobro`
--

CREATE TABLE `cobro` (
  `idCobro` int(10) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `idMesero` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `total` int(10) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `disponible` tinyint(1) NOT NULL,
  `atendida` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `capacidad`, `disponible`, `atendida`) VALUES
(1, 2, 1, 0),
(2, 2, 1, 0),
(3, 2, 1, 0),
(4, 2, 1, 0),
(5, 2, 1, 0),
(6, 4, 1, 0),
(7, 4, 1, 0),
(8, 4, 1, 0),
(9, 4, 1, 0),
(10, 4, 1, 0),
(11, 4, 1, 0),
(12, 4, 1, 0),
(13, 4, 1, 0),
(14, 6, 1, 0),
(15, 6, 1, 0),
(16, 6, 1, 0),
(17, 6, 1, 0),
(18, 6, 1, 0),
(19, 8, 1, 0),
(20, 8, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idMesero` int(10) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `apellido` varchar(11) NOT NULL,
  `usuario` varchar(11) NOT NULL,
  `contraseña` varchar(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idMesero`, `nombre`, `apellido`, `usuario`, `contraseña`, `estado`) VALUES
(1, 'Lucas ', 'Aielo', 'lucas', 'aielo', 1),
(2, 'Francisco ', 'Andrian', 'francisco', 'andrian', 1),
(3, 'Alejandro ', 'Gaite', 'alejandro', 'gaite', 1),
(4, 'Nahuel ', 'Gavino', 'nahuel', 'gavino', 1),
(5, 'Pablo', 'Poder', 'Pablo', 'Poder', 0),
(6, 'Antonella', 'Civarello', 'Antonella', 'Civarello', 0),
(7, 'Mauricio', 'Funes', 'Mauricio', 'Funes', 0),
(8, 'Maira', 'Rotte', 'Maira', 'Rotte', 0),
(9, 'Sebastian', 'Busto', 'Sebastian', 'Busto', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `idMesero` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idMesa`, `idMesero`, `fecha`, `estado`) VALUES
(3, 1, 1, '2023-10-26', 0),
(4, 4, 3, '2023-10-26', 0),
(5, 1, 2, '2023-10-26', 0),
(6, 5, 4, '2023-10-26', 0),
(7, 1, 1, '2023-10-26', 0),
(8, 1, 1, '2023-10-26', 0),
(9, 1, 1, '2023-10-26', 0),
(10, 1, 1, '2023-10-26', 0),
(11, 5, 3, '2023-10-26', 0),
(12, 1, 1, '2023-02-02', 0),
(13, 1, 1, '2023-10-28', 0),
(14, 4, 4, '2023-10-28', 0),
(15, 2, 2, '2023-10-28', 0),
(16, 1, 1, '2023-10-28', 0),
(17, 1, 1, '2023-10-28', 0),
(18, 1, 1, '2023-10-28', 0),
(19, 1, 1, '2023-10-28', 0),
(20, 1, 1, '2023-10-28', 0),
(21, 1, 1, '2023-10-28', 0),
(22, 1, 1, '2023-10-28', 0),
(23, 1, 1, '2023-10-28', 0),
(24, 1, 1, '2023-10-28', 0),
(25, 3, 3, '2023-10-28', 0),
(26, 1, 1, '2023-10-28', 0),
(27, 1, 1, '2023-10-28', 0),
(28, 5, 4, '2023-10-29', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoproducto`
--

CREATE TABLE `pedidoproducto` (
  `idPedidoProducto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedidoproducto`
--

INSERT INTO `pedidoproducto` (`idPedidoProducto`, `idPedido`, `idProducto`) VALUES
(3, 3, 5),
(4, 3, 32),
(5, 10, 13),
(6, 10, 40),
(7, 10, 38),
(8, 10, 6),
(9, 21, 39),
(10, 21, 51),
(11, 21, 3),
(12, 21, 30),
(13, 21, 4),
(14, 21, 7),
(15, 21, 41),
(16, 21, 3),
(17, 22, 1),
(18, 22, 1),
(19, 22, 1),
(20, 22, 50),
(21, 22, 32),
(22, 22, 41),
(23, 22, 46),
(24, 22, 41),
(25, 22, 7),
(26, 22, 6),
(28, 27, 50),
(29, 27, 6),
(30, 27, 33),
(31, 27, 33),
(32, 28, 48),
(33, 28, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `categoria` varchar(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `disponible` tinyint(1) NOT NULL,
  `cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `categoria`, `precio`, `disponible`, `cantidad`) VALUES
(1, 'Pizza Margarita', 'Pizzas', 5000, 1, 50),
(2, 'Pizza Pepperoni', 'Pizzas', 4500, 1, 60),
(3, 'Pizza Vegetariana', 'Pizzas', 3500, 1, 45),
(4, 'Pizza Hawaiana', 'Pizzas', 4700, 1, 55),
(5, 'Pizza BBQ', 'Pizzas', 5000, 1, 40),
(6, 'Pizza Mexicana', 'Pizzas', 4500, 1, 50),
(7, 'Pizza Caprese', 'Pizzas', 4700, 1, 45),
(8, 'Pizza Pollo BBQ', 'Pizzas', 5000, 1, 55),
(9, 'Lomo Completo', 'Lomos', 2500, 1, 40),
(10, 'Lomo Especial', 'Lomos', 2400, 1, 45),
(11, 'Lomo a la Mostaza', 'Lomos', 2300, 1, 40),
(12, 'Lomo Cheddar', 'Lomos', 2400, 1, 30),
(13, 'Lomo Clásico', 'Lomos', 2300, 1, 35),
(14, 'Lomo Vegetariano', 'Lomos', 2300, 1, 30),
(15, 'Lomo BBQ', 'Lomos', 2600, 1, 45),
(16, 'Lomo con Huevo', 'Lomos', 2300, 1, 35),
(17, 'Lomo con Jamón', 'Lomos', 2500, 1, 40),
(18, 'Hamburguesa Clásica', 'Hamburguesa', 2000, 1, 40),
(19, 'Hamburguesa con Ques', 'Hamburguesa', 2200, 1, 45),
(20, 'Hamburguesa BBQ', 'Hamburguesa', 2300, 1, 35),
(21, 'Hamburguesa Vegetari', 'Hamburguesa', 2000, 1, 40),
(22, 'Hamburguesa Doble', 'Hamburguesa', 3000, 1, 30),
(23, 'Hamburguesa Especial', 'Hamburguesa', 2800, 1, 35),
(24, 'Hamburguesa Hawaiana', 'Hamburguesa', 2600, 1, 30),
(25, 'Hamburguesa Picante', 'Hamburguesa', 2400, 1, 40),
(26, 'Hamburguesa con Cham', 'Hamburguesa', 2500, 1, 35),
(27, 'Hamburguesa de Pollo', 'Hamburguesa', 2300, 1, 40),
(28, 'Taco de Carne Asada', 'Tacos', 1000, 1, 50),
(29, 'Taco de Pollo', 'Tacos', 800, 1, 60),
(30, 'Taco Vegetariano', 'Tacos', 700, 1, 55),
(31, 'Taco de Barbacoa', 'Tacos', 900, 1, 50),
(32, 'Taco Mixto', 'Tacos', 850, 1, 55),
(33, 'Taco de Hongos', 'Tacos', 900, 1, 40),
(34, 'Agua Mineral', 'Bebidas sin', 1000, 1, 100),
(35, 'Refresco de Cola', 'Bebidas sin', 1500, 1, 120),
(36, 'Jugo de Naranja', 'Bebidas sin', 1200, 1, 90),
(37, 'Té Helado', 'Bebidas sin', 1400, 1, 110),
(38, 'Limonada', 'Bebidas sin', 1200, 1, 80),
(39, 'Agua con Gas', 'Bebidas sin', 1000, 1, 70),
(40, 'Jugo de Manzana', 'Bebidas sin', 1200, 1, 95),
(41, 'Té Caliente', 'Bebidas sin', 1400, 1, 105),
(42, 'Café', 'Bebidas sin', 1300, 1, 75),
(43, 'Batido de Frutas', 'Bebidas sin', 1800, 1, 85),
(44, 'Cerveza Lager', 'Bebida con ', 1500, 1, 100),
(45, 'Vino Tinto', 'Bebida con ', 2000, 1, 50),
(46, 'Whisky Escocés', 'Bebida con ', 2500, 1, 20),
(47, 'Fernet con pomelo', 'Bebida con ', 2500, 1, 30),
(48, 'Gin Tónico', 'Bebida con ', 2200, 1, 40),
(49, 'Tequila Reposado', 'Bebida con ', 2200, 1, 15),
(50, 'Cerveza Premium', 'Bebida con ', 2000, 1, 25),
(51, 'Fernet con coka', 'Bebida con ', 3000, 1, 35),
(52, 'Champagne', 'Bebida con ', 3000, 1, 10),
(53, 'Cerveza negra', 'Bebida con ', 2500, 1, 12),
(54, 'fernet', 'bebidas', 5000, 1, 12),
(55, 'fernet', 'bebidas', 5000, 1, 12),
(56, 'fernet', 'bebidas', 5000, 1, 12),
(57, 'fernet', 'bebidas', 5000, 1, 12),
(58, 'fernet con coquita', 'bebidas', 5000, 1, 12),
(59, 'fernet', 'bebidas', 5000, 0, 12),
(60, 'Hamburgesa de lentej', 'Hamburguesa', 10000, 1, 100),
(62, 'Hamburgesa de lentej', 'Hamburguesa', 10000, 1, 100),
(63, 'Hamburgesa de lentej', 'Hamburguesa', 10000, 1, 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(10) NOT NULL,
  `idMesa` int(10) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `contacto` int(21) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time(6) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cobro`
--
ALTER TABLE `cobro`
  ADD PRIMARY KEY (`idCobro`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`),
  ADD KEY `idPedido` (`idPedido`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idMesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`);

--
-- Indices de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD PRIMARY KEY (`idPedidoProducto`),
  ADD UNIQUE KEY `idPedidoProducto` (`idPedidoProducto`),
  ADD KEY `idPedido` (`idPedido`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idMesa` (`idMesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cobro`
--
ALTER TABLE `cobro`
  MODIFY `idCobro` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idMesero` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  MODIFY `idPedidoProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(10) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cobro`
--
ALTER TABLE `cobro`
  ADD CONSTRAINT `cobro_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  ADD CONSTRAINT `cobro_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`),
  ADD CONSTRAINT `cobro_ibfk_3` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`);

--
-- Filtros para la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD CONSTRAINT `pedidoproducto_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `pedidoproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
