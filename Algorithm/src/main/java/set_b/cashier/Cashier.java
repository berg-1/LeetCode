package set_b.cashier;

import java.util.HashMap;
import java.util.Map;

class Cashier {

    Map<Integer, Integer> menu = new HashMap<>();
    int n, discount, cnt;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        for (int i = 0; i < products.length; i++) {
            menu.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        cnt++;
        double res = 0;
        for (int i = 0; i < product.length; i++) {
            res += menu.get(product[i]) * amount[i];
        }
        if (cnt % n == 0) {
            res = res - (discount * res) / 100;
        }
        return res;
    }
}

class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier(3, 50, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{100, 200, 300, 400, 300, 200, 100});
        System.out.println(cashier.getBill(new int[]{1, 2}, new int[]{1, 2}));
    }
}
