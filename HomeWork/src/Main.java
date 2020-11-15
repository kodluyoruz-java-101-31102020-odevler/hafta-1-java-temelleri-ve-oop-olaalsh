
public class Main {

	public static void main(String[] args) {
		WORDDocument word = new WORDDocument("hi");
		 PDFDocument pdf = new  PDFDocument("ola");
		 
		 printer.printWORDDocument(word);
		 printer.prinPDFDocument(pdf);
		 
		
	}

}
