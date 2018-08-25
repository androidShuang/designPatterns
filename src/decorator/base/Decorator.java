package decorator.base;

public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operate() {
         this.component.operate();
    }
}
