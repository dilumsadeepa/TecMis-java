-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2022 at 07:05 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tecmis`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `id` int(100) NOT NULL,
  `uid` varchar(255) NOT NULL,
  `ad_name` varchar(255) NOT NULL,
  `ad_id` varchar(255) NOT NULL,
  `ad_tel` varchar(255) NOT NULL,
  `ad_email` varchar(255) NOT NULL,
  `ad_gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`id`, `uid`, `ad_name`, `ad_id`, `ad_tel`, `ad_email`, `ad_gender`) VALUES
(1, '1', 'Dilum Sadeepa', 'ADMIN001', '0789843284', 'dilumhellow@gmail.com', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `attendances`
--

CREATE TABLE `attendances` (
  `id` int(100) NOT NULL,
  `at_type` varchar(255) NOT NULL,
  `at_date` varchar(255) NOT NULL,
  `at_status` varchar(255) NOT NULL,
  `at_st_id` varchar(255) NOT NULL,
  `at_sub_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendances`
--

INSERT INTO `attendances` (`id`, `at_type`, `at_date`, `at_status`, `at_st_id`, `at_sub_id`) VALUES
(1, 'T', '2022.05.26', '1', 'TG001', 'ICT2201');

-- --------------------------------------------------------

--
-- Table structure for table `cas`
--

CREATE TABLE `cas` (
  `id` int(100) NOT NULL,
  `c_suid` varchar(255) NOT NULL,
  `c_cid` varchar(100) NOT NULL,
  `q1` int(100) DEFAULT NULL,
  `q2` int(100) DEFAULT NULL,
  `q3` int(100) DEFAULT NULL,
  `q4` int(100) DEFAULT NULL,
  `ass1` int(100) DEFAULT NULL,
  `ass2` int(100) DEFAULT NULL,
  `ass3` int(100) DEFAULT NULL,
  `mid` int(100) DEFAULT NULL,
  `fexam` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `courselecs`
--

CREATE TABLE `courselecs` (
  `id` int(100) NOT NULL,
  `cl_cid` varchar(100) NOT NULL,
  `cl_lid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(100) NOT NULL,
  `cu_id` varchar(100) NOT NULL,
  `cu_name` varchar(100) NOT NULL,
  `cu_did` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `cu_id`, `cu_name`, `cu_did`) VALUES
(1, 'ICT2201', 'Internet Aplication Deverlopment', 'ICT');

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `id` int(100) NOT NULL,
  `dept_id` varchar(255) NOT NULL,
  `dept_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `final_exams`
--

CREATE TABLE `final_exams` (
  `id` int(100) NOT NULL,
  `fi_practical` varchar(255) NOT NULL,
  `fi_theory` varchar(255) NOT NULL,
  `fi_sub_id` varchar(255) NOT NULL,
  `fi_st_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lectures`
--

CREATE TABLE `lectures` (
  `id` int(100) NOT NULL,
  `uid` varchar(255) NOT NULL,
  `lec_name` varchar(255) NOT NULL,
  `lec_id` varchar(255) NOT NULL,
  `lec_address` varchar(255) NOT NULL,
  `lec_tel` varchar(255) NOT NULL,
  `lec_email` varchar(255) NOT NULL,
  `lec_gender` varchar(255) NOT NULL,
  `lec_did` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `medicals`
--

CREATE TABLE `medicals` (
  `id` int(100) NOT NULL,
  `me_type` varchar(255) NOT NULL,
  `me_date` varchar(255) NOT NULL,
  `me_sub_id` varchar(255) NOT NULL,
  `me_st_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicals`
--

INSERT INTO `medicals` (`id`, `me_type`, `me_date`, `me_sub_id`, `me_st_id`) VALUES
(1, 'T', '23', 'ICT2201', 'TG001');

-- --------------------------------------------------------

--
-- Table structure for table `notices`
--

CREATE TABLE `notices` (
  `id` int(100) NOT NULL,
  `topic` varchar(255) NOT NULL,
  `msg` varchar(255) NOT NULL,
  `ndep` varchar(255) NOT NULL,
  `ndate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notices`
--

INSERT INTO `notices` (`id`, `topic`, `msg`, `ndep`, `ndate`) VALUES
(2, 'The Project', 'The mini project is goin on', 'ICT', '2022-05-26');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(100) NOT NULL,
  `uid` varchar(255) NOT NULL,
  `stu_name` varchar(255) NOT NULL,
  `stu_id` varchar(255) NOT NULL,
  `stu_address` varchar(255) NOT NULL,
  `stu_gender` varchar(255) NOT NULL,
  `stu_dob` varchar(255) NOT NULL,
  `stu_tel` varchar(255) NOT NULL,
  `stu_email` varchar(255) NOT NULL,
  `stu_did` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(100) NOT NULL,
  `sub_id` varchar(255) NOT NULL,
  `sub_name` varchar(255) NOT NULL,
  `sub_cuid` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tec_officers`
--

CREATE TABLE `tec_officers` (
  `id` int(100) NOT NULL,
  `uid` varchar(255) NOT NULL,
  `tec_name` varchar(255) NOT NULL,
  `tec_id` varchar(255) NOT NULL,
  `tec_tel` varchar(255) NOT NULL,
  `tec_email` varchar(255) NOT NULL,
  `tec_gender` varchar(255) NOT NULL,
  `tec_did` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(100) NOT NULL,
  `id_num` varchar(100) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `id_num`, `name`, `email`, `password`, `tel`, `gender`, `level`) VALUES
(8, 'ADM001', 'Kamal Gunarathna', 'kamal@email.com', '123', '1234567890', 'Male', '1'),
(9, 'TEC001', 'Nimal Perera', 'nimal@email.com', '123', '1234567890', 'Male', '2'),
(10, 'TEC002', 'Sunil Pehesara', 'sunil@email.com', '123', '1234567890', 'Male', '2'),
(11, 'LEC001', 'Sarath Perera', 'sarath@email.com', '123', '1234567890', 'Male', '3'),
(12, 'LEC002', 'Mauri Sakunthala', 'mauri@email.com', '123', '1234567890', 'Female', '3'),
(13, 'TG001', 'Dilum Sadeepa', 'dilum@email.com', '123', '1234567890', 'Male', '4'),
(14, 'TG002', 'Hasani Hewage', 'hasani@email.com', '123', '1234567890', 'Female', '4'),
(15, 'TG003', 'Pimuditha Sathsara', 'pimuditha@email.com', '123', '1234567890', 'Male', '4'),
(16, 'TG004', 'Chamidu Madushan', 'chamidu@email.com', '123', '1234567890', 'Male', '4');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendances`
--
ALTER TABLE `attendances`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cas`
--
ALTER TABLE `cas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `courselecs`
--
ALTER TABLE `courselecs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `final_exams`
--
ALTER TABLE `final_exams`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lectures`
--
ALTER TABLE `lectures`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `medicals`
--
ALTER TABLE `medicals`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `notices`
--
ALTER TABLE `notices`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tec_officers`
--
ALTER TABLE `tec_officers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `attendances`
--
ALTER TABLE `attendances`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `cas`
--
ALTER TABLE `cas`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `courselecs`
--
ALTER TABLE `courselecs`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `departments`
--
ALTER TABLE `departments`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `final_exams`
--
ALTER TABLE `final_exams`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lectures`
--
ALTER TABLE `lectures`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medicals`
--
ALTER TABLE `medicals`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `notices`
--
ALTER TABLE `notices`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tec_officers`
--
ALTER TABLE `tec_officers`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
