package udistrital.edu.co;

import java.util.LinkedList;

class Science implements Subject {

    private LinkedList<String> subjects;

    Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Matemáticas");
        subjects.addLast("Informática");
        subjects.addLast("Física");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }

    //Containing the ScienceIterator
    public class ScienceIterator implements Iterator {

        private LinkedList<String> subjects;
        private int position;

        ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            return subjects.get(position);
        }

    }

}
