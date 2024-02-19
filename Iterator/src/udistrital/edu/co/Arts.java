package udistrital.edu.co;

class Arts implements Subject {

    private String[] subjects;

    Arts() {
        subjects = new String[2];
        subjects[0] = "Pintura";
        subjects[1] = "Inglés";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }

    //Containing the ArtsIterator
    public class ArtsIterator implements Iterator {

        private String[] subjects;
        private int position;

        ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects[position++];
        }

        @Override
        public Boolean isDone() {
            return position >= subjects.length;
        }

        @Override
        public String currentItem() {
            return subjects[position];
        }

    }

}
