-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jan 2022 pada 10.37
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pesawat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `coba1`
--

CREATE TABLE `coba1` (
  `Nama` varchar(200) NOT NULL,
  `Tanggal_Lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `coba1`
--

INSERT INTO `coba1` (`Nama`, `Tanggal_Lahir`) VALUES
('Adit', '2022-01-17'),
('Linda', '2022-01-08');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_pelanggan`
--

CREATE TABLE `t_pelanggan` (
  `Id_Pembeli` int(11) NOT NULL,
  `Nama` varchar(200) NOT NULL,
  `Jenis_Kelamin` varchar(50) NOT NULL,
  `Umur` varchar(100) NOT NULL,
  `No_Handphone` varchar(50) NOT NULL,
  `Alamat` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_pelanggan`
--

INSERT INTO `t_pelanggan` (`Id_Pembeli`, `Nama`, `Jenis_Kelamin`, `Umur`, `No_Handphone`, `Alamat`) VALUES
(1136, 'Rina', 'Perempuan', '21', '0853427618', 'Jl Merdeka'),
(1137, 'Dinda', 'Perempuan', '20', '081324567834', 'Jl Pattimura'),
(1138, 'Linda', 'Perempuan', '25', '085324167438', 'Jl HKSN');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_penjualantiket`
--

CREATE TABLE `t_penjualantiket` (
  `Id_Tiket` int(11) NOT NULL,
  `Id_Pembeli` varchar(200) NOT NULL,
  `Id_Pesawat` varchar(200) NOT NULL,
  `Rute` varchar(200) NOT NULL,
  `Tanggal_Berangkat` date NOT NULL,
  `Kelas` varchar(200) NOT NULL,
  `No_Kursi` varchar(200) NOT NULL,
  `Harga` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_penjualantiket`
--

INSERT INTO `t_penjualantiket` (`Id_Tiket`, `Id_Pembeli`, `Id_Pesawat`, `Rute`, `Tanggal_Berangkat`, `Kelas`, `No_Kursi`, `Harga`) VALUES
(1132, '1136', '1873', 'Banjarmasin - Jakarta', '2022-01-12', 'Bisnis', '10', '250000'),
(1133, '1137', '6605', 'Bandung - Jakarta', '2022-01-12', 'Ekonomi', '5', '180000'),
(1134, '1138', '4783', 'Bandung - Jakarta', '2022-01-12', 'Bisnis', '3', '500000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_pesawat`
--

CREATE TABLE `t_pesawat` (
  `Id_Pesawat` int(11) NOT NULL,
  `Nama_Pesawat` varchar(200) NOT NULL,
  `Kapten_Pesawat` varchar(200) NOT NULL,
  `Jumlah_Awak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_pesawat`
--

INSERT INTO `t_pesawat` (`Id_Pesawat`, `Nama_Pesawat`, `Kapten_Pesawat`, `Jumlah_Awak`) VALUES
(1873, 'Lion Air', 'Budi', '10'),
(4783, 'Batik Air', 'Adam', '5'),
(4784, 'Garuda', 'Andri', '9');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_rute`
--

CREATE TABLE `t_rute` (
  `Id_Rute` int(11) NOT NULL,
  `Rute` varchar(255) NOT NULL,
  `Kelas` varchar(100) NOT NULL,
  `Harga` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `t_rute`
--

INSERT INTO `t_rute` (`Id_Rute`, `Rute`, `Kelas`, `Harga`) VALUES
(3307, 'Banjarmasin - Bandung', 'First Class', '400000'),
(3308, 'Bandung - Banjarmasin', 'Bisnis', '400000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_pelanggan`
--
ALTER TABLE `t_pelanggan`
  ADD PRIMARY KEY (`Id_Pembeli`);

--
-- Indeks untuk tabel `t_pesawat`
--
ALTER TABLE `t_pesawat`
  ADD PRIMARY KEY (`Id_Pesawat`);

--
-- Indeks untuk tabel `t_rute`
--
ALTER TABLE `t_rute`
  ADD PRIMARY KEY (`Id_Rute`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
