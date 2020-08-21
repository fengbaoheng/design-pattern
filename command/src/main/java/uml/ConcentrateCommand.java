package uml;

public class ConcentrateCommand implements Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
