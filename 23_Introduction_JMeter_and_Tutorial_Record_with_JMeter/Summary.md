# Introduction JMeter and Tutorial Record with JMeter
<br/>JMeter merupakan perangkat lunak terbuka, aplikasi desktop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web.
<br/><br/>Keuntungan menggunakan Jmeter
<br/>1. Open source (kita dapat melihat kode dari JMeter sehingga saat terjadi masalah kita dapat melihat sendiri di bagian mana terjadi masalah tersebut  )
<br/>2. Easy to use with GUI/NON GUI(Dengan Ui mana kita mendapatkan aplikasi berjalan seperti aplikasi dekstop pada umumnya, bila Non GUI dapat menggunakannya pada sistem berbasis CLI )
<br/><br/>Komponen JMeter Script
<br/>1. Test Plan
<br/>Rencana besar test yang akan dilakukan (parent)
<br/>2. Thread Groups
<br/>Kumpulan thread yang menjalankan skenario yang sama 
<br/>3.Samplers
<br/>Sebutan untuk request yang akan dikirim ke server
<br/>4. Config Elements
<br/>Element yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirim ke server
<br/>5. Listeners
<br/>perekeam data yang dihasilkan dari test
<br/>6.Timerfitur ini akan dijalankan duluan sebelum semua fitur yang lain berjalan 
<br/>Assertions 
<br/>Seperti assert pada API/WEB/Testing merupakan kriteria tambahan apakah passs/tidak 
<br/>Pre-Post Processors
<br/>Fitur yang memproses respons data sebelum atau sesudah test
