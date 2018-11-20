package ua.lviv.lgs;

public class Aplication {
	public static void main(String[] args) {
		System.out.println("Hello world");

//1
		int a = 123456789;
		byte b = 12;
		short c = 12345;
		long d = 1234567890;
		double e = 12345.67890;
		float f = 1234;
		char g = 123;
		boolean h = true;

//2
		System.out.println("int "+ Integer.MAX_VALUE);
		System.out.println("int "+ Integer.MIN_VALUE);
		System.out.println("byte "+ Byte.MAX_VALUE);
		System.out.println("byte "+ Byte.MIN_VALUE);
		System.out.println("short "+ Short.MAX_VALUE);
		System.out.println("short "+ Short.MIN_VALUE);

//3
		int [] loc = {25, 11, 250, 5, 34, 45, 456, 52, 92, 12};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println("мінімальне число="+min + " "+"максимальне число=" + max);
	}

}
