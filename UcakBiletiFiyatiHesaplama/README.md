## �dev - U�ak Bileti Fiyat� Hesaplama

Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program� yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye a�a��daki indirimleri uygulay�n ;

Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�, yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.
�pucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Ya� �ndirimi = Normal Tutar * Ya� �ndirim Oran� = 150 * 0.10= 15 TL
�ndirimli Tutar = Normal Tutar � Ya� �ndirimi = 150 � 15 = 135 TL
Gidi� D�n�� Bilet �ndirimi = �ndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km t�r�nden giriniz : 1500
Ya��n�z� giriniz : 20
Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km t�r�nden giriniz : -500
Ya��n�z� giriniz : 1
Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ): 77

Hatal� Veri Girdiniz !
Senaryo 3
Mesafeyi km t�r�nden giriniz : 200
Ya��n�z� giriniz : 35
Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ): 1

Toplam Tutar = 20.0 TL