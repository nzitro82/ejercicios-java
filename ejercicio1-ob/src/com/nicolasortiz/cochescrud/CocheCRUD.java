package com.nicolasortiz.cochescrud;

import java.util.List;

public interface CocheCRUD {

    List<Coche> findAll();

    void save(Coche coche);

    void delete(String cocheId);
}
