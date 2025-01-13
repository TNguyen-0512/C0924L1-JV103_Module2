package student.service;

import java.util.List;

public interface IService <T>{
    List<T> findAll();
    void add(T t);
    void update(T t);
    void deletebyId(T t);
}
