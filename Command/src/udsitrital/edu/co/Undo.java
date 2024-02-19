package udsitrital.edu.co;

class Undo implements Command {

    private Receiver receiver;

    Undo(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void action() {
        //Call undo in receiver
        receiver.performUndo();
    }

}
