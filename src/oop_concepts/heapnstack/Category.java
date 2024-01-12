package oop_concepts.heapnstack;

public class Category {

    String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }

    public static void main(String[] args) {

        Category category = new Category("MOUSE");
        Category category1 = new Category("GARDEN");
        System.out.println(category); // mouse
        System.out.println(category1);//garden

        change(category,category1);

        System.out.println(category);//mouse
        System.out.println(category1);//garden

    }

    static void change(Category category, Category category1){

        Category value = category;
        category = category1;
        category1 = value;

        System.out.println(category);//garden
        System.out.println(category1);//mouse

    }


}
