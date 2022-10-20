# Testing in CI/CD Pipeline

<br/>Continuous Integration adalah praktik pengembangan software dimana developer mengubah kode serta melakukan merge pada sebuah repository atau penyimpanan secara reguler secara terus menerus. Jika ada push dan commit yang baru maka akan dijalankan dan hasilnya dapat langsung diketahui. Jika ada kesalahan maka developer bisa melakukan tindakan dengan memperbarui koe sehingga, kualitas ditingkatkan dan menghemat waktu serta melakukan validasi dan update. CI sebagai solusi menyederhanakan tahapan pengembangan software sehingga issue bisa diperbaiki.
<br/><br/>CI terdapat 3 stage:
<br/> 1. Build
<br/> 2. Unit Test
<br/> 3. Integration Test
<br/><br/>Setelah selesai akan dilanjutkan ke CD (Continuous Delivery)/deployment.
<br/>Continuous Delivery adalah proses setelah CI, dimana developer sudah menjalankan build dan test dan memilih untuk tidak melimpahkannya ke CI.
<br/>Continuous Deployment adalah fase akhir dari CD. yaitu fase setelah CI selesai dijalankan dan otomatis akan release ke production

<br/><br/>Delivery vs Deployment
<br/>Delivery butuh manual action untuk release ke production sedangkan development langsung release ke deployment tanpa perlu approval dari developer

<br/>Hal yang membuat CI bagus
<br/>- Decoupled Stages =&gt; step-step yang berjalan harus mengerjakan CI dengan single task. berfokus pada task.
<br/>- Repeatable =&gt; stages dapat dipakai berulang-ulang
<br/>- Fail Fast =&gt; ketika ada error di line yang pertama maka langsung fail.
<br/>- Design with system in mind =&gt; tercover ke development sepert: application, infrastructure, configuration, data.
<br/>- Pipelines =&gt; meningkatkan confidences untuk bisa ke production
<br/>- Globally Unique versions =&gt; mengerti stage-stage setiap waktu dan perbedaan current stage dan future stage.

<br/><br/>CI/CD Process
<br/>yaitu proses yang berkelanjutan dalam software deployment.
<br/>1. Commit
<br/>2. Build
<br/>3. Test
<br/>4. Deploy

<br/>Manfaat CI/CD:
<br/>1. dapat mendeteksi bug dengan cepat
<br/>2. bug yang ditemukan akan dikurangi
<br/>3. mempercepat proses release
<br/>4. efisien

<br/>Manfaat CD
<br/>1. Reduce the risk
<br/>2. painless deployment
<br/>3. reduces cost
<br/>4. automated and transparent process
<br/>5. release more frequently

<br/><br/>CI Cost:
<br/>1. White automated test
<br/>2. server for automated test
<br/>3. merge the code as often as possible

<br/>CD/Deployment Cost:
<br/>1. Strong Foundation in CI
<br/>2. Need Highest quality of test
<br/>3. dokumentation need to be updated frequently

<br/>CI/CD Tools:
<br/>1. Jenkins
<br/>yang paling sering digunakan. Open source. menggunakan bahasa pemrograman Java dengan plugin dibagun menggunakan CI
<br/>Kelebihan:
<br/>- Open source tools
<br/>- easy to install
<br/>- over 1000++ plugins
<br/>- build with java
<br/>- free of cost
<br/>- automatically minotaur code quality and metrics

<br/><br/>2. Bamboo
<br/>yaitu yang dapat mengintegrasi management perilisan software sekaligus menciptakan continues delivery tesplaint
<br/>kelebihan:
<br/>- 100 remote build agents
<br/>- parallel test
<br/>- create image and save to register
<br/>- ensures easy and fast functionality
<br/><br/>3. circleci
<br/>uaotu memudahkan untuk menerapkan CI/CD.dapat diintegrasikan dengan github dll
<br/>Kelebihan:
<br/>- Allows to select build env
<br/>- support many language
<br/>- automatically cancel any queued
<br/>- integrate with vcs tools
<br/>- optional caching and parallelism
<br/>- split and balance test
<br/><br/>4. AWS Code Build
<br/>yaitu CI//CD tools yang mendeveloper untuk build dan test code to continuous scale.
<br/>Kelebihan:
<br/>- continuous scale
<br/>- extensible
<br/>- secure
<br/>- integrate and delivery with another tools
<br/><br/>5. Azure DevOps
<br/>yaitu yang dapat relis di plaing testing, deploying atau distibusi. dibuat oleh microsoft
<br/>kelebihan:
<br/>- free
<br/>- full features
<br/>- support net
<br/>- fast and easy process
<br/>6. CICD
<br/>7. Travis CI
<br/>yaitu tools pertama untuk service tools. bisa dilakukan dalan build di cloud

<br/><br/>Kelebihan:
<br/>- easy deployment and configuration
<br/>- integrate with another tools
<br/>- parallel test
<br/>- support multiple language
<br/><br/>8. Github Action
<br/>yaitu untuk melakukan automation test dan development
<br/>Kelebihan:
<br/>- hosted VM with multiple OS
<br/>- CI templates
<br/>- simple container and OS testing
<br/>- free
<br/><br/>9. Gitlab CI
<br/>yaitu CI dari gitlab yang dapat digunakan untuk mengatur development software. berbasis
<br/>Kelebihan:
<br/>- Integrated in gitlab interface
<br/>- simple usage
<br/>- integrate with other tools
<br/>- execute on multiple platform
<br/>- open source

<br/><br/>Github Action
<br/>Komponen:
<br/>- Workflows yaitu proses otomatis yang menjalankan 1 atau lebih jobs. sebagai file YAM yang untuk mengecek repository dan akan berjalan saat di trigger secara manual. dapat memilih workflow yang berbeda.
<br/>- jobs yaitu serangkaian steps in workflow saat di execute saat menjalankan bersamaan.tidak mendeteksi jobs lain. akan berjalan secara paralel.
<br/>- action yaitu aplikasi khusus untuk melakukan jobs yang complex dan selalu berulang dan menarik repository dari github.
<br/>- event yaitu aktivitas spesifik dalam repository trigger workflow berjalan.
<br/>- runner yaitu server yang menjalankan workflows dengan mereka trigger. Setiap runner 1 jobs.