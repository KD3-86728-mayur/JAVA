package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		System.out.println("0. Exit.");
		System.out.println("1. Add Mango");
		System.out.println("2. Add orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display name of all fruits");
		System.out.println("5. Display all fruits");
		System.out.println("6. Display the taste of all stale fruit");
		System.out.println("7. Mark fruit as stale");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Fruit[] basket = new Fruit[3];
		int counter = 0;
		
		int n;
		while ((n = menu(sc)) != 0) {
			switch (n) {
			case 1:
				basket[counter] = new Mango();
				basket[counter].accept(sc);
				counter++;
				break;
			case 2:
				basket[counter] = new Orange();
				basket[counter].accept(sc);
				counter++;
				break;
			case 3:
				basket[counter] = new Apple();
				basket[counter].accept(sc);
				counter++;
				break;
			case 4:
				for(int i=0;i<counter;i++) {
					System.out.println("Fruit name "+basket[i].getName());
				}
				
				break;
			case 5:
				for(int i=0;i<counter;i++) {
					
					if(basket[i] instanceof Mango) {
						Mango m = (Mango)basket[i];
						m.display();
					}else if(basket[i] instanceof Apple)
					{
						Apple a = (Apple) basket[i];
						a.display();
					}else {
						Orange o = (Orange) basket[i];
						o.display();
					}
				}
				break;
			case 6:

				for(int i=0;i<counter;i++) {
					if(!basket[i].isFreash) {
						System.out.println("Stale fruit :" + basket[i].name);;
					}
				}
				break;
			case 7:
				System.out.println("Enter index for for mark stale");
				int idx = sc.nextInt();
				if(idx < counter) {
					basket[idx].isFreash = false;
				}else {
					System.out.println("index is not prasent");
				}
				break;
			default:
				break;
			}
		}
	}

}
