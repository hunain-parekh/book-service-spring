package com.hunain.bookservice;

public interface IBookRepository<T> {
    public void save(T t);
}
