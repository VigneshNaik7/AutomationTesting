package JavaBasicPrg;

public class AllTypeOfStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Welcomeo";
		String s2="Welcomeo";
		String s3="  welcome   ";
		System.out.println(s1.equals(s2)); //Output true
		System.out.println(s1.equalsIgnoreCase(s2)); //Output true
		System.out.println(s1.replace('e', 'X').replace('o','Z'));//Output WXlcZmXZ
		System.out.println(s1.substring(2,7));//Output come
		System.out.println(s3.trim());//Output welcome
		System.out.println(s1.length());//Output 8
		System.out.println(s1.concat(s3));//Output Welcomeo welcome
		System.out.println(s1.concat(s3).concat(s2));//Output Welcomeo welcome Welcomeo
		System.out.println(s1.charAt(4));//Output o
		System.out.println(s1.contains("Wel"));//Output true
		System.out.println(s1.contains(s2));//Output true
		System.out.println(s1.contains(s3));//Output false
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}

}
