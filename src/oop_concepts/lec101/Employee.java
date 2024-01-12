package oop_concepts.lec101;


// Nesne merkezli programlama yaklaşımı, yazılımların karmaşıklaşmasına çözüm olarak çıkmıştır.
// bilgi gizleme (encapsulation)
// veri soyutlama (data abstraction)
// çok biçimlilik (polymorphism)
// kalıtım (inheritance)
// gibi kavramlar sunmuştur

/*
* Soyutlama: bir şeyin en önemli özelliklerini ön plana çıkarırken,
* önemli olmayan özelliklerini görmezden gelmektir.
*
* Zihin nasıl soyutlar?
* Zihin bir nesne ile karşılaşır, karakteristik özelliklerine göre onu algılar.
* Bu nesne zihnen biliniyorsa, daha önceden öğrenilmişse:
*       Nesne zihinde var olan bir kavramsal kategori ile örtüştürülür
* Eğer bilinmiyorsa, öğrenilmemişse:
*       Bu nesneden yola çıkarak yeni bir kavramsal kategori oluşturulur.
*
* Nesneyi izole edip temel özelliklerini çektiğimizde soyutlamaya ulaşırız
* Detaya girdikçe kavram gerçek nesneye yaklaşır bunu istemeyiz tabi
* Soyutlamayı genelleme olarak düşünebiliriz
*
* Soyutlama sonsuz karmaşıklıktaki gerçekliği basitleştirerek anlama çabasıdır
* bir varlık ile ilgili farklı açılardan ya da ilgi alanlarından yapılan soyutla-
* maların tümüne model denir
*
* model : birden çok soyutlama kapsadığı için nesneyi daha bütünsel ifade eder
* mutlak doğru model gerçekliğin kendisidir.
*
* Classification: Soyutlamalar sonucu elde edilen genellemeler birer kategori
* oluşturma işlemine sınıflandırma denir
*
*
* Sınıf ve Nesne Kavramı
* Filler gezegenin en büyük hayvanlarındandır < filler hakkında genelleme yapılmış
* Yeni doğan yavru fil bir insan boyundadır < yeni yavru fil bi nesnedir
* Nesne : insan zihninin algıladığı ve özellikleri olan herhangi bir kavramsal
* ya da fiziksel şeydir.
* Sınıf soyut olanı tümeli örneklerin hepsine genel olanı temsil eder
* Nesne ise somut olanı instance ı temsil eder
*
* Nesnelerin özellikleri ve davranışları vardır. özellikler state, fonksiyonlar behaviour
* UML DIAGRAM
* association, inheritance realization, dependency, composition, aggregation
* visual paradigm sitesi incelenebilir bit.ly/3Dls9sz
* association C aggregation C composition
* association : iki farklı classın objeler aracılığı ile birbirleri arasında
* tek yönlü ya da çift yönlü ilişkiye denir. one to many
* composition : compositiondaki bağımlılık güçlü bi bağımlılık
* araba ve motor arasındaki ilişki motorsuz çalışmaz
* aggregation : arabanın motoru değiştirilebiliyosa ya da müşteri banka ilişkisinde
* bi müşteri bankayı kullanmazsa banka hala kalır zayıf bi bağımlılık var yani
* değişebilirlik varsa aggregation, değişmezlik varsa finalla tanımlanmışsa composition
* aggregation özel bir assosaciationdır
* aralarındaki ilişki bitse bile nesneler yaşamaya devam eder
* //static means it belongs to the class not an object
* hem kendi hem altsınıflardan erişebilir altsınıf : inherit ediyosa
* 
*
*
*
*
* */
public class Employee {


    private  String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
