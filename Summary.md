# Understanding Jmeter Results 

<br/>Explorasi terkait Jmeter
<br/>Pada menu testplan, klik kanan=add+klik thread group
<br/>Pada thread group, klik add+pada menu sampler isi HTTP Request, kemudian isi bagian yang kosong sesuai kebutuhan
<br/>Untuk melakukan run namun bisa melihat hasil nya, klik kanan Thread group,Klik add+ listener+ View Result Time + klik run
<br/>Pada bagian view result tree terdapat HTTP Request yang berjalan sesuai dengan yang diatur sebelumnya
<br/><br/> Dengan langkah yang sama namun mengganti method menjadi POST dan isi bagian kosong
<br/>Klik tab body data dan masukkan contoh data JSON, data diambil dari sebuah csv cara memasukkan csv tersebut klik kanan+add+config element dan klik CSV Data Config
<br/>Pada bagian filename, klik browse kemudian cari letak file csv yang akan digunakan
<br/>Kembali ke bagian HTTP Request dengan method POST, ubah nama HTTP Request kemudian menjalankan testnya
<br/>Akan muncul pada bagian view result tree akan muncul request baru file yang kita ganti 
<br/>Dapat dilihat pada Response header akan muncul response 
<br/><br/> Hal yang diperlukan dalam melakukan pelaporan testing performa
<br/>1. Pembahasan Data Yang Sudah Dimiliki
<br/> - Summary tentang sistem
<br/> - Kondisi awal sistem
<br/> - Target yang ingin dicapai
<br/>2. Data Performance Test yang didapatkan
<br/> - Masukkan data dari data matrics yang didapatkan
<br/>3. Interpretasi Data Performance Test
<br/> - Interpretasi hasil dari metricsnya
<br/>4. Saran (memberikan masukan pada sistem agar dapat mempertahankan performa sistem )