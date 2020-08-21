package button;

public class HelpCommand implements Command {
    private final HelpDocument helpDocument = new HelpDocument();

    @Override
    public void execute() {
        helpDocument.display();
    }
}
