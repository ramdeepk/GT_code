public class Shopper {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new ActionMovie("Fast 7"));
        cart.add(new ComedyMovie("Kingsmen"));
        cart.add(new DramaMovie("Gone Girl"));
        cart.add(new ScifiMovie("Star Wars Episode 7"));
        System.out.printf("%-40s  %6s%n", "Movie", "Price");
        for (Movie movie: cart.getMovies()) {
            // this movie price calculation will go away after you
            // create your new polymorphic movie classes
            int price = movie.getPrice();
            System.out.printf("%-40s $%6d%n", movie, price);
        }
        System.out.printf("%-40s $%6d%n", "Total:", cart.totalPrice());
    }
}
