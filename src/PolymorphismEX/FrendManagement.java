package PolymorphismEX;

public class FrendManagement {

	public static void main(String[] args) {
		Friend[] friend = new Friend[10];
		int fcnt = 0;

		friend[fcnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		friend[fcnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		friend[fcnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		friend[fcnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

		for (int i = 0; i < fcnt; i++) {
			friend[i].showInfo();
			System.out.println();
		}
	}

}
