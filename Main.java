import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Product> baskets = new ArrayList<>();
		baskets.add(new Product("Leather wallet", 1200, 18, 1));
		baskets.add(new Product("Umbrella", 1900, 12, 2));
		baskets.add(new Product("Cigarette", 300, 28, 4));
		baskets.add(new Product("Honey", 400, 0, 3));

		Product maxGSTProduct = baskets.get(0);
		double totalPrice = 0.0;
		for (Product product : baskets) {
			totalPrice += product.getPrice();
			if (maxGSTProduct.getGstAmount() < product.getGstAmount()) {
				maxGSTProduct = product;
			}
		}

		System.out.println("Total Price : " + totalPrice);
		System.out.println("Maximum gst product is : " + maxGSTProduct);
	}
}
