package button;

public class MinimizeCommand implements Command {
    private final WindowController windowController = new WindowController();

    @Override
    public void execute() {
        windowController.minimize();
    }
}
