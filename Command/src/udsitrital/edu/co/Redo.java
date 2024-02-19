package udsitrital.edu.co;

class Redo implements Command {

    private Receiver receiver;

    Redo(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void action() {
        //Call redo in receiver
        receiver.performRedo();
    }

}
