/*W.A.J.P to compare a given string to the specified character sequence. Comparing 
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false*/
package corej;

public class OCharSeq {
	public static void main(String[] args) {
		String str1="topsint.com";
		String str2="topsint.com";
		CharSequence cs="topsint.com";
		System.out.println("Comparing '"+str1+"'"+ " and '" +cs+ "' : "+ str1.contentEquals(cs));
		System.out.println("Comparing '"+str2+"'"+ " and '" +cs+ "' : "+ str2.contentEquals(cs));
		String str3="Topsint.com";
		String str4="topsint.com";
		CharSequence cs2="Topsint.com";
		System.out.println("Comparing '"+str3+"'"+ " and '" +cs2+ "' : "+ str3.contentEquals(cs2));
		System.out.println("Comparing '"+str4+"'"+ " and '" +cs2+ "' : "+ str4.contentEquals(cs2));

	}

}
