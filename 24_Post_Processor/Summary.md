# POST PROCESSOR 
<br/>Merupakan bagian dari test plan yang merupakan sebuah aksi yang berjalan saat proses setelah dilakukan, proses ini merupakan proses request ke sebuah alamat web yang dilakukan pada umumnya untuk mengekstrak value yang didapatkan dari hasil mengakses sebuah alamat web seperti data pada Json dan Section atau respons yang lainnya.
<br/><br/>Salah satu post processor di JMeter adalah JSON Extractor. Pada JSON Extractor terdapat JSON Path Extractor untuk mengambil nilai-nilai yang terdapat pada data JSON yang dihasilkan dari respond saat melakukan request.
<br/>Menbuat Request Post Processor
<br/>Klik icon template yang berada dibagian kiri atas, kemudian pilih recording dan click create.
<br/>Untuk emmbuat request pada web reqres.in, ubah output file+ click create
<br/>Klik kanan thread Group, pilih add + Sampler + http request
<br/>Klik HTTP Request, pada bagian protokol isi https dan server name isi reqres.in
<br/>Pada path isi /api/user, lalu isi paramrter
<br/>Klik Run + Start lalu akan muncul hasil http request akan muncul pada bagian review result tree
<br/><br/> Beberapa Ekspresi JSON Path
<br/>1. $ = rooth element
<br/>2. .= child operator(object)
<br/>3. []= child operator (array)
<br/>4. ..= recursive descent (langsung ke object)
<br/>5. 8= wildcard (all things)
<br/>6. [start:end] =  array slice operator borrowed