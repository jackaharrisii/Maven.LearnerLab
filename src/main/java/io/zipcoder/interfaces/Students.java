package io.zipcoder.interfaces;

import org.omg.PortableInterceptor.INACTIVE;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student santana = new Student(1, "Christopher Santana");
        personList.add(santana);
        Student paranjape = new Student(2, "Rashmi Paranjape");
        personList.add(paranjape);
        Student ng = new Student(3, "Kendra Ng");
        personList.add(ng);
        Student bajwa = new Student(4, "Aashna Bajwa");
        personList.add(bajwa);
        Student doll = new Student(5, "Michael Doll");
        personList.add(doll);
        Student gates = new Student(6, "Joshua Gates");
        personList.add(gates);
        Student mendoza = new Student(7, "Angel Mendoza");
        personList.add(mendoza);
        Student evans = new Student(8, "Julia Evans");
        personList.add(evans);
        Student doshi = new Student(9, "Miral Doshi");
        personList.add(doshi);
        Student king = new Student(10, "Michael King");
        personList.add(king);
        Student botelho = new Student(11, "Maira Botelho");
        personList.add(botelho);
        Student miller = new Student(12, "Ryan Miller");
        personList.add(miller);
        Student chambers = new Student(13, "Brandon Chambers");
        personList.add(chambers);
        Student warrick = new Student(14, "Kwame Warrick");
        personList.add(warrick);
        Student patterson = new Student(15, "Brian Patterson");
        personList.add(patterson);
        Student tokhi = new Student(16, "John Tokhi");
        personList.add(tokhi);
        Student gheorghe = new Student(17, "Valentin Gheorghe");
        personList.add(gheorghe);
        Student kopetski = new Student(18, "Kane Kopetski");
        personList.add(kopetski);
        Student bunde = new Student(19, "Grace Bunde");
        personList.add(bunde);
        Student morales = new Student(20, "Eddie Morales");
        personList.add(morales);
        Student beale = new Student(21, "Charlotte Beale");
        personList.add(beale);
        Student etumadu = new Student(22, "Emmanuel Etumadu");
        personList.add(etumadu);
        Student fragier = new Student(23, "Valerie Fragier");
        personList.add(fragier);
        Student arguello = new Student(24, "Chung Arguello");
        personList.add(arguello);
        Student pham = new Student(25, "Sandy Pham");
        personList.add(pham);
        Student schoenbeck = new Student(26, "Leland Schoenbeck");
        personList.add(schoenbeck);
        Student duwell = new Student(27, "Ronald Duwell");
        personList.add(duwell);
        Student coon = new Student(28, "Benjamin Coon");
        personList.add(coon);
        Student gray = new Student(29, "Mike Gray");
        personList.add(gray);
        Student kunapareddy = new Student(30, "Usha Kunapareddy");
        personList.add(kunapareddy);
        Student shields = new Student(31, "Kaila Shields");
        personList.add(shields);
        Student trombello = new Student(32, "David Trombello");
        personList.add(trombello);
        Student harris = new Student(33, "Jack Harris");
        personList.add(harris);
        Student haynes = new Student(34, "Kievina Haynes");
        personList.add(haynes);
        Student jones = new Student(35, "Wesley Jones");
        personList.add(jones);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
