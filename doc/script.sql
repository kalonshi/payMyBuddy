--
-- Base de données : `paymybuddytest`
--

-- --------------------------------------------------------

--
-- Structure de la table `connection`
--

CREATE TABLE `connection` (
  `connection_id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  `connection_user_id` bigint(20) NOT NULL,
  `user_user_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `connection`
--

INSERT INTO `connection` (`connection_id`, `label`, `connection_user_id`, `user_user_id`) VALUES
(1, 'Mikeal', 20, 1),
(2, 'Mohamed', 14, 1),
(3, 'Patricia', 19, 1),
(4, 'Sophie', 16, 1),
(5, 'Samba', 12, 1),
(6, 'Mikeal', 4, 2),
(7, 'Mohamed', 11, 2),
(8, 'Patricia', 11, 2),
(9, 'Sophie', 13, 2),
(10, 'Samba', 12, 2),
(11, 'Mikeal', 1, 3),
(12, 'Mohamed', 17, 3),
(13, 'Patricia', 11, 3),
(14, 'Sophie', 19, 3),
(15, 'Samba', 15, 3),
(16, 'Mikeal', 2, 4),
(17, 'Mohamed', 7, 4),
(18, 'Patricia', 14, 4),
(19, 'Sophie', 12, 4),
(20, 'Samba', 14, 4),
(21, 'Mikeal', 5, 5),
(22, 'Mohamed', 8, 5),
(23, 'Patricia', 20, 5),
(24, 'Sophie', 12, 5),
(25, 'Samba', 10, 5),
(26, 'Mikeal', 16, 6),
(27, 'Mohamed', 13, 6),
(28, 'Patricia', 2, 6),
(29, 'Sophie', 16, 6),
(30, 'Samba', 3, 6),
(31, 'Mikeal', 10, 7),
(32, 'Mohamed', 13, 7),
(33, 'Patricia', 18, 7),
(34, 'Sophie', 7, 7),
(35, 'Samba', 8, 7),
(36, 'Mikeal', 12, 8),
(37, 'Mohamed', 12, 8),
(38, 'Patricia', 12, 8),
(39, 'Sophie', 3, 8),
(40, 'Samba', 19, 8),
(41, 'Mikeal', 20, 9),
(42, 'Mohamed', 1, 9),
(43, 'Patricia', 4, 9),
(44, 'Sophie', 14, 9),
(45, 'Samba', 13, 9),
(46, 'Mikeal', 3, 10),
(47, 'Mohamed', 10, 10),
(48, 'Patricia', 6, 10),
(49, 'Sophie', 18, 10),
(50, 'Samba', 6, 10),
(51, 'Mikeal', 14, 11),
(52, 'Mohamed', 18, 11),
(53, 'Patricia', 11, 11),
(54, 'Sophie', 5, 11),
(55, 'Samba', 7, 11),
(56, 'Mikeal', 4, 12),
(57, 'Mohamed', 13, 12),
(58, 'Patricia', 13, 12),
(59, 'Sophie', 4, 12),
(60, 'Samba', 2, 12),
(61, 'Mikeal', 3, 13),
(62, 'Mohamed', 4, 13),
(63, 'Patricia', 12, 13),
(64, 'Sophie', 15, 13),
(65, 'Samba', 18, 13),
(66, 'Mikeal', 17, 14),
(67, 'Mohamed', 1, 14),
(68, 'Patricia', 8, 14),
(69, 'Sophie', 18, 14),
(70, 'Samba', 5, 14),
(71, 'Mikeal', 18, 15),
(72, 'Mohamed', 12, 15),
(73, 'Patricia', 7, 15),
(74, 'Sophie', 7, 15),
(75, 'Samba', 5, 15),
(76, 'Mikeal', 17, 16),
(77, 'Mohamed', 6, 16),
(78, 'Patricia', 8, 16),
(79, 'Sophie', 4, 16),
(80, 'Samba', 8, 16),
(81, 'Mikeal', 14, 17),
(82, 'Mohamed', 20, 17),
(83, 'Patricia', 6, 17),
(84, 'Sophie', 6, 17),
(85, 'Samba', 14, 17),
(86, 'Mikeal', 14, 18),
(87, 'Mohamed', 19, 18),
(88, 'Patricia', 11, 18),
(89, 'Sophie', 11, 18),
(90, 'Samba', 12, 18),
(91, 'Mikeal', 2, 19),
(92, 'Mohamed', 13, 19),
(93, 'Patricia', 19, 19),
(94, 'Sophie', 13, 19),
(95, 'Samba', 3, 19),
(96, 'Mikeal', 10, 20),
(97, 'Mohamed', 14, 20),
(98, 'Patricia', 15, 20),
(99, 'Sophie', 15, 20),
(100, 'Samba', 20, 20);

-- --------------------------------------------------------

--
-- Structure de la table `transaction`
--

CREATE TABLE `transaction` (
  `id_transaction` bigint(20) NOT NULL,
  `amount` double NOT NULL,
  `date` datetime NOT NULL,
  `description` varchar(30) NOT NULL,
  `interest_rate` double DEFAULT NULL,
  `connection_connection_id` bigint(20) NOT NULL,
  `user_user_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `transaction`
--

INSERT INTO `transaction` (`id_transaction`, `amount`, `date`, `description`, `interest_rate`, `connection_connection_id`, `user_user_id`) VALUES
(1, 16, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 1, 1),
(2, 10, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 2, 1),
(3, 10, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 3, 1),
(4, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 4, 1),
(5, 52, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 5, 1),
(6, 16, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 6, 2),
(7, 10, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 7, 2),
(8, 52, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 8, 2),
(9, 20, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 9, 2),
(10, 145, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 10, 2),
(11, 20, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 11, 3),
(12, 10, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 12, 3),
(13, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 13, 3),
(14, 20, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 14, 3),
(15, 20, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 15, 3),
(16, 20, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 16, 4),
(17, 10, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 17, 4),
(18, 20, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 18, 4),
(19, 32, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 19, 4),
(20, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 20, 4),
(21, 145, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 21, 5),
(22, 16, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 22, 5),
(23, 52, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 23, 5),
(24, 145, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 24, 5),
(25, 145, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 25, 5),
(26, 10, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 26, 6),
(27, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 27, 6),
(28, 16, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 28, 6),
(29, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 29, 6),
(30, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 30, 6),
(31, 20, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 31, 7),
(32, 32, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 32, 7),
(33, 10, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 33, 7),
(34, 32, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 34, 7),
(35, 52, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 35, 7),
(36, 20, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 36, 8),
(37, 16, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 37, 8),
(38, 16, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 38, 8),
(39, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 39, 8),
(40, 20, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 40, 8),
(41, 145, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 41, 9),
(42, 145, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 42, 9),
(43, 20, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 43, 9),
(44, 145, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 44, 9),
(45, 10, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 45, 9),
(46, 52, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 46, 10),
(47, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 47, 10),
(48, 145, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 48, 10),
(49, 16, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 49, 10),
(50, 145, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 50, 10),
(51, 16, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 51, 11),
(52, 145, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 52, 11),
(53, 145, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 53, 11),
(54, 16, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 54, 11),
(55, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 55, 11),
(56, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 56, 12),
(57, 10, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 57, 12),
(58, 16, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 58, 12),
(59, 16, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 59, 12),
(60, 20, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 60, 12),
(61, 20, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 61, 13),
(62, 10, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 62, 13),
(63, 52, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 63, 13),
(64, 20, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 64, 13),
(65, 10, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 65, 13),
(66, 16, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 66, 14),
(67, 16, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 67, 14),
(68, 32, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 68, 14),
(69, 32, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 69, 14),
(70, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 70, 14),
(71, 10, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 71, 15),
(72, 16, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 72, 15),
(73, 52, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 73, 15),
(74, 16, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 74, 15),
(75, 10, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 75, 15),
(76, 16, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 76, 16),
(77, 32, '2022-01-04 12:20:19', 'Shopping Bill Share', 0.05, 77, 16),
(78, 52, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 78, 16),
(79, 32, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 79, 16),
(80, 10, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 80, 16),
(81, 145, '2022-01-04 12:20:19', 'Travel Ticket', 0.05, 81, 17),
(82, 16, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 82, 17),
(83, 20, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 83, 17),
(84, 52, '2022-01-04 12:20:19', 'Movie ticket', 0.05, 84, 17),
(85, 20, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 85, 17),
(86, 52, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 86, 18),
(87, 32, '2022-01-04 12:20:19', 'FoodTruck Ticket', 0.05, 87, 18),
(88, 52, '2022-01-04 12:20:19', 'Restaurant Bill share', 0.05, 88, 18),
(89, 145, '2022-01-04 12:20:20', 'Movie ticket', 0.05, 89, 18),
(90, 32, '2022-01-04 12:20:20', 'Restaurant Bill share', 0.05, 90, 18),
(91, 145, '2022-01-04 12:20:20', 'Shopping Bill Share', 0.05, 91, 19),
(92, 16, '2022-01-04 12:20:20', 'Movie ticket', 0.05, 92, 19),
(93, 52, '2022-01-04 12:20:20', 'Movie ticket', 0.05, 93, 19),
(94, 16, '2022-01-04 12:20:20', 'Restaurant Bill share', 0.05, 94, 19),
(95, 52, '2022-01-04 12:20:20', 'Travel Ticket', 0.05, 95, 19),
(96, 16, '2022-01-04 12:20:20', 'Shopping Bill Share', 0.05, 96, 20),
(97, 10, '2022-01-04 12:20:20', 'FoodTruck Ticket', 0.05, 97, 20),
(98, 16, '2022-01-04 12:20:20', 'FoodTruck Ticket', 0.05, 98, 20),
(99, 32, '2022-01-04 12:20:20', 'Shopping Bill Share', 0.05, 99, 20),
(100, 32, '2022-01-04 12:20:20', 'Movie ticket', 0.05, 100, 20);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(255) NOT NULL,
  `solde` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`user_id`, `email`, `password`, `solde`) VALUES
(1, 'admin', '$2a$10$1iJEaAFD0faW3QR1pNv9KOKoZKiyGBsHKzdPRc.4S.BEdEJQ/3cnW', 200),
(2, 'Omaz.Said@gmail.com', '$2a$10$sVk5O9ILfOvx.I3BVmQUJ.008gmT4yc1Jw8EwlYe0ZOmwu7Reu1be', 5),
(3, 'Milo.Michel@gmail.com', '$2a$10$2nF2OdBzMSSbWGVTB6Pv5uzJkXCCPnTtrDghELOSfX/Mles5z2zWm', 105),
(4, 'Escobar.Henry@gmail.com', '$2a$10$vGS/sVCpILzrmIfQgfZU6OqNraG6QkSnsC96XymdmFQRmhyvo9dbG', 205),
(5, 'Van. Martin@gmail.com', '$2a$10$D90DQUaExb51FTDhSFo0GeyhQAHv4l.FIdxWC/0K8whWmkrHG7vH.', 305),
(6, 'Pargeot.Louis@gmail.com', '$2a$10$e7tNiszif8.I87kN3vZr4u9Gx4FHNhUFx1mx4TAPYsx5FWy0R98vu', 405),
(7, 'Tran.Louisa@gmail.com', '$2a$10$AUUi1.Ky47mUb52jXALXleXSrQBHXiIpIb3.01CCAnJuDzfnmJWqe', 505),
(8, 'Lancelot.Julien@gmail.com', '$2a$10$rZ1W/Y1X.K3W9T9eTEIy6O3KJC3P9ibULhUqK9aVvHaXu./2ajq5C', 605),
(9, 'Jonhson.Karen@gmail.com', '$2a$10$K7w1Ln5TeRiCa9S6M.kyF.qZ/dEcILBirFGrDgolzDx.fFoHyfliO', 705),
(10, 'Donovan.Sophie@gmail.com', '$2a$10$y/e/mvcDv.QNcaVlzcqwouds7RVapSvkbOvKuNxwzvaO9zbcp3rLq', 805),
(11, 'Makhlouf.Sofiane@gmail.com', '$2a$10$M37k8SUgcOWwVlI6rlDjfuwJv7eSXGna8O86hjvmdQLEP2HWkXuxW', 905),
(12, 'Diaye.Demba@gmail.com', '$2a$10$MKXcifesPhg6PDC5ysMtMukENvW7D2a2lQlnjq3f4.yp16Ydan1HG', 1005),
(13, 'Diallo.rigobert@gmail.com', '$2a$10$TxPfHausm6BCaRVHTn/pv.XQIh8kl7SGczbW6m1RGn7eXymFGrfby', 1105),
(14, 'Dupont.Henry@gmail.com', '$2a$10$KtZRX8gDEg8LAP62H5.Ieu52uJtQpgOuZmdbbhfiXpIIEb09lEJbS', 1205),
(15, 'Balkanz.Cedric@gmail.com', '$2a$10$dATACG.lgkNOzXQH6ZQ1Y.vsUinrvORaJ60p80VS9WTY9tAic1zHm', 1305),
(16, 'Bond.olivier@gmail.com', '$2a$10$ro0vaDeNqQI0IHWq1o4syOeNu0OGS2Zb8OVXamablx8.8TZXWdi4C', 1405),
(17, 'Belverdere.Eric@gmail.com', '$2a$10$EpgVWmM.D4ajiZigSbdChezk1SrpGBsJRpxB.wR7FKwxFaMQpJ/va', 1505),
(18, 'Pinot.Olivia@gmail.com', '$2a$10$RY1vj/zCWpqIBomWnNzxHe3C5cEv3oQWzbjNmUGJ0.EpFi.wA5WoG', 1605),
(19, 'West.Julia@gmail.com', '$2a$10$dUs.aXultOr1Ybs9KQg6veWIVqaEhqEmdYPvgc2vOar/rNo8L8tr6', 1705),
(20, 'Fadi.Kadijha@gmail.com', '$2a$10$MABkG77tkmk35J7RjhnJueF7J7KXYQH1ipNqYVIPeJGiop6neK74O', 1805);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `connection`
--
ALTER TABLE `connection`
  ADD PRIMARY KEY (`connection_id`),
  ADD KEY `FKqthrmvty7aoheld8y5cll019q` (`connection_user_id`),
  ADD KEY `FKrfvt6iy9m960bcnlad7rrid41` (`user_user_id`);

--
-- Index pour la table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id_transaction`),
  ADD KEY `FK2ef28wdlhmwrtykhtjnj38ihv` (`connection_connection_id`),
  ADD KEY `FKgnae5nvxpqu8jxwr75mlmc0cr` (`user_user_id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `connection`
--
ALTER TABLE `connection`
  MODIFY `connection_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT pour la table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id_transaction` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `connection`
--
ALTER TABLE `connection`
  ADD CONSTRAINT `FKqthrmvty7aoheld8y5cll019q` FOREIGN KEY (`connection_user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `FKrfvt6iy9m960bcnlad7rrid41` FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`);

--
-- Contraintes pour la table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `FK2ef28wdlhmwrtykhtjnj38ihv` FOREIGN KEY (`connection_connection_id`) REFERENCES `connection` (`connection_id`),
  ADD CONSTRAINT `FKgnae5nvxpqu8jxwr75mlmc0cr` FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`);
COMMIT;
