# MAP DATA STRUCTURE

# MAP
<br/> merupakan struktur data yang ada di java yang dapat digunakan untuk menyimpan banyak data didalamnya.
<br/> data didalam map diidentifikasi menggunakan key, dan setiap key menggunakan datanya sendiri dan disebut value.

## Map didalam java terdiri dari beberapa jenis yaitu: 
<br/> 1.HashMap 
<br/>   merupakan implementasi dari map menggunakan algoritma data hashtable.
<br/> 2.WeakHashMap
<br/> weakhashmap masih menggunakan hashtable namun pada bagian key dapat dihilangkan jika sudah digunakan.
<br/> 3.IdentityHashMap
<br/>   identityhashmap masih menggunakan hashtable namun pada key apabila memiliki referensi pada memori yang berbeda maka akan dianggap sebagai data yang berbeda.
<br/> 4.LinkedHashMap
<br/>   secara internal menerapkan double link list sebagai strutur data didalam map nya.
<br/> 5.EnumHashMap
<br/>   map dalam bentuk ini tidak dapat diubah isinya.

## Sorted Map 
<br/> merupakan map yang dapat diurutkan baik ascendent maupun descendent.
<br/> tipe awal dari yang digunakan dari awal diubah menjadi sortedmap dan variabel yang digunakan menjadi Treemap.

## Navigable Map
<br/> seperti sortedmap namun memiliki navigasi yang lebih lengkap mulai dari key yang lebih rendah ke key yang lebih tinggi.
<br/> untuk mengubahnya tipe data sorted map diubah menjadi navigable map tetapi isi dari datanya tetap menggunakan Treemap.
