public class Handler implements NameChangerInterface {

    public void handleChangedName(NameChanger event) {
        System.out.printf("Dispatcher changed name to %s%n", event.getChangedName());
    }
}
