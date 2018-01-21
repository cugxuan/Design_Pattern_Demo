public abstract class Component {
    String name;

    public Component(String s){
        this.name=s;
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void foreach();
}
