package org.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamApiEx2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(101,"HP Laptop",250000));
        productList.add(new Product(102,"Dell Laptop",50000));
        productList.add(new Product(102,"Lenova Laptop",76000));
        productList.add(new Product(104,"Apple Laptop",1020000));


        List<Float> productPriceList = productList.stream()
                .filter(p->p.price>50000)//filtering price
                .map(p->p.price)//fetching price
                .collect(Collectors.toList());//collecting as list

        System.out.println("Laptop prices which more than 50000: "+productPriceList);

        //count number of products based on filter

        Long count = productList.stream()
                .filter(p->p.price>50000)
                .count();

        System.out.println("Number of laptops which are more than 50000 is : "+count);


        // reduce method

       float totalPrice = productList.stream()
               .map(product -> product.price)
               .reduce(0.0f,(sum,price)->sum+price);
       System.out.println("Sum of prices of all laptops: "+totalPrice);








    }
}
