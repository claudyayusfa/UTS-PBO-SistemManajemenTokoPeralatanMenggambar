# Sistem Manajemen Toko Peralatan Menggambar 🎨⋆｡˚👩🏻‍🎨ᝰ🖌️.🖼️

## Identitas Mahasiswa 🎏
| Identitas | Keterangan |
| --- | --- |
| **Nama** | Claudya Yusfa Ariyani |
| **NIM** | 2509116043 |
| **Program Studi** | Sistem Informasi |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Dosen Pengampu** | Dr. Akhmad Irsyad, S.T., M.Kom. |
| **Bahasa Pemrograman** | Java |

---

## 1. Deskripsi Proyek 👨🏻‍🎨
**Sistem Manajemen Toko Peralatan Menggambar** adalah program berbasis **Command Line Interface (CLI)** yang dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO).

Program ini digunakan untuk menampilkan informasi peralatan menggambar yang tersedia pada sebuah toko. Peralatan menggambar dibagi menjadi dua kategori, yaitu:

a. **Alat Gambar Konvensional**

b. **Alat Gambar Digital**

Setiap alat gambar memiliki informasi umum berupa:

- Kode barang
- Nama barang
- Harga barang
- Stok barang

Selain informasi umum tersebut, masing-masing kategori memiliki informasi khusus.

### Alat Gambar Konvensional 🖌️

Alat gambar konvensional memiliki informasi tambahan berupa **jenis** dan **bahan**.

Contoh data yang digunakan:

- Pensil 2B
- Pensil Warna Faber Castell (24)
- Drawing Pen 0.5
- Kuas Lukis
- Cat Air (12 pcs)
- Sketchbook A5

### Alat Gambar Digital 📱

Alat gambar digital memiliki informasi tambahan berupa **koneksi** dan **tipe**.

Contoh data yang digunakan:

- Drawing Tablet
- Wacom One
- Stylus Pen
- Digital Pen
- Pen Display
- XP-Pen Deco

---

## 2. Konsep Pemrograman Berorientasi Objek 🧑🏻‍💻

Program menerapkan beberapa konsep yang menjadi elemen utama dalam UTS Pemrograman Berorientasi Objek, yaitu: 

- inheritance
- polymorphism (overriding method)
- condition
- looping

### 2.1 Inheritance

Konsep **inheritance** diterapkan dengan membuat `AlatGambar` sebagai superclass dan dua subclass, yaitu `AlatGambarKonvensional` dan `AlatGambarDigital`.

Hierarki class dapat digambarkan sebagai berikut:

```text
                         AlatGambar
                         (Superclass)
                        /           \
                       /             \
                      ▼               ▼
       AlatGambarKonvensional    AlatGambarDigital
             (Subclass)              (Subclass)
                |                       |
          - jenis                   - koneksi
          - bahan                   - tipe
```

- Class `AlatGambar` menyimpan atribut umum yang dimiliki oleh seluruh alat gambar:

  <img width="444" height="180" alt="image" src="https://github.com/user-attachments/assets/a1157d5d-991d-4f55-801d-094b9844928d" />

- Hubungan inheritance pada `AlatGambarKonvensional` diterapkan menggunakan:

  <img width="1804" height="322" alt="image" src="https://github.com/user-attachments/assets/d74b0b1a-6c4a-4185-a892-1cb153ad0f80" />

- Sedangkan pada `AlatGambarDigital`:

  <img width="1748" height="330" alt="image" src="https://github.com/user-attachments/assets/f2fe4aa7-f78f-4e66-941e-1b1fffa3ca3c" />

- Kedua subclass menggunakan:

  <img width="514" height="44" alt="image" src="https://github.com/user-attachments/assets/23462273-5c24-48bc-9016-8110219ed637" />

  untuk memanggil constructor dari superclass `AlatGambar`.

  Dengan inheritance, atribut umum seperti `kode`, `nama`, `harga`, dan `stok` tidak perlu didefinisikan kembali pada setiap subclass.

---

### 2.2 Polymorphism dan Method Overriding

Konsep **polymorphism** pada program diterapkan menggunakan **method overriding**.

- Superclass `AlatGambar` memiliki method:

  <img width="780" height="216" alt="image" src="https://github.com/user-attachments/assets/2ae0e72c-ac0b-4ae8-b2bb-34f527a3d184" />

- Method tersebut kemudian di-**override** oleh subclass `AlatGambarKonvensional`:

  <img width="1020" height="302" alt="image" src="https://github.com/user-attachments/assets/cdc83d81-6186-44d0-a205-a217b595bef1" />

- Subclass `AlatGambarDigital` juga melakukan overriding terhadap method yang sama:

  <img width="1020" height="304" alt="image" src="https://github.com/user-attachments/assets/9d894c7e-e2c4-4b92-8cf2-31a81d07fced" />

- Penerapan polymorphism juga terlihat pada penggunaan tipe `AlatGambar` untuk menyimpan objek dari subclass:

  <img width="982" height="152" alt="image" src="https://github.com/user-attachments/assets/0fc3e0e0-a855-464a-8cb4-f5c183d86889" />

  <img width="1128" height="152" alt="image" src="https://github.com/user-attachments/assets/c1ad4b82-e4c8-422a-9f61-603ef271e554" />

- Ketika method:

    <img width="354" height="38" alt="image" src="https://github.com/user-attachments/assets/1e692557-9e7b-4701-9ac4-ecd9f3377a9f" />

    dipanggil, Java akan menjalankan method `tampilkanInfo()` sesuai dengan objek sebenarnya, baik `AlatGambarKonvensional` maupun `AlatGambarDigital`.

---

### 2.3 Condition

- Program menerapkan **condition** menggunakan `if-else` untuk melakukan validasi terhadap input pengguna.

  <img width="884" height="224" alt="image" src="https://github.com/user-attachments/assets/6ff412fd-2c32-44ff-b68b-c1b8f5dcde13" />

- Jika input berupa angka, program akan memproses pilihan pengguna. Jika pengguna memasukkan input selain angka, program akan menampilkan pesan:

  <img width="494" height="152" alt="image" src="https://github.com/user-attachments/assets/e7640209-fcf7-4f89-b24e-0c49f28c1288" />

  Program juga menggunakan `switch-case` untuk menentukan proses berdasarkan menu yang dipilih oleh pengguna.

---

### 2.4 Looping

Program menerapkan **looping** menggunakan `do-while` dan `for-each`.

- Perulangan `do-while` digunakan untuk menampilkan menu secara berulang selama pengguna belum memilih menu keluar:

  ```java
  do {
      // Menu program
  } while (pilihan != 3);
  ```

- Selain itu, perulangan `for-each` digunakan untuk menampilkan seluruh data alat gambar:

  <img width="686" height="200" alt="image" src="https://github.com/user-attachments/assets/16f6e225-d34c-4d41-9407-563b3fcc7e32" />

  <img width="594" height="192" alt="image" src="https://github.com/user-attachments/assets/9205f03c-f930-41b3-ad4e-8d9b274f0673" />

  Dengan demikian, data dapat ditampilkan secara berulang tanpa harus memanggil setiap objek satu per satu.

---

## 3. Alur Program 🪜

Alur penggunaan program adalah sebagai berikut:

1. Program dijalankan.
2. Program membuat data alat gambar konvensional dan alat gambar digital.
3. Program menampilkan menu utama.
4. Pengguna memasukkan pilihan menu.
5. Program memeriksa apakah input pengguna berupa angka menggunakan `if-else`.
6. Jika pengguna memilih **menu 1**, program menampilkan seluruh data Alat Gambar Konvensional.
7. Jika pengguna memilih **menu 2**, program menampilkan seluruh data Alat Gambar Digital.
8. Jika pengguna memilih **menu 3**, program menampilkan pesan selesai dan menghentikan program.
9. Jika pengguna memasukkan angka selain 1–3, program menampilkan pesan bahwa pilihan tidak tersedia.
10. Selama pengguna belum memilih menu 3, menu akan terus ditampilkan kembali menggunakan perulangan `do-while`.

Secara sederhana, alur program dapat digambarkan sebagai berikut:

```text
Mulai
  │
  ▼
Inisialisasi Data
  │
  ▼
Tampilkan Menu
  │
  ▼
Masukkan Pilihan
  │
  ├── Input bukan angka
  │       │
  │       └── Tampilkan pesan kesalahan
  │                   │
  │                   └──────► Kembali ke Menu
  │
  ├── Pilihan 1
  │       │
  │       └── Tampilkan Alat Gambar Konvensional
  │
  ├── Pilihan 2
  │       │
  │       └── Tampilkan Alat Gambar Digital
  │
  ├── Pilihan 3
  │       │
  │       └── Keluar dari Program
  │
  └── Pilihan lainnya
          │
          └── Tampilkan "Pilihan tidak tersedia"
```

---

## 5. Running Program 🤩

### 5.1 Menu Utama

Saat program pertama kali dijalankan, program menampilkan menu utama yang terdiri dari tiga pilihan. Pengguna dapat memilih menu dengan memasukkan angka 1 sampai 3.

<img width="522" height="290" alt="image" src="https://github.com/user-attachments/assets/66aeccc5-4325-40a2-add3-0160a0d6c5fb" />

---

### 5.2 Menampilkan Alat Gambar Konvensional

Ketika pengguna memilih **menu 1**, program melakukan perulangan terhadap data alat gambar konvensional dan menjalankan method `tampilkanInfo()`.

Program menampilkan informasi umum berupa kode, nama, harga, dan stok serta informasi khusus berupa jenis dan bahan.

<img width="590" height="970" alt="image" src="https://github.com/user-attachments/assets/668172de-7248-495e-8d55-eb28819dce97" /> 

---

### 5.3 Menampilkan Alat Gambar Digital

Ketika pengguna memilih **menu 2**, program melakukan perulangan terhadap data alat gambar digital dan menjalankan method `tampilkanInfo()`.

Program menampilkan informasi umum berupa kode, nama, harga, dan stok serta informasi khusus berupa koneksi dan tipe.

<img width="510" height="968" alt="image" src="https://github.com/user-attachments/assets/6518d05a-3528-48c3-b77b-49b067fabea3" />

---

### 5.4 Validasi Input

Jika pengguna memasukkan huruf atau input selain angka pada pilihan menu, program akan menampilkan pesan:

<img width="494" height="162" alt="image" src="https://github.com/user-attachments/assets/2cc67d9a-a2c9-4329-8d99-291ede5c4572" />

Setelah itu, program akan kembali menampilkan menu utama tanpa berhenti karena error.

---

### 5.5 Keluar dari Program

Ketika pengguna memilih **menu 3**, perulangan `do-while` akan berhenti dan program menampilkan pesan:

<img width="684" height="154" alt="image" src="https://github.com/user-attachments/assets/72616031-0322-4652-a0ee-f58f3bea004d" />

## 6. Kesimpulan 🌻

Program **Sistem Manajemen Toko Peralatan Menggambar** dibuat untuk menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan Java.

Program telah menerapkan:

- **Inheritance** melalui superclass `AlatGambar` dan subclass `AlatGambarKonvensional` serta `AlatGambarDigital`.
- **Polymorphism** melalui method overriding `tampilkanInfo()`.
- **Condition** menggunakan `if-else` untuk validasi input dan `switch-case` untuk pemilihan menu.
- **Looping** menggunakan `do-while` untuk perulangan menu dan `for-each` untuk menampilkan data.

Dengan penerapan konsep tersebut, program dapat mengelola dan menampilkan dua jenis peralatan menggambar melalui struktur class yang terorganisasi.



