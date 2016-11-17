package org.esalenko.designpatterns.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
