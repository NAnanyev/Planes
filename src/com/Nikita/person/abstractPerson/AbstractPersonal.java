package com.Nikita.person.abstractPerson;

import com.Nikita.person.interfacePerson.Person;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public abstract class AbstractPersonal implements Person {
    private String name;
    private Integer age;
    private boolean hasChildren;
    private String position;

    @Override
    public String toString() {
        return "AbstractPersonal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasChildren=" + hasChildren +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractPersonal personal = (AbstractPersonal) o;

        if (hasChildren != personal.hasChildren) return false;
        if (name != null ? !name.equals(personal.name) : personal.name != null) return false;
        return age != null ? age.equals(personal.age) : personal.age == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (hasChildren ? 1 : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public AbstractPersonal(String name, Integer age, boolean hasChildren) {
        this.name = name;
        this.age = age;
        this.hasChildren = hasChildren;
    }
}
