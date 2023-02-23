package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
//나라 이름과 인구를 입력하세요.(예: Korea 5000)
//나라 이름, 인구 >> Korea 5000
//나라 이름, 인구 >> USA 1000000
//나라 이름, 인구 >> Swiss 2000
//나라 이름, 인구 >> France 3000
//나라 이름, 인구 >> 그만
//    
//인구 검색 >> France
//France의 인구는 3000
//인구 검색 >> 스위스
//스위스 나라는 없습니다.
//인구 검색 >> 그만
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> popSearch = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요.");
		while (true) {
			String country = sc.next();
			if (country.equals("stop")) {
				break;
			} else {
				try {
					int population = sc.nextInt();
					popSearch.put(country, population);
					System.out.println("Country, Population >> " + country + " " + population);
				} catch (Exception e) {
					// TODO: handle exception
					sc.nextLine();
					System.out.println("It's not number");
				}
			}

		}

		Set<String> ks = popSearch.keySet();
		while (true) {
			String search = sc.next();

			try {
				if (search.equals("stop")) {
					System.exit(0);
				} else {

					System.out.println("Search >> " + search);
					System.out.println("Population >> " + popSearch.get(search).toString());
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("There is no" + search + " country");
			}
		}
	}

}