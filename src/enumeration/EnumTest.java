package enumeration;

//test the enum now

public class EnumTest {
PrinterType printerType;
AnotherType at;

enum AnotherType{something,or,another};

	public EnumTest(PrinterType pType) {
		printerType = pType;
	}
	
	public void feature() {
		
		switch (printerType) {
			case DOTMATRIX:
				System.out.println("Dot-matrix printers are economical");
				break;
			case INKJET:
				System.out.println("Inkjet printers provide decent quality prints");
				break;
			case LASER:
				System.out.println("Laser printers provide the best quality prints");
				break;
				}
				System.out.println("Print page capacity per minute: " +
				printerType.getPrintPageCapacity());
				}
	
	public static void main(String[] args) {
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
		EnumTest enumTest3 = new EnumTest(PrinterType.DOTMATRIX );
		//PrinterType pt = new PrinterType(); //cannot instantiate PrinterType
		EnumTest enumTest4 = new EnumTest(PrinterType.DOTMATRIX);
		System.out.println(PrinterType.LASER.name());
		System.out.println(PrinterType.LASER.valueOf("LASER") );
		
		
	}
}