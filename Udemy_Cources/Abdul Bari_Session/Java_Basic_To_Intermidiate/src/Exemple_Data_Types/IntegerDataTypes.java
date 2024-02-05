package Exemple_Data_Types;

class IntegerDataTypes {

	public static void main(String[] args) {
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
	}
}
    class FloatDataTypes {
    	public static void main(String[] args) {
			System.out.println(Float.MIN_VALUE);
			System.out.println(Float.MAX_VALUE);
		}
    }
    
    class NumberLiterals {
    	public static void main(String[] args) {
			byte b1 = 10;      //Decimal 
			byte b2 = 0b1010;  //Binary
			byte b3 = 012;     //Octal
			byte b4 = 0XA;     //Hexadecimal
			System.out.println(b1);//10
			System.out.println(b2);//10
			System.out.println(b3);//10
			System.out.println(b4);//10
			//All this are 10, but different numbers system
		}
    }
 
    class LongLiteral {
    	public static void main(String[] args) {
			long l = 999_999_999_9L;
			double d = 234.89;
			float f = 45.3f;
			System.out.println(l);
			System.out.println(d);
			System.out.println(f);
		}
    }
    
    class integerToBinary {
    	public static void main(String[] args) {
			int x = 5;
			int y = -5;
			System.out.println(Integer.toBinaryString(x));//101
			System.out.println(Integer.toBinaryString(y));//11111111111111111111111111111011
		}
    }
    
    //unicode.org -> code charts
    class UniCodeValues {
    	public static void main(String[] args) {
//			char x = 0x03C8;
			//writing a code all the symbols in Greek language
//			for (char c = 0x0370; c <= 0x03FF ; c++) {
//				System.out.print(c+ " ");
//			}
    		//writing a code all the symbols in Kannada language
    		for (char c = 0x0C80; c <= 0x0CF0 ; c++) {
				System.out.print(c+ " ");
			}
		}
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    