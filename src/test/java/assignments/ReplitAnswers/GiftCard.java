package assignments.ReplitAnswers;

import java.util.Scanner;

public class GiftCard {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int giftCard = 100;
		int blanket = -60;
		int charger = -15;
		int hat = -25;
		int headphones = -30;
		int laptop = -200;
		int pants = -50;
		int pillow = -40;
		int smartphone = -1000;
		int socks = -5;
		int usbCable = -10;
		
		String item = scan.nextLine();
		
		switch (item) {
		case "blanket":
		case "Blanket":
			if ((giftCard+blanket)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + blanket) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		
		case "charger":
		case "Charger":
			if ((giftCard+charger)>=0) {
				System.out.println("Thank you for your purchase!");
				System.out.println("Your current balance is: " + (giftCard + charger) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		
		case "hat":
		case "Hat":
			if ((giftCard+hat)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + hat) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		
		case "headphones":
		case "Headphones":
			if ((giftCard+headphones)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + headphones) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		
		case "laptop":
		case "Laptop":
			if ((giftCard+laptop)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + laptop) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
			
		case "pants":
		case "Pants":
			if ((giftCard+pants)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + pants) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
			
		case "pillow":
		case "Pillow":
			if ((giftCard+pillow)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + pillow) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		
		case "smartphone":
		case "Smartphone":
			if ((giftCard+smartphone)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + smartphone) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
			
		case "socks":
		case "Socks":
			if ((giftCard+socks)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + socks) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
			
		case "usb cable":
		case "USB Cable":
		case "USB cable":
		case "Usb Cable":
		case "Usb cable":
			if ((giftCard+usbCable)>=0) {
				System.out.println("Thank you for your purchase! ");
				System.out.println("Your current balance is: " + (giftCard + usbCable) + "$");
			} else {
				System.out.println("Sorry, not enough funds on your gift card!");
			} break;
		default:
			System.out.println("Invalid item!");
			break;
		}
		
		scan.close();
		
		
	}

}
