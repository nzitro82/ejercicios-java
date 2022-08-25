package com.nicolasortiz.cochescrud;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public List<Coche> findAll() {
        System.out.println("Listando coches");
        return null;
    }

    @Override
    public void save(Coche coche) {
        System.out.println("Modificando coche");
    }

    @Override
    public void delete(String cocheId) {
        System.out.println("Destruyendo coche");
    }
}
