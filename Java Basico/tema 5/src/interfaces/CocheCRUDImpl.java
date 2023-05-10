package interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void findAll() {
        System.out.println("find all");
    }
}
