package main.java;

import java.util.HashSet;
import java.util.Set;

public class CategoryManager {
    private HashSet<String> categories = new HashSet<>();

    //методи

    public void addCategory(String category) throws DuplicateCategoryException{
        if (!categories.add(category)) {
            throw new DuplicateCategoryException ( " Така категорія товару " + category + " вже існує! ");
        }
    }

    public Set<String> getCategories() {
        return categories;
    }
}
