# Fundamental Performance Test

<br/>Performance Test adalah teknik nonfunctional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja.
<br/><br/>Performance Testing mengukur atribut dari sistem dalam hal stabilitas, ketahanan,dan penggunaan rsource.
<br/>Performance Test cukup mahal untuk diaplikasikan dan dijalankann, namun dapat dijadikan tolak ukur.
<br/><br/>Yang menjadi perhatian dalam performance test biasanya adalah throughput dan response datanya.
<br/><br/>Langkah yang harus dilakukan untuk membuat Kasus Performance Test:
<br/>1. Membuat Test Plan
<br/>2. Membuat script test
<br/>3. Melakukan performance test
<br/>4. Menganalisa hasil performance test
<br/><br/>Macam - macam performance test
<br/>1. Smoke Test
<br/>	Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali.
<br/>2. Load Test
<br/>	merupakan pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu.
<br/>	Hasil load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dan memonitor dampat terhadap database, application server atau pendukung lainnya.
<br/>3. Stress Testing
<br/>	Metode ini dilakukan untuk mengamatikemampuan dan kestabilan sistem pada saat kondisi ekstrim.
<br/>4. Spike Testing
<br/>	seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat.
<br/>5. Soak Testing 
<br/>	Untuk mengetahui reliability ketika dalam tekanan dibawah puncak dalam jangka panjang. Dapat mengetahui bug pada race condition, memory leaks, db connection.