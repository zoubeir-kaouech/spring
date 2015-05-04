package tn.fst.dao;

import java.util.List;

public interface IDAO<I, T> {
boolean  add(I i);
I find(T t);
}
