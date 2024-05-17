codelab 2

Deskripsi
Program ini mengimplementasikan struktur data Binary Search Tree (BST) dalam bahasa pemrograman Java. Program ini memungkinkan pengguna untuk menambahkan node ke dalam BST dan melakukan traversal dalam tiga cara berbeda: Pre-order, In-order, dan Post-order.

Struktur Kode
Program terdiri dari beberapa metode utama:

NewNode(int data)
Metode ini digunakan untuk menambahkan node baru ke dalam BST. Metode ini memanggil metode rekursif NewNode(Node root, Node newData) untuk menemukan posisi yang tepat untuk node baru.
NewNode

(Node root, Node newData)
Metode rekursif ini mencari posisi yang tepat untuk node baru berdasarkan nilai datanya. Jika nilai data lebih kecil dari node saat ini, node baru akan ditempatkan di sub-pohon kiri. Jika lebih besar, node baru akan ditempatkan di sub-pohon kanan.

inOrder(Node node)
Metode ini melakukan traversal In-order, yang mengunjungi node di urutan: kiri, root, kanan. Hasil traversal ini adalah daftar node dalam urutan menaik.

preOrder(Node node)
Metode ini melakukan traversal Pre-order, yang mengunjungi node di urutan: root, kiri, kanan.

postOrder(Node node)
Metode ini melakukan traversal Post-order, yang mengunjungi node di urutan: kiri, kanan, root.


codelab 1

Deskripsi
Program ini mengimplementasikan struktur data Binary Tree dalam bahasa pemrograman Java. Program ini memungkinkan pengguna untuk menambahkan node ke dalam tree secara manual dan melakukan traversal dalam tiga cara berbeda: Pre-order, In-order, dan Post-order.

Struktur Kode
Program terdiri dari beberapa metode utama:

Main()
Konstruktor untuk inisialisasi root dari tree menjadi null.
addRoot

(int data)
Metode ini digunakan untuk menambahkan node root ke dalam tree.
inOrder

(node node)
Metode ini melakukan traversal In-order, yang mengunjungi node di urutan: kiri, root, kanan. Hasil traversal ini adalah daftar node dalam urutan menaik.
preOrder

(node node)
Metode ini melakukan traversal Pre-order, yang mengunjungi node di urutan: root, kiri, kanan.
postOrder

(node node)
Metode ini melakukan traversal Post-order, yang mengunjungi node di urutan: kiri, kanan, root.



