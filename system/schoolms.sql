
CREATE TABLE `student` (
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `age` int(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `grade` varchar(5) NOT NULL,
  `guardian` varchar(50) NOT NULL,
  `contact` int(15) NOT NULL,
  `birthday` date NOT NULL,
  `admissionDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

