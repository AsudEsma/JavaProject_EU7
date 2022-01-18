package assignments.ReplitAnswers.Bookshelf;

public class Bookshelf {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(012, "non", "bii", 125);
		System.out.println(b1);
		b1.setAuthor("asude");
		b1.setTitle("nonsense");
		b1.setId(11);
		b1.setPages(5986);
		System.out.println(b1);
		

		System.out.println("Is shelf empty: " + Shelf.isShelfEmpty());
		
		System.out.println("***Adding Books***");
		
		System.out.println(Shelf.addBook(001, "aLpeR cAnIGuz", "ogullar And rEncide rUHLar / A kAmu dAvAsi 1", 228));
		System.out.println(Shelf.addBook(002, "alPeR caNiGuZ", "cEhennem ciceGi / A kAmu dAvAsi 2", 220));
		System.out.println(Shelf.addBook(003, "aLpeR caniguz", "kIyameT pArk / A kAmu dAvAsi 3", 248));
		System.out.println(Shelf.addBook(004, "aLpeR cAnIGuz", "tAtli rUyaLar", 208));
		System.out.println(Shelf.addBook(005, "aLpeR cAnIGuz", "gIzlI aJans", 204));
		System.out.println(Shelf.addBook(006, "aLpeR cAnIGuz", "kAn AnD gUL / A bLooDy deJavu", 212));
		System.out.println(Shelf.addBook(007, "", "tHe theOry Of eVeryThing", 176));
		
		System.out.println("***Find Book by Partial Title***");
		
		System.out.println(Shelf.findBookByPartialTitle("tatlI "));
		System.out.println(Shelf.findBookByPartialTitle("ruHlar"));
		System.out.println(Shelf.findBookByPartialTitle("aN An"));
		System.out.println(Shelf.findBookByPartialTitle("tHiNg"));
		
		System.out.println("***Get Title By ID***");
		
		System.out.println(Shelf.getTitleByID(005));
		System.out.println(Shelf.getTitleByID(2));
		System.out.println(Shelf.getTitleByID(98));
		
		System.out.println("***Get All Books For Author***");
		
		System.out.println(Shelf.getAllBooksForAuthor("aLper CanIguz"));
		System.out.println(Shelf.getAllBooksForAuthor("Unknown"));
		
		System.out.println("***Unknown Author Number***");
		System.out.println(Book.getUnknownAuthors());

	}

}
