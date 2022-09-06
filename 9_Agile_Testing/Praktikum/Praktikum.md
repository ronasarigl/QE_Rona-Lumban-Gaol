<br/>Pada tahap Development dimana role2 developer (Mobile, Frontend, Backend, Fullstack) itu akan melakukan tugas mereka masing-masing. 
<br/>Pada tahap ini QA melakukan testing (life cycle: STLC software testing life cycle)
<br/>STLC yang dilakukan oleh QA terdiri dari
<br/>1. Requirement Analysis
<br/>2. Test Planning
<br/>3. Test Design
<br/>4. Test Environtmen set up
<br/>5. Test Exsecution
<br/>6. Test Closure

# Apa yang dilakukan oleh QA:
<br/>Testing fitur yg ada di status Deliver (status yg menandakan bahwa issue siap ditest)
<br/>Ketika ada bug, membuat issue bertipe Bug kemudian mengisikannya dengan format yg reporting (bug apa, expected dan actualnya itu apa)
<br/>Ini akan dipindah ke bagian Need Fix, akan dipindah oleh developer ke status In Progress
<br/>Kalau udah difix atau udah dibenerin, maka akan dipindah lagi oleh developer ke bagian Deliver dan siap untuk ditesting lagi
<br/>Ketika ditesting atau ditesting lagi itu udah engga ada bug, maka bisa dipindah ke bagian Done (fitur yg dibangun itu sudah sesuai dengan story, requirement dan acceptance criteria)

## Tantangan ketika menerapkan agile testing
<br/>1. Testing is an activity not a phase
<br/>	Testing dilakukan secara bersamaan dengan pembangunan oleh developer, tantangannya melakukan testingnya setiap hari tidak menunggu pekerjaan developer selesai dulu 
<br/>	Dikarenakan ketika menunggu developer selesai dan berakhirnya belum selesai membuat Qe tidak bisa melakukan testing dan automation.
<br/>2. Prevent bugs rather than finding bugs
<br/>	Kebanyakan bugs ditemukan karena requirement tidak jelas atau developer yang mengerjakanfitur membuat asumsi sendiri sehingga requirement terjadi ketidak jelasan 
<br/>3. Dont be a checker, be a tester 
<br/>	Membuat munculnya kemalasan melakukan testing karena merasa sebaiknya menggunakan automation, sebagai QE harusnya yang menjadi representatif seorang user.
<br/>4. Don,t try to break the system, instead help build the best possible system 
<br/>	Dibanding memperbanyak negative testcase dibanding positive, lebih baik membuat si user mendapat flow postifnya.
<br/>5. The whole team is responsible for quality, not just the tester
<br/>	Terkadang ketika menemui masalah mungkin ditemukan ketidak cocokan antar bagian sehingga harus adanya kerjasama yang dimana semua tanggung jawab dipikul bersama.
