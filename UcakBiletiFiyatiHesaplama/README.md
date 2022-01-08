## Ödev - Uçak Bileti Fiyatý Hesaplama

Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý yapýn. Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ) bilgilerini alýn. Mesafe baþýna ücret 0,10 TL / km olarak alýn. Ýlk olarak uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye aþaðýdaki indirimleri uygulayýn ;

Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý, yolculuk tipi ise 1 veya 2) olmalýdýr. Aksi takdirde kullanýcýya "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir.
Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr.
Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim uygulanýr.
Ýpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaþ Ýndirimi = Normal Tutar * Yaþ Ýndirim Oraný = 150 * 0.10= 15 TL
Ýndirimli Tutar = Normal Tutar – Yaþ Ýndirimi = 150 – 15 = 135 TL
Gidiþ Dönüþ Bilet Ýndirimi = Ýndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaþýnýzý giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaþýnýzý giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): 77

Hatalý Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaþýnýzý giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): 1

Toplam Tutar = 20.0 TL