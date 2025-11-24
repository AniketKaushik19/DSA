class monkeyBanana {
    public static void main(String[] args) {
        int monkey = 5;
        int bm = 4, pm = 3;
        int b = 17, p = 10;
        int monkeyEat = 0;

        while (monkeyEat < monkey) {
            if (b >= bm) {
                b -= bm;
                monkeyEat++;
            } else if (p >= pm) {
                p -= pm;
                monkeyEat++;
            } else {
                // Last monkey eats remaining bananas and peanuts if any
                if (b > 0 || p > 0) {
                    monkeyEat++;
                    b = 0;
                    p = 0;
                }
                break;
            }
        }
        System.out.println("Monkeys remaining on the tree: " + (monkey - monkeyEat));
    }
}