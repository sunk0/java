import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangerInterface> listeners;


    public Dispatcher() {
        this.listeners = new ArrayList<NameChangerInterface>();
    }

    public void addNameChangeListener(NameChangerInterface name) {
        this.listeners.add(name);
    }

    public void removeNameChangeListener(NameChangerInterface removeName) {
        this.listeners.remove(removeName);
    }

    public void fireNameChangeEvent(NameChanger event) {
        this.name = event.getChangedName();
        for (NameChangerInterface listener : this.listeners) {
            listener.handleChangedName(event);
        }
    }

}
