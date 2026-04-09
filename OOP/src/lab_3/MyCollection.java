package lab_3;

public interface MyCollection {
    public int size();

    public boolean add(Object o);

    public boolean remove(Object o);

    public boolean contains(Object o);

    public boolean clear();

    @Override
    public String toString();
}
