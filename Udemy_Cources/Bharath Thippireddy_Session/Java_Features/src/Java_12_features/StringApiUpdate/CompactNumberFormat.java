package Java_12_features.StringApiUpdate;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		
		NumberFormat formatt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(formatt.format(1000));
		System.out.println(formatt.format(1000000));
	}
}
