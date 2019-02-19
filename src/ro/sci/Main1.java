package ro.sci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;

public class Main1<value> {

    public static void main(String[] args){

        Book carte1 = new Book();
        carte1.setNume("Carte1");
        carte1.setNrPagini(10);

        Book carte2 = new Book();
        carte2.setNume("Carte2");
        carte2.setNrPagini(100);

        Book carte3 = new Book();
        carte3.setNume("Carte3");
        carte3.setNrPagini(50);

        Novel nuv1 = new Novel();
        nuv1.setNume("Nuv1");
        nuv1.setNrPagini(100);
        nuv1.setType("roman de aventuri");

        Novel nuv2 = new Novel();
        nuv2.setNume("Nuv2");
        nuv2.setNrPagini(500);
        nuv2.setType("roman politist");

        Novel nuv3 = new Novel();
        nuv3.setNume("Nuv3");
        nuv3.setNrPagini(1000);
        nuv3.setType("roman istoric");

        ArtAlbum art1 = new ArtAlbum();
        art1.setNume("Art1");
        art1.setNrPagini(20);
        art1.setCalitateHartie("cool");

        ArtAlbum art2 = new ArtAlbum();
        art2.setNume("Art2");
        art2.setNrPagini(40);
        art2.setCalitateHartie("awsome");

        ArtAlbum art3 = new ArtAlbum();
        art3.setNume("Art3");
        art3.setNrPagini(60);
        art3.setCalitateHartie("not that good");

        SculptureAlbum sculpture1 = new SculptureAlbum();
        sculpture1.setNume("Sculpture1");
        sculpture1.setNrPagini(200);
        sculpture1.setCalitateHartie("awsome");
        sculpture1.setGen("bronz");

        SculptureAlbum sculpture2 = new SculptureAlbum();
        sculpture2.setNume("Sculpture2");
        sculpture2.setNrPagini(200);
        sculpture2.setCalitateHartie("awsome");
        sculpture2.setGen("marmura");

        SculptureAlbum sculpture3 = new SculptureAlbum();
        sculpture3.setNume("Sculpture3");
        sculpture3.setNrPagini(500);
        sculpture3.setCalitateHartie("not that good");
        sculpture3.setGen("bronz");

        Book nuvela = new Novel();
        nuvela.setNume("Nuv1");
        nuvela.setNrPagini(100);
        ((Novel) nuvela).setType("action");

        Book albumArta = new ArtAlbum();
        albumArta.setNume("Art2");
        albumArta.setNrPagini(40);
        ((ArtAlbum) albumArta).setCalitateHartie("impressive");

        Book albumSculptura = new SculptureAlbum();
        albumSculptura.setNume("Sculpture3");
        albumSculptura.setNrPagini(50);
        ((SculptureAlbum) albumSculptura).setCalitateHartie("ioioi");
        ((SculptureAlbum) albumSculptura).setGen("wtf?");

        Library librarie = new Library();

        librarie.addBook(carte1);
        librarie.addBook(carte2);
        librarie.addBook(carte3);
        librarie.addBook(nuv1);
        librarie.addBook(nuv2);
        librarie.addBook(nuv3);
        librarie.addBook(art1);
        librarie.addBook(art2);
        librarie.addBook(art3);
        librarie.addBook(sculpture1);
        librarie.addBook(sculpture2);
        librarie.addBook(sculpture3);
        librarie.addBook(nuvela);
        librarie.addBook(albumArta);
        librarie.addBook(albumSculptura);

        librarie.remove(art1);

        //afiseaza cuprinsul bibliotecii si numara articolele ramase dupa add si remove
        List cartileDinBiblioteca = librarie.getListOfBooks();
        System.out.println("\n" + cartileDinBiblioteca);
        System.out.println("\nNumar de carti existente in biblioteca : " + librarie.getItemCount());

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nIntroduceti numele cartii cautate: ");
        String mySearch = keyboard.nextLine();
        librarie.search(mySearch);

        System.out.println("\nIntroduceti un numar: ");
        int myint = keyboard.nextInt();
        String myString = keyboard.nextLine();
        System.out.println("\nAm citit: " + myint);
        System.out.println("Am citit: " + myString + "\n");

        //System.out.println(librarie.get(index));

        //creeaza o lista a elementelor din biblioteca
        String listaInPoza = cartileDinBiblioteca.toString();
        //elimina primul si ultimul caracter ale listei
        String cartiInBiblioteca = listaInPoza.substring(1, listaInPoza.length() - 1);
        //face split acolo unde intalneste o virgula urmata de un spatiu
        String[] elementeLibrarie = cartiInBiblioteca.split(",\\s");
        //java foreach loop pentru a printa elementele
        int index = 1;
        for (String e : elementeLibrarie) {
            System.out.println(String.valueOf(index++) + ": " + e);
        }
    }

    /* la astea mai am de lucrat, adica sa le inteleg
       ca lumea, sa le implementezsi si sa le leg cu "introduceti
    /* un numar" pe care l-ai dat tu mai sus


    /*String fileName = "text.txt";
    File textFile = new File(fileName);
    Scanner in;
    {
        try {
            in = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int value = in.nextInt(); {
        System.out.println("Read value: " + value);
        in.nextLine();
        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        in.close();
    }
    File file = new File("test.txt");
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one.");
			br.newLine();
			br.write("This is line two.");
			br.newLine();
			br.write("Last line.");
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
    */

    //TODO homework
    // 1. stergeti o carte
    // 2. metoda voastra specifica 1
    // 3. metoda voastra specifica 2

}




