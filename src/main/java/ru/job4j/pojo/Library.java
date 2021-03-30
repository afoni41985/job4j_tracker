package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("CleanCode", 500);
        Book warAndPeace = new Book("War and Peace", 2000);
        Book annaKarenina = new Book("Anna Karenina", 1500);
        Book idiot = new Book("Idiot", 1000);
        Book[] collect = new Book[4];
        collect[0] = cleanCode;
        collect[1] = warAndPeace;
        collect[2] = annaKarenina;
        collect[3] = idiot;
        for (Book clt : collect) {
            System.out.println(clt.getName() + " " + clt.getNumber());
        }
        System.out.println();
        Book temp = collect[0];
        collect[0] = collect[3];
        collect[3] = temp;
        for (Book clt : collect) {
            System.out.println(clt.getName() + " " + clt.getNumber());
        }
        System.out.println();
        for (Book clt : collect) {
            if (clt.getName().equals("CleanCode")) {
                System.out.println(clt.getName() + " " + clt.getNumber());
            }
        }

    }
}
