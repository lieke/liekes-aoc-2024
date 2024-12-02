object Day2Data {
  val input: List[List[Int]] = List(
    List(25, 26, 29, 30, 32, 35, 37, 35),
    List(15, 16, 17, 20, 22, 24, 26, 26),
    List(80, 81, 83, 85, 89),
    List(76, 77, 79, 82, 84, 87, 89, 95),
    List(73, 75, 78, 81, 83, 84, 81, 84),
    List(9, 10, 11, 12, 11, 8),
    List(27, 28, 30, 33, 35, 34, 37, 37),
    List(67, 70, 69, 72, 74, 78),
    List(65, 66, 69, 72, 75, 72, 74, 79),
    List(22, 25, 25, 26, 27, 28),
    List(47, 50, 53, 53, 51),
    List(67, 70, 70, 71, 74, 75, 77, 77),
    List(68, 69, 71, 74, 74, 78),
    List(54, 56, 58, 58, 65),
    List(19, 21, 24, 28, 30, 32, 34, 36),
    List(75, 78, 79, 80, 84, 81),
    List(13, 16, 19, 20, 23, 25, 29, 29),
    List(66, 67, 69, 73, 75, 78, 79, 83),
    List(41, 42, 46, 49, 56),
    List(86, 87, 90, 96, 97, 98, 99),
    List(67, 68, 74, 76, 78, 76),
    List(64, 65, 66, 67, 69, 74, 75, 75),
    List(55, 58, 61, 68, 72),
    List(44, 45, 48, 50, 53, 54, 60, 65),
    List(41, 38, 40, 42, 44, 47),
    List(50, 48, 49, 52, 54, 56, 54),
    List(62, 59, 61, 64, 65, 66, 66),
    List(29, 27, 29, 30, 31, 35),
    List(32, 29, 31, 34, 40),
    List(27, 25, 27, 29, 28, 31, 33, 34),
    List(68, 66, 67, 65, 66, 68, 70, 67),
    List(41, 38, 39, 40, 43, 42, 44, 44),
    List(82, 79, 81, 84, 82, 86),
    List(78, 75, 74, 77, 78, 85),
    List(89, 88, 91, 93, 94, 97, 97, 99),
    List(63, 61, 61, 62, 64, 63),
    List(44, 43, 43, 45, 46, 46),
    List(86, 84, 85, 85, 89),
    List(19, 18, 21, 24, 24, 29),
    List(18, 17, 20, 24, 25, 27, 28),
    List(15, 14, 15, 17, 21, 24, 22),
    List(85, 83, 86, 90, 90),
    List(28, 26, 30, 32, 34, 37, 41),
    List(78, 77, 78, 82, 85, 92),
    List(73, 71, 77, 80, 83),
    List(12, 11, 12, 14, 20, 22, 24, 22),
    List(48, 47, 54, 56, 56),
    List(37, 36, 41, 43, 47),
    List(83, 80, 81, 83, 90, 95),
    List(53, 53, 55, 57, 60),
    List(31, 31, 32, 33, 36, 35),
    List(86, 86, 87, 88, 91, 94, 94),
    List(82, 82, 84, 86, 88, 92),
    List(17, 17, 18, 19, 21, 27),
    List(29, 29, 31, 28, 30, 33, 36),
    List(70, 70, 71, 68, 65),
    List(1, 1, 2, 1, 1),
    List(27, 27, 29, 27, 31),
    List(38, 38, 41, 43, 45, 48, 45, 52),
    List(40, 40, 41, 43, 43, 46, 49),
    List(7, 7, 7, 9, 11, 14, 13),
    List(3, 3, 6, 9, 10, 10, 10),
    List(20, 20, 21, 21, 25),
    List(51, 51, 51, 53, 60),
    List(40, 40, 41, 45, 48, 49, 52),
    List(73, 73, 74, 76, 79, 81, 85, 83),
    List(8, 8, 12, 13, 13),
    List(40, 40, 41, 43, 45, 46, 50, 54),
    List(72, 72, 73, 74, 78, 85),
    List(42, 42, 43, 50, 51, 53),
    List(62, 62, 63, 66, 69, 75, 73),
    List(28, 28, 31, 32, 38, 40, 40),
    List(48, 48, 51, 56, 58, 59, 63),
    List(39, 39, 41, 47, 50, 56),
    List(29, 33, 35, 37, 38),
    List(20, 24, 27, 29, 31, 32, 35, 33),
    List(55, 59, 60, 62, 62),
    List(38, 42, 43, 45, 47, 48, 50, 54),
    List(9, 13, 15, 18, 20, 23, 24, 29),
    List(72, 76, 77, 80, 78, 80, 83),
    List(57, 61, 64, 65, 68, 67, 68, 67),
    List(72, 76, 78, 79, 81, 82, 79, 79),
    List(12, 16, 19, 22, 25, 28, 25, 29),
    List(33, 37, 38, 41, 42, 39, 45),
    List(36, 40, 41, 44, 44, 46),
    List(65, 69, 70, 72, 75, 75, 72),
    List(9, 13, 13, 15, 15),
    List(33, 37, 39, 42, 45, 45, 46, 50),
    List(69, 73, 76, 77, 80, 80, 86),
    List(7, 11, 12, 16, 18, 19),
    List(30, 34, 35, 36, 40, 38),
    List(34, 38, 39, 43, 45, 47, 47),
    List(2, 6, 8, 12, 13, 16, 20),
    List(36, 40, 43, 46, 50, 55),
    List(76, 80, 85, 86, 88, 91, 92),
    List(46, 50, 51, 52, 59, 60, 61, 60),
    List(1, 5, 7, 12, 12),
    List(61, 65, 70, 71, 74, 75, 79),
    List(28, 32, 35, 36, 37, 44, 46, 52),
    List(24, 30, 33, 35, 37),
    List(75, 82, 83, 84, 87, 90, 91, 88),
    List(52, 59, 60, 61, 63, 65, 65),
    List(54, 59, 62, 63, 65, 66, 70),
    List(17, 24, 25, 27, 29, 34),
    List(57, 64, 67, 70, 67, 68, 70, 73),
    List(69, 76, 78, 81, 83, 82, 80),
    List(13, 19, 20, 18, 20, 20),
    List(20, 27, 29, 28, 29, 33),
    List(10, 16, 18, 15, 16, 21),
    List(66, 72, 74, 77, 77, 80),
    List(62, 68, 70, 73, 75, 75, 72),
    List(84, 89, 89, 91, 92, 95, 96, 96),
    List(21, 27, 28, 28, 32),
    List(32, 37, 39, 40, 43, 43, 50),
    List(18, 25, 26, 29, 33, 36, 37),
    List(9, 15, 16, 20, 23, 25, 26, 25),
    List(49, 54, 58, 61, 61),
    List(46, 52, 54, 55, 57, 61, 65),
    List(21, 27, 29, 30, 34, 35, 36, 42),
    List(78, 83, 84, 90, 92, 95),
    List(54, 61, 63, 65, 66, 67, 74, 72),
    List(1, 7, 9, 10, 11, 17, 20, 20),
    List(39, 46, 52, 55, 56, 60),
    List(7, 12, 14, 16, 18, 20, 26, 32),
    List(89, 87, 84, 83, 84),
    List(37, 36, 35, 32, 31, 29, 27, 27),
    List(48, 45, 42, 41, 40, 37, 34, 30),
    List(23, 21, 20, 18, 17, 14, 12, 7),
    List(69, 67, 65, 63, 60, 63, 62),
    List(93, 91, 88, 86, 89, 92),
    List(10, 8, 6, 7, 7),
    List(28, 26, 24, 27, 26, 24, 23, 19),
    List(54, 51, 52, 51, 50, 44),
    List(65, 64, 61, 60, 60, 59),
    List(18, 16, 13, 10, 8, 5, 5, 8),
    List(80, 78, 76, 76, 76),
    List(89, 87, 84, 82, 82, 79, 77, 73),
    List(27, 24, 24, 21, 19, 18, 11),
    List(44, 43, 39, 38, 36),
    List(15, 14, 13, 10, 6, 3, 2, 3),
    List(76, 73, 69, 67, 64, 64),
    List(53, 51, 50, 48, 44, 43, 39),
    List(20, 19, 17, 15, 11, 6),
    List(50, 47, 40, 37, 36),
    List(98, 96, 93, 87, 84, 82, 84),
    List(43, 42, 37, 34, 33, 31, 28, 28),
    List(32, 30, 29, 27, 20, 17, 14, 10),
    List(66, 64, 62, 61, 59, 53, 52, 46),
    List(17, 19, 17, 14, 11, 10, 7, 5),
    List(73, 76, 73, 72, 71, 73),
    List(78, 80, 79, 76, 75, 72, 72),
    List(16, 18, 15, 13, 10, 6),
    List(93, 96, 93, 91, 89, 87, 84, 79),
    List(53, 55, 52, 50, 48, 46, 47, 44),
    List(57, 60, 57, 56, 53, 52, 54, 57),
    List(59, 60, 57, 58, 56, 56),
    List(61, 64, 62, 59, 62, 58),
    List(36, 39, 38, 41, 39, 38, 33),
    List(13, 14, 14, 13, 12, 11),
    List(76, 77, 74, 74, 77),
    List(8, 10, 10, 9, 6, 6),
    List(55, 57, 57, 55, 53, 49),
    List(51, 53, 52, 52, 50, 47, 40),
    List(18, 21, 19, 15, 12),
    List(83, 84, 82, 78, 76, 75, 73, 76),
    List(35, 38, 34, 31, 31),
    List(57, 60, 58, 54, 51, 48, 44),
    List(27, 30, 29, 25, 23, 21, 16),
    List(12, 15, 9, 7, 6, 5),
    List(20, 23, 20, 15, 13, 10, 9, 11),
    List(21, 22, 20, 17, 12, 10, 8, 8),
    List(59, 60, 57, 51, 49, 46, 42),
    List(22, 24, 22, 16, 14, 12, 5),
    List(71, 71, 69, 68, 67, 66, 64),
    List(90, 90, 88, 86, 85, 87),
    List(77, 77, 76, 73, 71, 71),
    List(9, 9, 7, 6, 2),
    List(91, 91, 90, 88, 86, 84, 83, 77),
    List(27, 27, 24, 26, 25, 24, 22),
    List(55, 55, 56, 54, 53, 54),
    List(84, 84, 81, 83, 81, 78, 75, 75),
    List(60, 60, 58, 55, 56, 53, 50, 46),
    List(61, 61, 63, 60, 57, 56, 51),
    List(59, 59, 58, 57, 57, 54),
    List(34, 34, 32, 31, 31, 29, 30),
    List(33, 33, 30, 30, 30),
    List(62, 62, 59, 56, 56, 52),
    List(24, 24, 24, 23, 16),
    List(14, 14, 13, 9, 8, 6),
    List(20, 20, 19, 16, 15, 11, 10, 11),
    List(96, 96, 92, 91, 90, 89, 89),
    List(93, 93, 89, 87, 84, 82, 81, 77),
    List(62, 62, 60, 56, 50),
    List(72, 72, 69, 62, 60),
    List(76, 76, 69, 66, 65, 68),
    List(96, 96, 89, 87, 87),
    List(65, 65, 63, 56, 55, 51),
    List(76, 76, 75, 68, 61),
    List(63, 59, 56, 53, 52),
    List(75, 71, 70, 68, 66, 67),
    List(79, 75, 72, 70, 70),
    List(99, 95, 93, 90, 86),
    List(70, 66, 65, 63, 60, 54),
    List(6, 2, 1, 4, 1),
    List(30, 26, 28, 27, 28),
    List(64, 60, 57, 55, 57, 56, 56),
    List(65, 61, 60, 59, 58, 57, 58, 54),
    List(67, 63, 62, 61, 59, 56, 57, 52),
    List(93, 89, 88, 85, 85, 82),
    List(39, 35, 32, 29, 27, 27, 28),
    List(96, 92, 92, 89, 88, 85, 85),
    List(71, 67, 67, 65, 63, 61, 58, 54),
    List(46, 42, 41, 40, 37, 37, 32),
    List(68, 64, 63, 59, 58, 55),
    List(41, 37, 34, 30, 33),
    List(71, 67, 63, 62, 60, 58, 58),
    List(45, 41, 39, 35, 34, 31, 27),
    List(78, 74, 72, 69, 66, 62, 56),
    List(62, 58, 57, 55, 52, 47, 45, 42),
    List(89, 85, 82, 76, 75, 72, 71, 74),
    List(69, 65, 64, 61, 56, 53, 51, 51),
    List(73, 69, 64, 62, 58),
    List(32, 28, 21, 20, 19, 18, 16, 9),
    List(94, 89, 87, 85, 83, 82, 79, 78),
    List(91, 84, 82, 81, 84),
    List(41, 36, 33, 31, 30, 27, 27),
    List(56, 51, 48, 46, 44, 41, 38, 34),
    List(85, 78, 77, 75, 72, 70, 68, 62),
    List(85, 80, 79, 80, 78, 76, 75),
    List(30, 25, 27, 26, 29),
    List(37, 32, 35, 33, 33),
    List(79, 74, 72, 73, 69),
    List(80, 75, 72, 71, 72, 70, 69, 64),
    List(62, 57, 55, 55, 53, 51, 48, 45),
    List(53, 47, 45, 44, 44, 41, 40, 42),
    List(40, 33, 31, 28, 28, 28),
    List(90, 85, 84, 83, 82, 82, 78),
    List(95, 88, 85, 85, 84, 83, 82, 76),
    List(37, 30, 28, 24, 23, 20, 19, 17),
    List(24, 19, 15, 14, 16),
    List(24, 19, 16, 14, 11, 7, 7),
    List(62, 55, 52, 51, 49, 45, 44, 40),
    List(49, 43, 39, 38, 33),
    List(88, 81, 78, 73, 71),
    List(64, 59, 56, 51, 49, 51),
    List(19, 14, 11, 6, 6),
    List(41, 34, 29, 28, 24),
    List(44, 39, 36, 33, 30, 23, 17),
    List(40, 41, 44, 47, 48, 50, 51, 48),
    List(57, 59, 61, 64, 64),
    List(58, 60, 61, 62, 66),
    List(79, 82, 84, 86, 92),
    List(7, 9, 7, 8, 9, 10, 11),
    List(30, 32, 35, 38, 41, 38, 40, 38),
    List(39, 40, 41, 43, 42, 42),
    List(76, 77, 79, 77, 79, 83),
    List(16, 19, 17, 19, 25),
    List(79, 82, 83, 83, 84, 86, 87, 90),
    List(21, 24, 24, 26, 29, 31, 32, 30),
    List(28, 31, 32, 35, 37, 37, 39, 39),
    List(58, 61, 61, 63, 66, 67, 71),
    List(9, 10, 13, 13, 19),
    List(51, 53, 57, 59, 60, 61, 64),
    List(80, 82, 84, 88, 90, 88),
    List(86, 89, 93, 95, 96, 98, 98),
    List(72, 74, 76, 80, 81, 85),
    List(76, 79, 83, 85, 88, 90, 96),
    List(76, 79, 85, 88, 91, 94, 97),
    List(79, 80, 87, 89, 91, 92, 89),
    List(86, 87, 90, 95, 95),
    List(37, 39, 41, 47, 51),
    List(29, 30, 32, 37, 40, 46),
    List(57, 54, 57, 58, 59, 61, 63, 66),
    List(63, 60, 61, 64, 63),
    List(62, 59, 60, 61, 64, 64),
    List(47, 45, 46, 49, 53),
    List(6, 4, 6, 7, 8, 9, 14),
    List(35, 32, 33, 36, 38, 35, 38),
    List(7, 4, 5, 7, 8, 9, 7, 5),
    List(51, 49, 52, 54, 55, 52, 53, 53),
    List(48, 47, 49, 50, 49, 52, 56),
    List(17, 16, 19, 17, 18, 21, 26),
    List(93, 92, 92, 93, 95, 96, 97),
    List(14, 12, 15, 15, 18, 16),
    List(11, 10, 10, 13, 13),
    List(91, 90, 90, 93, 94, 95, 99),
    List(72, 71, 72, 72, 73, 78),
    List(35, 34, 37, 40, 44, 47, 48),
    List(26, 24, 27, 28, 31, 32, 36, 33),
    List(31, 29, 33, 34, 34),
    List(79, 76, 80, 82, 86),
    List(54, 53, 57, 60, 63, 66, 69, 76),
    List(76, 74, 79, 82, 83, 86, 88, 89),
    List(42, 41, 46, 47, 50, 49),
    List(20, 18, 21, 23, 24, 27, 33, 33),
    List(51, 50, 52, 54, 59, 63),
    List(11, 9, 12, 15, 20, 23, 24, 29),
    List(57, 57, 58, 61, 62, 63),
    List(53, 53, 56, 58, 60, 61, 58),
    List(25, 25, 27, 29, 31, 33, 34, 34),
    List(70, 70, 71, 72, 74, 76, 79, 83),
    List(70, 70, 73, 76, 79, 82, 83, 90),
    List(6, 6, 8, 7, 8),
    List(24, 24, 26, 29, 28, 30, 33, 31),
    List(66, 66, 67, 66, 67, 67),
    List(91, 91, 92, 90, 94),
    List(92, 92, 95, 92, 94, 99),
    List(58, 58, 60, 62, 64, 67, 67, 68),
    List(86, 86, 89, 89, 86),
    List(16, 16, 17, 17, 18, 21, 22, 22),
    List(46, 46, 47, 48, 48, 52),
    List(87, 87, 89, 92, 92, 99),
    List(1, 1, 4, 7, 10, 11, 15, 17),
    List(73, 73, 74, 75, 79, 81, 80),
    List(84, 84, 87, 91, 91),
    List(74, 74, 76, 80, 84),
    List(50, 50, 53, 57, 59, 65),
    List(74, 74, 80, 81, 84),
    List(11, 11, 13, 15, 21, 20),
    List(47, 47, 54, 55, 55),
    List(57, 57, 58, 60, 62, 68, 69, 73),
    List(41, 41, 48, 51, 56),
    List(16, 20, 21, 24, 27),
    List(14, 18, 19, 22, 25, 23),
    List(84, 88, 89, 90, 93, 93),
    List(59, 63, 65, 68, 69, 72, 75, 79),
    List(19, 23, 26, 29, 32, 37),
    List(24, 28, 31, 30, 33, 35),
    List(70, 74, 76, 79, 77, 75),
    List(66, 70, 73, 74, 72, 75, 75),
    List(56, 60, 61, 59, 62, 63, 67),
    List(21, 25, 26, 24, 31),
    List(27, 31, 33, 33, 34),
    List(2, 6, 6, 7, 6),
    List(83, 87, 88, 88, 90, 93, 93),
    List(75, 79, 82, 82, 83, 84, 88),
    List(34, 38, 40, 40, 43, 46, 52),
    List(64, 68, 72, 75, 76),
    List(72, 76, 80, 81, 78),
    List(79, 83, 87, 89, 89),
    List(12, 16, 20, 22, 23, 24, 26, 30),
    List(36, 40, 42, 46, 53),
    List(24, 28, 35, 38, 40),
    List(7, 11, 13, 19, 21, 22, 21),
    List(35, 39, 41, 43, 50, 50),
    List(63, 67, 70, 77, 81),
    List(66, 70, 71, 77, 79, 85),
    List(61, 66, 69, 72, 75),
    List(71, 77, 78, 81, 80),
    List(70, 76, 77, 78, 80, 81, 81),
    List(25, 32, 33, 35, 36, 40),
    List(32, 39, 41, 44, 45, 50),
    List(36, 41, 42, 39, 42, 43, 44, 46),
    List(8, 14, 17, 14, 12),
    List(79, 85, 86, 84, 85, 85),
    List(20, 27, 29, 27, 31),
    List(60, 66, 64, 67, 73),
    List(31, 37, 37, 38, 40, 43),
    List(27, 33, 34, 36, 36, 37, 36),
    List(17, 22, 24, 24, 24),
    List(76, 83, 84, 84, 88),
    List(72, 78, 79, 81, 82, 82, 87),
    List(10, 16, 18, 22, 24, 27),
    List(77, 82, 84, 88, 90, 91, 93, 90),
    List(33, 39, 41, 45, 47, 49, 52, 52),
    List(67, 74, 78, 81, 85),
    List(25, 32, 36, 38, 41, 43, 49),
    List(44, 50, 52, 54, 59, 61),
    List(13, 20, 23, 26, 29, 31, 37, 35),
    List(45, 50, 57, 60, 60),
    List(66, 72, 73, 80, 84),
    List(18, 24, 27, 30, 32, 37, 42),
    List(81, 79, 76, 75, 78),
    List(7, 5, 3, 2, 1, 1),
    List(55, 54, 51, 50, 49, 45),
    List(45, 44, 41, 38, 35, 30),
    List(79, 76, 73, 72, 74, 71),
    List(94, 92, 94, 91, 90, 93),
    List(30, 28, 27, 26, 29, 26, 26),
    List(97, 94, 95, 92, 89, 86, 83, 79),
    List(21, 20, 22, 19, 13),
    List(96, 94, 94, 91, 90),
    List(81, 78, 76, 76, 74, 76),
    List(38, 35, 33, 33, 33),
    List(58, 56, 56, 53, 52, 48),
    List(57, 55, 53, 51, 51, 49, 48, 43),
    List(76, 74, 73, 70, 68, 64, 61),
    List(25, 22, 18, 16, 19),
    List(17, 14, 10, 7, 5, 3, 3),
    List(41, 40, 38, 34, 33, 30, 26),
    List(99, 97, 96, 95, 94, 91, 87, 82),
    List(95, 92, 85, 82, 81, 78, 77, 76),
    List(69, 67, 61, 58, 56, 59),
    List(57, 54, 53, 48, 45, 44, 43, 43),
    List(86, 85, 82, 79, 73, 72, 68),
    List(88, 85, 78, 76, 74, 67),
    List(69, 71, 68, 66, 65, 62, 60, 58),
    List(48, 50, 49, 47, 44, 41, 42),
    List(17, 20, 17, 14, 11, 10, 9, 9),
    List(79, 80, 77, 75, 72, 70, 66),
    List(16, 18, 17, 15, 13, 12, 10, 3),
    List(67, 69, 67, 66, 68, 65, 62, 60),
    List(69, 71, 68, 67, 68, 70),
    List(20, 22, 23, 20, 19, 19),
    List(32, 34, 33, 35, 31),
    List(85, 88, 87, 86, 85, 86, 85, 80),
    List(14, 15, 15, 13, 12),
    List(29, 31, 30, 30, 27, 24, 27),
    List(68, 69, 69, 67, 64, 64),
    List(92, 93, 93, 90, 86),
    List(56, 57, 54, 54, 51, 46),
    List(21, 22, 18, 15, 14),
    List(30, 31, 30, 27, 25, 21, 22),
    List(60, 61, 58, 56, 55, 51, 51),
    List(27, 28, 24, 23, 20, 18, 14),
    List(95, 97, 95, 92, 90, 86, 83, 77),
    List(67, 70, 63, 62, 60, 57, 55, 52),
    List(32, 34, 28, 25, 28),
    List(31, 32, 26, 25, 25),
    List(28, 31, 29, 22, 20, 16),
    List(13, 15, 14, 9, 3),
    List(68, 68, 65, 64, 61, 59, 56),
    List(39, 39, 36, 33, 35),
    List(29, 29, 26, 23, 23),
    List(72, 72, 70, 69, 65),
    List(15, 15, 12, 11, 8, 7, 6, 1),
    List(43, 43, 41, 42, 39, 38, 35, 34),
    List(52, 52, 49, 46, 47, 45, 47),
    List(39, 39, 41, 40, 40),
    List(28, 28, 26, 27, 23),
    List(36, 36, 35, 33, 32, 35, 28),
    List(19, 19, 19, 16, 15),
    List(20, 20, 19, 17, 15, 15, 16),
    List(51, 51, 49, 49, 49),
    List(65, 65, 63, 60, 60, 56),
    List(90, 90, 88, 86, 86, 81),
    List(68, 68, 65, 61, 58, 55),
    List(34, 34, 32, 28, 25, 22, 25),
    List(88, 88, 85, 81, 79, 78, 78),
    List(26, 26, 24, 23, 20, 16, 13, 9),
    List(98, 98, 95, 91, 88, 85, 82, 77),
    List(29, 29, 26, 19, 16, 15, 14),
    List(96, 96, 94, 93, 87, 88),
    List(62, 62, 57, 54, 54),
    List(72, 72, 66, 63, 59),
    List(45, 45, 44, 41, 36, 35, 32, 25),
    List(38, 34, 33, 30, 27, 25, 22, 21),
    List(74, 70, 67, 64, 62, 61, 60, 62),
    List(51, 47, 46, 43, 43),
    List(62, 58, 55, 52, 48),
    List(20, 16, 13, 10, 5),
    List(57, 53, 51, 53, 52, 51),
    List(99, 95, 93, 90, 92, 91, 94),
    List(23, 19, 18, 15, 14, 15, 15),
    List(62, 58, 59, 58, 55, 51),
    List(59, 55, 54, 55, 54, 51, 44),
    List(95, 91, 89, 87, 87, 86, 85),
    List(31, 27, 26, 24, 24, 22, 25),
    List(27, 23, 22, 19, 19, 18, 16, 16),
    List(96, 92, 92, 89, 85),
    List(26, 22, 22, 20, 18, 13),
    List(27, 23, 19, 17, 16, 14),
    List(90, 86, 83, 82, 80, 76, 77),
    List(86, 82, 80, 79, 77, 74, 70, 70),
    List(20, 16, 12, 11, 10, 6),
    List(97, 93, 92, 88, 82),
    List(75, 71, 68, 66, 65, 64, 57, 54),
    List(88, 84, 77, 76, 73, 72, 75),
    List(37, 33, 32, 30, 25, 25),
    List(61, 57, 54, 47, 43),
    List(65, 61, 59, 54, 53, 46),
    List(54, 47, 44, 42, 40, 38),
    List(88, 81, 79, 78, 81),
    List(60, 55, 52, 50, 49, 48, 48),
    List(86, 81, 79, 76, 73, 71, 68, 64),
    List(38, 32, 31, 29, 27, 25, 18),
    List(80, 75, 73, 76, 75, 73, 71),
    List(34, 27, 29, 28, 27, 24, 23, 25),
    List(97, 92, 89, 92, 92),
    List(57, 51, 52, 50, 49, 48, 44),
    List(27, 22, 20, 18, 21, 18, 12),
    List(85, 80, 77, 77, 74, 71, 69, 66),
    List(26, 20, 18, 16, 16, 19),
    List(82, 76, 74, 73, 71, 70, 70, 70),
    List(93, 87, 85, 84, 82, 81, 81, 77),
    List(96, 89, 87, 85, 85, 84, 79),
    List(34, 27, 23, 21, 19, 17),
    List(30, 25, 23, 19, 18, 20),
    List(57, 51, 50, 46, 43, 42, 42),
    List(31, 26, 25, 21, 18, 17, 14, 10),
    List(51, 45, 41, 40, 39, 36, 30),
    List(45, 39, 37, 35, 29, 28, 27),
    List(78, 72, 70, 67, 65, 60, 61),
    List(78, 73, 68, 67, 65, 62, 62),
    List(95, 89, 86, 84, 78, 74),
    List(75, 68, 65, 60, 58, 52),
    List(71, 71, 74, 72, 74, 77, 79, 84),
    List(22, 19, 21, 22, 22, 24, 25, 30),
    List(10, 7, 8, 8, 7),
    List(78, 76, 77, 76, 78, 81),
    List(44, 42, 44, 46, 49, 47),
    List(2, 2, 3, 6, 8, 12, 14, 14),
    List(12, 12, 14, 16, 22, 25, 28, 25),
    List(29, 34, 35, 38, 40, 41, 41, 44),
    List(28, 25, 23, 21, 18, 17, 19),
    List(66, 60, 59, 56, 55, 57, 57),
    List(55, 55, 52, 51, 51, 49),
    List(32, 28, 27, 26, 22),
    List(81, 79, 76, 73, 71, 71, 67),
    List(94, 92, 91, 88, 84, 83, 80, 83),
    List(86, 84, 82, 81, 80, 79, 76, 76),
    List(66, 60, 58, 55, 51, 49, 49),
    List(91, 95, 96, 96, 97, 96),
    List(37, 33, 28, 26, 22),
    List(26, 25, 24, 23, 20, 16, 15, 15),
    List(41, 41, 43, 45, 47, 49, 49),
    List(55, 57, 56, 54, 50, 47, 44, 40),
    List(34, 32, 31, 29, 26, 20, 18, 12),
    List(39, 38, 41, 44, 46),
    List(51, 47, 46, 44, 43, 43),
    List(64, 70, 73, 77, 80, 83),
    List(46, 48, 54, 56, 59, 61, 64, 67),
    List(20, 23, 20, 22, 25, 29),
    List(46, 52, 53, 54, 58, 59, 62, 68),
    List(14, 21, 21, 23, 25, 25),
    List(57, 57, 57, 56, 53, 53),
    List(34, 27, 25, 22, 17, 15, 12, 15),
    List(22, 26, 28, 29, 30, 31, 36),
    List(76, 80, 82, 84, 88, 92),
    List(49, 50, 54, 57, 56),
    List(27, 28, 35, 37, 41),
    List(70, 72, 71, 64, 63),
    List(13, 13, 12, 11, 11, 10, 5),
    List(91, 87, 83, 81, 82),
    List(21, 19, 20, 21, 24, 26, 26),
    List(78, 73, 76, 73, 70),
    List(33, 29, 25, 22, 21, 17),
    List(1, 5, 7, 10, 12, 13, 10),
    List(2, 5, 6, 5, 5),
    List(16, 18, 17, 16, 13, 13),
    List(62, 66, 69, 71, 69, 69),
    List(43, 36, 34, 31, 29, 26, 20, 20),
    List(83, 79, 77, 74, 71, 71, 67),
    List(58, 62, 66, 69, 72, 74),
    List(64, 60, 58, 56, 49),
    List(56, 57, 54, 55, 55),
    List(31, 31, 35, 36, 38, 41, 44),
    List(42, 36, 35, 33, 30, 30, 26),
    List(44, 45, 42, 40, 34, 30),
    List(99, 96, 93, 90, 88, 86, 81, 83),
    List(18, 22, 25, 27, 29, 30, 32, 36),
    List(79, 79, 78, 75, 71, 70, 67, 62),
    List(36, 39, 36, 38, 40, 47),
    List(92, 89, 91, 94, 91, 92, 95, 92),
    List(16, 21, 23, 30, 28),
    List(85, 86, 83, 80, 79, 76, 75, 70),
    List(84, 83, 85, 86, 87, 91, 90),
    List(7, 9, 11, 14, 16, 20, 24),
    List(40, 44, 47, 51, 56),
    List(60, 63, 66, 68, 71, 71, 75),
    List(31, 35, 38, 36, 33),
    List(24, 24, 27, 31, 33, 31),
    List(16, 12, 11, 9, 9, 9),
    List(24, 24, 23, 21, 18, 13),
    List(64, 58, 56, 55, 52, 48, 44),
    List(50, 48, 51, 53, 55, 55, 57, 61),
    List(34, 37, 35, 33, 33, 30),
    List(97, 97, 98, 98, 98),
    List(48, 48, 44, 43, 42, 40, 39, 36),
    List(96, 95, 95, 96, 96),
    List(7, 11, 14, 15, 15, 16, 16),
    List(82, 88, 91, 92, 92),
    List(31, 32, 35, 34, 36, 37),
    List(33, 33, 31, 30, 27, 26, 19, 13),
    List(13, 15, 17, 18, 25, 30),
    List(86, 88, 86, 83, 82, 78, 76, 76),
    List(49, 49, 48, 46, 40, 38, 39),
    List(89, 82, 81, 78, 77, 70),
    List(58, 61, 59, 56, 54, 56, 53, 56),
    List(38, 35, 42, 43, 44),
    List(22, 27, 28, 34, 37, 37),
    List(47, 44, 44, 43, 41, 38, 39),
    List(45, 43, 46, 52, 50),
    List(44, 40, 38, 36, 32, 25),
    List(99, 99, 96, 94, 91, 90, 87, 83),
    List(61, 54, 51, 54, 51, 50, 46),
    List(75, 82, 83, 84, 85, 88, 90, 97),
    List(20, 26, 28, 28, 32),
    List(6, 6, 11, 12, 15, 21),
    List(88, 82, 82, 81, 78),
    List(69, 66, 64, 64, 63, 60),
    List(2, 5, 7, 6, 4),
    List(69, 64, 62, 60, 60, 62),
    List(19, 23, 23, 25, 30),
    List(12, 18, 19, 21, 23, 27),
    List(67, 63, 65, 64, 66),
    List(45, 52, 55, 58, 60, 65, 68, 71),
    List(54, 49, 48, 45, 41),
    List(80, 80, 83, 82, 84, 88),
    List(91, 90, 90, 89, 86, 86),
    List(54, 57, 61, 64, 67, 74),
    List(50, 53, 54, 56, 59, 60, 66),
    List(16, 20, 22, 28, 35),
    List(82, 84, 84, 87, 88),
    List(19, 15, 12, 9, 12),
    List(3, 9, 11, 12, 13, 15),
    List(55, 53, 57, 60, 60),
    List(55, 52, 55, 52, 54, 55, 56, 62),
    List(66, 63, 66, 69, 72, 74, 76, 83),
    List(68, 70, 73, 76, 79, 79),
    List(74, 76, 77, 78, 80, 82, 79),
    List(93, 89, 86, 84, 81, 81, 80, 83),
    List(18, 18, 17, 15, 8, 6, 2),
    List(42, 49, 50, 51, 51, 53, 50),
    List(1, 5, 6, 3, 5, 8),
    List(46, 46, 45, 41, 37),
    List(54, 54, 55, 56, 61, 65),
    List(57, 57, 55, 56, 53),
    List(28, 28, 26, 24, 26, 23, 25),
    List(87, 87, 90, 89, 89),
    List(67, 71, 71, 73, 74, 78),
    List(37, 33, 30, 29, 26, 23, 20),
    List(69, 65, 63, 58, 57, 54, 52),
    List(28, 25, 24, 22, 24, 21, 20, 17),
    List(72, 75, 73, 72, 72, 72),
    List(66, 66, 64, 66, 64, 63, 59),
    List(94, 95, 93, 91, 93),
    List(42, 40, 42, 43, 44, 41, 44, 48),
    List(38, 44, 47, 48, 51, 55, 55),
    List(50, 47, 46, 39, 36, 35, 32, 31),
    List(70, 72, 70, 69, 66, 64, 62),
    List(12, 10, 7, 8, 4),
    List(73, 68, 65, 64, 58, 56, 55, 53),
    List(10, 7, 4, 5, 5),
    List(58, 56, 55, 52, 49, 45, 43, 36),
    List(37, 39, 41, 44, 46, 46, 44),
    List(11, 10, 11, 13, 14, 18, 21, 25),
    List(88, 84, 81, 74, 68),
    List(81, 74, 73, 73, 72, 71, 64),
    List(28, 28, 29, 30, 30, 31, 30),
    List(77, 78, 75, 72, 70, 70, 71),
    List(37, 34, 35, 37, 41, 43, 49),
    List(43, 44, 47, 51, 52, 52),
    List(71, 64, 61, 60, 57, 59),
    List(22, 23, 25, 27, 29),
    List(64, 67, 69, 72, 75, 77, 80, 82),
    List(85, 87, 90, 91, 93, 94),
    List(28, 26, 23, 22, 21, 18, 16),
    List(68, 71, 73, 74, 76, 79, 81, 83),
    List(24, 25, 26, 28, 29),
    List(22, 23, 25, 28, 29),
    List(29, 30, 31, 32, 35, 36, 39),
    List(3, 5, 6, 8, 9),
    List(39, 36, 34, 33, 30, 28, 25),
    List(54, 52, 49, 47, 44, 43, 41),
    List(82, 85, 87, 89, 90, 93, 96, 97),
    List(18, 21, 24, 27, 28, 30, 32),
    List(8, 9, 10, 12, 14),
    List(54, 53, 52, 51, 49, 46),
    List(67, 66, 65, 64, 61, 58),
    List(58, 57, 54, 51, 49, 47, 44),
    List(25, 28, 29, 31, 33),
    List(7, 8, 9, 10, 11, 14, 15),
    List(88, 87, 86, 85, 84),
    List(51, 52, 53, 55, 58, 60, 63),
    List(38, 35, 32, 29, 27, 24, 22),
    List(81, 82, 83, 84, 85, 87, 90),
    List(78, 77, 75, 72, 69),
    List(81, 83, 84, 87, 88, 90, 91),
    List(31, 34, 35, 38, 39),
    List(52, 51, 50, 47, 44, 41),
    List(79, 76, 73, 70, 69, 66, 64),
    List(94, 93, 90, 89, 88, 85, 82, 81),
    List(34, 36, 38, 40, 43, 45),
    List(58, 57, 55, 52, 49, 47, 45),
    List(24, 23, 21, 20, 19),
    List(89, 90, 91, 93, 94),
    List(58, 59, 61, 64, 67, 69, 70, 71),
    List(50, 52, 55, 56, 58, 60),
    List(63, 61, 59, 56, 53, 50),
    List(43, 46, 49, 52, 54, 55),
    List(42, 40, 37, 36, 33, 30, 27, 24),
    List(26, 27, 28, 31, 32, 33),
    List(66, 63, 62, 60, 58, 55),
    List(11, 14, 15, 18, 19, 22, 24, 27),
    List(50, 49, 48, 46, 45),
    List(80, 83, 84, 87, 88, 91),
    List(74, 75, 77, 79, 80, 82),
    List(66, 67, 70, 72, 74),
    List(68, 69, 72, 75, 78, 81, 83, 84),
    List(63, 61, 60, 59, 57, 54, 51),
    List(37, 38, 40, 41, 43),
    List(44, 43, 40, 39, 36, 34, 33),
    List(84, 85, 87, 90, 92, 94, 95),
    List(78, 80, 81, 82, 85, 88, 90, 91),
    List(38, 37, 35, 33, 30, 29, 27),
    List(61, 63, 65, 68, 70),
    List(47, 49, 50, 52, 53),
    List(39, 36, 34, 32, 31),
    List(70, 71, 72, 73, 74, 77, 80),
    List(41, 39, 37, 34, 33, 31, 28, 25),
    List(30, 31, 33, 36, 37, 40, 42),
    List(18, 21, 24, 26, 27, 30, 33),
    List(37, 38, 41, 44, 45),
    List(10, 13, 14, 15, 18, 20, 22),
    List(96, 95, 94, 91, 90, 89),
    List(46, 47, 48, 50, 53),
    List(83, 82, 79, 76, 75),
    List(38, 39, 41, 44, 47, 48, 51, 53),
    List(73, 75, 76, 79, 80),
    List(81, 84, 87, 88, 89),
    List(28, 27, 26, 25, 22, 19, 17, 15),
    List(54, 55, 57, 59, 60, 62, 65, 66),
    List(69, 71, 73, 75, 76, 78),
    List(43, 45, 46, 49, 51, 54, 57),
    List(56, 55, 52, 50, 47, 44, 41, 40),
    List(36, 37, 40, 41, 42, 44),
    List(63, 66, 69, 71, 73, 74),
    List(40, 43, 44, 47, 48, 50, 53),
    List(76, 77, 78, 81, 84, 85),
    List(68, 65, 63, 60, 58, 56),
    List(59, 62, 64, 66, 67, 68),
    List(24, 23, 20, 19, 16, 14, 11),
    List(27, 25, 23, 20, 18, 17, 14, 11),
    List(11, 13, 15, 18, 21, 24, 25),
    List(17, 18, 19, 20, 22),
    List(52, 55, 58, 60, 63, 66),
    List(55, 57, 59, 62, 63, 65, 68),
    List(7, 8, 11, 14, 17, 20, 21, 22),
    List(84, 83, 81, 78, 77),
    List(24, 21, 19, 17, 16, 14, 11),
    List(41, 38, 37, 35, 33, 30, 27),
    List(74, 77, 78, 79, 82, 85),
    List(63, 61, 60, 57, 56, 55, 53),
    List(27, 30, 33, 34, 36, 39, 41, 43),
    List(62, 65, 67, 69, 70, 73, 74, 77),
    List(51, 49, 48, 47, 44, 42, 41, 38),
    List(22, 23, 24, 27, 28),
    List(49, 50, 53, 56, 59, 62, 65),
    List(36, 33, 32, 31, 30),
    List(5, 8, 10, 13, 14, 17, 19),
    List(38, 37, 36, 33, 31, 30, 27, 24),
    List(55, 56, 57, 59, 62),
    List(43, 46, 48, 51, 53, 55, 57),
    List(37, 39, 42, 43, 46, 49),
    List(45, 47, 50, 53, 56),
    List(6, 7, 9, 11, 13, 16, 18, 19),
    List(57, 58, 61, 62, 63, 64, 67, 69),
    List(13, 12, 11, 10, 7, 6),
    List(82, 79, 78, 76, 74, 71, 70, 67),
    List(16, 14, 11, 8, 5, 3),
    List(13, 16, 19, 22, 25, 27, 29, 31),
    List(35, 32, 31, 28, 27, 25),
    List(22, 25, 27, 29, 31, 33, 35),
    List(67, 70, 73, 76, 78, 80, 82),
    List(20, 21, 22, 25, 27, 30, 31, 32),
    List(66, 63, 62, 60, 57, 56, 55, 54),
    List(32, 31, 28, 27, 24, 21, 20, 18),
    List(13, 15, 16, 17, 18),
    List(80, 81, 82, 84, 85, 86, 88, 89),
    List(49, 47, 46, 45, 43, 41),
    List(69, 66, 65, 63, 60, 59, 56),
    List(76, 74, 71, 68, 66, 65, 64),
    List(25, 22, 21, 19, 16, 13, 11, 8),
    List(44, 46, 49, 51, 52, 53),
    List(33, 36, 37, 38, 40),
    List(65, 62, 59, 57, 54),
    List(87, 84, 83, 82, 81),
    List(58, 59, 60, 63, 65, 68),
    List(55, 58, 60, 62, 63, 64, 65, 67),
    List(77, 79, 80, 82, 85, 86, 88, 90),
    List(26, 29, 30, 33, 35, 36),
    List(83, 84, 87, 90, 92),
    List(42, 44, 47, 50, 52, 55),
    List(76, 73, 72, 71, 70),
    List(38, 36, 34, 33, 30, 27, 25, 24),
    List(72, 73, 76, 79, 80),
    List(83, 80, 79, 77, 74, 73),
    List(2, 5, 7, 9, 11, 12, 15),
    List(33, 31, 28, 25, 24, 23, 21),
    List(81, 82, 84, 87, 88, 91, 93, 94),
    List(80, 77, 74, 72, 71, 69, 66),
    List(68, 66, 64, 63, 60, 57, 55),
    List(31, 30, 28, 26, 23),
    List(35, 34, 31, 28, 27, 26, 25),
    List(76, 78, 80, 82, 84),
    List(85, 84, 83, 81, 80, 79, 78),
    List(78, 80, 81, 82, 84),
    List(17, 16, 13, 11, 10, 8),
    List(84, 85, 88, 91, 92, 93),
    List(83, 86, 89, 91, 93, 96, 98),
    List(46, 43, 41, 40, 39, 37),
    List(77, 78, 80, 83, 85),
    List(46, 47, 48, 51, 52, 55),
    List(88, 86, 84, 81, 80, 77, 75),
    List(12, 13, 15, 18, 21, 22, 25),
    List(29, 28, 27, 24, 23, 20, 17, 14),
    List(8, 7, 6, 5, 2),
    List(88, 87, 85, 82, 79, 77, 75),
    List(47, 50, 52, 54, 57),
    List(78, 80, 83, 84, 85, 88, 90),
    List(67, 70, 72, 74, 75, 78),
    List(10, 11, 14, 16, 19, 21, 22, 25),
    List(41, 44, 46, 47, 48),
    List(37, 35, 33, 30, 27, 24, 23),
    List(29, 28, 26, 23, 22, 21),
    List(24, 27, 30, 31, 33),
    List(16, 18, 19, 21, 22, 25, 26, 27),
    List(97, 94, 92, 91, 88, 87),
    List(4, 7, 10, 12, 14, 15, 18, 21),
    List(1, 4, 7, 9, 11, 13, 16),
    List(80, 78, 76, 73, 70, 69),
    List(59, 57, 56, 54, 52),
    List(53, 56, 57, 59, 62, 65),
    List(47, 44, 43, 41, 38, 36, 33),
    List(10, 11, 12, 14, 16, 17, 18),
    List(94, 91, 90, 87, 86, 83),
    List(96, 95, 94, 93, 90, 87, 86),
    List(27, 30, 32, 35, 38, 41),
    List(35, 37, 38, 39, 40, 41),
    List(88, 89, 92, 94, 96),
    List(59, 61, 64, 67, 68, 71, 72, 73),
    List(2, 5, 6, 8, 9, 12, 15, 17),
    List(71, 74, 75, 76, 79, 81, 82),
    List(40, 41, 44, 47, 48, 51, 53),
    List(60, 63, 64, 66, 67),
    List(21, 24, 27, 29, 31, 33, 36, 39),
    List(11, 13, 14, 16, 18),
    List(74, 75, 76, 79, 82),
    List(24, 26, 28, 31, 33),
    List(59, 56, 53, 51, 50, 49),
    List(60, 61, 63, 65, 67, 70, 72, 73),
    List(94, 92, 90, 87, 84, 82, 80, 79),
    List(67, 66, 63, 60, 58),
    List(25, 22, 21, 20, 18, 16, 15, 13),
    List(1, 3, 4, 6, 9, 12, 13, 16),
    List(38, 37, 35, 34, 32),
    List(30, 31, 32, 34, 35, 38, 40),
    List(64, 65, 66, 68, 70),
    List(3, 4, 5, 6, 7, 9),
    List(85, 84, 81, 79, 78, 76, 74, 71),
    List(39, 36, 34, 33, 31, 30, 29, 27),
    List(70, 67, 65, 64, 61, 58, 56),
    List(81, 78, 76, 73, 71, 68, 67),
    List(13, 15, 18, 21, 22, 25, 27, 28),
    List(82, 81, 79, 76, 75, 74, 72),
    List(42, 44, 47, 49, 52),
    List(40, 41, 44, 47, 49, 52, 53),
    List(73, 76, 79, 80, 82),
    List(83, 84, 86, 89, 91),
    List(45, 42, 41, 38, 37),
    List(62, 60, 57, 56, 53, 52),
    List(25, 27, 29, 31, 34),
    List(32, 34, 36, 39, 40, 42, 43),
    List(41, 38, 36, 35, 32, 29, 26, 23),
    List(28, 30, 33, 35, 36, 38, 41, 42),
    List(37, 38, 41, 42, 44, 45, 46),
    List(28, 25, 22, 19, 17, 14, 11),
    List(74, 72, 69, 67, 66),
    List(65, 66, 67, 69, 70),
    List(21, 22, 24, 27, 28, 29, 31, 34),
    List(51, 50, 47, 46, 43, 40, 39),
    List(27, 28, 30, 33, 34, 37, 38, 39),
    List(82, 83, 86, 89, 92, 94, 97, 99),
    List(98, 97, 94, 92, 91, 90, 89),
    List(85, 83, 82, 81, 80, 78),
    List(87, 85, 84, 82, 81),
    List(70, 72, 74, 75, 78, 80, 83, 85),
    List(18, 19, 22, 23, 24, 27),
    List(11, 13, 15, 16, 19, 22, 24, 25),
    List(55, 58, 59, 61, 64, 66, 68, 70),
    List(29, 26, 24, 23, 21, 18, 17, 15),
    List(50, 51, 52, 53, 56, 57),
    List(88, 87, 86, 83, 81, 79),
    List(35, 38, 39, 42, 45, 47, 48),
    List(67, 70, 71, 74, 75),
    List(91, 90, 89, 88, 86),
    List(21, 18, 17, 15, 13),
    List(37, 36, 34, 31, 30, 27, 25),
    List(67, 66, 65, 63, 61, 60, 58),
    List(76, 73, 70, 68, 67, 65, 64, 63),
    List(37, 39, 42, 44, 45),
    List(6, 7, 10, 11, 13, 14, 16, 18),
    List(25, 24, 21, 20, 18, 15, 14, 11),
    List(84, 83, 80, 79, 77, 76, 74, 72),
    List(19, 17, 15, 12, 10),
    List(83, 85, 86, 89, 91, 92, 93, 94),
    List(13, 14, 15, 16, 17, 19),
    List(97, 95, 92, 91, 90, 88, 87),
    List(62, 65, 67, 70, 71, 74, 75, 78),
    List(19, 17, 14, 11, 9),
    List(2, 5, 6, 7, 9, 11, 12, 15),
    List(30, 32, 34, 35, 38, 40),
    List(30, 33, 34, 37, 40),
    List(76, 77, 80, 83, 86, 87),
    List(15, 12, 10, 8, 7),
    List(22, 20, 18, 15, 13),
    List(16, 15, 13, 12, 10, 8, 5, 4),
    List(36, 38, 41, 43, 44, 46),
    List(55, 52, 49, 46, 45, 43),
    List(15, 12, 9, 7, 5, 4, 3, 2),
    List(54, 55, 57, 60, 63, 66),
    List(64, 61, 59, 56, 54, 53, 50),
    List(37, 40, 43, 46, 47, 48, 51),
    List(70, 69, 66, 64, 61, 60, 59, 57),
    List(21, 18, 15, 14, 13, 12, 10),
    List(49, 47, 46, 43, 41, 39, 36, 33),
    List(33, 36, 37, 39, 41, 44),
    List(87, 89, 90, 93, 95),
    List(99, 96, 94, 92, 90),
    List(59, 56, 54, 53, 50, 48, 46),
    List(92, 90, 89, 87, 84, 83, 80),
    List(2, 4, 7, 9, 11),
    List(28, 25, 24, 22, 19, 17),
    List(99, 96, 95, 92, 89),
    List(76, 73, 71, 69, 67, 64),
    List(88, 90, 92, 95, 97),
    List(25, 26, 27, 28, 29, 30, 33),
    List(37, 34, 33, 31, 30, 29, 27),
    List(1, 2, 5, 6, 7, 9, 11, 13),
    List(26, 24, 22, 21, 20, 18),
    List(33, 31, 30, 27, 25, 24, 22, 20),
    List(68, 69, 71, 73, 76, 77, 80),
    List(42, 40, 39, 37, 34, 32, 29, 27),
    List(67, 66, 63, 62, 61),
    List(24, 21, 18, 15, 14),
    List(67, 64, 61, 59, 57),
    List(80, 83, 85, 87, 88, 89, 91, 92),
    List(29, 32, 35, 38, 40, 43, 46),
    List(42, 41, 40, 37, 36),
    List(68, 69, 71, 74, 75),
    List(45, 44, 41, 38, 37, 34, 31, 30),
    List(59, 58, 56, 54, 51, 48, 47, 46),
    List(39, 41, 42, 44, 46, 49, 52),
    List(67, 65, 63, 61, 58, 57),
    List(71, 73, 75, 76, 79, 82, 85),
    List(93, 92, 91, 88, 86, 84, 81, 79),
    List(32, 29, 28, 26, 25, 23),
    List(52, 55, 57, 58, 60, 62, 64, 66),
    List(51, 53, 55, 57, 58, 59, 60),
    List(35, 32, 30, 29, 27, 24, 21),
    List(69, 71, 73, 75, 76),
    List(26, 28, 30, 33, 34, 36),
    List(26, 24, 21, 18, 17, 16, 14, 12),
    List(57, 59, 62, 64, 66, 67, 69),
    List(23, 20, 18, 17, 15),
    List(33, 34, 37, 38, 39, 40, 42),
    List(85, 86, 87, 88, 90, 93, 96, 97),
    List(43, 41, 40, 37, 36, 34, 32, 29),
    List(23, 26, 27, 28, 29, 31, 34, 35),
    List(26, 23, 20, 18, 17, 16, 15, 12),
    List(54, 57, 59, 62, 64, 65, 67, 68),
    List(88, 85, 84, 82, 81, 79, 77, 76),
    List(88, 86, 84, 83, 81, 80, 78),
    List(94, 91, 88, 85, 84, 81, 78, 77),
    List(62, 61, 58, 57, 55, 53, 50),
    List(47, 45, 43, 42, 40),
    List(23, 22, 21, 19, 17, 16, 15),
    List(34, 36, 38, 41, 42, 45),
    List(15, 13, 11, 9, 7),
    List(41, 44, 45, 47, 48, 50, 52, 53),
    List(82, 79, 77, 76, 75, 72, 70, 67),
    List(71, 72, 74, 77, 79, 80, 81),
    List(56, 53, 50, 47, 44),
    List(33, 34, 37, 39, 40, 42),
    List(60, 58, 55, 52, 51, 48),
    List(67, 64, 62, 60, 57, 55, 53, 50),
    List(27, 26, 23, 21, 18, 16, 13, 11),
    List(72, 69, 68, 66, 63, 62),
    List(61, 64, 66, 69, 70, 72, 74),
    List(9, 12, 14, 16, 18, 21, 22),
    List(42, 39, 38, 36, 34, 31, 29),
    List(77, 76, 73, 71, 68, 66),
    List(10, 7, 6, 4, 2),
    List(39, 37, 35, 32, 29, 28, 27, 26),
    List(68, 71, 74, 76, 79, 80, 81),
    List(45, 47, 48, 51, 54, 56, 59),
    List(91, 90, 89, 87, 86, 85, 83, 82),
    List(42, 44, 47, 49, 51, 52, 53),
    List(24, 23, 22, 20, 18, 16, 13),
    List(14, 12, 11, 8, 6, 3, 2),
    List(45, 42, 40, 39, 36),
    List(32, 34, 36, 39, 42, 43, 44),
    List(89, 87, 86, 85, 82, 81, 80),
    List(10, 12, 15, 16, 19),
    List(62, 59, 57, 55, 53, 51, 48),
    List(99, 98, 96, 93, 90, 87, 86),
    List(56, 58, 59, 60, 61, 64, 66, 69),
    List(49, 50, 53, 56, 59, 62, 64),
    List(79, 76, 74, 71, 70, 67),
    List(66, 63, 61, 59, 57, 55, 54, 52),
    List(32, 31, 30, 29, 28, 25, 23),
    List(88, 91, 94, 96, 97, 99),
    List(72, 74, 76, 79, 82),
    List(14, 16, 18, 19, 22, 23, 26, 29),
    List(51, 49, 48, 46, 45, 43, 41),
    List(58, 59, 61, 63, 66, 68, 70),
    List(13, 10, 9, 6, 3, 2),
    List(77, 75, 73, 70, 68, 67),
    List(62, 60, 59, 57, 54, 53, 50)
  )
}