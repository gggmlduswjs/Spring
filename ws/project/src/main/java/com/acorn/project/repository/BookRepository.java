package com.acorn.project.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.project.domain.Book;

@Repository
public class BookRepository {

    @Autowired
    private SqlSession session;

    public List<Book> findAll() {
        return session.selectList("BookMapper.findAll");
    }

    public Book findById(int id) {
        return session.selectOne("BookMapper.findById", id);
    }

    public void save(Book book) {
        session.insert("BookMapper.save", book);
    }

    public void update(Book book) {
        session.update("BookMapper.update", book);
    }

    public void delete(int id) {
        session.delete("BookMapper.delete", id);
    }
}
