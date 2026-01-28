1. Apakah kegunaan parameter di dalam fungsi?
   ANSWER: untuk memanggil nilai suatu variabel dari luar fungsi
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
   namaPelanggan dan isMember?

ANSWER: supaya dapat mendapatkan nilai data dari fungsi lain, ketika kita memasukkan nama "Andi" dan nilai "true", apabila kita tidak memasukkan parameter pada fungsi, maka akan terjadi error karena kita perlu datanya

3. Apakah parameter sama dengan variabel? Jelaskan.
   ANSWER: entahlah

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
   perbedaan output ketika isMember bernilai true dan ketika false?
   ANSWER: apabila true maka akan di outputkan kalimat dia akan mendapat diskon di toko itu, namun apabila false maka tidak akan di outputkan diskon dan langsug didisplay menu makan dan minumannya.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
   namaPelanggan dan isMember?
   ANSWER: maka akan terjadi error karena tidak dapat membaca nilai namaPelanggan dan isMember dari fungsi lain
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
   Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
   adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
   berlaku, tampilkan kode invalid.
   ANSWER: tadi saya error saat tidak memnambahkan variabel kodepromo pada main function pada function menu(), setelah saya tambahkan, program bisa jalan

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
   tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
   perintah pemanggilan fungsi menu yang benar.
   ANSWER:

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
   pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
   dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
   Jelaskan alasan Anda.
   ANSWER: honestly after doing the experiment about function like three times, i was realizing something that actually function is more legible than using only one function which was the main method
