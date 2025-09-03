package edu.polymorphism.pack1.ex2.model;

// 부모 클래스
// name, id, toString를 작성하는 클래스
// 부모 클래스의 접근제한자는 protected

public class UniverseMember /* extends Object */ {

    protected String name;
    protected String id;

    public UniverseMember() {
    }

    public UniverseMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UniverseMember{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
