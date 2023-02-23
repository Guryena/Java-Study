package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
//		도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 도시 이름을 '키'로 하는 
//		HashMap<String, Location> 컬렉션을 만들고, 사용자로부터 입력 받아 4개의 도시를 저장하라. 그리고 도시 이름으로 검색하는 프로그램을 작성하라.
//		도시, 경도, 위도를 입력하세요.
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> map = new HashMap<>();

		while (true) {
			String city = sc.next();
			if (city.equals("stop")) {
				break;
			} else {
				try {

					double lati = sc.nextDouble();
					double longi = sc.nextDouble();
					Location location = new Location(city, lati, longi);
					map.put(city, location);
					System.out.println("Input >> " + city + " " + lati + " " + longi);
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Wrong input");
				}
			}

		}

		Set<String> ks = map.keySet();

		while (true) {
			System.out.print("City >> ");

			String search = sc.next();
			try {

				if (search.equals("stop")) {
					System.exit(0);
					;
				} else {
					System.out.println(search + " " + map.get(search).toString());
				}
			} catch (Exception e) {
				System.out.println("No " + search);
			}
		}

//		>> 서울, 37, 126
//		>> LA, 34, -118
//		>> 파리, 2, 48
//		>> 시드니, 151, -33
//		----------------------------------
//		서울 37 126
//		LA 34 -118
//		파리 2 48
//		시드니 151 -33
//		----------------------------------
//		도시 이름 >> 피리
//		피리는 없습니다.
//		도시 이름 >> 파리
//		파리 2 48
//		도시 이름 >> 그만
	}

}
