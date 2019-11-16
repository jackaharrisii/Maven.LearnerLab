package io.zipcoder.interfaces;

import org.omg.PortableInterceptor.INACTIVE;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student santana = new Student(1, "Christopher Santana");
        super.add(santana);
        Student paranjape = new Student(2, "Rashmi Paranjape");
        super.add(paranjape);
        Student ng = new Student(3, "Kendra Ng");
        super.add(ng);
        Student bajwa = new Student(4, "Aashna Bajwa");
        super.add(bajwa);
        Student doll = new Student(5, "Michael Doll");
        super.add(doll);
        Student gates = new Student(6, "Joshua Gates");
        super.add(gates);
        Student mendoza = new Student(7, "Angel Mendoza");
        super.add(mendoza);
        Student evans = new Student(8, "Julia Evans");
        super.add(evans);
        Student doshi = new Student(9, "Miral Doshi");
        super.add(doshi);
        Student king = new Student(10, "Michael King");
        super.add(king);
        Student botelho = new Student(11, "Maira Botelho");
        super.add(botelho);
        Student miller = new Student(12, "Ryan Miller");
        super.add(miller);
        Student chambers = new Student(13, "Brandon Chambers");
        super.add(chambers);
        Student warrick = new Student(14, "Kwame Warrick");
        super.add(warrick);
        Student patterson = new Student(15, "Brian Patterson");
        super.add(patterson);
        Student tokhi = new Student(16, "John Tokhi");
        super.add(tokhi);
        Student gheorghe = new Student(17, "Valentin Gheorghe");
        super.add(gheorghe);
        Student kopetski = new Student(18, "Kane Kopetski");
        super.add(kopetski);
        Student bunde = new Student(19, "Grace Bunde");
        super.add(bunde);
        Student morales = new Student(20, "Eddie Morales");
        super.add(morales);
        Student beale = new Student(21, "Charlotte Beale");
        super.add(beale);
        Student etumadu = new Student(22, "Emmanuel Etumadu");
        super.add(etumadu);
        Student fragier = new Student(23, "Valerie Fragier");
        super.add(fragier);
        Student arguello = new Student(24, "Chung Arguello");
        super.add(arguello);
        Student pham = new Student(25, "Sandy Pham");
        super.add(pham);
        Student schoenbeck = new Student(26, "Leland Schoenbeck");
        super.add(schoenbeck);
        Student duwell = new Student(27, "Ronald Duwell");
        super.add(duwell);
        Student coon = new Student(28, "Benjamin Coon");
        super.add(coon);
        Student gray = new Student(29, "Mike Gray");
        super.add(gray);
        Student kunapareddy = new Student(30, "Usha Kunapareddy");
        super.add(kunapareddy);
        Student shields = new Student(31, "Kaila Shields");
        super.add(shields);
        Student trombello = new Student(32, "David Trombello");
        super.add(trombello);
        Student harris = new Student(33, "Jack Harris");
        super.add(harris);
        Student haynes = new Student(34, "Kievina Haynes");
        super.add(haynes);
        Student jones = new Student(35, "Wesley Jones");
        super.add(jones);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
