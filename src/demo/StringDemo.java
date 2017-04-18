package demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
}
     public StringDemo() {
	}
     public String smallString(String str)// ×Ö·û´®±äÐ¡Ð´
	{
		String temp = "error";
		if (str.equals("") || str == null) {
			return temp;
		}
		String s = str.toLowerCase();
		return s;
	}
}
