-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2020 at 05:31 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sablon`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `Id_barang` varchar(5) NOT NULL,
  `Nama_barang` varchar(12) NOT NULL,
  `Harga` varchar(12) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`Id_barang`, `Nama_barang`, `Harga`, `Stok`) VALUES
('3', 'aaaa', '20', 20000),
('4', 'bbbccc', '20000', 7);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `Nama` varchar(30) NOT NULL,
  `Password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`Nama`, `Password`) VALUES
('salma@karyawan', 'salma123');

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE `kasir` (
  `Id Kasir` varchar(5) NOT NULL,
  `Nama` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pesanan` varchar(5) NOT NULL,
  `nama_pemesan` varchar(30) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kain` varchar(20) NOT NULL,
  `warna` varchar(20) NOT NULL,
  `jenis_sablon` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `size` varchar(5) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `harga` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id_pesanan`, `nama_pemesan`, `no_hp`, `alamat`, `jenis_kain`, `warna`, `jenis_sablon`, `jumlah`, `size`, `jenis_kelamin`, `harga`) VALUES
('23', 'Diky', '082352352', 'Madura', 'Cotton combats 30s', 'blue', 'Flock/beludru', 6, 'XL', 'Laki-laki', 24000),
('2', 'Andiko', '083253262', 'Mojokerto', 'Cotton combats 30s', 'Teal', 'PVC', 5, 'XL', 'Laki-laki', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `pemilik`
--

CREATE TABLE `pemilik` (
  `Nama` varchar(30) NOT NULL,
  `Password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemilik`
--

INSERT INTO `pemilik` (`Nama`, `Password`) VALUES
('salma@pemilik', 'salma123');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `Id pesanan` varchar(5) NOT NULL,
  `Nama pemesan` varchar(30) NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `No hp` int(12) NOT NULL,
  `Jenis kain` varchar(30) NOT NULL,
  `Jenis sablon` varchar(30) NOT NULL,
  `Warna` varchar(30) NOT NULL,
  `Jumlah` bigint(20) NOT NULL,
  `Tanggal selesai` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `size`
--

CREATE TABLE `size` (
  `S male` bigint(20) NOT NULL,
  `S female` bigint(20) NOT NULL,
  `M male` bigint(20) NOT NULL,
  `M female` bigint(20) NOT NULL,
  `L male` bigint(20) NOT NULL,
  `L female` bigint(20) NOT NULL,
  `XL male` bigint(20) NOT NULL,
  `XL female` bigint(20) NOT NULL,
  `XXL male` bigint(20) NOT NULL,
  `XXL female` bigint(20) NOT NULL,
  `Lain male` bigint(20) NOT NULL,
  `Lain female` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
