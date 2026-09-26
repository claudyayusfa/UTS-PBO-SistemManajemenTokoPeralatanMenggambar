# Sistem Manajemen Toko Peralatan Menggambar 🎨⋆｡˚👩🏻‍🎨ᝰ🖌️.🖼️

## Identitas Mahasiswa
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

- Ketike method:

    <img width="354" height="38" alt="image" src="https://github.com/user-attachments/assets/1e692557-9e7b-4701-9ac4-ecd9f3377a9f" />

    dipanggil, Java akan menjalankan method `tampilkanInfo()` sesuai dengan objek sebenarnya, baik `AlatGambarKonvensional` maupun `AlatGambarDigital`.

---

