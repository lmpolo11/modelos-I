package udistrital.edu.co;

class Client {

    public static void main(String[] args) {
        Iterator scienceIterator = new Science().createIterator();
        Iterator artsIterator = new Arts().createIterator();

        System.out.println("\nScience subjects :");
        print(scienceIterator);

        System.out.println("\nArts subjects :");
        print(artsIterator);
    }

    private static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

}
