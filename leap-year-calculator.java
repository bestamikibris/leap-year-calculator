import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Yılı Giriniz: ");
		year = input.nextInt();
		
	    if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " Yılı Bir Artık Yıldır");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " Yılı Bir Artık Yıl Değildir");
        }

        if (year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " Yılı Bir Artık Yıldır");
        } else if (year % 100 != 0 && year % 4 != 0) {
            System.out.println(year + " Yılı Bir Artık Yıl Değildir");
        }
	
    }
}
